package org.scilab.forge.jlatexmath;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes.dex */
public class InvalidUnitException extends JMathTeXException {
    private static final long serialVersionUID = 860909774647515072L;

    public InvalidUnitException() {
        super("The delimiter type was not valid! Use one of the unit constants from the class 'TeXConstants'.");
    }
}
