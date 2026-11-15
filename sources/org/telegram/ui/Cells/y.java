package org.telegram.ui.Cells;

import android.graphics.Canvas;
import android.graphics.drawable.RippleDrawable;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
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
