package org.scilab.forge.jlatexmath;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes.dex */
public class MonoScaleAtom extends ScaleAtom {
    private float factor;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public MonoScaleAtom(Atom atom, float f7) {
        super(atom, r2, r2);
        double d = f7;
        this.factor = f7;
    }

    @Override // org.scilab.forge.jlatexmath.ScaleAtom, org.scilab.forge.jlatexmath.Atom
    public Box createBox(TeXEnvironment teXEnvironment) {
        TeXEnvironment copy = teXEnvironment.copy();
        float scaleFactor = copy.getScaleFactor();
        copy.setScaleFactor(this.factor);
        return new ScaleBox(this.base.createBox(copy), this.factor / scaleFactor);
    }
}
