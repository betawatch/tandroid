package org.scilab.forge.jlatexmath;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
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
