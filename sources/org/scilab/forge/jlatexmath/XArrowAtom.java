package org.scilab.forge.jlatexmath;

/* loaded from: classes3.dex */
public class XArrowAtom extends Atom {
    private boolean left;
    private Atom over;
    private Atom under;

    public XArrowAtom(Atom atom, Atom atom2, boolean z) {
        this.over = atom;
        this.under = atom2;
        this.left = z;
    }

    @Override // org.scilab.forge.jlatexmath.Atom
    public Box createBox(TeXEnvironment teXEnvironment) {
        Atom atom = this.over;
        Box createBox = atom != null ? atom.createBox(teXEnvironment.supStyle()) : new StrutBox(0.0f, 0.0f, 0.0f, 0.0f);
        Atom atom2 = this.under;
        Box createBox2 = atom2 != null ? atom2.createBox(teXEnvironment.subStyle()) : new StrutBox(0.0f, 0.0f, 0.0f, 0.0f);
        Box createBox3 = new SpaceAtom(0, 1.5f, 0.0f, 0.0f).createBox(teXEnvironment.supStyle());
        Box createBox4 = new SpaceAtom(0, 1.5f, 0.0f, 0.0f).createBox(teXEnvironment.subStyle());
        Box createBox5 = new SpaceAtom(5, 0.0f, 2.0f, 0.0f).createBox(teXEnvironment);
        float max = Math.max(createBox.getWidth() + (createBox3.getWidth() * 2.0f), createBox2.getWidth() + (createBox4.getWidth() * 2.0f));
        Box create = XLeftRightArrowFactory.create(this.left, teXEnvironment, max);
        HorizontalBox horizontalBox = new HorizontalBox(createBox, max, 2);
        HorizontalBox horizontalBox2 = new HorizontalBox(createBox2, max, 2);
        VerticalBox verticalBox = new VerticalBox();
        verticalBox.add(horizontalBox);
        verticalBox.add(createBox5);
        verticalBox.add(create);
        verticalBox.add(createBox5);
        verticalBox.add(horizontalBox2);
        float height = verticalBox.getHeight() + verticalBox.getDepth();
        float height2 = createBox5.getHeight() + createBox5.getDepth() + horizontalBox2.getHeight() + horizontalBox2.getDepth();
        verticalBox.setDepth(height2);
        verticalBox.setHeight(height - height2);
        return new HorizontalBox(verticalBox, verticalBox.getWidth() + (createBox5.getHeight() * 2.0f), 2);
    }
}
