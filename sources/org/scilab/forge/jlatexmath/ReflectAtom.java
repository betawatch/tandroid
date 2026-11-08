package org.scilab.forge.jlatexmath;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public class ReflectAtom extends Atom {
    private Atom base;

    public ReflectAtom(Atom atom) {
        this.type = atom.type;
        this.base = atom;
    }

    @Override // org.scilab.forge.jlatexmath.Atom
    public Box createBox(TeXEnvironment teXEnvironment) {
        return new ReflectBox(this.base.createBox(teXEnvironment));
    }
}
