package org.scilab.forge.jlatexmath;

import a1.g;
import org.telegram.messenger.zs;
import ru.noties.jlatexmath.awt.BasicStroke;
import ru.noties.jlatexmath.awt.Color;
import ru.noties.jlatexmath.awt.Graphics2D;
import ru.noties.jlatexmath.awt.Stroke;
import ru.noties.jlatexmath.awt.geom.AffineTransform;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public class GeoGebraLogoBox extends Box {
    private static final Color gray = new Color(zs.n1, zs.n1, zs.n1);
    private static final Color blue = new Color(zs.j2, zs.j2, zs.e4);
    private static final BasicStroke st = new BasicStroke(3.8f, 0, 0, 4.0f);

    public GeoGebraLogoBox(float f7, float f10) {
        this.depth = 0.0f;
        this.height = f10;
        this.width = f7;
        this.shift = 0.0f;
    }

    private static void drawCircle(Graphics2D graphics2D, float f7, float f10) {
        graphics2D.setColor(blue);
        graphics2D.translate(f7, f10);
        graphics2D.fillArc(0, 0, 8, 8, 0, 360);
        graphics2D.setColor(Color.BLACK);
        graphics2D.drawArc(0, 0, 8, 8, 0, 360);
        graphics2D.translate(-f7, -f10);
    }

    @Override // org.scilab.forge.jlatexmath.Box
    public void draw(Graphics2D graphics2D, float f7, float f10) {
        AffineTransform transform = graphics2D.getTransform();
        Color color = graphics2D.getColor();
        Stroke stroke = graphics2D.getStroke();
        float f11 = this.height;
        graphics2D.translate(g.A(f11, 0.25f, 2.15f, f7), f10 - (f11 * 0.81395346f));
        graphics2D.setColor(gray);
        graphics2D.setStroke(st);
        float f12 = this.height;
        graphics2D.scale((f12 * 0.05f) / 2.15f, (f12 * 0.05f) / 2.15f);
        graphics2D.rotate(-0.4537856055185257d, 20.5d, 17.5d);
        graphics2D.drawArc(0, 0, 43, 32, 0, 360);
        graphics2D.rotate(0.4537856055185257d, 20.5d, 17.5d);
        graphics2D.setStroke(stroke);
        drawCircle(graphics2D, 16.0f, -5.0f);
        drawCircle(graphics2D, -1.0f, 7.0f);
        drawCircle(graphics2D, 5.0f, 28.0f);
        drawCircle(graphics2D, 27.0f, 24.0f);
        drawCircle(graphics2D, 36.0f, 3.0f);
        graphics2D.setStroke(stroke);
        graphics2D.setTransform(transform);
        graphics2D.setColor(color);
    }

    @Override // org.scilab.forge.jlatexmath.Box
    public int getLastFontId() {
        return 0;
    }
}
