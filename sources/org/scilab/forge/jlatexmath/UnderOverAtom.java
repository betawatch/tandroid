package org.scilab.forge.jlatexmath;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public class UnderOverAtom extends Atom {
    private final Atom base;
    private final Atom over;
    private final boolean overScriptSize;
    private final float overSpace;
    private final int overUnit;
    private final Atom under;
    private final boolean underScriptSize;
    private final float underSpace;
    private final int underUnit;

    public UnderOverAtom(Atom atom, Atom atom2, int i10, float f7, boolean z10, boolean z11) {
        SpaceAtom.checkUnit(i10);
        this.base = atom;
        if (z11) {
            this.under = null;
            this.underSpace = 0.0f;
            this.underUnit = 0;
            this.underScriptSize = false;
            this.over = atom2;
            this.overUnit = i10;
            this.overSpace = f7;
            this.overScriptSize = z10;
            return;
        }
        this.under = atom2;
        this.underUnit = i10;
        this.underSpace = f7;
        this.underScriptSize = z10;
        this.overSpace = 0.0f;
        this.over = null;
        this.overUnit = 0;
        this.overScriptSize = false;
    }

    private static Box changeWidth(Box box, float f7) {
        return (box == null || Math.abs(f7 - box.getWidth()) <= 1.0E-7f) ? box : new HorizontalBox(box, f7, 2);
    }

    @Override // org.scilab.forge.jlatexmath.Atom
    public Box createBox(TeXEnvironment teXEnvironment) {
        Box box;
        Atom atom = this.base;
        Box strutBox = atom == null ? new StrutBox(0.0f, 0.0f, 0.0f, 0.0f) : atom.createBox(teXEnvironment);
        float width = strutBox.getWidth();
        Atom atom2 = this.over;
        Box box2 = null;
        if (atom2 != null) {
            box = atom2.createBox(this.overScriptSize ? teXEnvironment.subStyle() : teXEnvironment);
            width = Math.max(width, box.getWidth());
        } else {
            box = null;
        }
        Atom atom3 = this.under;
        if (atom3 != null) {
            box2 = atom3.createBox(this.underScriptSize ? teXEnvironment.subStyle() : teXEnvironment);
            width = Math.max(width, box2.getWidth());
        }
        VerticalBox verticalBox = new VerticalBox();
        teXEnvironment.setLastFontId(strutBox.getLastFontId());
        if (this.over != null) {
            verticalBox.add(changeWidth(box, width));
            verticalBox.add(new SpaceAtom(this.overUnit, 0.0f, this.overSpace, 0.0f).createBox(teXEnvironment));
        }
        Box changeWidth = changeWidth(strutBox, width);
        verticalBox.add(changeWidth);
        float depth = (verticalBox.getDepth() + verticalBox.getHeight()) - changeWidth.getDepth();
        if (this.under != null) {
            verticalBox.add(new SpaceAtom(this.overUnit, 0.0f, this.underSpace, 0.0f).createBox(teXEnvironment));
            verticalBox.add(changeWidth(box2, width));
        }
        verticalBox.setDepth((verticalBox.getDepth() + verticalBox.getHeight()) - depth);
        verticalBox.setHeight(depth);
        return verticalBox;
    }

    @Override // org.scilab.forge.jlatexmath.Atom
    public int getLeftType() {
        return this.base.getLeftType();
    }

    @Override // org.scilab.forge.jlatexmath.Atom
    public int getRightType() {
        return this.base.getRightType();
    }

    public UnderOverAtom(Atom atom, Atom atom2, int i10, float f7, boolean z10, Atom atom3, int i11, float f10, boolean z11) {
        SpaceAtom.checkUnit(i10);
        SpaceAtom.checkUnit(i11);
        this.base = atom;
        this.under = atom2;
        this.underUnit = i10;
        this.underSpace = f7;
        this.underScriptSize = z10;
        this.over = atom3;
        this.overUnit = i11;
        this.overSpace = f10;
        this.overScriptSize = z11;
    }
}
