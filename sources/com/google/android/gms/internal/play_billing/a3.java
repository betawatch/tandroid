package com.google.android.gms.internal.play_billing;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class a3 extends b3 {
    @Override // com.google.android.gms.internal.play_billing.b3
    public final double a(Object obj, long j10) {
        return Double.longBitsToDouble(this.a.getLong(obj, j10));
    }

    @Override // com.google.android.gms.internal.play_billing.b3
    public final float b(Object obj, long j10) {
        return Float.intBitsToFloat(this.a.getInt(obj, j10));
    }

    @Override // com.google.android.gms.internal.play_billing.b3
    public final void c(Object obj, long j10, boolean z10) {
        if (c3.g) {
            c3.c(obj, j10, z10 ? (byte) 1 : (byte) 0);
        } else {
            c3.d(obj, j10, z10 ? (byte) 1 : (byte) 0);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.b3
    public final void d(Object obj, long j10, byte b10) {
        if (c3.g) {
            c3.c(obj, j10, b10);
        } else {
            c3.d(obj, j10, b10);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.b3
    public final void e(Object obj, long j10, double d) {
        this.a.putLong(obj, j10, Double.doubleToLongBits(d));
    }

    @Override // com.google.android.gms.internal.play_billing.b3
    public final void f(Object obj, long j10, float f7) {
        this.a.putInt(obj, j10, Float.floatToIntBits(f7));
    }

    @Override // com.google.android.gms.internal.play_billing.b3
    public final boolean g(Object obj, long j10) {
        return c3.g ? c3.m(obj, j10) : c3.n(obj, j10);
    }
}
