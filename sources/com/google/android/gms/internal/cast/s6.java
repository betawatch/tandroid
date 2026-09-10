package com.google.android.gms.internal.cast;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class s6 extends t6 {
    @Override // com.google.android.gms.internal.cast.t6
    public final double a(Object obj, long j3) {
        return Double.longBitsToDouble(this.a.getLong(obj, j3));
    }

    @Override // com.google.android.gms.internal.cast.t6
    public final float b(Object obj, long j3) {
        return Float.intBitsToFloat(this.a.getInt(obj, j3));
    }

    @Override // com.google.android.gms.internal.cast.t6
    public final void c(Object obj, long j3, boolean z10) {
        if (u6.g) {
            u6.c(obj, j3, z10 ? (byte) 1 : (byte) 0);
        } else {
            u6.d(obj, j3, z10 ? (byte) 1 : (byte) 0);
        }
    }

    @Override // com.google.android.gms.internal.cast.t6
    public final void d(Object obj, long j3, byte b10) {
        if (u6.g) {
            u6.c(obj, j3, b10);
        } else {
            u6.d(obj, j3, b10);
        }
    }

    @Override // com.google.android.gms.internal.cast.t6
    public final void e(Object obj, long j3, double d) {
        this.a.putLong(obj, j3, Double.doubleToLongBits(d));
    }

    @Override // com.google.android.gms.internal.cast.t6
    public final void f(Object obj, long j3, float f7) {
        this.a.putInt(obj, j3, Float.floatToIntBits(f7));
    }

    @Override // com.google.android.gms.internal.cast.t6
    public final boolean g(Object obj, long j3) {
        return u6.g ? u6.m(obj, j3) : u6.n(obj, j3);
    }
}
