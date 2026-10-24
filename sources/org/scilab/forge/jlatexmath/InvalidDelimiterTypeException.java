package org.scilab.forge.jlatexmath;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes.dex */
public class InvalidDelimiterTypeException extends JMathTeXException {
    private static final long serialVersionUID = -7170484583239756156L;

    public InvalidDelimiterTypeException() {
        super("The delimiter type was not valid! Use one of the delimiter type constants from the class 'TeXConstants'.");
    }
}
