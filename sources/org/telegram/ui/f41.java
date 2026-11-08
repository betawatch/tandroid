package org.telegram.ui;

import android.graphics.Canvas;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class f41 extends ng.c {
    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (getTranslationY() != 0.0f) {
            canvas.drawColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.d6, false));
        }
        super.onDraw(canvas);
    }
}
