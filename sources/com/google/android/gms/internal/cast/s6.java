package com.google.android.gms.internal.cast;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes.dex */
public final class s6 extends t6 {
    @Override // com.google.android.gms.internal.cast.t6
    public final double a(Object obj, long j10) {
        return Double.longBitsToDouble(this.a.getLong(obj, j10));
    }

    @Override // com.google.android.gms.internal.cast.t6
    public final float b(Object obj, long j10) {
        return Float.intBitsToFloat(this.a.getInt(obj, j10));
    }

    @Override // com.google.android.gms.internal.cast.t6
    public final void c(Object obj, long j10, boolean z10) {
        if (u6.g) {
            u6.c(obj, j10, z10 ? (byte) 1 : (byte) 0);
        } else {
            u6.d(obj, j10, z10 ? (byte) 1 : (byte) 0);
        }
    }

    @Override // com.google.android.gms.internal.cast.t6
    public final void d(Object obj, long j10, byte b10) {
        if (u6.g) {
            u6.c(obj, j10, b10);
        } else {
            u6.d(obj, j10, b10);
        }
    }

    @Override // com.google.android.gms.internal.cast.t6
    public final void e(Object obj, long j10, double d) {
        this.a.putLong(obj, j10, Double.doubleToLongBits(d));
    }

    @Override // com.google.android.gms.internal.cast.t6
    public final void f(Object obj, long j10, float f7) {
        this.a.putInt(obj, j10, Float.floatToIntBits(f7));
    }

    @Override // com.google.android.gms.internal.cast.t6
    public final boolean g(Object obj, long j10) {
        return u6.g ? u6.m(obj, j10) : u6.n(obj, j10);
    }
}
