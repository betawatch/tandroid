package org.scilab.forge.jlatexmath;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public class DelimiterMappingNotFoundException extends JMathTeXException {
    private static final long serialVersionUID = 273456491396361682L;

    public DelimiterMappingNotFoundException(char c) {
        super("No mapping found for the character '" + c + "'! Insert a <Map>-element in 'TeXFormulaSettings.xml'.");
    }
}
