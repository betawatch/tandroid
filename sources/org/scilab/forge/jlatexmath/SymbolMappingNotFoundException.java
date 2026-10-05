package org.scilab.forge.jlatexmath;

import a4.a;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes.dex */
public class SymbolMappingNotFoundException extends JMathTeXException {
    private static final long serialVersionUID = 2659192520874275262L;

    public SymbolMappingNotFoundException(String str) {
        super(a.q("No mapping found for the symbol '", str, "'! Insert a <SymbolMapping>-element in 'DefaultTeXFont.xml'."));
    }
}
