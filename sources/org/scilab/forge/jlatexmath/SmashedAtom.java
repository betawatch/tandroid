package org.scilab.forge.jlatexmath;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
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
