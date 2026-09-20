package org.scilab.forge.jlatexmath;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
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
