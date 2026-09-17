package org.scilab.forge.jlatexmath;

import ru.noties.jlatexmath.awt.Graphics2D;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
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
