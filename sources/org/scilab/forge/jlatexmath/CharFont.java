package org.scilab.forge.jlatexmath;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
