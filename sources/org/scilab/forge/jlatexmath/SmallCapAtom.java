package org.scilab.forge.jlatexmath;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
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
