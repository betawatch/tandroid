package org.scilab.forge.jlatexmath;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public class FcscoreAtom extends Atom {
    private int N;

    public FcscoreAtom(int i) {
        this.N = i;
    }

    @Override // org.scilab.forge.jlatexmath.Atom
    public Box createBox(TeXEnvironment teXEnvironment) {
        float factor = SpaceAtom.getFactor(5, teXEnvironment) * 12.0f;
        int i = this.N;
        return new FcscoreBox(i == 5 ? 4 : i, 1.0f * factor, 0.07f * factor, 0.125f * factor, i == 5);
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
