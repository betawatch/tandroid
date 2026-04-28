package org.scilab.forge.jlatexmath;

/* loaded from: classes3.dex */
public class DelimiterMappingNotFoundException extends JMathTeXException {
    private static final long serialVersionUID = 273456491396361682L;

    protected DelimiterMappingNotFoundException(char c) {
        super("No mapping found for the character '" + c + "'! Insert a <" + TeXFormulaSettingsParser.CHARTODEL_MAPPING_EL + ">-element in '" + TeXFormulaSettingsParser.RESOURCE_NAME + "'.");
    }
}
