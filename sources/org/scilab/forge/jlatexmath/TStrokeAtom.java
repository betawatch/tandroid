package org.scilab.forge.jlatexmath;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes.dex */
public class TStrokeAtom extends Atom {
    private boolean upper;

    public TStrokeAtom(boolean z10) {
        this.upper = z10;
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
