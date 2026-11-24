package org.scilab.forge.jlatexmath;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public class InvalidDelimiterException extends JMathTeXException {
    private static final long serialVersionUID = 212553180078002724L;

    public InvalidDelimiterException(char c, String str) {
        super("The character '" + c + "' is mapped to a symbol with the name '" + str + "', but that symbol is not defined as a delimiter (del='true') in 'TeXSymbols.xml'!");
    }

    public InvalidDelimiterException(String str) {
        super(tb4.y("The symbol with the name '", str, "' is not defined as a delimiter (del='true') in 'TeXSymbols.xml'!"));
    }
}
