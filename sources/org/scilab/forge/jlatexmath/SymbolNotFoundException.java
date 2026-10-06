package org.scilab.forge.jlatexmath;

import a4.a;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes.dex */
public class SymbolNotFoundException extends JMathTeXException {
    private static final long serialVersionUID = -3005021333407670912L;

    public SymbolNotFoundException(String str) {
        super(a.q("There's no symbol with the name '", str, "' defined in 'TeXSymbols.xml'!"));
    }
}
