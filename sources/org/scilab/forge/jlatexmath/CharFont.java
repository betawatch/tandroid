package org.scilab.forge.jlatexmath;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
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
