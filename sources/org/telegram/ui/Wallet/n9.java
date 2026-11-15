package org.telegram.ui.Wallet;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.SystemClock;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes4.dex */
public final class n9 {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final boolean f;
    public final long g;
    public final /* synthetic */ o9 h;

    public n9(o9 o9Var, n9 n9Var, float f10, boolean z10) {
        float z11;
        this.h = o9Var;
        this.f = z10;
        this.b = f10;
        this.a = n9Var != null ? n9Var.a : f10;
        this.g = (n9Var == null || z10) ? SystemClock.uptimeMillis() : n9Var.g;
        float f11 = 0.0f;
        float a10 = (n9Var == null || !z10) ? 0.0f : n9Var.a();
        if (n9Var != null) {
            float f12 = n9Var.c;
            f11 = com.google.android.gms.internal.vision.e2.z(1.0f, f12, a10, f12);
        }
        this.c = f11;
        if (n9Var == null) {
            z11 = o9Var.P;
        } else {
            float f13 = n9Var.d;
            z11 = com.google.android.gms.internal.vision.e2.z(1.0f, f13, a10, f13);
        }
        this.d = z11;
        this.e = n9Var == null ? (-org.telegram.messenger.g0.N(44.0f)) * 0.1f : n9Var.e * (1.0f - a10);
    }

    public final float a() {
        if (this.h.J >= 1.0f) {
            return 1.0f;
        }
        return o9.T.getInterpolation(Math.min(1.0f, (SystemClock.uptimeMillis() - this.g) / 320.0f));
    }

    public final void b(Canvas canvas, Paint paint, String str, float f10, int i7) {
        float a10 = a();
        boolean z10 = this.f;
        float f11 = z10 ? 0.0f : 1.0f;
        float f12 = this.c;
        float z11 = com.google.android.gms.internal.vision.e2.z(f11, f12, a10, f12);
        if (z11 <= 0.0f) {
            return;
        }
        int alpha = paint.getAlpha();
        float measureText = paint.measureText(str);
        canvas.save();
        float d = d() + f10;
        float f13 = i7;
        float f14 = this.e;
        canvas.translate(d, com.google.android.gms.internal.vision.e2.z(z10 ? org.telegram.messenger.g0.N(44.0f) * 0.1f : 0.0f, f14, a10, f13 + f14));
        float f15 = z10 ? this.h.P : 1.0f;
        float f16 = this.d;
        float z12 = com.google.android.gms.internal.vision.e2.z(f15, f16, a10, f16);
        canvas.scale(z12, z12, measureText / 2.0f, (paint.descent() + paint.ascent()) / 2.0f);
        paint.setAlpha(Math.round(alpha * z11));
        canvas.drawText(str, 0.0f, 0.0f, paint);
        paint.setAlpha(alpha);
        canvas.restore();
    }

    public final n9 c() {
        o9 o9Var = this.h;
        return o9Var.J >= 1.0f ? new n9(o9Var, d()) : new n9(o9Var, d(), this);
    }

    public final float d() {
        float f10 = this.b;
        float f11 = this.a;
        return (o9.T.getInterpolation(this.h.J) * (f10 - f11)) + f11;
    }

    public n9(o9 o9Var, float f10) {
        this.h = o9Var;
        this.f = false;
        this.b = f10;
        this.a = f10;
        this.c = 1.0f;
        this.d = 1.0f;
        this.e = 0.0f;
        this.g = SystemClock.uptimeMillis();
    }

    public n9(o9 o9Var, float f10, n9 n9Var) {
        this.h = o9Var;
        this.f = n9Var.f;
        this.b = f10;
        this.a = f10;
        this.c = n9Var.c;
        this.d = n9Var.d;
        this.e = n9Var.e;
        this.g = n9Var.g;
    }
}
