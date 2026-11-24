package org.scilab.forge.jlatexmath;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public class BigOperatorAtom extends Atom {
    protected Atom base;
    private boolean limits;
    private boolean limitsSet;
    private Atom over;
    private Atom under;

    public BigOperatorAtom(Atom atom, Atom atom2, Atom atom3) {
        this.limitsSet = false;
        this.limits = false;
        this.base = atom;
        this.under = atom2;
        this.over = atom3;
        this.type = 1;
    }

    private static Box changeWidth(Box box, float f) {
        return (box == null || Math.abs(f - box.getWidth()) <= 1.0E-7f) ? box : new HorizontalBox(box, f, 2);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0168 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0075  */
    @Override // org.scilab.forge.jlatexmath.Atom
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Box createBox(TeXEnvironment teXEnvironment) {
        Atom atom;
        RowAtom rowAtom;
        boolean z;
        int i;
        Box horizontalBox;
        float f;
        Box changeWidth;
        float f2;
        TeXFont teXFont = teXEnvironment.getTeXFont();
        int style = teXEnvironment.getStyle();
        Atom atom2 = this.base;
        if (atom2 instanceof TypedAtom) {
            atom = ((TypedAtom) atom2).getBase();
            if (atom instanceof RowAtom) {
                rowAtom = (RowAtom) atom;
                if (rowAtom.lookAtLastAtom && this.base.type_limits != 2) {
                    atom = rowAtom.getLastAtom();
                    this.base = atom;
                    z = this.limitsSet;
                    if ((!z && !this.limits) || ((!z && style >= 2) || (i = atom.type_limits) == 1 || (i == 0 && style >= 2))) {
                        if (rowAtom == null) {
                            return new ScriptsAtom(this.base, this.under, this.over).createBox(teXEnvironment);
                        }
                        rowAtom.add(new ScriptsAtom(this.base, this.under, this.over));
                        Box createBox = rowAtom.createBox(teXEnvironment);
                        rowAtom.getLastAtom();
                        rowAtom.add(this.base);
                        this.base = atom2;
                        return createBox;
                    }
                    if ((atom instanceof SymbolAtom) || atom.type != 1) {
                        horizontalBox = new HorizontalBox(atom != null ? new StrutBox(0.0f, 0.0f, 0.0f, 0.0f) : atom.createBox(teXEnvironment));
                        f = 0.0f;
                    } else {
                        Char r5 = teXFont.getChar(((SymbolAtom) atom).getName(), style);
                        horizontalBox = this.base.createBox(teXEnvironment);
                        f = r5.getItalic();
                    }
                    Atom atom3 = this.over;
                    Box createBox2 = atom3 == null ? atom3.createBox(teXEnvironment.supStyle()) : null;
                    Atom atom4 = this.under;
                    Box createBox3 = atom4 != null ? atom4.createBox(teXEnvironment.subStyle()) : null;
                    float max = Math.max(Math.max(createBox2 != null ? 0.0f : createBox2.getWidth(), horizontalBox.getWidth()), createBox3 != null ? 0.0f : createBox3.getWidth());
                    changeWidth = changeWidth(createBox2, max);
                    Box changeWidth2 = changeWidth(horizontalBox, max);
                    Box changeWidth3 = changeWidth(createBox3, max);
                    VerticalBox verticalBox = new VerticalBox();
                    float bigOpSpacing5 = teXFont.getBigOpSpacing5(style);
                    if (this.over == null) {
                        verticalBox.add(new StrutBox(0.0f, bigOpSpacing5, 0.0f, 0.0f));
                        changeWidth.setShift(f / 2.0f);
                        verticalBox.add(changeWidth);
                        f2 = Math.max(teXFont.getBigOpSpacing1(style), teXFont.getBigOpSpacing3(style) - changeWidth.getDepth());
                        verticalBox.add(new StrutBox(0.0f, f2, 0.0f, 0.0f));
                        verticalBox.getHeight();
                        verticalBox.getDepth();
                    } else {
                        f2 = 0.0f;
                    }
                    verticalBox.add(changeWidth2);
                    if (this.under != null) {
                        verticalBox.add(new StrutBox(0.0f, Math.max(teXFont.getBigOpSpacing2(style), teXFont.getBigOpSpacing4(style) - changeWidth3.getHeight()), 0.0f, 0.0f));
                        changeWidth3.setShift((-f) / 2.0f);
                        verticalBox.add(changeWidth3);
                        verticalBox.add(new StrutBox(0.0f, bigOpSpacing5, 0.0f, 0.0f));
                    }
                    float height = changeWidth2.getHeight();
                    float depth = verticalBox.getDepth() + verticalBox.getHeight();
                    if (changeWidth != null) {
                        height += changeWidth.getDepth() + changeWidth.getHeight() + bigOpSpacing5 + f2;
                    }
                    verticalBox.setHeight(height);
                    verticalBox.setDepth(depth - height);
                    if (rowAtom != null) {
                        return verticalBox;
                    }
                    HorizontalBox horizontalBox2 = new HorizontalBox(rowAtom.createBox(teXEnvironment));
                    rowAtom.add(this.base);
                    horizontalBox2.add(verticalBox);
                    this.base = atom2;
                    return horizontalBox2;
                }
            }
            this.base = atom;
        } else {
            atom = atom2;
        }
        rowAtom = null;
        z = this.limitsSet;
        if (!z) {
        }
        if (atom instanceof SymbolAtom) {
        }
        horizontalBox = new HorizontalBox(atom != null ? new StrutBox(0.0f, 0.0f, 0.0f, 0.0f) : atom.createBox(teXEnvironment));
        f = 0.0f;
        Atom atom32 = this.over;
        if (atom32 == null) {
        }
        Atom atom42 = this.under;
        if (atom42 != null) {
        }
        float max2 = Math.max(Math.max(createBox2 != null ? 0.0f : createBox2.getWidth(), horizontalBox.getWidth()), createBox3 != null ? 0.0f : createBox3.getWidth());
        changeWidth = changeWidth(createBox2, max2);
        Box changeWidth22 = changeWidth(horizontalBox, max2);
        Box changeWidth32 = changeWidth(createBox3, max2);
        VerticalBox verticalBox2 = new VerticalBox();
        float bigOpSpacing52 = teXFont.getBigOpSpacing5(style);
        if (this.over == null) {
        }
        verticalBox2.add(changeWidth22);
        if (this.under != null) {
        }
        float height2 = changeWidth22.getHeight();
        float depth2 = verticalBox2.getDepth() + verticalBox2.getHeight();
        if (changeWidth != null) {
        }
        verticalBox2.setHeight(height2);
        verticalBox2.setDepth(depth2 - height2);
        if (rowAtom != null) {
        }
    }

    public BigOperatorAtom(Atom atom, Atom atom2, Atom atom3, boolean z) {
        this(atom, atom2, atom3);
        this.limits = z;
        this.limitsSet = true;
    }
}
