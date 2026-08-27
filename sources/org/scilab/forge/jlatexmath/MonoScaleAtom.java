package org.scilab.forge.jlatexmath;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
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
