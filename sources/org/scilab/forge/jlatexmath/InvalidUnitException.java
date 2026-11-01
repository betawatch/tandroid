package org.scilab.forge.jlatexmath;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public class InvalidUnitException extends JMathTeXException {
    private static final long serialVersionUID = 860909774647515072L;

    public InvalidUnitException() {
        super("The delimiter type was not valid! Use one of the unit constants from the class 'TeXConstants'.");
    }
}
