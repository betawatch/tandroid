package org.telegram.ui.Cells;

import android.graphics.Canvas;
import android.graphics.drawable.RippleDrawable;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class y extends RippleDrawable {
    @Override // android.graphics.drawable.RippleDrawable, android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int save = canvas.save();
        try {
            super.draw(canvas);
        } catch (Exception e) {
            org.telegram.messenger.f8.e("probably forgot to put setCallback", e);
        } finally {
            canvas.restoreToCount(save);
        }
    }
}
