package org.scilab.forge.jlatexmath;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public class RuleAtom extends Atom {
    private static final float MAX_LENGTH = 4096.0f;
    private float h;
    private int hunit;
    private float r;
    private int runit;
    private float w;
    private int wunit;

    public RuleAtom(int i10, float f7, int i11, float f10, int i12, float f11) {
        this.wunit = i10;
        this.hunit = i11;
        this.runit = i12;
        this.w = f7;
        this.h = f10;
        this.r = f11;
    }

    @Override // org.scilab.forge.jlatexmath.Atom
    public Box createBox(TeXEnvironment teXEnvironment) {
        float factor = SpaceAtom.getFactor(this.wunit, teXEnvironment) * this.w;
        float factor2 = SpaceAtom.getFactor(this.hunit, teXEnvironment) * this.h;
        float factor3 = SpaceAtom.getFactor(this.runit, teXEnvironment) * this.r;
        if (Float.isInfinite(factor) || Float.isNaN(factor) || factor > MAX_LENGTH) {
            factor = MAX_LENGTH;
        }
        if (Float.isInfinite(factor2) || Float.isNaN(factor2) || factor2 > MAX_LENGTH) {
            factor2 = MAX_LENGTH;
        }
        return new HorizontalRule(factor2, factor, factor3);
    }
}
