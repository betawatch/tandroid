package org.scilab.forge.jlatexmath;

import ru.noties.jlatexmath.awt.Graphics2D;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public class GlueBox extends Box {
    protected float shrink;
    protected float stretch;

    public GlueBox(float f10, float f11, float f12) {
        this.width = f10;
        this.stretch = f11;
        this.shrink = f12;
    }

    @Override // org.scilab.forge.jlatexmath.Box
    public int getLastFontId() {
        return -1;
    }

    @Override // org.scilab.forge.jlatexmath.Box
    public void draw(Graphics2D graphics2D, float f10, float f11) {
    }
}
