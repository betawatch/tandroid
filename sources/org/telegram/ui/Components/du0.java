package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.text.TextUtils;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class du0 extends Drawable implements Drawable.Callback {
    public final i6 a;
    public final Paint b;

    public du0() {
        i6 i6Var = new i6(false, true, true);
        this.a = i6Var;
        i6Var.setCallback(this);
        i6Var.n(0.3f, 165L, xq.h);
        i6Var.b = 1;
        i6Var.x(org.telegram.messenger.g0.o());
        i6Var.w(org.telegram.messenger.g0.L(10.0f));
        Paint.Style style = Paint.Style.FILL_AND_STROKE;
        TextPaint textPaint = i6Var.a;
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
        i6 i6Var = this.a;
        if (z9 && TextUtils.equals(i6Var.i, str)) {
            return;
        }
        i6Var.a();
        i6Var.t(str, z9, true);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        i6 i6Var = this.a;
        Paint paint = this.b;
        if (paint != null) {
            paint.setStrokeWidth(org.telegram.messenger.g0.N(1.6f));
            RectF rectF = org.telegram.messenger.g0.P;
            rectF.set(((org.telegram.messenger.g0.L(24.0f) - i6Var.c()) / 2.0f) - org.telegram.messenger.g0.N(3.0f), org.telegram.messenger.g0.N(0.2f) + ((org.telegram.messenger.g0.L(24.0f) - i6Var.e) / 2.0f), org.telegram.messenger.g0.N(3.0f) + ((i6Var.c() + org.telegram.messenger.g0.L(24.0f)) / 2.0f), (org.telegram.messenger.g0.L(24.0f) + i6Var.e) / 2.0f);
            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.N(3.0f), org.telegram.messenger.g0.N(3.0f), paint);
        }
        i6Var.a.setStrokeWidth(org.telegram.messenger.g0.N(0.3f));
        i6Var.setBounds(0, (int) ((org.telegram.messenger.g0.L(24.0f) - i6Var.e) / 2.0f), org.telegram.messenger.g0.L(24.0f), (int) ((org.telegram.messenger.g0.L(24.0f) + i6Var.e) / 2.0f));
        i6Var.draw(canvas);
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
