package org.scilab.forge.jlatexmath;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public class tcaronAtom extends Atom {
    @Override // org.scilab.forge.jlatexmath.Atom
    public Box createBox(TeXEnvironment teXEnvironment) {
        CharBox charBox = new CharBox(teXEnvironment.getTeXFont().getChar("textapos", teXEnvironment.getStyle()));
        HorizontalBox horizontalBox = new HorizontalBox(new CharBox(teXEnvironment.getTeXFont().getChar('t', "mathnormal", teXEnvironment.getStyle())));
        horizontalBox.add(new SpaceAtom(0, -0.3f, 0.0f, 0.0f).createBox(teXEnvironment));
        horizontalBox.add(charBox);
        return horizontalBox;
    }
}
