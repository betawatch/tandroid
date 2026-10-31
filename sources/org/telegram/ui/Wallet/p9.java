package org.telegram.ui.Wallet;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.SystemClock;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class p9 {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final boolean f;
    public final long g;
    public final /* synthetic */ q9 h;

    public p9(q9 q9Var, p9 p9Var, float f7, boolean z10) {
        float z11;
        this.h = q9Var;
        this.f = z10;
        this.b = f7;
        this.a = p9Var != null ? p9Var.a : f7;
        this.g = (p9Var == null || z10) ? SystemClock.uptimeMillis() : p9Var.g;
        float f10 = 0.0f;
        float a2 = (p9Var == null || !z10) ? 0.0f : p9Var.a();
        if (p9Var != null) {
            float f11 = p9Var.c;
            f10 = c3.i0.z(1.0f, f11, a2, f11);
        }
        this.c = f10;
        if (p9Var == null) {
            z11 = q9Var.O;
        } else {
            float f12 = p9Var.d;
            z11 = c3.i0.z(1.0f, f12, a2, f12);
        }
        this.d = z11;
        this.e = p9Var == null ? (-org.telegram.messenger.i0.N(44.0f)) * 0.1f : p9Var.e * (1.0f - a2);
    }

    public final float a() {
        if (this.h.I >= 1.0f) {
            return 1.0f;
        }
        return q9.S.getInterpolation(Math.min(1.0f, (SystemClock.uptimeMillis() - this.g) / 320.0f));
    }

    public final void b(Canvas canvas, Paint paint, String str, float f7, int i10) {
        float a2 = a();
        boolean z10 = this.f;
        float f10 = z10 ? 0.0f : 1.0f;
        float f11 = this.c;
        float z11 = c3.i0.z(f10, f11, a2, f11);
        if (z11 <= 0.0f) {
            return;
        }
        int alpha = paint.getAlpha();
        float measureText = paint.measureText(str);
        canvas.save();
        float d = d() + f7;
        float f12 = i10;
        float f13 = this.e;
        canvas.translate(d, c3.i0.z(z10 ? org.telegram.messenger.i0.N(44.0f) * 0.1f : 0.0f, f13, a2, f12 + f13));
        float f14 = z10 ? this.h.O : 1.0f;
        float f15 = this.d;
        float z12 = c3.i0.z(f14, f15, a2, f15);
        canvas.scale(z12, z12, measureText / 2.0f, (paint.descent() + paint.ascent()) / 2.0f);
        paint.setAlpha(Math.round(alpha * z11));
        canvas.drawText(str, 0.0f, 0.0f, paint);
        paint.setAlpha(alpha);
        canvas.restore();
    }

    public final p9 c() {
        q9 q9Var = this.h;
        return q9Var.I >= 1.0f ? new p9(q9Var, d()) : new p9(q9Var, d(), this);
    }

    public final float d() {
        float f7 = this.b;
        float f10 = this.a;
        return (q9.S.getInterpolation(this.h.I) * (f7 - f10)) + f10;
    }

    public p9(q9 q9Var, float f7) {
        this.h = q9Var;
        this.f = false;
        this.b = f7;
        this.a = f7;
        this.c = 1.0f;
        this.d = 1.0f;
        this.e = 0.0f;
        this.g = SystemClock.uptimeMillis();
    }

    public p9(q9 q9Var, float f7, p9 p9Var) {
        this.h = q9Var;
        this.f = p9Var.f;
        this.b = f7;
        this.a = f7;
        this.c = p9Var.c;
        this.d = p9Var.d;
        this.e = p9Var.e;
        this.g = p9Var.g;
    }
}
