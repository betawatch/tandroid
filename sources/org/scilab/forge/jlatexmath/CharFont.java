package org.scilab.forge.jlatexmath;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public class CharFont {
    public int boldFontId;
    public char c;
    public int fontId;

    public CharFont(char c, int i, int i2) {
        this.c = c;
        this.fontId = i;
        this.boldFontId = i2;
    }

    public CharFont(char c, int i) {
        this(c, i, i);
    }
}
