package org.scilab.forge.jlatexmath;

/* loaded from: classes3.dex */
public class InvalidUnitException extends JMathTeXException {
    protected InvalidUnitException() {
        super("The delimiter type was not valid! Use one of the unit constants from the class 'TeXConstants'.");
    }
}
