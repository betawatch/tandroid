package org.scilab.forge.jlatexmath;

import ru.noties.jlatexmath.awt.Graphics2D;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public class OverBar extends VerticalBox {
    public OverBar(Box box, float f, float f2) {
        add(new StrutBox(0.0f, f2, 0.0f, 0.0f));
        add(new HorizontalRule(f2, box.getWidth(), 0.0f));
        add(new StrutBox(0.0f, f, 0.0f, 0.0f));
        add(box);
    }

    @Override // org.scilab.forge.jlatexmath.VerticalBox, org.scilab.forge.jlatexmath.Box
    public /* bridge */ /* synthetic */ void add(int i, Box box) {
        super.add(i, box);
    }

    @Override // org.scilab.forge.jlatexmath.VerticalBox, org.scilab.forge.jlatexmath.Box
    public /* bridge */ /* synthetic */ void draw(Graphics2D graphics2D, float f, float f2) {
        super.draw(graphics2D, f, f2);
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
