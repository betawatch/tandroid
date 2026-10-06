package org.scilab.forge.jlatexmath;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
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
