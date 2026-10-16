package org.scilab.forge.jlatexmath;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes.dex */
public class MiddleAtom extends Atom {
    public Atom base;
    public Box box = new StrutBox(0.0f, 0.0f, 0.0f, 0.0f);

    public MiddleAtom(Atom atom) {
        this.base = atom;
    }

    @Override // org.scilab.forge.jlatexmath.Atom
    public Box createBox(TeXEnvironment teXEnvironment) {
        return this.box;
    }
}
