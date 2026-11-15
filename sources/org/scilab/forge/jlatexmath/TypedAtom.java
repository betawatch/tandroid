package org.scilab.forge.jlatexmath;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public class TypedAtom extends Atom {
    private final Atom atom;
    private final int leftType;
    private final int rightType;

    public TypedAtom(int i7, int i10, Atom atom) {
        this.leftType = i7;
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
