package org.scilab.forge.jlatexmath;

import ru.noties.jlatexmath.awt.Font;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public class Char {
    private final char c;
    private final Font font;
    private final int fontCode;
    private final Metrics m;

    public Char(char c, Font font, int i, Metrics metrics) {
        this.font = font;
        this.fontCode = i;
        this.c = c;
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
