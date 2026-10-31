package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class f21 extends Drawable {
    public Paint a;
    public RectF b;

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        RectF rectF = this.b;
        rectF.set(getBounds());
        rectF.inset(org.telegram.messenger.i0.L(1.0f), (rectF.height() - org.telegram.messenger.i0.L(28.0f)) / 2.0f);
        canvas.drawRoundRect(rectF, org.telegram.messenger.i0.L(14.0f), org.telegram.messenger.i0.L(14.0f), this.a);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        this.a.setAlpha(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
