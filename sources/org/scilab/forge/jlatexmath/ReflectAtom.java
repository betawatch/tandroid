package org.scilab.forge.jlatexmath;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
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
