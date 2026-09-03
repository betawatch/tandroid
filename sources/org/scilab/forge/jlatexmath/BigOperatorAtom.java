package org.scilab.forge.jlatexmath;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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

    private static Box changeWidth(Box box, float f10) {
        return (box == null || Math.abs(f10 - box.getWidth()) <= 1.0E-7f) ? box : new HorizontalBox(box, f10, 2);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x016a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0077  */
    @Override // org.scilab.forge.jlatexmath.Atom
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Box createBox(TeXEnvironment teXEnvironment) {
        RowAtom rowAtom;
        boolean z4;
        Atom atom;
        int i10;
        Box horizontalBox;
        float f10;
        Box changeWidth;
        float f11;
        TeXFont teXFont = teXEnvironment.getTeXFont();
        int style = teXEnvironment.getStyle();
        Atom atom2 = this.base;
        if (atom2 instanceof TypedAtom) {
            Atom base = ((TypedAtom) atom2).getBase();
            if (base instanceof RowAtom) {
                rowAtom = (RowAtom) base;
                if (rowAtom.lookAtLastAtom && this.base.type_limits != 2) {
                    this.base = rowAtom.getLastAtom();
                    z4 = this.limitsSet;
                    if ((!z4 && !this.limits) || ((!z4 && style >= 2) || (i10 = (atom = this.base).type_limits) == 1 || (i10 == 0 && style >= 2))) {
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
                        f10 = 0.0f;
                    } else {
                        Char r52 = teXFont.getChar(((SymbolAtom) atom).getName(), style);
                        horizontalBox = this.base.createBox(teXEnvironment);
                        f10 = r52.getItalic();
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
                        changeWidth.setShift(f10 / 2.0f);
                        verticalBox.add(changeWidth);
                        f11 = Math.max(teXFont.getBigOpSpacing1(style), teXFont.getBigOpSpacing3(style) - changeWidth.getDepth());
                        verticalBox.add(new StrutBox(0.0f, f11, 0.0f, 0.0f));
                        verticalBox.getHeight();
                        verticalBox.getDepth();
                    } else {
                        f11 = 0.0f;
                    }
                    verticalBox.add(changeWidth2);
                    if (this.under != null) {
                        verticalBox.add(new StrutBox(0.0f, Math.max(teXFont.getBigOpSpacing2(style), teXFont.getBigOpSpacing4(style) - changeWidth3.getHeight()), 0.0f, 0.0f));
                        changeWidth3.setShift((-f10) / 2.0f);
                        verticalBox.add(changeWidth3);
                        verticalBox.add(new StrutBox(0.0f, bigOpSpacing5, 0.0f, 0.0f));
                    }
                    float height = changeWidth2.getHeight();
                    float depth = verticalBox.getDepth() + verticalBox.getHeight();
                    if (changeWidth != null) {
                        height += changeWidth.getDepth() + changeWidth.getHeight() + bigOpSpacing5 + f11;
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
            this.base = base;
        }
        rowAtom = null;
        z4 = this.limitsSet;
        if (!z4) {
        }
        if (atom instanceof SymbolAtom) {
        }
        horizontalBox = new HorizontalBox(atom != null ? new StrutBox(0.0f, 0.0f, 0.0f, 0.0f) : atom.createBox(teXEnvironment));
        f10 = 0.0f;
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

    public BigOperatorAtom(Atom atom, Atom atom2, Atom atom3, boolean z4) {
        this(atom, atom2, atom3);
        this.limits = z4;
        this.limitsSet = true;
    }
}
