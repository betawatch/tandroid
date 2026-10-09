package com.google.android.gms.internal.cast;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public final class p6 extends r6 {
    @Override // com.google.android.gms.internal.cast.r6
    public final double a(Object obj, long j3) {
        return Double.longBitsToDouble(this.a.getLong(obj, j3));
    }

    @Override // com.google.android.gms.internal.cast.r6
    public final float b(Object obj, long j3) {
        return Float.intBitsToFloat(this.a.getInt(obj, j3));
    }

    @Override // com.google.android.gms.internal.cast.r6
    public final void c(Object obj, long j3, boolean z10) {
        if (s6.g) {
            s6.c(obj, j3, z10 ? (byte) 1 : (byte) 0);
        } else {
            s6.d(obj, j3, z10 ? (byte) 1 : (byte) 0);
        }
    }

    @Override // com.google.android.gms.internal.cast.r6
    public final void d(Object obj, long j3, byte b10) {
        if (s6.g) {
            s6.c(obj, j3, b10);
        } else {
            s6.d(obj, j3, b10);
        }
    }

    @Override // com.google.android.gms.internal.cast.r6
    public final void e(Object obj, long j3, double d) {
        this.a.putLong(obj, j3, Double.doubleToLongBits(d));
    }

    @Override // com.google.android.gms.internal.cast.r6
    public final void f(Object obj, long j3, float f7) {
        this.a.putInt(obj, j3, Float.floatToIntBits(f7));
    }

    @Override // com.google.android.gms.internal.cast.r6
    public final boolean g(Object obj, long j3) {
        return s6.g ? s6.m(obj, j3) : s6.n(obj, j3);
    }
}
