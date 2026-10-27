package org.telegram.ui;

import android.graphics.Canvas;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class ip0 extends org.telegram.ui.Cells.ka {
    @Override // android.view.View
    public final void draw(Canvas canvas) {
        if (canvas.isHardwareAccelerated()) {
            super.draw(canvas);
        } else {
            ag.z0.a(canvas, this, new t3(this, 16));
        }
    }
}
