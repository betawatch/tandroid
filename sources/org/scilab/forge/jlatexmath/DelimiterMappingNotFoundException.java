package org.scilab.forge.jlatexmath;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public class DelimiterMappingNotFoundException extends JMathTeXException {
    private static final long serialVersionUID = 273456491396361682L;

    public DelimiterMappingNotFoundException(char c10) {
        super("No mapping found for the character '" + c10 + "'! Insert a <Map>-element in 'TeXFormulaSettings.xml'.");
    }
}
