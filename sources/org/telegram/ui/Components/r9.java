package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class r9 extends Drawable {
    public TextPaint a;
    public final Paint b;
    public final Paint c;
    public final Paint d;
    public final float e;
    public float f;
    public float g;
    public final RectF h;
    public ValueAnimator i;

    public r9() {
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

    public final void a(float f10, boolean z4) {
        float max = Math.max(Math.min(f10, 1.0f), 0.0f);
        ValueAnimator valueAnimator = this.i;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.i = null;
        }
        if (!z4) {
            this.g = max;
            invalidateSelf();
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.g, max);
        this.i = ofFloat;
        ofFloat.addUpdateListener(new f6(this, 5));
        this.i.addListener(new org.telegram.ui.ActionBar.a1(this, max, 4));
        this.i.setInterpolator(pr.h);
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
            float f10 = this.e;
            canvas.scale(f10, f10, centerX, centerY);
        }
        paint3.setStrokeWidth(AndroidUtilities.dpf2(1.1f));
        float f11 = i10;
        float f12 = width;
        float dpf2 = (((f12 - AndroidUtilities.dpf2(16.33f)) / 2.0f) + f11) - AndroidUtilities.dpf2(1.33f);
        float f13 = i11;
        float f14 = height;
        float dpf22 = ((f14 - AndroidUtilities.dpf2(10.33f)) / 2.0f) + f13;
        float dpf23 = (((AndroidUtilities.dpf2(16.33f) + f12) / 2.0f) + f11) - AndroidUtilities.dpf2(1.33f);
        float dpf24 = ((AndroidUtilities.dpf2(10.33f) + f14) / 2.0f) + f13;
        RectF rectF = this.h;
        rectF.set(dpf2, dpf22, dpf23, dpf24);
        canvas.drawRoundRect(rectF, AndroidUtilities.dpf2(2.33f), AndroidUtilities.dpf2(2.33f), paint3);
        rectF.set((((f12 - AndroidUtilities.dpf2(13.0f)) / 2.0f) + f11) - AndroidUtilities.dpf2(1.66f), ((f14 - AndroidUtilities.dpf2(7.33f)) / 2.0f) + f13, Math.max(AndroidUtilities.dpf2(1.1f), this.g * AndroidUtilities.dpf2(13.0f)) + ((((f12 - AndroidUtilities.dpf2(13.0f)) / 2.0f) + f11) - AndroidUtilities.dpf2(1.66f)), ((AndroidUtilities.dpf2(7.33f) + f14) / 2.0f) + f13);
        canvas.drawRoundRect(rectF, AndroidUtilities.dpf2(0.83f), AndroidUtilities.dpf2(0.83f), paint);
        float f15 = centerY;
        rectF.set((((AndroidUtilities.dpf2(17.5f) + f12) - AndroidUtilities.dpf2(4.66f)) / 2.0f) + f11, f15 - AndroidUtilities.dpf2(2.65f), ((AndroidUtilities.dpf2(4.66f) + (AndroidUtilities.dpf2(17.5f) + f12)) / 2.0f) + f11, AndroidUtilities.dpf2(2.65f) + f15);
        canvas.drawArc(rectF, -90.0f, 180.0f, false, paint2);
        if (this.e != 1.0f) {
            canvas.restore();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return AndroidUtilities.dp(this.e * 24.0f);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return AndroidUtilities.dp(this.e * 24.0f);
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

    public r9(float f10, int i10) {
        this();
        a(f10, false);
        this.b.setColor(-1);
        this.c.setColor(-1);
        this.d.setColor(i10);
        this.e = 1.3f;
        invalidateSelf();
    }
}
