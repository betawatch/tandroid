package org.scilab.forge.jlatexmath;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public class InvalidDelimiterTypeException extends JMathTeXException {
    private static final long serialVersionUID = -7170484583239756156L;

    public InvalidDelimiterTypeException() {
        super("The delimiter type was not valid! Use one of the delimiter type constants from the class 'TeXConstants'.");
    }
}
