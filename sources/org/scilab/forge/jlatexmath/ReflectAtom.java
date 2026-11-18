package org.scilab.forge.jlatexmath;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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
