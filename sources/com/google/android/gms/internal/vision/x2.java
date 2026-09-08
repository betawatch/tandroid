package com.google.android.gms.internal.vision;

import sun.misc.Unsafe;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public abstract class x2 {
    public final Unsafe a;

    public x2(Unsafe unsafe) {
        this.a = unsafe;
    }

    public abstract byte a(Object obj, long j3);

    public final void b(long j3, Object obj, int i10) {
        this.a.putInt(obj, j3, i10);
    }

    public abstract void c(Object obj, long j3, byte b10);

    public abstract void d(Object obj, long j3, double d);

    public abstract void e(Object obj, long j3, float f7);

    public final void f(Object obj, long j3, long j10) {
        this.a.putLong(obj, j3, j10);
    }

    public abstract void g(Object obj, long j3, boolean z10);

    public abstract boolean h(Object obj, long j3);

    public abstract float i(Object obj, long j3);

    public abstract double j(Object obj, long j3);

    public final int k(Object obj, long j3) {
        return this.a.getInt(obj, j3);
    }

    public final long l(Object obj, long j3) {
        return this.a.getLong(obj, j3);
    }
}
