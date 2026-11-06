package org.scilab.forge.jlatexmath;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public class MathAtom extends Atom {
    protected Atom base;
    private int style;

    public MathAtom(Atom atom, int i7) {
        this.base = atom;
        this.style = i7;
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
