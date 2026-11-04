package org.scilab.forge.jlatexmath;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public class CharFont {
    public int boldFontId;
    public char c;
    public int fontId;

    public CharFont(char c2, int i3) {
        this(c2, i3, i3);
    }

    public CharFont(char c2, int i3, int i10) {
        this.c = c2;
        this.fontId = i3;
        this.boldFontId = i10;
    }
}
