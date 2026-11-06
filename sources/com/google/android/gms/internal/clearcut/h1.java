package com.google.android.gms.internal.clearcut;

/* loaded from: classes.dex */
public final class h1 extends i1 {
    @Override // com.google.android.gms.internal.clearcut.i1
    public final void c(Object obj, long j3, double d) {
        this.a.putDouble(obj, j3, d);
    }

    @Override // com.google.android.gms.internal.clearcut.i1
    public final void d(Object obj, long j3, float f10) {
        this.a.putFloat(obj, j3, f10);
    }

    @Override // com.google.android.gms.internal.clearcut.i1
    public final void f(Object obj, long j3, boolean z9) {
        this.a.putBoolean(obj, j3, z9);
    }

    @Override // com.google.android.gms.internal.clearcut.i1
    public final boolean i(Object obj, long j3) {
        return this.a.getBoolean(obj, j3);
    }

    @Override // com.google.android.gms.internal.clearcut.i1
    public final float j(Object obj, long j3) {
        return this.a.getFloat(obj, j3);
    }

    @Override // com.google.android.gms.internal.clearcut.i1
    public final double k(Object obj, long j3) {
        return this.a.getDouble(obj, j3);
    }

    @Override // com.google.android.gms.internal.clearcut.i1
    public final byte l(Object obj, long j3) {
        return this.a.getByte(obj, j3);
    }
}
