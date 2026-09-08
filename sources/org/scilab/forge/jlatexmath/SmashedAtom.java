package org.scilab.forge.jlatexmath;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public class SmashedAtom extends Atom {
    private Atom at;
    private boolean d;
    private boolean h;

    public SmashedAtom(Atom atom, String str) {
        this.h = true;
        this.d = true;
        this.at = atom;
        if ("t".equals(str)) {
            this.d = false;
        } else if ("b".equals(str)) {
            this.h = false;
        }
    }

    @Override // org.scilab.forge.jlatexmath.Atom
    public Box createBox(TeXEnvironment teXEnvironment) {
        Box createBox = this.at.createBox(teXEnvironment);
        if (this.h) {
            createBox.setHeight(0.0f);
        }
        if (this.d) {
            createBox.setDepth(0.0f);
        }
        return createBox;
    }

    public SmashedAtom(Atom atom) {
        this.h = true;
        this.d = true;
        this.at = atom;
    }
}
