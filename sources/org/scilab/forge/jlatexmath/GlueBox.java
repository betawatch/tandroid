package org.scilab.forge.jlatexmath;

import ru.noties.jlatexmath.awt.Graphics2D;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
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
