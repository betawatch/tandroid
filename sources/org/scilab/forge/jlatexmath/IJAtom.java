package org.scilab.forge.jlatexmath;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes.dex */
public class IJAtom extends Atom {
    private boolean upper;

    public IJAtom(boolean z9) {
        this.upper = z9;
    }

    @Override // org.scilab.forge.jlatexmath.Atom
    public Box createBox(TeXEnvironment teXEnvironment) {
        CharBox charBox = new CharBox(teXEnvironment.getTeXFont().getChar(this.upper ? 'I' : 'i', "mathnormal", teXEnvironment.getStyle()));
        CharBox charBox2 = new CharBox(teXEnvironment.getTeXFont().getChar(this.upper ? 'J' : 'j', "mathnormal", teXEnvironment.getStyle()));
        HorizontalBox horizontalBox = new HorizontalBox(charBox);
        horizontalBox.add(new SpaceAtom(0, -0.065f, 0.0f, 0.0f).createBox(teXEnvironment));
        horizontalBox.add(charBox2);
        return horizontalBox;
    }
}
