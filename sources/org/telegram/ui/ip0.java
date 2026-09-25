package org.telegram.ui;

import android.graphics.Canvas;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class ip0 extends org.telegram.ui.Cells.ia {
    @Override // android.view.View
    public final void draw(Canvas canvas) {
        if (canvas.isHardwareAccelerated()) {
            super.draw(canvas);
        } else {
            yf.i0.a(canvas, this, new t3(this, 15));
        }
    }
}
