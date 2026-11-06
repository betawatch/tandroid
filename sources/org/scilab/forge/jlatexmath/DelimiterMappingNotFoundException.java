package org.scilab.forge.jlatexmath;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public class DelimiterMappingNotFoundException extends JMathTeXException {
    private static final long serialVersionUID = 273456491396361682L;

    public DelimiterMappingNotFoundException(char c10) {
        super("No mapping found for the character '" + c10 + "'! Insert a <Map>-element in 'TeXFormulaSettings.xml'.");
    }
}
