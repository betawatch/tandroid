package org.scilab.forge.jlatexmath;

import ru.noties.jlatexmath.awt.Graphics2D;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes.dex */
public class OverBar extends VerticalBox {
    public OverBar(Box box, float f7, float f10) {
        add(new StrutBox(0.0f, f10, 0.0f, 0.0f));
        add(new HorizontalRule(f10, box.getWidth(), 0.0f));
        add(new StrutBox(0.0f, f7, 0.0f, 0.0f));
        add(box);
    }

    @Override // org.scilab.forge.jlatexmath.VerticalBox, org.scilab.forge.jlatexmath.Box
    public /* bridge */ /* synthetic */ void add(int i10, Box box) {
        super.add(i10, box);
    }

    @Override // org.scilab.forge.jlatexmath.VerticalBox, org.scilab.forge.jlatexmath.Box
    public /* bridge */ /* synthetic */ void draw(Graphics2D graphics2D, float f7, float f10) {
        super.draw(graphics2D, f7, f10);
    }

    @Override // org.scilab.forge.jlatexmath.VerticalBox, org.scilab.forge.jlatexmath.Box
    public /* bridge */ /* synthetic */ int getLastFontId() {
        return super.getLastFontId();
    }

    @Override // org.scilab.forge.jlatexmath.VerticalBox
    public /* bridge */ /* synthetic */ int getSize() {
        return super.getSize();
    }
}
