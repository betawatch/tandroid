package org.telegram.ui.Wallet;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.SystemClock;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final class ca {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final boolean f;
    public final long g;
    public final /* synthetic */ da h;

    public ca(da daVar, ca caVar, float f10, boolean z10) {
        float z11;
        this.h = daVar;
        this.f = z10;
        this.b = f10;
        this.a = caVar != null ? caVar.a : f10;
        this.g = (caVar == null || z10) ? SystemClock.uptimeMillis() : caVar.g;
        float f11 = 0.0f;
        float a10 = (caVar == null || !z10) ? 0.0f : caVar.a();
        if (caVar != null) {
            float f12 = caVar.c;
            f11 = com.google.android.gms.internal.vision.e2.z(1.0f, f12, a10, f12);
        }
        this.c = f11;
        if (caVar == null) {
            z11 = daVar.P;
        } else {
            float f13 = caVar.d;
            z11 = com.google.android.gms.internal.vision.e2.z(1.0f, f13, a10, f13);
        }
        this.d = z11;
        this.e = caVar == null ? (-org.telegram.messenger.g0.N(44.0f)) * 0.1f : caVar.e * (1.0f - a10);
    }

    public final float a() {
        if (this.h.J >= 1.0f) {
            return 1.0f;
        }
        return da.T.getInterpolation(Math.min(1.0f, (SystemClock.uptimeMillis() - this.g) / 320.0f));
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

    public final ca c() {
        da daVar = this.h;
        return daVar.J >= 1.0f ? new ca(daVar, d()) : new ca(daVar, d(), this);
    }

    public final float d() {
        float f10 = this.b;
        float f11 = this.a;
        return (da.T.getInterpolation(this.h.J) * (f10 - f11)) + f11;
    }

    public ca(da daVar, float f10) {
        this.h = daVar;
        this.f = false;
        this.b = f10;
        this.a = f10;
        this.c = 1.0f;
        this.d = 1.0f;
        this.e = 0.0f;
        this.g = SystemClock.uptimeMillis();
    }

    public ca(da daVar, float f10, ca caVar) {
        this.h = daVar;
        this.f = caVar.f;
        this.b = f10;
        this.a = f10;
        this.c = caVar.c;
        this.d = caVar.d;
        this.e = caVar.e;
        this.g = caVar.g;
    }
}
