package org.scilab.forge.jlatexmath;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes.dex */
public class ScaleAtom extends Atom {
    protected Atom base;
    private double xscl;
    private double yscl;

    public ScaleAtom(Atom atom, double d, double d10) {
        this.type = atom.type;
        this.base = atom;
        this.xscl = d;
        this.yscl = d10;
    }

    @Override // org.scilab.forge.jlatexmath.Atom
    public Box createBox(TeXEnvironment teXEnvironment) {
        return new ScaleBox(this.base.createBox(teXEnvironment), this.xscl, this.yscl);
    }

    @Override // org.scilab.forge.jlatexmath.Atom
    public int getLeftType() {
        return this.base.getLeftType();
    }

    @Override // org.scilab.forge.jlatexmath.Atom
    public int getRightType() {
        return this.base.getRightType();
    }

    public ScaleAtom(Atom atom, double d) {
        this.type = atom.type;
        this.base = atom;
        this.xscl = d;
        this.yscl = d;
    }
}
