package org.scilab.forge.jlatexmath;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes.dex */
public class ItAtom extends Atom {
    private Atom base;

    public ItAtom(Atom atom) {
        this.base = atom;
    }

    @Override // org.scilab.forge.jlatexmath.Atom
    public Box createBox(TeXEnvironment teXEnvironment) {
        if (this.base == null) {
            return new StrutBox(0.0f, 0.0f, 0.0f, 0.0f);
        }
        TeXEnvironment copy = teXEnvironment.copy(teXEnvironment.getTeXFont().copy());
        copy.getTeXFont().setIt(true);
        return this.base.createBox(copy);
    }
}
