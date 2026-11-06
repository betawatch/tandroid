package org.scilab.forge.jlatexmath;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public class CharAtom extends CharSymbol {
    private final char c;
    private boolean mathMode;
    private String textStyle;

    public CharAtom(char c10, String str, boolean z9) {
        this.c = c10;
        this.textStyle = str;
        this.mathMode = z9;
    }

    private Char getChar(TeXFont teXFont, int i7, boolean z9) {
        char c10 = this.c;
        if (z9 && Character.isLowerCase(c10)) {
            c10 = Character.toUpperCase(this.c);
        }
        String str = this.textStyle;
        return str == null ? teXFont.getDefaultChar(c10, i7) : teXFont.getChar(c10, str, i7);
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
