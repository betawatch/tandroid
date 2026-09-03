package com.google.android.gms.internal.cast;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class p6 extends q6 {
    @Override // com.google.android.gms.internal.cast.q6
    public final double a(Object obj, long j10) {
        return Double.longBitsToDouble(this.a.getLong(obj, j10));
    }

    @Override // com.google.android.gms.internal.cast.q6
    public final float b(Object obj, long j10) {
        return Float.intBitsToFloat(this.a.getInt(obj, j10));
    }

    @Override // com.google.android.gms.internal.cast.q6
    public final void c(Object obj, long j10, boolean z4) {
        if (r6.g) {
            r6.c(obj, j10, z4 ? (byte) 1 : (byte) 0);
        } else {
            r6.d(obj, j10, z4 ? (byte) 1 : (byte) 0);
        }
    }

    @Override // com.google.android.gms.internal.cast.q6
    public final void d(Object obj, long j10, byte b10) {
        if (r6.g) {
            r6.c(obj, j10, b10);
        } else {
            r6.d(obj, j10, b10);
        }
    }

    @Override // com.google.android.gms.internal.cast.q6
    public final void e(Object obj, long j10, double d) {
        this.a.putLong(obj, j10, Double.doubleToLongBits(d));
    }

    @Override // com.google.android.gms.internal.cast.q6
    public final void f(Object obj, long j10, float f10) {
        this.a.putInt(obj, j10, Float.floatToIntBits(f10));
    }

    @Override // com.google.android.gms.internal.cast.q6
    public final boolean g(Object obj, long j10) {
        return r6.g ? r6.m(obj, j10) : r6.n(obj, j10);
    }
}
