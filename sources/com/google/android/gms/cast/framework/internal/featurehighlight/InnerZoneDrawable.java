package com.google.android.gms.cast.framework.internal.featurehighlight;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
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
