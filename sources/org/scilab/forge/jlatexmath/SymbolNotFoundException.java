package org.scilab.forge.jlatexmath;

import a1.g;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes.dex */
public class SymbolNotFoundException extends JMathTeXException {
    private static final long serialVersionUID = -3005021333407670912L;

    public SymbolNotFoundException(String str) {
        super(g.p("There's no symbol with the name '", str, "' defined in 'TeXSymbols.xml'!"));
    }
}
