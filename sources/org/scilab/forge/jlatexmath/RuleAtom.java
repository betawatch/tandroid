package org.scilab.forge.jlatexmath;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public class RuleAtom extends Atom {
    private static final float MAX_LENGTH = 4096.0f;
    private float h;
    private int hunit;
    private float r;
    private int runit;
    private float w;
    private int wunit;

    public RuleAtom(int i7, float f10, int i10, float f11, int i11, float f12) {
        this.wunit = i7;
        this.hunit = i10;
        this.runit = i11;
        this.w = f10;
        this.h = f11;
        this.r = f12;
    }

    @Override // org.scilab.forge.jlatexmath.Atom
    public Box createBox(TeXEnvironment teXEnvironment) {
        float factor = SpaceAtom.getFactor(this.wunit, teXEnvironment) * this.w;
        float factor2 = SpaceAtom.getFactor(this.hunit, teXEnvironment) * this.h;
        float factor3 = SpaceAtom.getFactor(this.runit, teXEnvironment) * this.r;
        if (Float.isInfinite(factor) || Float.isNaN(factor) || factor > MAX_LENGTH) {
            factor = 4096.0f;
        }
        if (Float.isInfinite(factor2) || Float.isNaN(factor2) || factor2 > MAX_LENGTH) {
            factor2 = 4096.0f;
        }
        return new HorizontalRule(factor2, factor, factor3);
    }
}
