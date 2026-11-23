package org.scilab.forge.jlatexmath;

import a8.p0;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes.dex */
public class SymbolNotFoundException extends JMathTeXException {
    private static final long serialVersionUID = -3005021333407670912L;

    public SymbolNotFoundException(String str) {
        super(p0.p("There's no symbol with the name '", str, "' defined in 'TeXSymbols.xml'!"));
    }
}
