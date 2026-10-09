package org.scilab.forge.jlatexmath;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public class DelimiterMappingNotFoundException extends JMathTeXException {
    private static final long serialVersionUID = 273456491396361682L;

    public DelimiterMappingNotFoundException(char c10) {
        super("No mapping found for the character '" + c10 + "'! Insert a <Map>-element in 'TeXFormulaSettings.xml'.");
    }
}
