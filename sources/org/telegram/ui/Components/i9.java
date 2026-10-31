package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class i9 extends Drawable {
    public TextPaint a;
    public final Paint b;
    public final Paint c;
    public final Paint d;
    public final float e;
    public float f;
    public float g;
    public final RectF h;
    public ValueAnimator i;

    public i9() {
        Paint paint = new Paint(1);
        this.b = paint;
        this.c = new Paint(1);
        this.d = new Paint(1);
        this.e = 1.0f;
        this.f = 0.0f;
        this.g = 1.0f;
        this.h = new RectF();
        paint.setStyle(Paint.Style.STROKE);
    }

    public final void a(boolean z10, float f7) {
        float max = Math.max(Math.min(f7, 1.0f), 0.0f);
        ValueAnimator valueAnimator = this.i;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.i = null;
        }
        if (!z10) {
            this.g = max;
            invalidateSelf();
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.g, max);
        this.i = ofFloat;
        ofFloat.addUpdateListener(new a6(this, 5));
        this.i.addListener(new org.telegram.ui.ActionBar.v0(this, max, 4));
        this.i.setInterpolator(gr.h);
        this.i.setDuration(200L);
        this.i.start();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (getBounds() == null) {
            return;
        }
        int i10 = getBounds().left;
        int i11 = getBounds().top + ((int) this.f);
        int width = getBounds().width();
        int height = getBounds().height();
        int centerX = getBounds().centerX();
        int centerY = getBounds().centerY() + ((int) this.f);
        TextPaint textPaint = this.a;
        Paint paint = this.d;
        Paint paint2 = this.c;
        Paint paint3 = this.b;
        if (textPaint != null) {
            int color = textPaint.getColor();
            paint3.setColor(color);
            paint2.setColor(color);
            paint.setColor(color);
        }
        if (this.e != 1.0f) {
            canvas.save();
            float f7 = this.e;
            canvas.scale(f7, f7, centerX, centerY);
        }
        paint3.setStrokeWidth(org.telegram.messenger.i0.N(1.1f));
        float f10 = i10;
        float f11 = width;
        float N = (((f11 - org.telegram.messenger.i0.N(16.33f)) / 2.0f) + f10) - org.telegram.messenger.i0.N(1.33f);
        float f12 = i11;
        float f13 = height;
        float N2 = ((f13 - org.telegram.messenger.i0.N(10.33f)) / 2.0f) + f12;
        float N3 = (((org.telegram.messenger.i0.N(16.33f) + f11) / 2.0f) + f10) - org.telegram.messenger.i0.N(1.33f);
        float N4 = ((org.telegram.messenger.i0.N(10.33f) + f13) / 2.0f) + f12;
        RectF rectF = this.h;
        rectF.set(N, N2, N3, N4);
        canvas.drawRoundRect(rectF, org.telegram.messenger.i0.N(2.33f), org.telegram.messenger.i0.N(2.33f), paint3);
        rectF.set((((f11 - org.telegram.messenger.i0.N(13.0f)) / 2.0f) + f10) - org.telegram.messenger.i0.N(1.66f), ((f13 - org.telegram.messenger.i0.N(7.33f)) / 2.0f) + f12, Math.max(org.telegram.messenger.i0.N(1.1f), this.g * org.telegram.messenger.i0.N(13.0f)) + ((((f11 - org.telegram.messenger.i0.N(13.0f)) / 2.0f) + f10) - org.telegram.messenger.i0.N(1.66f)), ((org.telegram.messenger.i0.N(7.33f) + f13) / 2.0f) + f12);
        canvas.drawRoundRect(rectF, org.telegram.messenger.i0.N(0.83f), org.telegram.messenger.i0.N(0.83f), paint);
        float f14 = centerY;
        rectF.set((((org.telegram.messenger.i0.N(17.5f) + f11) - org.telegram.messenger.i0.N(4.66f)) / 2.0f) + f10, f14 - org.telegram.messenger.i0.N(2.65f), ((org.telegram.messenger.i0.N(4.66f) + (org.telegram.messenger.i0.N(17.5f) + f11)) / 2.0f) + f10, org.telegram.messenger.i0.N(2.65f) + f14);
        canvas.drawArc(rectF, -90.0f, 180.0f, false, paint2);
        if (this.e != 1.0f) {
            canvas.restore();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return org.telegram.messenger.i0.L(this.e * 24.0f);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return org.telegram.messenger.i0.L(this.e * 24.0f);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        this.b.setAlpha(i10);
        this.c.setAlpha(i10);
        this.d.setAlpha(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.b.setColorFilter(colorFilter);
        this.c.setColorFilter(colorFilter);
        this.d.setColorFilter(colorFilter);
    }

    public i9(float f7, int i10) {
        this();
        a(false, f7);
        this.b.setColor(-1);
        this.c.setColor(-1);
        this.d.setColor(i10);
        this.e = 1.3f;
        invalidateSelf();
    }
}
