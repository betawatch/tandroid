package org.scilab.forge.jlatexmath;

/* loaded from: classes3.dex */
public class CharAtom extends CharSymbol {
    private final char c;
    private boolean mathMode;
    private String textStyle;

    public CharAtom(char c, String str, boolean z) {
        this.c = c;
        this.textStyle = str;
        this.mathMode = z;
    }

    public CharAtom(char c, String str) {
        this(c, str, false);
    }

    public boolean isMathMode() {
        return this.mathMode;
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

    public char getCharacter() {
        return this.c;
    }

    private Char getChar(TeXFont teXFont, int i, boolean z) {
        char c = this.c;
        if (z && Character.isLowerCase(c)) {
            c = Character.toUpperCase(this.c);
        }
        String str = this.textStyle;
        if (str == null) {
            return teXFont.getDefaultChar(c, i);
        }
        return teXFont.getChar(c, str, i);
    }

    @Override // org.scilab.forge.jlatexmath.CharSymbol
    public CharFont getCharFont(TeXFont teXFont) {
        return getChar(teXFont, 0, false).getCharFont();
    }

    public String toString() {
        return "CharAtom: '" + this.c + "'";
    }
}
