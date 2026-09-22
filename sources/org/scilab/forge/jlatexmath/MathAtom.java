package org.scilab.forge.jlatexmath;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
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
