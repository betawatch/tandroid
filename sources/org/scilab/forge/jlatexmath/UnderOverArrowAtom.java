package org.scilab.forge.jlatexmath;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public class UnderOverArrowAtom extends Atom {
    private Atom base;
    private boolean dble;
    private boolean left;
    private boolean over;

    public UnderOverArrowAtom(Atom atom, boolean z10, boolean z11) {
        this.dble = false;
        this.base = atom;
        this.left = z10;
        this.over = z11;
    }

    @Override // org.scilab.forge.jlatexmath.Atom
    public Box createBox(TeXEnvironment teXEnvironment) {
        Box create;
        float f7;
        Atom atom = this.base;
        Box createBox = atom != null ? atom.createBox(teXEnvironment) : new StrutBox(0.0f, 0.0f, 0.0f, 0.0f);
        float width = new SpaceAtom(3, 1.0f, 0.0f, 0.0f).createBox(teXEnvironment).getWidth();
        if (this.dble) {
            create = XLeftRightArrowFactory.create(teXEnvironment, createBox.getWidth());
            f7 = width * 4.0f;
        } else {
            create = XLeftRightArrowFactory.create(this.left, teXEnvironment, createBox.getWidth());
            f7 = -width;
        }
        VerticalBox verticalBox = new VerticalBox();
        if (this.over) {
            verticalBox.add(create);
            verticalBox.add(new HorizontalBox(createBox, create.getWidth(), 2));
            float height = verticalBox.getHeight() + verticalBox.getDepth();
            verticalBox.setDepth(createBox.getDepth());
            verticalBox.setHeight(height - createBox.getDepth());
            return verticalBox;
        }
        verticalBox.add(new HorizontalBox(createBox, create.getWidth(), 2));
        verticalBox.add(new StrutBox(0.0f, f7, 0.0f, 0.0f));
        verticalBox.add(create);
        verticalBox.setDepth((verticalBox.getHeight() + verticalBox.getDepth()) - createBox.getHeight());
        verticalBox.setHeight(createBox.getHeight());
        return verticalBox;
    }

    public UnderOverArrowAtom(Atom atom, boolean z10) {
        this.left = false;
        this.base = atom;
        this.over = z10;
        this.dble = true;
    }
}
