package org.telegram.ui;

import android.graphics.Canvas;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class f41 extends org.telegram.ui.Cells.w7 {
    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (getTranslationY() != 0.0f) {
            canvas.drawColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.d6, false));
        }
        super.onDraw(canvas);
    }
}
