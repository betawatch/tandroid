package com.google.android.gms.internal.clearcut;

/* loaded from: classes.dex */
public final class j1 extends k1 {
    @Override // com.google.android.gms.internal.clearcut.k1
    public final void c(Object obj, long j10, double d) {
        this.a.putDouble(obj, j10, d);
    }

    @Override // com.google.android.gms.internal.clearcut.k1
    public final void d(Object obj, long j10, float f10) {
        this.a.putFloat(obj, j10, f10);
    }

    @Override // com.google.android.gms.internal.clearcut.k1
    public final void f(Object obj, long j10, boolean z10) {
        this.a.putBoolean(obj, j10, z10);
    }

    @Override // com.google.android.gms.internal.clearcut.k1
    public final boolean i(Object obj, long j10) {
        return this.a.getBoolean(obj, j10);
    }

    @Override // com.google.android.gms.internal.clearcut.k1
    public final float j(Object obj, long j10) {
        return this.a.getFloat(obj, j10);
    }

    @Override // com.google.android.gms.internal.clearcut.k1
    public final double k(Object obj, long j10) {
        return this.a.getDouble(obj, j10);
    }

    @Override // com.google.android.gms.internal.clearcut.k1
    public final byte l(Object obj, long j10) {
        return this.a.getByte(obj, j10);
    }
}
