package org.scilab.forge.jlatexmath;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public class MathAtom extends Atom {
    protected Atom base;
    private int style;

    public MathAtom(Atom atom, int i) {
        this.base = atom;
        this.style = i;
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
