package org.scilab.forge.jlatexmath;

import ru.noties.jlatexmath.awt.Font;
import ru.noties.jlatexmath.awt.Graphics2D;
import ru.noties.jlatexmath.awt.font.TextLayout;
import ru.noties.jlatexmath.awt.geom.Rectangle2D;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public class JavaFontRenderingBox extends Box {
    private static Font font = new Font("Serif", 0, 10);
    private float size;
    private TextLayout text;

    public JavaFontRenderingBox(String str, int i, float f, Font font2, boolean z) {
        this.size = f;
        TextLayout textLayout = new TextLayout(str, font2.deriveFont(i), null);
        this.text = textLayout;
        Rectangle2D bounds = textLayout.getBounds();
        this.height = ((-bounds.getY()) * f) / 10.0f;
        this.depth = ((bounds.getHeight() * f) / 10.0f) - this.height;
        this.width = (((bounds.getX() + bounds.getWidth()) + 0.4f) * f) / 10.0f;
    }

    public static void setFont(String str) {
        font = new Font(str, 0, 10);
    }

    @Override // org.scilab.forge.jlatexmath.Box
    public void draw(Graphics2D graphics2D, float f, float f2) {
        drawDebug(graphics2D, f, f2);
        graphics2D.translate(f, f2);
        float f3 = this.size;
        graphics2D.scale(f3 * 0.1d, f3 * 0.1d);
        this.text.draw(graphics2D, 0, 0);
        float f4 = this.size;
        graphics2D.scale(10.0f / f4, 10.0f / f4);
        graphics2D.translate(-f, -f2);
    }

    @Override // org.scilab.forge.jlatexmath.Box
    public int getLastFontId() {
        return 0;
    }

    public JavaFontRenderingBox(String str, int i, float f) {
        this(str, i, f, font, true);
    }
}
