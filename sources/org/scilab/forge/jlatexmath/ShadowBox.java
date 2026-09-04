package org.scilab.forge.jlatexmath;

import ru.noties.jlatexmath.awt.BasicStroke;
import ru.noties.jlatexmath.awt.Graphics2D;
import ru.noties.jlatexmath.awt.Stroke;
import ru.noties.jlatexmath.awt.geom.Rectangle2D;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public class ShadowBox extends FramedBox {
    private float shadowRule;

    public ShadowBox(FramedBox framedBox, float f7) {
        super(framedBox.box, framedBox.thickness, framedBox.space);
        this.shadowRule = f7;
        this.depth += f7;
        this.width += f7;
    }

    @Override // org.scilab.forge.jlatexmath.FramedBox, org.scilab.forge.jlatexmath.Box
    public void draw(Graphics2D graphics2D, float f7, float f10) {
        float f11 = this.thickness;
        float f12 = f11 / 2.0f;
        this.box.draw(graphics2D, this.space + f7 + f11, f10);
        Stroke stroke = graphics2D.getStroke();
        graphics2D.setStroke(new BasicStroke(this.thickness, 0, 0));
        float f13 = this.height;
        float f14 = this.width;
        float f15 = this.shadowRule;
        float f16 = this.thickness;
        graphics2D.draw(new Rectangle2D.Float(f7 + f12, (f10 - f13) + f12, (f14 - f15) - f16, ((f13 + this.depth) - f15) - f16));
        float abs = (float) Math.abs(1.0d / graphics2D.getTransform().getScaleX());
        graphics2D.setStroke(new BasicStroke(abs, 0, 0));
        float f17 = this.shadowRule;
        graphics2D.fill(new Rectangle2D.Float((f7 + f17) - abs, ((this.depth + f10) - f17) - abs, this.width - f17, f17));
        float f18 = f7 + this.width;
        float f19 = this.shadowRule;
        float f20 = (f18 - f19) - abs;
        float f21 = this.height;
        graphics2D.fill(new Rectangle2D.Float(f20, (f10 - f21) + f12 + f19, f19, ((this.depth + f21) - (2.0f * f19)) - f12));
        graphics2D.setStroke(stroke);
    }

    @Override // org.scilab.forge.jlatexmath.FramedBox, org.scilab.forge.jlatexmath.Box
    public int getLastFontId() {
        return this.box.getLastFontId();
    }
}
