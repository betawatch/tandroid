package org.scilab.forge.jlatexmath;

/* loaded from: classes3.dex */
public class ItAtom extends Atom {
    private Atom base;

    public ItAtom(Atom atom) {
        this.base = atom;
    }

    @Override // org.scilab.forge.jlatexmath.Atom
    public Box createBox(TeXEnvironment teXEnvironment) {
        if (this.base != null) {
            TeXEnvironment copy = teXEnvironment.copy(teXEnvironment.getTeXFont().copy());
            copy.getTeXFont().setIt(true);
            return this.base.createBox(copy);
        }
        return new StrutBox(0.0f, 0.0f, 0.0f, 0.0f);
    }
}
