package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.text.TextUtils;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class pu0 extends Drawable implements Drawable.Callback {
    public final n6 a;
    public final Paint b;

    public pu0() {
        n6 n6Var = new n6(false, true, true);
        this.a = n6Var;
        n6Var.setCallback(this);
        n6Var.n(0.3f, 165L, nr.h);
        n6Var.b = 1;
        n6Var.x(org.telegram.messenger.g0.o());
        n6Var.w(org.telegram.messenger.g0.L(10.0f));
        Paint.Style style = Paint.Style.FILL_AND_STROKE;
        TextPaint textPaint = n6Var.a;
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

    public final void b(boolean z10, float f10) {
        String str = a(f10) + "X";
        n6 n6Var = this.a;
        if (z10 && TextUtils.equals(n6Var.i, str)) {
            return;
        }
        n6Var.a();
        n6Var.t(str, z10, true);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        n6 n6Var = this.a;
        Paint paint = this.b;
        if (paint != null) {
            paint.setStrokeWidth(org.telegram.messenger.g0.N(1.6f));
            RectF rectF = org.telegram.messenger.g0.P;
            rectF.set(((org.telegram.messenger.g0.L(24.0f) - n6Var.c()) / 2.0f) - org.telegram.messenger.g0.N(3.0f), org.telegram.messenger.g0.N(0.2f) + ((org.telegram.messenger.g0.L(24.0f) - n6Var.e) / 2.0f), org.telegram.messenger.g0.N(3.0f) + ((n6Var.c() + org.telegram.messenger.g0.L(24.0f)) / 2.0f), (org.telegram.messenger.g0.L(24.0f) + n6Var.e) / 2.0f);
            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.N(3.0f), org.telegram.messenger.g0.N(3.0f), paint);
        }
        n6Var.a.setStrokeWidth(org.telegram.messenger.g0.N(0.3f));
        n6Var.setBounds(0, (int) ((org.telegram.messenger.g0.L(24.0f) - n6Var.e) / 2.0f), org.telegram.messenger.g0.L(24.0f), (int) ((org.telegram.messenger.g0.L(24.0f) + n6Var.e) / 2.0f));
        n6Var.draw(canvas);
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
        this.a.C = i7;
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
