package com.google.android.gms.internal.play_billing;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class z2 extends a3 {
    @Override // com.google.android.gms.internal.play_billing.a3
    public final double a(Object obj, long j10) {
        return Double.longBitsToDouble(this.a.getLong(obj, j10));
    }

    @Override // com.google.android.gms.internal.play_billing.a3
    public final float b(Object obj, long j10) {
        return Float.intBitsToFloat(this.a.getInt(obj, j10));
    }

    @Override // com.google.android.gms.internal.play_billing.a3
    public final void c(Object obj, long j10, boolean z10) {
        if (b3.g) {
            b3.c(obj, j10, z10 ? (byte) 1 : (byte) 0);
        } else {
            b3.d(obj, j10, z10 ? (byte) 1 : (byte) 0);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.a3
    public final void d(Object obj, long j10, byte b10) {
        if (b3.g) {
            b3.c(obj, j10, b10);
        } else {
            b3.d(obj, j10, b10);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.a3
    public final void e(Object obj, long j10, double d) {
        this.a.putLong(obj, j10, Double.doubleToLongBits(d));
    }

    @Override // com.google.android.gms.internal.play_billing.a3
    public final void f(Object obj, long j10, float f10) {
        this.a.putInt(obj, j10, Float.floatToIntBits(f10));
    }

    @Override // com.google.android.gms.internal.play_billing.a3
    public final boolean g(Object obj, long j10) {
        return b3.g ? b3.m(obj, j10) : b3.n(obj, j10);
    }
}
