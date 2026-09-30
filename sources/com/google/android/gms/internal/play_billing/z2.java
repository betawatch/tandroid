package com.google.android.gms.internal.play_billing;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes.dex */
public final class z2 extends b3 {
    @Override // com.google.android.gms.internal.play_billing.b3
    public final double a(Object obj, long j3) {
        return Double.longBitsToDouble(this.a.getLong(obj, j3));
    }

    @Override // com.google.android.gms.internal.play_billing.b3
    public final float b(Object obj, long j3) {
        return Float.intBitsToFloat(this.a.getInt(obj, j3));
    }

    @Override // com.google.android.gms.internal.play_billing.b3
    public final void c(Object obj, long j3, boolean z10) {
        if (c3.g) {
            c3.c(obj, j3, z10 ? (byte) 1 : (byte) 0);
        } else {
            c3.d(obj, j3, z10 ? (byte) 1 : (byte) 0);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.b3
    public final void d(Object obj, long j3, byte b10) {
        if (c3.g) {
            c3.c(obj, j3, b10);
        } else {
            c3.d(obj, j3, b10);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.b3
    public final void e(Object obj, long j3, double d) {
        this.a.putLong(obj, j3, Double.doubleToLongBits(d));
    }

    @Override // com.google.android.gms.internal.play_billing.b3
    public final void f(Object obj, long j3, float f7) {
        this.a.putInt(obj, j3, Float.floatToIntBits(f7));
    }

    @Override // com.google.android.gms.internal.play_billing.b3
    public final boolean g(Object obj, long j3) {
        return c3.g ? c3.m(obj, j3) : c3.n(obj, j3);
    }
}
