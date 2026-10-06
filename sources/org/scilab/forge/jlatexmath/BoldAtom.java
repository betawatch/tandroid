package org.scilab.forge.jlatexmath;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes.dex */
public class BoldAtom extends Atom {
    private Atom base;

    public BoldAtom(Atom atom) {
        this.base = atom;
    }

    @Override // org.scilab.forge.jlatexmath.Atom
    public Box createBox(TeXEnvironment teXEnvironment) {
        if (this.base == null) {
            return new StrutBox(0.0f, 0.0f, 0.0f, 0.0f);
        }
        TeXEnvironment copy = teXEnvironment.copy(teXEnvironment.getTeXFont().copy());
        copy.getTeXFont().setBold(true);
        return this.base.createBox(copy);
    }
}
