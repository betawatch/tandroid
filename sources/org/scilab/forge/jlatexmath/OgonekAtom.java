package org.scilab.forge.jlatexmath;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public class OgonekAtom extends Atom {
    private Atom base;

    public OgonekAtom(Atom atom) {
        this.base = atom;
    }

    @Override // org.scilab.forge.jlatexmath.Atom
    public Box createBox(TeXEnvironment teXEnvironment) {
        Box box;
        Box createBox = this.base.createBox(teXEnvironment);
        VerticalBox verticalBox = new VerticalBox();
        verticalBox.add(createBox);
        Char r7 = teXEnvironment.getTeXFont().getChar("ogonek", teXEnvironment.getStyle());
        float italic = r7.getItalic();
        CharBox charBox = new CharBox(r7);
        if (Math.abs(italic) > 1.0E-7f) {
            box = new HorizontalBox(new StrutBox(-italic, 0.0f, 0.0f, 0.0f));
            box.add(charBox);
        } else {
            box = charBox;
        }
        HorizontalBox horizontalBox = new HorizontalBox(box, createBox.getWidth(), 1);
        verticalBox.add(new StrutBox(0.0f, -charBox.getHeight(), 0.0f, 0.0f));
        verticalBox.add(horizontalBox);
        float depth = verticalBox.getDepth() + verticalBox.getHeight();
        verticalBox.setHeight(createBox.getHeight());
        verticalBox.setDepth(depth - createBox.getHeight());
        return verticalBox;
    }
}
