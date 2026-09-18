package org.scilab.forge.jlatexmath;

import ru.noties.jlatexmath.awt.Graphics2D;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes.dex */
public class ReflectBox extends Box {
    private Box box;

    public ReflectBox(Box box) {
        this.box = box;
        this.width = box.width;
        this.height = box.height;
        this.depth = box.depth;
        this.shift = box.shift;
    }

    @Override // org.scilab.forge.jlatexmath.Box
    public void draw(Graphics2D graphics2D, float f7, float f10) {
        drawDebug(graphics2D, f7, f10);
        graphics2D.translate(f7, f10);
        graphics2D.scale(-1.0d, 1.0d);
        this.box.draw(graphics2D, -this.width, 0.0f);
        graphics2D.scale(-1.0d, 1.0d);
        graphics2D.translate(-f7, -f10);
    }

    @Override // org.scilab.forge.jlatexmath.Box
    public int getLastFontId() {
        return this.box.getLastFontId();
    }
}
