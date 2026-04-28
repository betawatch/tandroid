package org.scilab.forge.jlatexmath;

/* loaded from: classes3.dex */
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

    public BigOperatorAtom(Atom atom, Atom atom2, Atom atom3, boolean z) {
        this(atom, atom2, atom3);
        this.limits = z;
        this.limitsSet = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x016c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0079  */
    @Override // org.scilab.forge.jlatexmath.Atom
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Box createBox(TeXEnvironment teXEnvironment) {
        RowAtom rowAtom;
        boolean z;
        Atom atom;
        int i;
        Box horizontalBox;
        float f;
        Box changeWidth;
        float f2;
        TeXFont teXFont = teXEnvironment.getTeXFont();
        int style = teXEnvironment.getStyle();
        Atom atom2 = this.base;
        if (atom2 instanceof TypedAtom) {
            Atom base = ((TypedAtom) atom2).getBase();
            if (base instanceof RowAtom) {
                rowAtom = (RowAtom) base;
                if (rowAtom.lookAtLastAtom && this.base.type_limits != 2) {
                    this.base = rowAtom.getLastAtom();
                    z = this.limitsSet;
                    if ((!z && !this.limits) || ((!z && style >= 2) || (i = (atom = this.base).type_limits) == 1 || (i == 0 && style >= 2))) {
                        if (rowAtom != null) {
                            rowAtom.add(new ScriptsAtom(this.base, this.under, this.over));
                            Box createBox = rowAtom.createBox(teXEnvironment);
                            rowAtom.getLastAtom();
                            rowAtom.add(this.base);
                            this.base = atom2;
                            return createBox;
                        }
                        return new ScriptsAtom(this.base, this.under, this.over).createBox(teXEnvironment);
                    }
                    if (!(atom instanceof SymbolAtom) && atom.type == 1) {
                        Char r5 = teXFont.getChar(((SymbolAtom) atom).getName(), style);
                        horizontalBox = this.base.createBox(teXEnvironment);
                        f = r5.getItalic();
                    } else {
                        Atom atom3 = this.base;
                        horizontalBox = new HorizontalBox(atom3 != null ? new StrutBox(0.0f, 0.0f, 0.0f, 0.0f) : atom3.createBox(teXEnvironment));
                        f = 0.0f;
                    }
                    Atom atom4 = this.over;
                    Box createBox2 = atom4 == null ? atom4.createBox(teXEnvironment.supStyle()) : null;
                    Atom atom5 = this.under;
                    Box createBox3 = atom5 != null ? atom5.createBox(teXEnvironment.subStyle()) : null;
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
                    float height2 = verticalBox.getHeight() + verticalBox.getDepth();
                    if (changeWidth != null) {
                        height += bigOpSpacing5 + f2 + changeWidth.getHeight() + changeWidth.getDepth();
                    }
                    verticalBox.setHeight(height);
                    verticalBox.setDepth(height2 - height);
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
            this.base = base;
        }
        rowAtom = null;
        z = this.limitsSet;
        if (!z) {
        }
        if (!(atom instanceof SymbolAtom)) {
        }
        Atom atom32 = this.base;
        horizontalBox = new HorizontalBox(atom32 != null ? new StrutBox(0.0f, 0.0f, 0.0f, 0.0f) : atom32.createBox(teXEnvironment));
        f = 0.0f;
        Atom atom42 = this.over;
        if (atom42 == null) {
        }
        Atom atom52 = this.under;
        if (atom52 != null) {
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
        float height3 = changeWidth22.getHeight();
        float height22 = verticalBox2.getHeight() + verticalBox2.getDepth();
        if (changeWidth != null) {
        }
        verticalBox2.setHeight(height3);
        verticalBox2.setDepth(height22 - height3);
        if (rowAtom != null) {
        }
    }

    private static Box changeWidth(Box box, float f) {
        return (box == null || Math.abs(f - box.getWidth()) <= 1.0E-7f) ? box : new HorizontalBox(box, f, 2);
    }
}
