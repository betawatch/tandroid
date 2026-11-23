package org.scilab.forge.jlatexmath;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
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
