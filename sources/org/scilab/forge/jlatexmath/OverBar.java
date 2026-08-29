package org.scilab.forge.jlatexmath;

import ru.noties.jlatexmath.awt.Graphics2D;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public class OverBar extends VerticalBox {
    public OverBar(Box box, float f9, float f10) {
        add(new StrutBox(0.0f, f10, 0.0f, 0.0f));
        add(new HorizontalRule(f10, box.getWidth(), 0.0f));
        add(new StrutBox(0.0f, f9, 0.0f, 0.0f));
        add(box);
    }

    @Override // org.scilab.forge.jlatexmath.VerticalBox, org.scilab.forge.jlatexmath.Box
    public /* bridge */ /* synthetic */ void add(int i10, Box box) {
        super.add(i10, box);
    }

    @Override // org.scilab.forge.jlatexmath.VerticalBox, org.scilab.forge.jlatexmath.Box
    public /* bridge */ /* synthetic */ void draw(Graphics2D graphics2D, float f9, float f10) {
        super.draw(graphics2D, f9, f10);
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
