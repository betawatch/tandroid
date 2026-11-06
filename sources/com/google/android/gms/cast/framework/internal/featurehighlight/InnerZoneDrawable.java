package com.google.android.gms.cast.framework.internal.featurehighlight;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
class InnerZoneDrawable extends Drawable {
    public float a;
    public float b;

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (this.b > 0.0f) {
            throw null;
        }
        canvas.drawCircle(0.0f, 0.0f, this.a * 0.0f, null);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i7) {
        throw null;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        throw null;
    }

    public void setPulseAlpha(float f10) {
        this.b = f10;
        invalidateSelf();
    }

    public void setPulseScale(float f10) {
        invalidateSelf();
    }

    public void setScale(float f10) {
        this.a = f10;
        invalidateSelf();
    }
}
