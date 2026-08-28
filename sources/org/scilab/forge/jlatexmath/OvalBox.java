package org.scilab.forge.jlatexmath;

import ru.noties.jlatexmath.awt.BasicStroke;
import ru.noties.jlatexmath.awt.Graphics2D;
import ru.noties.jlatexmath.awt.Stroke;
import ru.noties.jlatexmath.awt.geom.RoundRectangle2D;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public class OvalBox extends FramedBox {
    public OvalBox(FramedBox framedBox) {
        super(framedBox.box, framedBox.thickness, framedBox.space);
    }

    @Override // org.scilab.forge.jlatexmath.FramedBox, org.scilab.forge.jlatexmath.Box
    public void draw(Graphics2D graphics2D, float f10, float f11) {
        this.box.draw(graphics2D, this.space + f10 + this.thickness, f11);
        Stroke stroke = graphics2D.getStroke();
        graphics2D.setStroke(new BasicStroke(this.thickness, 0, 0));
        float f12 = this.thickness;
        float f13 = f12 / 2.0f;
        float min = Math.min(this.width - f12, (this.height + this.depth) - f12) * 0.5f;
        float f14 = f10 + f13;
        float f15 = this.height;
        float f16 = (f11 - f15) + f13;
        float f17 = this.width;
        float f18 = this.thickness;
        graphics2D.draw(new RoundRectangle2D.Float(f14, f16, f17 - f18, (f15 + this.depth) - f18, min, min));
        graphics2D.setStroke(stroke);
    }

    @Override // org.scilab.forge.jlatexmath.FramedBox, org.scilab.forge.jlatexmath.Box
    public int getLastFontId() {
        return this.box.getLastFontId();
    }
}
