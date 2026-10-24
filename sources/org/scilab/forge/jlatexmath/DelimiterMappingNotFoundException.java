package org.scilab.forge.jlatexmath;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes.dex */
public class DelimiterMappingNotFoundException extends JMathTeXException {
    private static final long serialVersionUID = 273456491396361682L;

    public DelimiterMappingNotFoundException(char c10) {
        super("No mapping found for the character '" + c10 + "'! Insert a <Map>-element in 'TeXFormulaSettings.xml'.");
    }
}
