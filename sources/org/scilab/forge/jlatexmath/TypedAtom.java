package org.scilab.forge.jlatexmath;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public class TypedAtom extends Atom {
    private final Atom atom;
    private final int leftType;
    private final int rightType;

    public TypedAtom(int i3, int i10, Atom atom) {
        this.leftType = i3;
        this.rightType = i10;
        this.atom = atom;
        this.type_limits = atom.type_limits;
    }

    @Override // org.scilab.forge.jlatexmath.Atom
    public Box createBox(TeXEnvironment teXEnvironment) {
        return this.atom.createBox(teXEnvironment);
    }

    public Atom getBase() {
        Atom atom = this.atom;
        atom.type_limits = this.type_limits;
        return atom;
    }

    @Override // org.scilab.forge.jlatexmath.Atom
    public int getLeftType() {
        return this.leftType;
    }

    @Override // org.scilab.forge.jlatexmath.Atom
    public int getRightType() {
        return this.rightType;
    }
}
