package org.scilab.forge.jlatexmath;

import ru.noties.jlatexmath.awt.Font;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public class Char {
    private final char c;
    private final Font font;
    private final int fontCode;
    private final Metrics m;

    public Char(char c2, Font font, int i3, Metrics metrics) {
        this.font = font;
        this.fontCode = i3;
        this.c = c2;
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
