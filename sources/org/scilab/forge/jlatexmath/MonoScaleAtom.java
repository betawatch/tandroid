package org.scilab.forge.jlatexmath;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes.dex */
public class MonoScaleAtom extends ScaleAtom {
    private float factor;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public MonoScaleAtom(Atom atom, float f10) {
        super(atom, r2, r2);
        double d = f10;
        this.factor = f10;
    }

    @Override // org.scilab.forge.jlatexmath.ScaleAtom, org.scilab.forge.jlatexmath.Atom
    public Box createBox(TeXEnvironment teXEnvironment) {
        TeXEnvironment copy = teXEnvironment.copy();
        float scaleFactor = copy.getScaleFactor();
        copy.setScaleFactor(this.factor);
        return new ScaleBox(this.base.createBox(copy), this.factor / scaleFactor);
    }
}
