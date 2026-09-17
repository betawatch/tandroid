package org.scilab.forge.jlatexmath;

import a4.a;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes.dex */
public class SymbolNotFoundException extends JMathTeXException {
    private static final long serialVersionUID = -3005021333407670912L;

    public SymbolNotFoundException(String str) {
        super(a.p("There's no symbol with the name '", str, "' defined in 'TeXSymbols.xml'!"));
    }
}
