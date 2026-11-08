package org.scilab.forge.jlatexmath;

import ru.noties.jlatexmath.awt.Font;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes.dex */
public class Char {
    private final char c;
    private final Font font;
    private final int fontCode;
    private final Metrics m;

    public Char(char c10, Font font, int i7, Metrics metrics) {
        this.font = font;
        this.fontCode = i7;
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
