package org.scilab.forge.jlatexmath;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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
