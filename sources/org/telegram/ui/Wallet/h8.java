package org.telegram.ui.Wallet;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.SystemClock;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final class h8 {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final boolean f;
    public final long g;
    public final /* synthetic */ i8 h;

    public h8(i8 i8Var, h8 h8Var, float f7, boolean z10) {
        float y3;
        this.h = i8Var;
        this.f = z10;
        this.b = f7;
        this.a = h8Var != null ? h8Var.a : f7;
        this.g = (h8Var == null || z10) ? SystemClock.uptimeMillis() : h8Var.g;
        float f10 = 0.0f;
        float a2 = (h8Var == null || !z10) ? 0.0f : h8Var.a();
        if (h8Var != null) {
            float f11 = h8Var.c;
            f10 = com.google.android.gms.internal.vision.e2.y(1.0f, f11, a2, f11);
        }
        this.c = f10;
        if (h8Var == null) {
            y3 = i8Var.N;
        } else {
            float f12 = h8Var.d;
            y3 = com.google.android.gms.internal.vision.e2.y(1.0f, f12, a2, f12);
        }
        this.d = y3;
        this.e = h8Var == null ? (-AndroidUtilities.dpf2(44.0f)) * 0.1f : h8Var.e * (1.0f - a2);
    }

    public final float a() {
        if (this.h.H >= 1.0f) {
            return 1.0f;
        }
        return i8.R.getInterpolation(Math.min(1.0f, (SystemClock.uptimeMillis() - this.g) / 320.0f));
    }

    public final void b(Canvas canvas, Paint paint, String str, float f7, int i10) {
        float a2 = a();
        boolean z10 = this.f;
        float f10 = z10 ? 0.0f : 1.0f;
        float f11 = this.c;
        float y3 = com.google.android.gms.internal.vision.e2.y(f10, f11, a2, f11);
        if (y3 <= 0.0f) {
            return;
        }
        int alpha = paint.getAlpha();
        float measureText = paint.measureText(str);
        canvas.save();
        float d = d() + f7;
        float f12 = i10;
        float f13 = this.e;
        canvas.translate(d, com.google.android.gms.internal.vision.e2.y(z10 ? AndroidUtilities.dpf2(44.0f) * 0.1f : 0.0f, f13, a2, f12 + f13));
        float f14 = z10 ? this.h.N : 1.0f;
        float f15 = this.d;
        float y10 = com.google.android.gms.internal.vision.e2.y(f14, f15, a2, f15);
        canvas.scale(y10, y10, measureText / 2.0f, (paint.descent() + paint.ascent()) / 2.0f);
        paint.setAlpha(Math.round(alpha * y3));
        canvas.drawText(str, 0.0f, 0.0f, paint);
        paint.setAlpha(alpha);
        canvas.restore();
    }

    public final h8 c() {
        i8 i8Var = this.h;
        return i8Var.H >= 1.0f ? new h8(i8Var, d()) : new h8(i8Var, d(), this);
    }

    public final float d() {
        float f7 = this.b;
        float f10 = this.a;
        return (i8.R.getInterpolation(this.h.H) * (f7 - f10)) + f10;
    }

    public h8(i8 i8Var, float f7) {
        this.h = i8Var;
        this.f = false;
        this.b = f7;
        this.a = f7;
        this.c = 1.0f;
        this.d = 1.0f;
        this.e = 0.0f;
        this.g = SystemClock.uptimeMillis();
    }

    public h8(i8 i8Var, float f7, h8 h8Var) {
        this.h = i8Var;
        this.f = h8Var.f;
        this.b = f7;
        this.a = f7;
        this.c = h8Var.c;
        this.d = h8Var.d;
        this.e = h8Var.e;
        this.g = h8Var.g;
    }
}
