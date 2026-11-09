package org.scilab.forge.jlatexmath;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes.dex */
public class TStrokeAtom extends Atom {
    private boolean upper;

    public TStrokeAtom(boolean z9) {
        this.upper = z9;
    }

    @Override // org.scilab.forge.jlatexmath.Atom
    public Box createBox(TeXEnvironment teXEnvironment) {
        Char r02 = teXEnvironment.getTeXFont().getChar("bar", teXEnvironment.getStyle());
        float italic = r02.getItalic();
        CharBox charBox = new CharBox(teXEnvironment.getTeXFont().getChar(this.upper ? 'T' : 't', "mathnormal", teXEnvironment.getStyle()));
        Box charBox2 = new CharBox(r02);
        if (Math.abs(italic) > 1.0E-7f) {
            Box horizontalBox = new HorizontalBox(new StrutBox(-italic, 0.0f, 0.0f, 0.0f));
            horizontalBox.add(charBox2);
            charBox2 = horizontalBox;
        }
        HorizontalBox horizontalBox2 = new HorizontalBox(charBox2, charBox.getWidth(), 2);
        VerticalBox verticalBox = new VerticalBox();
        verticalBox.add(charBox);
        verticalBox.add(new StrutBox(0.0f, charBox.getHeight() * (-0.5f), 0.0f, 0.0f));
        verticalBox.add(horizontalBox2);
        return verticalBox;
    }
}
