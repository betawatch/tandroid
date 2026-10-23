package org.telegram.ui.Wallet;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.SystemClock;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes4.dex */
public final class h9 {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final boolean f;
    public final long g;
    public final /* synthetic */ i9 h;

    public h9(i9 i9Var, h9 h9Var, float f7, boolean z10) {
        float y3;
        this.h = i9Var;
        this.f = z10;
        this.b = f7;
        this.a = h9Var != null ? h9Var.a : f7;
        this.g = (h9Var == null || z10) ? SystemClock.uptimeMillis() : h9Var.g;
        float f10 = 0.0f;
        float a2 = (h9Var == null || !z10) ? 0.0f : h9Var.a();
        if (h9Var != null) {
            float f11 = h9Var.c;
            f10 = com.google.android.gms.internal.play_billing.k3.y(1.0f, f11, a2, f11);
        }
        this.c = f10;
        if (h9Var == null) {
            y3 = i9Var.O;
        } else {
            float f12 = h9Var.d;
            y3 = com.google.android.gms.internal.play_billing.k3.y(1.0f, f12, a2, f12);
        }
        this.d = y3;
        this.e = h9Var == null ? (-AndroidUtilities.dpf2(44.0f)) * 0.1f : h9Var.e * (1.0f - a2);
    }

    public final float a() {
        if (this.h.I >= 1.0f) {
            return 1.0f;
        }
        return i9.S.getInterpolation(Math.min(1.0f, (SystemClock.uptimeMillis() - this.g) / 320.0f));
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
        float f14 = z10 ? this.h.O : 1.0f;
        float f15 = this.d;
        float y10 = com.google.android.gms.internal.play_billing.k3.y(f14, f15, a2, f15);
        canvas.scale(y10, y10, measureText / 2.0f, (paint.descent() + paint.ascent()) / 2.0f);
        paint.setAlpha(Math.round(alpha * y3));
        canvas.drawText(str, 0.0f, 0.0f, paint);
        paint.setAlpha(alpha);
        canvas.restore();
    }

    public final h9 c() {
        i9 i9Var = this.h;
        return i9Var.I >= 1.0f ? new h9(i9Var, d()) : new h9(i9Var, d(), this);
    }

    public final float d() {
        float f7 = this.b;
        float f10 = this.a;
        return (i9.S.getInterpolation(this.h.I) * (f7 - f10)) + f10;
    }

    public h9(i9 i9Var, float f7) {
        this.h = i9Var;
        this.f = false;
        this.b = f7;
        this.a = f7;
        this.c = 1.0f;
        this.d = 1.0f;
        this.e = 0.0f;
        this.g = SystemClock.uptimeMillis();
    }

    public h9(i9 i9Var, float f7, h9 h9Var) {
        this.h = i9Var;
        this.f = h9Var.f;
        this.b = f7;
        this.a = f7;
        this.c = h9Var.c;
        this.d = h9Var.d;
        this.e = h9Var.e;
        this.g = h9Var.g;
    }
}
