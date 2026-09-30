package org.scilab.forge.jlatexmath;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes.dex */
public class PhantomAtom extends Atom implements Row {
    private boolean d;
    private RowAtom elements;
    private boolean h;
    private boolean w;

    public PhantomAtom(Atom atom) {
        this.w = true;
        this.h = true;
        this.d = true;
        if (atom == null) {
            this.elements = new RowAtom();
        } else {
            this.elements = new RowAtom(atom);
        }
    }

    @Override // org.scilab.forge.jlatexmath.Atom
    public Box createBox(TeXEnvironment teXEnvironment) {
        Box createBox = this.elements.createBox(teXEnvironment);
        return new StrutBox(this.w ? createBox.getWidth() : 0.0f, this.h ? createBox.getHeight() : 0.0f, this.d ? createBox.getDepth() : 0.0f, createBox.getShift());
    }

    @Override // org.scilab.forge.jlatexmath.Atom
    public int getLeftType() {
        return this.elements.getLeftType();
    }

    @Override // org.scilab.forge.jlatexmath.Atom
    public int getRightType() {
        return this.elements.getRightType();
    }

    @Override // org.scilab.forge.jlatexmath.Row
    public void setPreviousAtom(Dummy dummy) {
        this.elements.setPreviousAtom(dummy);
    }

    public PhantomAtom(Atom atom, boolean z10, boolean z11, boolean z12) {
        this(atom);
        this.w = z10;
        this.h = z11;
        this.d = z12;
    }
}
