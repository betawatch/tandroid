package org.scilab.forge.jlatexmath;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public class InvalidUnitException extends JMathTeXException {
    private static final long serialVersionUID = 860909774647515072L;

    public InvalidUnitException() {
        super("The delimiter type was not valid! Use one of the unit constants from the class 'TeXConstants'.");
    }
}
