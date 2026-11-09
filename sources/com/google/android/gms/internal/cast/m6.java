package com.google.android.gms.internal.cast;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes.dex */
public final class m6 extends n6 {
    @Override // com.google.android.gms.internal.cast.n6
    public final double a(Object obj, long j3) {
        return Double.longBitsToDouble(this.a.getLong(obj, j3));
    }

    @Override // com.google.android.gms.internal.cast.n6
    public final float b(Object obj, long j3) {
        return Float.intBitsToFloat(this.a.getInt(obj, j3));
    }

    @Override // com.google.android.gms.internal.cast.n6
    public final void c(Object obj, long j3, boolean z9) {
        if (o6.g) {
            o6.c(obj, j3, z9 ? (byte) 1 : (byte) 0);
        } else {
            o6.d(obj, j3, z9 ? (byte) 1 : (byte) 0);
        }
    }

    @Override // com.google.android.gms.internal.cast.n6
    public final void d(Object obj, long j3, byte b10) {
        if (o6.g) {
            o6.c(obj, j3, b10);
        } else {
            o6.d(obj, j3, b10);
        }
    }

    @Override // com.google.android.gms.internal.cast.n6
    public final void e(Object obj, long j3, double d) {
        this.a.putLong(obj, j3, Double.doubleToLongBits(d));
    }

    @Override // com.google.android.gms.internal.cast.n6
    public final void f(Object obj, long j3, float f10) {
        this.a.putInt(obj, j3, Float.floatToIntBits(f10));
    }

    @Override // com.google.android.gms.internal.cast.n6
    public final boolean g(Object obj, long j3) {
        return o6.g ? o6.m(obj, j3) : o6.n(obj, j3);
    }
}
