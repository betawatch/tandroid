package com.google.android.gms.cast.framework.internal.featurehighlight;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
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
    public final void setAlpha(int i10) {
        throw null;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        throw null;
    }

    public void setPulseAlpha(float f7) {
        this.b = f7;
        invalidateSelf();
    }

    public void setPulseScale(float f7) {
        invalidateSelf();
    }

    public void setScale(float f7) {
        this.a = f7;
        invalidateSelf();
    }
}
