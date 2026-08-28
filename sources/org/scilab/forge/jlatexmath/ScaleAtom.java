package org.scilab.forge.jlatexmath;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public class ScaleAtom extends Atom {
    protected Atom base;
    private double xscl;
    private double yscl;

    public ScaleAtom(Atom atom, double d, double d9) {
        this.type = atom.type;
        this.base = atom;
        this.xscl = d;
        this.yscl = d9;
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
