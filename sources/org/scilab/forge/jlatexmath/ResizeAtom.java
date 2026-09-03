package org.scilab.forge.jlatexmath;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public class ResizeAtom extends Atom {
    private Atom base;
    private float h;
    private int hunit;
    private boolean keepaspectratio;
    private float w;
    private int wunit;

    public ResizeAtom(Atom atom, String str, String str2, boolean z4) {
        this.type = atom.type;
        this.base = atom;
        this.keepaspectratio = z4;
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
        double d10;
        double d11;
        Box createBox = this.base.createBox(teXEnvironment);
        int i10 = this.wunit;
        if (i10 == -1 && this.hunit == -1) {
            return createBox;
        }
        if (i10 == -1 || this.hunit == -1) {
            if (i10 == -1 || this.hunit != -1) {
                factor = SpaceAtom.getFactor(this.hunit, teXEnvironment) * this.h;
                f10 = createBox.height;
            } else {
                factor = SpaceAtom.getFactor(i10, teXEnvironment) * this.w;
                f10 = createBox.width;
            }
            d = factor / f10;
        } else {
            double factor2 = (SpaceAtom.getFactor(i10, teXEnvironment) * this.w) / createBox.width;
            double factor3 = (SpaceAtom.getFactor(this.hunit, teXEnvironment) * this.h) / createBox.height;
            if (!this.keepaspectratio) {
                d10 = factor3;
                d11 = factor2;
                return new ScaleBox(createBox, d11, d10);
            }
            d = Math.min(factor2, factor3);
        }
        d11 = d;
        d10 = d11;
        return new ScaleBox(createBox, d11, d10);
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
