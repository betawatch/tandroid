package org.scilab.forge.jlatexmath;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
public class XArrowAtom extends Atom {
    private boolean left;
    private Atom over;
    private Atom under;

    public XArrowAtom(Atom atom, Atom atom2, boolean z10) {
        this.over = atom;
        this.under = atom2;
        this.left = z10;
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
        float max = Math.max((createBox3.getWidth() * 2.0f) + createBox.getWidth(), (createBox4.getWidth() * 2.0f) + createBox2.getWidth());
        Box create = XLeftRightArrowFactory.create(this.left, teXEnvironment, max);
        HorizontalBox horizontalBox = new HorizontalBox(createBox, max, 2);
        HorizontalBox horizontalBox2 = new HorizontalBox(createBox2, max, 2);
        VerticalBox verticalBox = new VerticalBox();
        verticalBox.add(horizontalBox);
        verticalBox.add(createBox5);
        verticalBox.add(create);
        verticalBox.add(createBox5);
        verticalBox.add(horizontalBox2);
        float depth = verticalBox.getDepth() + verticalBox.getHeight();
        float depth2 = horizontalBox2.getDepth() + horizontalBox2.getHeight() + createBox5.getDepth() + createBox5.getHeight();
        verticalBox.setDepth(depth2);
        verticalBox.setHeight(depth - depth2);
        return new HorizontalBox(verticalBox, (createBox5.getHeight() * 2.0f) + verticalBox.getWidth(), 2);
    }
}
