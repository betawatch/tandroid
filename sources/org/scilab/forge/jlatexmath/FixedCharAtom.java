package org.scilab.forge.jlatexmath;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes.dex */
public class FixedCharAtom extends CharSymbol {
    private final CharFont cf;

    public FixedCharAtom(CharFont charFont) {
        this.cf = charFont;
    }

    @Override // org.scilab.forge.jlatexmath.Atom
    public Box createBox(TeXEnvironment teXEnvironment) {
        return new CharBox(teXEnvironment.getTeXFont().getChar(this.cf, teXEnvironment.getStyle()));
    }

    @Override // org.scilab.forge.jlatexmath.CharSymbol
    public CharFont getCharFont(TeXFont teXFont) {
        return this.cf;
    }
}
