package org.scilab.forge.jlatexmath;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
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
        Char r22 = teXEnvironment.getTeXFont().getChar("jlatexmathcedilla", teXEnvironment.getStyle());
        float italic = r22.getItalic();
        Box charBox = new CharBox(r22);
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
