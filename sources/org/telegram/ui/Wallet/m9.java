package org.telegram.ui.Wallet;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.SystemClock;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes4.dex */
public final class m9 {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final boolean f;
    public final long g;
    public final /* synthetic */ n9 h;

    public m9(n9 n9Var, m9 m9Var, float f7, boolean z10) {
        float y3;
        this.h = n9Var;
        this.f = z10;
        this.b = f7;
        this.a = m9Var != null ? m9Var.a : f7;
        this.g = (m9Var == null || z10) ? SystemClock.uptimeMillis() : m9Var.g;
        float f10 = 0.0f;
        float a2 = (m9Var == null || !z10) ? 0.0f : m9Var.a();
        if (m9Var != null) {
            float f11 = m9Var.c;
            f10 = com.google.android.gms.internal.play_billing.k3.y(1.0f, f11, a2, f11);
        }
        this.c = f10;
        if (m9Var == null) {
            y3 = n9Var.N;
        } else {
            float f12 = m9Var.d;
            y3 = com.google.android.gms.internal.play_billing.k3.y(1.0f, f12, a2, f12);
        }
        this.d = y3;
        this.e = m9Var == null ? (-AndroidUtilities.dpf2(44.0f)) * 0.1f : m9Var.e * (1.0f - a2);
    }

    public final float a() {
        if (this.h.H >= 1.0f) {
            return 1.0f;
        }
        return n9.R.getInterpolation(Math.min(1.0f, (SystemClock.uptimeMillis() - this.g) / 320.0f));
    }

    public final void b(Canvas canvas, Paint paint, String str, float f7, int i10) {
        float a2 = a();
        boolean z10 = this.f;
        float f10 = z10 ? 0.0f : 1.0f;
        float f11 = this.c;
        float y3 = com.google.android.gms.internal.play_billing.k3.y(f10, f11, a2, f11);
        if (y3 <= 0.0f) {
            return;
        }
        int alpha = paint.getAlpha();
        float measureText = paint.measureText(str);
        canvas.save();
        float d = d() + f7;
        float f12 = i10;
        float f13 = this.e;
        canvas.translate(d, com.google.android.gms.internal.play_billing.k3.y(z10 ? AndroidUtilities.dpf2(44.0f) * 0.1f : 0.0f, f13, a2, f12 + f13));
        float f14 = z10 ? this.h.N : 1.0f;
        float f15 = this.d;
        float y10 = com.google.android.gms.internal.play_billing.k3.y(f14, f15, a2, f15);
        canvas.scale(y10, y10, measureText / 2.0f, (paint.descent() + paint.ascent()) / 2.0f);
        paint.setAlpha(Math.round(alpha * y3));
        canvas.drawText(str, 0.0f, 0.0f, paint);
        paint.setAlpha(alpha);
        canvas.restore();
    }

    public final m9 c() {
        n9 n9Var = this.h;
        return n9Var.H >= 1.0f ? new m9(n9Var, d()) : new m9(n9Var, d(), this);
    }

    public final float d() {
        float f7 = this.b;
        float f10 = this.a;
        return (n9.R.getInterpolation(this.h.H) * (f7 - f10)) + f10;
    }

    public m9(n9 n9Var, float f7) {
        this.h = n9Var;
        this.f = false;
        this.b = f7;
        this.a = f7;
        this.c = 1.0f;
        this.d = 1.0f;
        this.e = 0.0f;
        this.g = SystemClock.uptimeMillis();
    }

    public m9(n9 n9Var, float f7, m9 m9Var) {
        this.h = n9Var;
        this.f = m9Var.f;
        this.b = f7;
        this.a = f7;
        this.c = m9Var.c;
        this.d = m9Var.d;
        this.e = m9Var.e;
        this.g = m9Var.g;
    }
}
