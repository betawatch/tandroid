package org.telegram.ui.ActionBar;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class i6 extends Drawable {
    public static Paint c;
    public Paint a;
    public float b;

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int L;
        Rect bounds = getBounds();
        float f7 = this.b;
        if (Math.abs(f7 - (-1.0f)) < 0.01f) {
            L = Math.max(bounds.width(), bounds.height()) / 2;
        } else if (Math.abs(f7 - (-2.0f)) < 0.01f) {
            L = (int) Math.ceil(Math.sqrt(((bounds.top - bounds.centerY()) * (bounds.top - bounds.centerY())) + ((bounds.left - bounds.centerX()) * (bounds.left - bounds.centerX()))));
        } else {
            L = org.telegram.messenger.i0.L(f7);
        }
        canvas.drawCircle(bounds.centerX(), bounds.centerY(), L, this.a);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
