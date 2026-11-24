package org.scilab.forge.jlatexmath;

import ru.noties.jlatexmath.awt.Graphics2D;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public class StrutBox extends Box {
    public StrutBox(float f, float f2, float f3, float f4) {
        this.width = f;
        this.height = f2;
        this.depth = f3;
        this.shift = f4;
    }

    @Override // org.scilab.forge.jlatexmath.Box
    public int getLastFontId() {
        return -1;
    }

    @Override // org.scilab.forge.jlatexmath.Box
    public void draw(Graphics2D graphics2D, float f, float f2) {
    }
}
