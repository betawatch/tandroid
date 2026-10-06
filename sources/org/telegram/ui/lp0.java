package org.telegram.ui;

import android.graphics.Canvas;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
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
