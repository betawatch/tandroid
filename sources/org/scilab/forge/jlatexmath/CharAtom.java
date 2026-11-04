package org.scilab.forge.jlatexmath;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public class CharAtom extends CharSymbol {
    private final char c;
    private boolean mathMode;
    private String textStyle;

    public CharAtom(char c2, String str, boolean z10) {
        this.c = c2;
        this.textStyle = str;
        this.mathMode = z10;
    }

    private Char getChar(TeXFont teXFont, int i3, boolean z10) {
        char c2 = this.c;
        if (z10 && Character.isLowerCase(c2)) {
            c2 = Character.toUpperCase(this.c);
        }
        String str = this.textStyle;
        return str == null ? teXFont.getDefaultChar(c2, i3) : teXFont.getChar(c2, str, i3);
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

    public CharAtom(char c2, String str) {
        this(c2, str, false);
    }
}
