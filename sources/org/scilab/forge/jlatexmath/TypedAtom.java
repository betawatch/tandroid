package org.scilab.forge.jlatexmath;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
public class TypedAtom extends Atom {
    private final Atom atom;
    private final int leftType;
    private final int rightType;

    public TypedAtom(int i10, int i11, Atom atom) {
        this.leftType = i10;
        this.rightType = i11;
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
