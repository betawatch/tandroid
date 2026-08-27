package org.scilab.forge.jlatexmath;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public class CharAtom extends CharSymbol {
    private final char c;
    private boolean mathMode;
    private String textStyle;

    public CharAtom(char c10, String str, boolean z10) {
        this.c = c10;
        this.textStyle = str;
        this.mathMode = z10;
    }

    private Char getChar(TeXFont teXFont, int i10, boolean z10) {
        char c10 = this.c;
        if (z10 && Character.isLowerCase(c10)) {
            c10 = Character.toUpperCase(this.c);
        }
        String str = this.textStyle;
        return str == null ? teXFont.getDefaultChar(c10, i10) : teXFont.getChar(c10, str, i10);
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

    public CharAtom(char c10, String str) {
        this(c10, str, false);
    }
}
