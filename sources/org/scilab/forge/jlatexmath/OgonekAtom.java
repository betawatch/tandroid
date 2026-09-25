package org.scilab.forge.jlatexmath;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
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
        Char r82 = teXEnvironment.getTeXFont().getChar("ogonek", teXEnvironment.getStyle());
        float italic = r82.getItalic();
        CharBox charBox = new CharBox(r82);
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
