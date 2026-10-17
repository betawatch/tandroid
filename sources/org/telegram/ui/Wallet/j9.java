package org.telegram.ui.Wallet;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.SystemClock;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
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

    public j9(k9 k9Var, j9 j9Var, float f7, boolean z10) {
        float x10;
        this.h = k9Var;
        this.f = z10;
        this.b = f7;
        this.a = j9Var != null ? j9Var.a : f7;
        this.g = (j9Var == null || z10) ? SystemClock.uptimeMillis() : j9Var.g;
        float f10 = 0.0f;
        float a2 = (j9Var == null || !z10) ? 0.0f : j9Var.a();
        if (j9Var != null) {
            float f11 = j9Var.c;
            f10 = com.google.android.gms.internal.cast.a6.x(1.0f, f11, a2, f11);
        }
        this.c = f10;
        if (j9Var == null) {
            x10 = k9Var.N;
        } else {
            float f12 = j9Var.d;
            x10 = com.google.android.gms.internal.cast.a6.x(1.0f, f12, a2, f12);
        }
        this.d = x10;
        this.e = j9Var == null ? (-AndroidUtilities.dpf2(44.0f)) * 0.1f : j9Var.e * (1.0f - a2);
    }

    public final float a() {
        if (this.h.H >= 1.0f) {
            return 1.0f;
        }
        return k9.R.getInterpolation(Math.min(1.0f, (SystemClock.uptimeMillis() - this.g) / 320.0f));
    }

    public final void b(Canvas canvas, Paint paint, String str, float f7, int i10) {
        float a2 = a();
        boolean z10 = this.f;
        float f10 = z10 ? 0.0f : 1.0f;
        float f11 = this.c;
        float x10 = com.google.android.gms.internal.cast.a6.x(f10, f11, a2, f11);
        if (x10 <= 0.0f) {
            return;
        }
        int alpha = paint.getAlpha();
        float measureText = paint.measureText(str);
        canvas.save();
        float d = d() + f7;
        float f12 = i10;
        float f13 = this.e;
        canvas.translate(d, com.google.android.gms.internal.cast.a6.x(z10 ? AndroidUtilities.dpf2(44.0f) * 0.1f : 0.0f, f13, a2, f12 + f13));
        float f14 = z10 ? this.h.N : 1.0f;
        float f15 = this.d;
        float x11 = com.google.android.gms.internal.cast.a6.x(f14, f15, a2, f15);
        canvas.scale(x11, x11, measureText / 2.0f, (paint.descent() + paint.ascent()) / 2.0f);
        paint.setAlpha(Math.round(alpha * x10));
        canvas.drawText(str, 0.0f, 0.0f, paint);
        paint.setAlpha(alpha);
        canvas.restore();
    }

    public final j9 c() {
        k9 k9Var = this.h;
        return k9Var.H >= 1.0f ? new j9(k9Var, d()) : new j9(k9Var, d(), this);
    }

    public final float d() {
        float f7 = this.b;
        float f10 = this.a;
        return (k9.R.getInterpolation(this.h.H) * (f7 - f10)) + f10;
    }

    public j9(k9 k9Var, float f7) {
        this.h = k9Var;
        this.f = false;
        this.b = f7;
        this.a = f7;
        this.c = 1.0f;
        this.d = 1.0f;
        this.e = 0.0f;
        this.g = SystemClock.uptimeMillis();
    }

    public j9(k9 k9Var, float f7, j9 j9Var) {
        this.h = k9Var;
        this.f = j9Var.f;
        this.b = f7;
        this.a = f7;
        this.c = j9Var.c;
        this.d = j9Var.d;
        this.e = j9Var.e;
        this.g = j9Var.g;
    }
}
