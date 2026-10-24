package org.scilab.forge.jlatexmath;

import ru.noties.jlatexmath.awt.Graphics2D;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
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
