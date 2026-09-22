package org.scilab.forge.jlatexmath;

import a4.a;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes.dex */
public class InvalidDelimiterException extends JMathTeXException {
    private static final long serialVersionUID = 212553180078002724L;

    public InvalidDelimiterException(String str) {
        super(a.q("The symbol with the name '", str, "' is not defined as a delimiter (del='true') in 'TeXSymbols.xml'!"));
    }

    public InvalidDelimiterException(char c10, String str) {
        super("The character '" + c10 + "' is mapped to a symbol with the name '" + str + "', but that symbol is not defined as a delimiter (del='true') in 'TeXSymbols.xml'!");
    }
}
