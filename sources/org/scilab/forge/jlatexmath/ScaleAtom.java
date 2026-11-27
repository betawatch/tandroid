package org.scilab.forge.jlatexmath;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public class ScaleAtom extends Atom {
    protected Atom base;
    private double xscl;
    private double yscl;

    public ScaleAtom(Atom atom, double d, double d2) {
        this.type = atom.type;
        this.base = atom;
        this.xscl = d;
        this.yscl = d2;
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
