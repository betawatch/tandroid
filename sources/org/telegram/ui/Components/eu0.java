package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.text.TextUtils;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class eu0 extends Drawable implements Drawable.Callback {
    public final h6 a;
    public final Paint b;

    public eu0() {
        h6 h6Var = new h6(false, true, true);
        this.a = h6Var;
        h6Var.setCallback(this);
        h6Var.n(0.3f, 165L, wq.h);
        h6Var.b = 1;
        h6Var.x(org.telegram.messenger.g0.o());
        h6Var.w(org.telegram.messenger.g0.L(10.0f));
        Paint.Style style = Paint.Style.FILL_AND_STROKE;
        TextPaint textPaint = h6Var.a;
        textPaint.setStyle(style);
        textPaint.setStrokeWidth(org.telegram.messenger.g0.N(0.6f));
        Paint paint = new Paint(1);
        this.b = paint;
        paint.setStyle(Paint.Style.STROKE);
    }

    public static String a(float f10) {
        Math.abs(f10 - 0.25f);
        float round = Math.round(f10 * 10.0f) / 10.0f;
        long j3 = (long) round;
        if (round == j3) {
            return a8.p0.o(j3, "");
        }
        return "" + round;
    }

    public final void b(boolean z9, float f10) {
        String str = a(f10) + "X";
        h6 h6Var = this.a;
        if (z9 && TextUtils.equals(h6Var.i, str)) {
            return;
        }
        h6Var.a();
        h6Var.t(str, z9, true);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        h6 h6Var = this.a;
        Paint paint = this.b;
        if (paint != null) {
            paint.setStrokeWidth(org.telegram.messenger.g0.N(1.6f));
            RectF rectF = org.telegram.messenger.g0.P;
            rectF.set(((org.telegram.messenger.g0.L(24.0f) - h6Var.c()) / 2.0f) - org.telegram.messenger.g0.N(3.0f), org.telegram.messenger.g0.N(0.2f) + ((org.telegram.messenger.g0.L(24.0f) - h6Var.e) / 2.0f), org.telegram.messenger.g0.N(3.0f) + ((h6Var.c() + org.telegram.messenger.g0.L(24.0f)) / 2.0f), (org.telegram.messenger.g0.L(24.0f) + h6Var.e) / 2.0f);
            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.N(3.0f), org.telegram.messenger.g0.N(3.0f), paint);
        }
        h6Var.a.setStrokeWidth(org.telegram.messenger.g0.N(0.3f));
        h6Var.setBounds(0, (int) ((org.telegram.messenger.g0.L(24.0f) - h6Var.e) / 2.0f), org.telegram.messenger.g0.L(24.0f), (int) ((org.telegram.messenger.g0.L(24.0f) + h6Var.e) / 2.0f));
        h6Var.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return org.telegram.messenger.g0.L(24.0f);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return org.telegram.messenger.g0.L(24.0f);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j3) {
        scheduleSelf(runnable, j3);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i7) {
        this.a.B = i7;
        Paint paint = this.b;
        if (paint != null) {
            paint.setAlpha(i7);
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
