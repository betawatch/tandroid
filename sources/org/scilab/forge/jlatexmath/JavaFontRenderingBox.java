package org.scilab.forge.jlatexmath;

import ru.noties.jlatexmath.awt.Font;
import ru.noties.jlatexmath.awt.Graphics2D;
import ru.noties.jlatexmath.awt.font.TextLayout;
import ru.noties.jlatexmath.awt.geom.Rectangle2D;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes.dex */
public class JavaFontRenderingBox extends Box {
    private static Font font = new Font("Serif", 0, 10);
    private float size;
    private TextLayout text;

    public JavaFontRenderingBox(String str, int i7, float f10, Font font2, boolean z9) {
        this.size = f10;
        TextLayout textLayout = new TextLayout(str, font2.deriveFont(i7), null);
        this.text = textLayout;
        Rectangle2D bounds = textLayout.getBounds();
        this.height = ((-bounds.getY()) * f10) / 10.0f;
        this.depth = ((bounds.getHeight() * f10) / 10.0f) - this.height;
        this.width = (((bounds.getX() + bounds.getWidth()) + 0.4f) * f10) / 10.0f;
    }

    public static void setFont(String str) {
        font = new Font(str, 0, 10);
    }

    @Override // org.scilab.forge.jlatexmath.Box
    public void draw(Graphics2D graphics2D, float f10, float f11) {
        drawDebug(graphics2D, f10, f11);
        graphics2D.translate(f10, f11);
        float f12 = this.size;
        graphics2D.scale(f12 * 0.1d, f12 * 0.1d);
        this.text.draw(graphics2D, 0, 0);
        float f13 = this.size;
        graphics2D.scale(10.0f / f13, 10.0f / f13);
        graphics2D.translate(-f10, -f11);
    }

    @Override // org.scilab.forge.jlatexmath.Box
    public int getLastFontId() {
        return 0;
    }

    public JavaFontRenderingBox(String str, int i7, float f10) {
        this(str, i7, f10, font, true);
    }
}
