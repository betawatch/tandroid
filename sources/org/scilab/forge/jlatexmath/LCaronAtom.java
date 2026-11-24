package org.scilab.forge.jlatexmath;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public class LCaronAtom extends Atom {
    private boolean upper;

    public LCaronAtom(boolean z) {
        this.upper = z;
    }

    @Override // org.scilab.forge.jlatexmath.Atom
    public Box createBox(TeXEnvironment teXEnvironment) {
        CharBox charBox = new CharBox(teXEnvironment.getTeXFont().getChar("textapos", teXEnvironment.getStyle()));
        HorizontalBox horizontalBox = new HorizontalBox(new CharBox(teXEnvironment.getTeXFont().getChar(this.upper ? 'L' : 'l', "mathnormal", teXEnvironment.getStyle())));
        if (this.upper) {
            horizontalBox.add(new SpaceAtom(0, -0.3f, 0.0f, 0.0f).createBox(teXEnvironment));
        } else {
            horizontalBox.add(new SpaceAtom(0, -0.13f, 0.0f, 0.0f).createBox(teXEnvironment));
        }
        horizontalBox.add(charBox);
        return horizontalBox;
    }
}
