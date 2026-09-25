package org.scilab.forge.jlatexmath;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
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
