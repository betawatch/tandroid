package org.scilab.forge.jlatexmath;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
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
