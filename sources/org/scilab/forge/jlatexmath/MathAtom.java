package org.scilab.forge.jlatexmath;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public class MathAtom extends Atom {
    protected Atom base;
    private int style;

    public MathAtom(Atom atom, int i10) {
        this.base = atom;
        this.style = i10;
    }

    @Override // org.scilab.forge.jlatexmath.Atom
    public Box createBox(TeXEnvironment teXEnvironment) {
        TeXEnvironment copy = teXEnvironment.copy(teXEnvironment.getTeXFont().copy());
        copy.getTeXFont().setRoman(false);
        int style = copy.getStyle();
        copy.setStyle(this.style);
        Box createBox = this.base.createBox(copy);
        copy.setStyle(style);
        return createBox;
    }
}
