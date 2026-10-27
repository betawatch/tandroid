package org.telegram.ui.Wallet;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.SystemClock;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class g9 {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final boolean f;
    public final long g;
    public final /* synthetic */ h9 h;

    public g9(h9 h9Var, g9 g9Var, float f7, boolean z10) {
        float z11;
        this.h = h9Var;
        this.f = z10;
        this.b = f7;
        this.a = g9Var != null ? g9Var.a : f7;
        this.g = (g9Var == null || z10) ? SystemClock.uptimeMillis() : g9Var.g;
        float f10 = 0.0f;
        float a2 = (g9Var == null || !z10) ? 0.0f : g9Var.a();
        if (g9Var != null) {
            float f11 = g9Var.c;
            f10 = c3.h0.z(1.0f, f11, a2, f11);
        }
        this.c = f10;
        if (g9Var == null) {
            z11 = h9Var.O;
        } else {
            float f12 = g9Var.d;
            z11 = c3.h0.z(1.0f, f12, a2, f12);
        }
        this.d = z11;
        this.e = g9Var == null ? (-AndroidUtilities.dpf2(44.0f)) * 0.1f : g9Var.e * (1.0f - a2);
    }

    public final float a() {
        if (this.h.I >= 1.0f) {
            return 1.0f;
        }
        return h9.S.getInterpolation(Math.min(1.0f, (SystemClock.uptimeMillis() - this.g) / 320.0f));
    }

    public final void b(Canvas canvas, Paint paint, String str, float f7, int i10) {
        float a2 = a();
        boolean z10 = this.f;
        float f10 = z10 ? 0.0f : 1.0f;
        float f11 = this.c;
        float z11 = c3.h0.z(f10, f11, a2, f11);
        if (z11 <= 0.0f) {
            return;
        }
        int alpha = paint.getAlpha();
        float measureText = paint.measureText(str);
        canvas.save();
        float d = d() + f7;
        float f12 = i10;
        float f13 = this.e;
        canvas.translate(d, c3.h0.z(z10 ? AndroidUtilities.dpf2(44.0f) * 0.1f : 0.0f, f13, a2, f12 + f13));
        float f14 = z10 ? this.h.O : 1.0f;
        float f15 = this.d;
        float z12 = c3.h0.z(f14, f15, a2, f15);
        canvas.scale(z12, z12, measureText / 2.0f, (paint.descent() + paint.ascent()) / 2.0f);
        paint.setAlpha(Math.round(alpha * z11));
        canvas.drawText(str, 0.0f, 0.0f, paint);
        paint.setAlpha(alpha);
        canvas.restore();
    }

    public final g9 c() {
        h9 h9Var = this.h;
        return h9Var.I >= 1.0f ? new g9(h9Var, d()) : new g9(h9Var, d(), this);
    }

    public final float d() {
        float f7 = this.b;
        float f10 = this.a;
        return (h9.S.getInterpolation(this.h.I) * (f7 - f10)) + f10;
    }

    public g9(h9 h9Var, float f7) {
        this.h = h9Var;
        this.f = false;
        this.b = f7;
        this.a = f7;
        this.c = 1.0f;
        this.d = 1.0f;
        this.e = 0.0f;
        this.g = SystemClock.uptimeMillis();
    }

    public g9(h9 h9Var, float f7, g9 g9Var) {
        this.h = h9Var;
        this.f = g9Var.f;
        this.b = f7;
        this.a = f7;
        this.c = g9Var.c;
        this.d = g9Var.d;
        this.e = g9Var.e;
        this.g = g9Var.g;
    }
}
