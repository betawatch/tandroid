package org.scilab.forge.jlatexmath;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
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
