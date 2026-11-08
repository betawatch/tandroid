package org.scilab.forge.jlatexmath;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public class RaiseAtom extends Atom {
    private Atom base;
    private float d;
    private int dunit;
    private float h;
    private int hunit;
    private float r;
    private int runit;

    public RaiseAtom(Atom atom, int i7, float f10, int i10, float f11, int i11, float f12) {
        this.base = atom;
        this.runit = i7;
        this.r = f10;
        this.hunit = i10;
        this.h = f11;
        this.dunit = i11;
        this.d = f12;
    }

    @Override // org.scilab.forge.jlatexmath.Atom
    public Box createBox(TeXEnvironment teXEnvironment) {
        Box createBox = this.base.createBox(teXEnvironment);
        int i7 = this.runit;
        if (i7 == -1) {
            createBox.setShift(0.0f);
        } else {
            createBox.setShift(SpaceAtom.getFactor(i7, teXEnvironment) * (-this.r));
        }
        if (this.hunit == -1) {
            return createBox;
        }
        HorizontalBox horizontalBox = new HorizontalBox(createBox);
        horizontalBox.setHeight(SpaceAtom.getFactor(this.hunit, teXEnvironment) * this.h);
        int i10 = this.dunit;
        if (i10 == -1) {
            horizontalBox.setDepth(0.0f);
            return horizontalBox;
        }
        horizontalBox.setDepth(SpaceAtom.getFactor(i10, teXEnvironment) * this.d);
        return horizontalBox;
    }

    @Override // org.scilab.forge.jlatexmath.Atom
    public int getLeftType() {
        return this.base.getLeftType();
    }

    @Override // org.scilab.forge.jlatexmath.Atom
    public int getRightType() {
        return this.base.getRightType();
    }
}
