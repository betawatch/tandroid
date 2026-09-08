package org.scilab.forge.jlatexmath;

import ru.noties.jlatexmath.awt.Graphics2D;
import ru.noties.jlatexmath.awt.geom.AffineTransform;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public class OverUnderBox extends Box {
    private final Box base;
    private final Box del;
    private final float kern;
    private final boolean over;
    private final Box script;

    public OverUnderBox(Box box, Box box2, Box box3, float f7, boolean z10) {
        this.base = box;
        this.del = box2;
        this.script = box3;
        this.kern = f7;
        this.over = z10;
        this.width = box.getWidth();
        float f10 = 0.0f;
        this.height = box.height + (z10 ? box2.getWidth() : 0.0f) + ((!z10 || box3 == null) ? 0.0f : box3.height + box3.depth + f7);
        float width = box.depth + (z10 ? 0.0f : box2.getWidth());
        if (!z10 && box3 != null) {
            f10 = box3.height + box3.depth + f7;
        }
        this.depth = width + f10;
    }

    @Override // org.scilab.forge.jlatexmath.Box
    public void draw(Graphics2D graphics2D, float f7, float f10) {
        drawDebug(graphics2D, f7, f10);
        this.base.draw(graphics2D, f7, f10);
        float width = (f10 - this.base.height) - this.del.getWidth();
        Box box = this.del;
        box.setDepth(this.del.getDepth() + box.getHeight());
        this.del.setHeight(0.0f);
        if (this.over) {
            Box box2 = this.del;
            double d = (box2.height + box2.depth) * 0.75d;
            AffineTransform transform = graphics2D.getTransform();
            graphics2D.translate(d + f7, width);
            graphics2D.rotate(1.5707963267948966d);
            this.del.draw(graphics2D, 0.0f, 0.0f);
            graphics2D.setTransform(transform);
            Box box3 = this.script;
            if (box3 != null) {
                box3.draw(graphics2D, f7, (width - this.kern) - box3.depth);
            }
        }
        float f11 = f10 + this.base.depth;
        if (this.over) {
            return;
        }
        AffineTransform transform2 = graphics2D.getTransform();
        graphics2D.translate(((this.del.getHeight() + this.del.depth) * 0.75d) + f7, f11);
        graphics2D.rotate(1.5707963267948966d);
        this.del.draw(graphics2D, 0.0f, 0.0f);
        graphics2D.setTransform(transform2);
        float width2 = this.del.getWidth() + f11;
        Box box4 = this.script;
        if (box4 != null) {
            box4.draw(graphics2D, f7, width2 + this.kern + box4.height);
        }
    }

    @Override // org.scilab.forge.jlatexmath.Box
    public int getLastFontId() {
        return this.base.getLastFontId();
    }
}
