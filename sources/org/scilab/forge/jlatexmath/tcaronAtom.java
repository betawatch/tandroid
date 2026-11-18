package org.scilab.forge.jlatexmath;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
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
