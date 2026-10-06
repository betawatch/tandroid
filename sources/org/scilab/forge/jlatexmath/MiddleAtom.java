package org.scilab.forge.jlatexmath;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
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
