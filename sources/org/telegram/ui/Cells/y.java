package org.telegram.ui.Cells;

import android.graphics.Canvas;
import android.graphics.drawable.RippleDrawable;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class y extends RippleDrawable {
    @Override // android.graphics.drawable.RippleDrawable, android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int save = canvas.save();
        try {
            super.draw(canvas);
        } catch (Exception e10) {
            org.telegram.messenger.a8.e("probably forgot to put setCallback", e10);
        } finally {
            canvas.restoreToCount(save);
        }
    }
}
