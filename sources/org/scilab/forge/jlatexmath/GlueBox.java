package org.scilab.forge.jlatexmath;

import ru.noties.jlatexmath.awt.Graphics2D;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
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
