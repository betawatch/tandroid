package org.telegram.ui;

import android.graphics.Canvas;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class lp0 extends org.telegram.ui.Cells.ia {
    @Override // android.view.View
    public final void draw(Canvas canvas) {
        if (canvas.isHardwareAccelerated()) {
            super.draw(canvas);
        } else {
            yf.f0.a(canvas, this, new t3(this, 15));
        }
    }
}
