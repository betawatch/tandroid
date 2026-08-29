package com.google.android.gms.cast.framework.internal.featurehighlight;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
class OuterHighlightDrawable extends Drawable {
    public float a;
    public float b;
    public float c;

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        canvas.drawCircle(this.b + 0.0f, this.c + 0.0f, this.a * 0.0f, null);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        throw null;
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

    public void setScale(float f9) {
        this.a = f9;
        invalidateSelf();
    }

    public void setTranslationX(float f9) {
        this.b = f9;
        invalidateSelf();
    }

    public void setTranslationY(float f9) {
        this.c = f9;
        invalidateSelf();
    }
}
