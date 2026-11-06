package org.telegram.ui;

import android.graphics.Canvas;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class e41 extends org.telegram.ui.Cells.w7 {
    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (getTranslationY() != 0.0f) {
            canvas.drawColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.d6, false));
        }
        super.onDraw(canvas);
    }
}
