package com.google.android.gms.internal.cast;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final class n6 extends p6 {
    @Override // com.google.android.gms.internal.cast.p6
    public final double a(Object obj, long j10) {
        return Double.longBitsToDouble(this.a.getLong(obj, j10));
    }

    @Override // com.google.android.gms.internal.cast.p6
    public final float b(Object obj, long j10) {
        return Float.intBitsToFloat(this.a.getInt(obj, j10));
    }

    @Override // com.google.android.gms.internal.cast.p6
    public final void c(Object obj, long j10, boolean z4) {
        if (q6.g) {
            q6.c(obj, j10, z4 ? (byte) 1 : (byte) 0);
        } else {
            q6.d(obj, j10, z4 ? (byte) 1 : (byte) 0);
        }
    }

    @Override // com.google.android.gms.internal.cast.p6
    public final void d(Object obj, long j10, byte b10) {
        if (q6.g) {
            q6.c(obj, j10, b10);
        } else {
            q6.d(obj, j10, b10);
        }
    }

    @Override // com.google.android.gms.internal.cast.p6
    public final void e(Object obj, long j10, double d) {
        this.a.putLong(obj, j10, Double.doubleToLongBits(d));
    }

    @Override // com.google.android.gms.internal.cast.p6
    public final void f(Object obj, long j10, float f10) {
        this.a.putInt(obj, j10, Float.floatToIntBits(f10));
    }

    @Override // com.google.android.gms.internal.cast.p6
    public final boolean g(Object obj, long j10) {
        return q6.g ? q6.m(obj, j10) : q6.n(obj, j10);
    }
}
