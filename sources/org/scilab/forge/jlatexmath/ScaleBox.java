package org.scilab.forge.jlatexmath;

import ru.noties.jlatexmath.awt.Graphics2D;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public class ScaleBox extends Box {
    private Box box;
    private double xscl;
    private double yscl;

    public ScaleBox(Box box, double d, double d10) {
        this.box = box;
        this.xscl = (Double.isNaN(d) || Double.isInfinite(d)) ? 0.0d : d;
        this.yscl = (Double.isNaN(d10) || Double.isInfinite(d10)) ? 0.0d : d10;
        this.width = box.width * ((float) Math.abs(this.xscl));
        double d11 = this.yscl;
        this.height = (d11 > 0.0d ? box.height : -box.depth) * ((float) d11);
        this.depth = (d11 > 0.0d ? box.depth : -box.height) * ((float) d11);
        this.shift = box.shift * ((float) d11);
    }

    @Override // org.scilab.forge.jlatexmath.Box
    public void draw(Graphics2D graphics2D, float f10, float f11) {
        drawDebug(graphics2D, f10, f11);
        double d = this.xscl;
        if (d == 0.0d || this.yscl == 0.0d) {
            return;
        }
        float f12 = d < 0.0d ? this.width : 0.0f;
        graphics2D.translate(f10 + f12, f11);
        graphics2D.scale(this.xscl, this.yscl);
        this.box.draw(graphics2D, 0.0f, 0.0f);
        graphics2D.scale(1.0d / this.xscl, 1.0d / this.yscl);
        graphics2D.translate((-f10) - f12, -f11);
    }

    @Override // org.scilab.forge.jlatexmath.Box
    public int getLastFontId() {
        return this.box.getLastFontId();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ScaleBox(Box box, float f10) {
        this(box, r2, r2);
        double d = f10;
    }
}
