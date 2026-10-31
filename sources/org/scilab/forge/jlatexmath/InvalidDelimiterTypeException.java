package org.scilab.forge.jlatexmath;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public class InvalidDelimiterTypeException extends JMathTeXException {
    private static final long serialVersionUID = -7170484583239756156L;

    public InvalidDelimiterTypeException() {
        super("The delimiter type was not valid! Use one of the delimiter type constants from the class 'TeXConstants'.");
    }
}
