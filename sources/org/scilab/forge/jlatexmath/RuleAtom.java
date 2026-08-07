package org.scilab.forge.jlatexmath;

/* loaded from: classes3.dex */
public class RuleAtom extends Atom {
    private static final float MAX_LENGTH = 4096.0f;
    private float h;
    private int hunit;
    private float r;
    private int runit;
    private float w;
    private int wunit;

    public RuleAtom(int i, float f, int i2, float f2, int i3, float f3) {
        this.wunit = i;
        this.hunit = i2;
        this.runit = i3;
        this.w = f;
        this.h = f2;
        this.r = f3;
    }

    @Override // org.scilab.forge.jlatexmath.Atom
    public Box createBox(TeXEnvironment teXEnvironment) {
        float factor = this.w * SpaceAtom.getFactor(this.wunit, teXEnvironment);
        float factor2 = this.h * SpaceAtom.getFactor(this.hunit, teXEnvironment);
        float factor3 = this.r * SpaceAtom.getFactor(this.runit, teXEnvironment);
        if (!DelimiterFactory$$ExternalSyntheticBackport0.m(factor) || factor > MAX_LENGTH) {
            factor = MAX_LENGTH;
        }
        if (!DelimiterFactory$$ExternalSyntheticBackport0.m(factor2) || factor2 > MAX_LENGTH) {
            factor2 = MAX_LENGTH;
        }
        return new HorizontalRule(factor2, factor, factor3);
    }
}
