package org.scilab.forge.jlatexmath;

/* loaded from: classes3.dex */
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
        Char r8 = teXEnvironment.getTeXFont().getChar("ogonek", teXEnvironment.getStyle());
        float italic = r8.getItalic();
        CharBox charBox = new CharBox(r8);
        if (Math.abs(italic) > 1.0E-7f) {
            box = new HorizontalBox(new StrutBox(-italic, 0.0f, 0.0f, 0.0f));
            box.add(charBox);
        } else {
            box = charBox;
        }
        HorizontalBox horizontalBox = new HorizontalBox(box, createBox.getWidth(), 1);
        verticalBox.add(new StrutBox(0.0f, -charBox.getHeight(), 0.0f, 0.0f));
        verticalBox.add(horizontalBox);
        float height = verticalBox.getHeight() + verticalBox.getDepth();
        verticalBox.setHeight(createBox.getHeight());
        verticalBox.setDepth(height - createBox.getHeight());
        return verticalBox;
    }
}
