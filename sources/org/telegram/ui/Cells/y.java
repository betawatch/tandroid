package org.telegram.ui.Cells;

import android.graphics.Canvas;
import android.graphics.drawable.RippleDrawable;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
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
