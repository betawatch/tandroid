package org.scilab.forge.jlatexmath;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
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
