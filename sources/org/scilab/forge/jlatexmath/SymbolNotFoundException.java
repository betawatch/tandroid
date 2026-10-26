package org.scilab.forge.jlatexmath;

import a1.g;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public class SymbolNotFoundException extends JMathTeXException {
    private static final long serialVersionUID = -3005021333407670912L;

    public SymbolNotFoundException(String str) {
        super(g.p("There's no symbol with the name '", str, "' defined in 'TeXSymbols.xml'!"));
    }
}
