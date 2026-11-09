package org.telegram.ui.Wallet;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.SystemClock;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes4.dex */
public final class j9 {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final boolean f;
    public final long g;
    public final /* synthetic */ k9 h;

    public j9(k9 k9Var, j9 j9Var, float f10, boolean z9) {
        float z10;
        this.h = k9Var;
        this.f = z9;
        this.b = f10;
        this.a = j9Var != null ? j9Var.a : f10;
        this.g = (j9Var == null || z9) ? SystemClock.uptimeMillis() : j9Var.g;
        float f11 = 0.0f;
        float a10 = (j9Var == null || !z9) ? 0.0f : j9Var.a();
        if (j9Var != null) {
            float f12 = j9Var.c;
            f11 = com.google.android.recaptcha.internal.a.z(1.0f, f12, a10, f12);
        }
        this.c = f11;
        if (j9Var == null) {
            z10 = k9Var.O;
        } else {
            float f13 = j9Var.d;
            z10 = com.google.android.recaptcha.internal.a.z(1.0f, f13, a10, f13);
        }
        this.d = z10;
        this.e = j9Var == null ? (-org.telegram.messenger.g0.N(44.0f)) * 0.1f : j9Var.e * (1.0f - a10);
    }

    public final float a() {
        if (this.h.I >= 1.0f) {
            return 1.0f;
        }
        return k9.S.getInterpolation(Math.min(1.0f, (SystemClock.uptimeMillis() - this.g) / 320.0f));
    }

    public final void b(Canvas canvas, Paint paint, String str, float f10, int i7) {
        float a10 = a();
        boolean z9 = this.f;
        float f11 = z9 ? 0.0f : 1.0f;
        float f12 = this.c;
        float z10 = com.google.android.recaptcha.internal.a.z(f11, f12, a10, f12);
        if (z10 <= 0.0f) {
            return;
        }
        int alpha = paint.getAlpha();
        float measureText = paint.measureText(str);
        canvas.save();
        float d = d() + f10;
        float f13 = i7;
        float f14 = this.e;
        canvas.translate(d, com.google.android.recaptcha.internal.a.z(z9 ? org.telegram.messenger.g0.N(44.0f) * 0.1f : 0.0f, f14, a10, f13 + f14));
        float f15 = z9 ? this.h.O : 1.0f;
        float f16 = this.d;
        float z11 = com.google.android.recaptcha.internal.a.z(f15, f16, a10, f16);
        canvas.scale(z11, z11, measureText / 2.0f, (paint.descent() + paint.ascent()) / 2.0f);
        paint.setAlpha(Math.round(alpha * z10));
        canvas.drawText(str, 0.0f, 0.0f, paint);
        paint.setAlpha(alpha);
        canvas.restore();
    }

    public final j9 c() {
        k9 k9Var = this.h;
        return k9Var.I >= 1.0f ? new j9(k9Var, d()) : new j9(k9Var, d(), this);
    }

    public final float d() {
        float f10 = this.b;
        float f11 = this.a;
        return (k9.S.getInterpolation(this.h.I) * (f10 - f11)) + f11;
    }

    public j9(k9 k9Var, float f10) {
        this.h = k9Var;
        this.f = false;
        this.b = f10;
        this.a = f10;
        this.c = 1.0f;
        this.d = 1.0f;
        this.e = 0.0f;
        this.g = SystemClock.uptimeMillis();
    }

    public j9(k9 k9Var, float f10, j9 j9Var) {
        this.h = k9Var;
        this.f = j9Var.f;
        this.b = f10;
        this.a = f10;
        this.c = j9Var.c;
        this.d = j9Var.d;
        this.e = j9Var.e;
        this.g = j9Var.g;
    }
}
