package org.scilab.forge.jlatexmath;

import ru.noties.jlatexmath.awt.Font;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public class Char {
    private final char c;
    private final Font font;
    private final int fontCode;
    private final Metrics m;

    public Char(char c10, Font font, int i9, Metrics metrics) {
        this.font = font;
        this.fontCode = i9;
        this.c = c10;
        this.m = metrics;
    }

    public char getChar() {
        return this.c;
    }

    public CharFont getCharFont() {
        return new CharFont(this.c, this.fontCode);
    }

    public float getDepth() {
        return this.m.getDepth();
    }

    public Font getFont() {
        return this.font;
    }

    public int getFontCode() {
        return this.fontCode;
    }

    public float getHeight() {
        return this.m.getHeight();
    }

    public float getItalic() {
        return this.m.getItalic();
    }

    public Metrics getMetrics() {
        return this.m;
    }

    public float getWidth() {
        return this.m.getWidth();
    }
}
