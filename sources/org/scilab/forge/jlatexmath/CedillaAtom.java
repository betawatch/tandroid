package org.scilab.forge.jlatexmath;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public class CedillaAtom extends Atom {
    private Atom base;

    public CedillaAtom(Atom atom) {
        this.base = atom;
    }

    @Override // org.scilab.forge.jlatexmath.Atom
    public Box createBox(TeXEnvironment teXEnvironment) {
        Box createBox = this.base.createBox(teXEnvironment);
        VerticalBox verticalBox = new VerticalBox();
        verticalBox.add(createBox);
        Char r1 = teXEnvironment.getTeXFont().getChar("jlatexmathcedilla", teXEnvironment.getStyle());
        float italic = r1.getItalic();
        Box charBox = new CharBox(r1);
        if (Math.abs(italic) > 1.0E-7f) {
            Box horizontalBox = new HorizontalBox(new StrutBox(-italic, 0.0f, 0.0f, 0.0f));
            horizontalBox.add(charBox);
            charBox = horizontalBox;
        }
        HorizontalBox horizontalBox2 = new HorizontalBox(charBox, createBox.getWidth(), 2);
        verticalBox.add(new StrutBox(0.0f, -(SpaceAtom.getFactor(5, teXEnvironment) * 0.4f), 0.0f, 0.0f));
        verticalBox.add(horizontalBox2);
        float depth = verticalBox.getDepth() + verticalBox.getHeight();
        verticalBox.setHeight(createBox.getHeight());
        verticalBox.setDepth(depth - createBox.getHeight());
        return verticalBox;
    }
}
