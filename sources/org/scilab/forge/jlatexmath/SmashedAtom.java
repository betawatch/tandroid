package org.scilab.forge.jlatexmath;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
