package org.telegram.ui.Wallet;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.SystemClock;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class k9 {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final boolean f;
    public final long g;
    public final /* synthetic */ l9 h;

    public k9(l9 l9Var, k9 k9Var, float f10, boolean z10) {
        float y9;
        this.h = l9Var;
        this.f = z10;
        this.b = f10;
        this.a = k9Var != null ? k9Var.a : f10;
        this.g = (k9Var == null || z10) ? SystemClock.uptimeMillis() : k9Var.g;
        float f11 = 0.0f;
        float a10 = (k9Var == null || !z10) ? 0.0f : k9Var.a();
        if (k9Var != null) {
            float f12 = k9Var.c;
            f11 = com.google.android.recaptcha.internal.a.y(1.0f, f12, a10, f12);
        }
        this.c = f11;
        if (k9Var == null) {
            y9 = l9Var.P;
        } else {
            float f13 = k9Var.d;
            y9 = com.google.android.recaptcha.internal.a.y(1.0f, f13, a10, f13);
        }
        this.d = y9;
        this.e = k9Var == null ? (-org.telegram.messenger.g0.N(44.0f)) * 0.1f : k9Var.e * (1.0f - a10);
    }

    public final float a() {
        if (this.h.J >= 1.0f) {
            return 1.0f;
        }
        return l9.T.getInterpolation(Math.min(1.0f, (SystemClock.uptimeMillis() - this.g) / 320.0f));
    }

    public final void b(Canvas canvas, Paint paint, String str, float f10, int i3) {
        float a10 = a();
        boolean z10 = this.f;
        float f11 = z10 ? 0.0f : 1.0f;
        float f12 = this.c;
        float y9 = com.google.android.recaptcha.internal.a.y(f11, f12, a10, f12);
        if (y9 <= 0.0f) {
            return;
        }
        int alpha = paint.getAlpha();
        float measureText = paint.measureText(str);
        canvas.save();
        float d = d() + f10;
        float f13 = i3;
        float f14 = this.e;
        canvas.translate(d, com.google.android.recaptcha.internal.a.y(z10 ? org.telegram.messenger.g0.N(44.0f) * 0.1f : 0.0f, f14, a10, f13 + f14));
        float f15 = z10 ? this.h.P : 1.0f;
        float f16 = this.d;
        float y10 = com.google.android.recaptcha.internal.a.y(f15, f16, a10, f16);
        canvas.scale(y10, y10, measureText / 2.0f, (paint.descent() + paint.ascent()) / 2.0f);
        paint.setAlpha(Math.round(alpha * y9));
        canvas.drawText(str, 0.0f, 0.0f, paint);
        paint.setAlpha(alpha);
        canvas.restore();
    }

    public final k9 c() {
        l9 l9Var = this.h;
        return l9Var.J >= 1.0f ? new k9(l9Var, d()) : new k9(l9Var, d(), this);
    }

    public final float d() {
        float f10 = this.b;
        float f11 = this.a;
        return (l9.T.getInterpolation(this.h.J) * (f10 - f11)) + f11;
    }

    public k9(l9 l9Var, float f10) {
        this.h = l9Var;
        this.f = false;
        this.b = f10;
        this.a = f10;
        this.c = 1.0f;
        this.d = 1.0f;
        this.e = 0.0f;
        this.g = SystemClock.uptimeMillis();
    }

    public k9(l9 l9Var, float f10, k9 k9Var) {
        this.h = l9Var;
        this.f = k9Var.f;
        this.b = f10;
        this.a = f10;
        this.c = k9Var.c;
        this.d = k9Var.d;
        this.e = k9Var.e;
        this.g = k9Var.g;
    }
}
