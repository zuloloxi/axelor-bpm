/*******************************************************************************
 * Signavio Core Components
 * Copyright (C) 2012  Signavio GmbH
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 ******************************************************************************/
package de.hpi.bpmn2_0.model.event;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import de.hpi.bpmn2_0.model.activity.misc.Operation;
import de.hpi.bpmn2_0.model.data_object.Account;
import de.hpi.bpmn2_0.model.data_object.Message;
import de.hpi.bpmn2_0.model.data_object.Template;
import de.hpi.bpmn2_0.model.data_object.TemplateRule;


/**
 * <p>Java class for tMessageEventDefinition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tMessageEventDefinition">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.omg.org/bpmn20}tEventDefinition">
 *       &lt;sequence>
 *         &lt;element name="operationRef" type="{http://www.w3.org/2001/XMLSchema}QName" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="messageRef" type="{http://www.w3.org/2001/XMLSchema}QName" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tMessageEventDefinition", propOrder = {
    "operationRef",
    "messageRef",
    "template",
    "templateRule",
    "account"
})
public class MessageEventDefinition
    extends EventDefinition
{
	
	@XmlElement
    protected Operation operationRef;
    @XmlElement
    protected Message messageRef;
    
    @XmlElement
    protected Template template;
    
    @XmlElement
    protected TemplateRule templateRule;
    
    @XmlElement
    protected Account account;
    
    @XmlAttribute
    protected Boolean persist;
    
    /* Constructors */
    public MessageEventDefinition() {
    	super();
    }
    
    public MessageEventDefinition(MessageEventDefinition msgEvDef) {
    	this.setOperationRef(msgEvDef.getOperationRef());
    	this.setMessageRef(msgEvDef.getMessageRef());
    }
    
    /* Getter & Setter */

    /**
     * Gets the value of the operationRef property.
     * 
     * @return
     *     possible object is
     *     {@link Operation }
     *     
     */
    public Operation getOperationRef() {
        return operationRef;
    }

    /**
     * Sets the value of the operationRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link Operation }
     *     
     */
    public void setOperationRef(Operation value) {
        this.operationRef = value;
    }

    /**
     * Gets the value of the messageRef property.
     * 
     * @return
     *     possible object is
     *     {@link Message }
     *     
     */
    public Message getMessageRef() {
        return messageRef;
    }

    /**
     * Sets the value of the messageRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link Message }
     *     
     */
    public void setMessageRef(Message value) {
        this.messageRef = value;
    }
    
    public Template getTemplate(){
    	return this.template;
    }
    
    public void setTemplate(Template template){
    	this.template = template;
    }
    
    public TemplateRule getTemplateRule(){
    	return this.templateRule;
    }
    
    public void setTemplateRule(TemplateRule templateRule){
    	this.templateRule = templateRule;
    }
    
    public Account getAccount(){
    	return this.account;
    }
    
    public void setAccount(Account account){
    	this.account = account;
    }
    
    public Boolean getPersist(){
    	return this.persist;
    }
    
    public void setPersist(Boolean persist){
    	this.persist = persist;
    }
    
}
