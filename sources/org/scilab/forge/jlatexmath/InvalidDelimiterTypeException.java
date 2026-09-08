package org.scilab.forge.jlatexmath;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public class InvalidDelimiterTypeException extends JMathTeXException {
    private static final long serialVersionUID = -7170484583239756156L;

    public InvalidDelimiterTypeException() {
        super("The delimiter type was not valid! Use one of the delimiter type constants from the class 'TeXConstants'.");
    }
}
