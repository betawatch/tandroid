package org.scilab.forge.jlatexmath;

import ru.noties.jlatexmath.awt.Color;
import ru.noties.jlatexmath.awt.Graphics2D;
import ru.noties.jlatexmath.awt.geom.Rectangle2D;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes.dex */
public class HorizontalRule extends Box {
    private Color color;
    private float speShift;

    public HorizontalRule(float f7, float f10, float f11) {
        this.color = null;
        this.speShift = 0.0f;
        this.height = f7;
        this.width = f10;
        this.shift = f11;
    }

    @Override // org.scilab.forge.jlatexmath.Box
    public void draw(Graphics2D graphics2D, float f7, float f10) {
        Color color = graphics2D.getColor();
        Color color2 = this.color;
        if (color2 != null) {
            graphics2D.setColor(color2);
        }
        float f11 = this.speShift;
        if (f11 == 0.0f) {
            float f12 = this.height;
            graphics2D.fill(new Rectangle2D.Float(f7, f10 - f12, this.width, f12));
        } else {
            float f13 = this.height;
            graphics2D.fill(new Rectangle2D.Float(f7, (f10 - f13) + f11, this.width, f13));
        }
        graphics2D.setColor(color);
    }

    @Override // org.scilab.forge.jlatexmath.Box
    public int getLastFontId() {
        return -1;
    }

    public HorizontalRule(float f7, float f10, float f11, boolean z10) {
        this.color = null;
        this.speShift = 0.0f;
        this.height = f7;
        this.width = f10;
        if (z10) {
            this.shift = f11;
        } else {
            this.shift = 0.0f;
            this.speShift = f11;
        }
    }

    public HorizontalRule(float f7, float f10, float f11, Color color) {
        this.speShift = 0.0f;
        this.height = f7;
        this.width = f10;
        this.color = color;
        this.shift = f11;
    }
}
