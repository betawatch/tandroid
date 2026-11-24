package org.scilab.forge.jlatexmath;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public class SmallCapAtom extends Atom {
    protected Atom base;

    public SmallCapAtom(Atom atom) {
        this.base = atom;
    }

    @Override // org.scilab.forge.jlatexmath.Atom
    public Box createBox(TeXEnvironment teXEnvironment) {
        boolean smallCap = teXEnvironment.getSmallCap();
        teXEnvironment.setSmallCap(true);
        Box createBox = this.base.createBox(teXEnvironment);
        teXEnvironment.setSmallCap(smallCap);
        return createBox;
    }
}
