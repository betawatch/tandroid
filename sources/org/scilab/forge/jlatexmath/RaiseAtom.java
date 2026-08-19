package org.scilab.forge.jlatexmath;

/* loaded from: classes3.dex */
public class RaiseAtom extends Atom {
    private Atom base;
    private float d;
    private int dunit;
    private float h;
    private int hunit;
    private float r;
    private int runit;

    public RaiseAtom(Atom atom, int i, float f, int i2, float f2, int i3, float f3) {
        this.base = atom;
        this.runit = i;
        this.r = f;
        this.hunit = i2;
        this.h = f2;
        this.dunit = i3;
        this.d = f3;
    }

    @Override // org.scilab.forge.jlatexmath.Atom
    public int getLeftType() {
        return this.base.getLeftType();
    }

    @Override // org.scilab.forge.jlatexmath.Atom
    public int getRightType() {
        return this.base.getRightType();
    }

    @Override // org.scilab.forge.jlatexmath.Atom
    public Box createBox(TeXEnvironment teXEnvironment) {
        Box createBox = this.base.createBox(teXEnvironment);
        int i = this.runit;
        if (i == -1) {
            createBox.setShift(0.0f);
        } else {
            createBox.setShift((-this.r) * SpaceAtom.getFactor(i, teXEnvironment));
        }
        if (this.hunit == -1) {
            return createBox;
        }
        HorizontalBox horizontalBox = new HorizontalBox(createBox);
        horizontalBox.setHeight(this.h * SpaceAtom.getFactor(this.hunit, teXEnvironment));
        int i2 = this.dunit;
        if (i2 == -1) {
            horizontalBox.setDepth(0.0f);
            return horizontalBox;
        }
        horizontalBox.setDepth(this.d * SpaceAtom.getFactor(i2, teXEnvironment));
        return horizontalBox;
    }
}
