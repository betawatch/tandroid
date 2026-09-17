package org.scilab.forge.jlatexmath;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
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
