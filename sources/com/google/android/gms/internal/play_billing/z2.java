package com.google.android.gms.internal.play_billing;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class z2 extends b3 {
    @Override // com.google.android.gms.internal.play_billing.b3
    public final double a(Object obj, long j3) {
        return Double.longBitsToDouble(this.a.getLong(obj, j3));
    }

    @Override // com.google.android.gms.internal.play_billing.b3
    public final float b(Object obj, long j3) {
        return Float.intBitsToFloat(this.a.getInt(obj, j3));
    }

    @Override // com.google.android.gms.internal.play_billing.b3
    public final void c(Object obj, long j3, boolean z9) {
        if (c3.g) {
            c3.c(obj, j3, z9 ? (byte) 1 : (byte) 0);
        } else {
            c3.d(obj, j3, z9 ? (byte) 1 : (byte) 0);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.b3
    public final void d(Object obj, long j3, byte b10) {
        if (c3.g) {
            c3.c(obj, j3, b10);
        } else {
            c3.d(obj, j3, b10);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.b3
    public final void e(Object obj, long j3, double d) {
        this.a.putLong(obj, j3, Double.doubleToLongBits(d));
    }

    @Override // com.google.android.gms.internal.play_billing.b3
    public final void f(Object obj, long j3, float f10) {
        this.a.putInt(obj, j3, Float.floatToIntBits(f10));
    }

    @Override // com.google.android.gms.internal.play_billing.b3
    public final boolean g(Object obj, long j3) {
        return c3.g ? c3.m(obj, j3) : c3.n(obj, j3);
    }
}
