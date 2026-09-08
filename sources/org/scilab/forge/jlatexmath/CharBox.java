package org.scilab.forge.jlatexmath;

import ru.noties.jlatexmath.awt.Font;
import ru.noties.jlatexmath.awt.Graphics2D;
import ru.noties.jlatexmath.awt.geom.AffineTransform;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public class CharBox extends Box {
    private final char[] arr = new char[1];
    private final CharFont cf;
    private float italic;
    private final float size;

    public CharBox(Char r22) {
        this.cf = r22.getCharFont();
        this.size = r22.getMetrics().getSize();
        this.width = r22.getWidth();
        this.height = r22.getHeight();
        this.depth = r22.getDepth();
        this.italic = r22.getItalic();
    }

    public void addItalicCorrectionToWidth() {
        this.width += this.italic;
        this.italic = 0.0f;
    }

    @Override // org.scilab.forge.jlatexmath.Box
    public void draw(Graphics2D graphics2D, float f7, float f10) {
        drawDebug(graphics2D, f7, f10);
        AffineTransform transform = graphics2D.getTransform();
        graphics2D.translate(f7, f10);
        Font font = FontInfo.getFont(this.cf.fontId);
        if (Math.abs(this.size - TeXFormula.FONT_SCALE_FACTOR) > 1.0E-7f) {
            float f11 = this.size;
            float f12 = TeXFormula.FONT_SCALE_FACTOR;
            graphics2D.scale(f11 / f12, f11 / f12);
        }
        if (graphics2D.getFont() != font) {
            graphics2D.setFont(font);
        }
        char[] cArr = this.arr;
        cArr[0] = this.cf.c;
        graphics2D.drawChars(cArr, 0, 1, 0, 0);
        graphics2D.setTransform(transform);
    }

    @Override // org.scilab.forge.jlatexmath.Box
    public int getLastFontId() {
        return this.cf.fontId;
    }

    public String toString() {
        return super.toString() + "=" + this.cf.c;
    }
}
