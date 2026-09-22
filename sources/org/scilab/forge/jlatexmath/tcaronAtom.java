package org.scilab.forge.jlatexmath;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
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
