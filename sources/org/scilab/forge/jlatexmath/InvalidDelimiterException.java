package org.scilab.forge.jlatexmath;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public class InvalidDelimiterException extends JMathTeXException {
    private static final long serialVersionUID = 212553180078002724L;

    public InvalidDelimiterException(char c, String str) {
        super("The character '" + c + "' is mapped to a symbol with the name '" + str + "', but that symbol is not defined as a delimiter (del='true') in 'TeXSymbols.xml'!");
    }

    public InvalidDelimiterException(String str) {
        super(kt6.o("The symbol with the name '", str, "' is not defined as a delimiter (del='true') in 'TeXSymbols.xml'!"));
    }
}
