package org.scilab.forge.jlatexmath;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public class ResizeAtom extends Atom {
    private Atom base;
    private float h;
    private int hunit;
    private boolean keepaspectratio;
    private float w;
    private int wunit;

    public ResizeAtom(Atom atom, String str, String str2, boolean z9) {
        this.type = atom.type;
        this.base = atom;
        this.keepaspectratio = z9;
        float[] length = SpaceAtom.getLength(str == null ? "" : str);
        float[] length2 = SpaceAtom.getLength(str2 == null ? "" : str2);
        if (length.length != 2) {
            this.wunit = -1;
        } else {
            this.wunit = (int) length[0];
            this.w = length[1];
        }
        if (length2.length != 2) {
            this.hunit = -1;
        } else {
            this.hunit = (int) length2[0];
            this.h = length2[1];
        }
    }

    @Override // org.scilab.forge.jlatexmath.Atom
    public Box createBox(TeXEnvironment teXEnvironment) {
        float factor;
        float f10;
        double d;
        double d2;
        double d10;
        Box createBox = this.base.createBox(teXEnvironment);
        int i7 = this.wunit;
        if (i7 == -1 && this.hunit == -1) {
            return createBox;
        }
        if (i7 == -1 || this.hunit == -1) {
            if (i7 == -1 || this.hunit != -1) {
                factor = SpaceAtom.getFactor(this.hunit, teXEnvironment) * this.h;
                f10 = createBox.height;
            } else {
                factor = SpaceAtom.getFactor(i7, teXEnvironment) * this.w;
                f10 = createBox.width;
            }
            d = factor / f10;
        } else {
            double factor2 = (SpaceAtom.getFactor(i7, teXEnvironment) * this.w) / createBox.width;
            double factor3 = (SpaceAtom.getFactor(this.hunit, teXEnvironment) * this.h) / createBox.height;
            if (!this.keepaspectratio) {
                d2 = factor3;
                d10 = factor2;
                return new ScaleBox(createBox, d10, d2);
            }
            d = Math.min(factor2, factor3);
        }
        d10 = d;
        d2 = d10;
        return new ScaleBox(createBox, d10, d2);
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
