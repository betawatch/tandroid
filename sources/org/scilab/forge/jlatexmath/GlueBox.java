package org.scilab.forge.jlatexmath;

import ru.noties.jlatexmath.awt.Graphics2D;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes.dex */
public class GlueBox extends Box {
    protected float shrink;
    protected float stretch;

    public GlueBox(float f7, float f10, float f11) {
        this.width = f7;
        this.stretch = f10;
        this.shrink = f11;
    }

    @Override // org.scilab.forge.jlatexmath.Box
    public int getLastFontId() {
        return -1;
    }

    @Override // org.scilab.forge.jlatexmath.Box
    public void draw(Graphics2D graphics2D, float f7, float f10) {
    }
}
