package org.scilab.forge.jlatexmath;

import a8.p0;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes.dex */
public class SymbolNotFoundException extends JMathTeXException {
    private static final long serialVersionUID = -3005021333407670912L;

    public SymbolNotFoundException(String str) {
        super(p0.p("There's no symbol with the name '", str, "' defined in 'TeXSymbols.xml'!"));
    }
}
