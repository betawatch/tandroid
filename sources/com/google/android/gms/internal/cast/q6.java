package com.google.android.gms.internal.cast;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class q6 extends r6 {
    @Override // com.google.android.gms.internal.cast.r6
    public final double a(Object obj, long j10) {
        return Double.longBitsToDouble(this.a.getLong(obj, j10));
    }

    @Override // com.google.android.gms.internal.cast.r6
    public final float b(Object obj, long j10) {
        return Float.intBitsToFloat(this.a.getInt(obj, j10));
    }

    @Override // com.google.android.gms.internal.cast.r6
    public final void c(Object obj, long j10, boolean z10) {
        if (s6.g) {
            s6.c(obj, j10, z10 ? (byte) 1 : (byte) 0);
        } else {
            s6.d(obj, j10, z10 ? (byte) 1 : (byte) 0);
        }
    }

    @Override // com.google.android.gms.internal.cast.r6
    public final void d(Object obj, long j10, byte b10) {
        if (s6.g) {
            s6.c(obj, j10, b10);
        } else {
            s6.d(obj, j10, b10);
        }
    }

    @Override // com.google.android.gms.internal.cast.r6
    public final void e(Object obj, long j10, double d) {
        this.a.putLong(obj, j10, Double.doubleToLongBits(d));
    }

    @Override // com.google.android.gms.internal.cast.r6
    public final void f(Object obj, long j10, float f10) {
        this.a.putInt(obj, j10, Float.floatToIntBits(f10));
    }

    @Override // com.google.android.gms.internal.cast.r6
    public final boolean g(Object obj, long j10) {
        return s6.g ? s6.m(obj, j10) : s6.n(obj, j10);
    }
}
