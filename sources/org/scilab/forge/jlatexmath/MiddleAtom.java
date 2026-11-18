package org.scilab.forge.jlatexmath;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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
