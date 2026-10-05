package org.scilab.forge.jlatexmath;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes.dex */
public class LCaronAtom extends Atom {
    private boolean upper;

    public LCaronAtom(boolean z10) {
        this.upper = z10;
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
