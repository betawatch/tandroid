package com.google.android.gms.internal.cast;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes.dex */
public final class q6 extends s6 {
    @Override // com.google.android.gms.internal.cast.s6
    public final double a(Object obj, long j10) {
        return Double.longBitsToDouble(this.a.getLong(obj, j10));
    }

    @Override // com.google.android.gms.internal.cast.s6
    public final float b(Object obj, long j10) {
        return Float.intBitsToFloat(this.a.getInt(obj, j10));
    }

    @Override // com.google.android.gms.internal.cast.s6
    public final void c(Object obj, long j10, boolean z10) {
        if (t6.g) {
            t6.c(obj, j10, z10 ? (byte) 1 : (byte) 0);
        } else {
            t6.d(obj, j10, z10 ? (byte) 1 : (byte) 0);
        }
    }

    @Override // com.google.android.gms.internal.cast.s6
    public final void d(Object obj, long j10, byte b10) {
        if (t6.g) {
            t6.c(obj, j10, b10);
        } else {
            t6.d(obj, j10, b10);
        }
    }

    @Override // com.google.android.gms.internal.cast.s6
    public final void e(Object obj, long j10, double d) {
        this.a.putLong(obj, j10, Double.doubleToLongBits(d));
    }

    @Override // com.google.android.gms.internal.cast.s6
    public final void f(Object obj, long j10, float f7) {
        this.a.putInt(obj, j10, Float.floatToIntBits(f7));
    }

    @Override // com.google.android.gms.internal.cast.s6
    public final boolean g(Object obj, long j10) {
        return t6.g ? t6.m(obj, j10) : t6.n(obj, j10);
    }
}
