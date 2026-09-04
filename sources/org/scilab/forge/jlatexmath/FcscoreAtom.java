package org.scilab.forge.jlatexmath;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public class FcscoreAtom extends Atom {
    private int N;

    public FcscoreAtom(int i10) {
        this.N = i10;
    }

    @Override // org.scilab.forge.jlatexmath.Atom
    public Box createBox(TeXEnvironment teXEnvironment) {
        float factor = SpaceAtom.getFactor(5, teXEnvironment) * 12.0f;
        int i10 = this.N;
        return new FcscoreBox(i10 == 5 ? 4 : i10, 1.0f * factor, 0.07f * factor, factor * 0.125f, i10 == 5);
    }

    @Override // org.scilab.forge.jlatexmath.Atom
    public int getLeftType() {
        return 0;
    }

    @Override // org.scilab.forge.jlatexmath.Atom
    public int getRightType() {
        return 0;
    }
}
