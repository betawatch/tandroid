package org.telegram.ui.ActionBar;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class y5 extends Drawable {
    public static Paint c;
    public Paint a;
    public float b;

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int L;
        Rect bounds = getBounds();
        float f10 = this.b;
        if (Math.abs(f10 - (-1.0f)) < 0.01f) {
            L = Math.max(bounds.width(), bounds.height()) / 2;
        } else if (Math.abs(f10 - (-2.0f)) < 0.01f) {
            L = (int) Math.ceil(Math.sqrt(((bounds.top - bounds.centerY()) * (bounds.top - bounds.centerY())) + ((bounds.left - bounds.centerX()) * (bounds.left - bounds.centerX()))));
        } else {
            L = org.telegram.messenger.g0.L(f10);
        }
        canvas.drawCircle(bounds.centerX(), bounds.centerY(), L, this.a);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i7) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
