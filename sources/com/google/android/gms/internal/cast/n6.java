package com.google.android.gms.internal.cast;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class n6 extends o6 {
    @Override // com.google.android.gms.internal.cast.o6
    public final double a(Object obj, long j10) {
        return Double.longBitsToDouble(this.a.getLong(obj, j10));
    }

    @Override // com.google.android.gms.internal.cast.o6
    public final float b(Object obj, long j10) {
        return Float.intBitsToFloat(this.a.getInt(obj, j10));
    }

    @Override // com.google.android.gms.internal.cast.o6
    public final void c(Object obj, long j10, boolean z10) {
        if (p6.g) {
            p6.c(obj, j10, z10 ? (byte) 1 : (byte) 0);
        } else {
            p6.d(obj, j10, z10 ? (byte) 1 : (byte) 0);
        }
    }

    @Override // com.google.android.gms.internal.cast.o6
    public final void d(Object obj, long j10, byte b10) {
        if (p6.g) {
            p6.c(obj, j10, b10);
        } else {
            p6.d(obj, j10, b10);
        }
    }

    @Override // com.google.android.gms.internal.cast.o6
    public final void e(Object obj, long j10, double d) {
        this.a.putLong(obj, j10, Double.doubleToLongBits(d));
    }

    @Override // com.google.android.gms.internal.cast.o6
    public final void f(Object obj, long j10, float f7) {
        this.a.putInt(obj, j10, Float.floatToIntBits(f7));
    }

    @Override // com.google.android.gms.internal.cast.o6
    public final boolean g(Object obj, long j10) {
        return p6.g ? p6.m(obj, j10) : p6.n(obj, j10);
    }
}
