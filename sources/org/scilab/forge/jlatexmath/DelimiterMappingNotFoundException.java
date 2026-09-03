package org.scilab.forge.jlatexmath;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public class DelimiterMappingNotFoundException extends JMathTeXException {
    private static final long serialVersionUID = 273456491396361682L;

    public DelimiterMappingNotFoundException(char c3) {
        super("No mapping found for the character '" + c3 + "'! Insert a <Map>-element in 'TeXFormulaSettings.xml'.");
    }
}
