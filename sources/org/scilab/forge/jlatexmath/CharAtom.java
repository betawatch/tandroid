package org.scilab.forge.jlatexmath;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public class CharAtom extends CharSymbol {
    private final char c;
    private boolean mathMode;
    private String textStyle;

    public CharAtom(char c, String str, boolean z) {
        this.c = c;
        this.textStyle = str;
        this.mathMode = z;
    }

    private Char getChar(TeXFont teXFont, int i, boolean z) {
        char c = this.c;
        if (z && Character.isLowerCase(c)) {
            c = Character.toUpperCase(this.c);
        }
        String str = this.textStyle;
        return str == null ? teXFont.getDefaultChar(c, i) : teXFont.getChar(c, str, i);
    }

    @Override // org.scilab.forge.jlatexmath.Atom
    public Box createBox(TeXEnvironment teXEnvironment) {
        String textStyle;
        if (this.textStyle == null && (textStyle = teXEnvironment.getTextStyle()) != null) {
            this.textStyle = textStyle;
        }
        boolean smallCap = teXEnvironment.getSmallCap();
        CharBox charBox = new CharBox(getChar(teXEnvironment.getTeXFont(), teXEnvironment.getStyle(), smallCap));
        return (smallCap && Character.isLowerCase(this.c)) ? new ScaleBox(charBox, 0.800000011920929d, 0.800000011920929d) : charBox;
    }

    @Override // org.scilab.forge.jlatexmath.CharSymbol
    public CharFont getCharFont(TeXFont teXFont) {
        return getChar(teXFont, 0, false).getCharFont();
    }

    public char getCharacter() {
        return this.c;
    }

    public boolean isMathMode() {
        return this.mathMode;
    }

    public String toString() {
        return "CharAtom: '" + this.c + "'";
    }

    public CharAtom(char c, String str) {
        this(c, str, false);
    }
}
