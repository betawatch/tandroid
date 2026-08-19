package org.scilab.forge.jlatexmath;

/* loaded from: classes3.dex */
public class UnderOverArrowAtom extends Atom {
    private Atom base;
    private boolean dble;
    private boolean left;
    private boolean over;

    public UnderOverArrowAtom(Atom atom, boolean z, boolean z2) {
        this.dble = false;
        this.base = atom;
        this.left = z;
        this.over = z2;
    }

    public UnderOverArrowAtom(Atom atom, boolean z) {
        this.left = false;
        this.base = atom;
        this.over = z;
        this.dble = true;
    }

    @Override // org.scilab.forge.jlatexmath.Atom
    public Box createBox(TeXEnvironment teXEnvironment) {
        Box create;
        float f;
        Atom atom = this.base;
        Box createBox = atom != null ? atom.createBox(teXEnvironment) : new StrutBox(0.0f, 0.0f, 0.0f, 0.0f);
        float width = new SpaceAtom(3, 1.0f, 0.0f, 0.0f).createBox(teXEnvironment).getWidth();
        if (this.dble) {
            create = XLeftRightArrowFactory.create(teXEnvironment, createBox.getWidth());
            f = width * 4.0f;
        } else {
            create = XLeftRightArrowFactory.create(this.left, teXEnvironment, createBox.getWidth());
            f = -width;
        }
        VerticalBox verticalBox = new VerticalBox();
        if (this.over) {
            verticalBox.add(create);
            verticalBox.add(new HorizontalBox(createBox, create.getWidth(), 2));
            float depth = verticalBox.getDepth() + verticalBox.getHeight();
            verticalBox.setDepth(createBox.getDepth());
            verticalBox.setHeight(depth - createBox.getDepth());
            return verticalBox;
        }
        verticalBox.add(new HorizontalBox(createBox, create.getWidth(), 2));
        verticalBox.add(new StrutBox(0.0f, f, 0.0f, 0.0f));
        verticalBox.add(create);
        verticalBox.setDepth((verticalBox.getDepth() + verticalBox.getHeight()) - createBox.getHeight());
        verticalBox.setHeight(createBox.getHeight());
        return verticalBox;
    }
}
