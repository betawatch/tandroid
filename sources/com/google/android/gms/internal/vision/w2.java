package com.google.android.gms.internal.vision;

import sun.misc.Unsafe;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public abstract class w2 {
    public final Unsafe a;

    public w2(Unsafe unsafe) {
        this.a = unsafe;
    }

    public abstract byte a(Object obj, long j10);

    public final void b(long j10, Object obj, int i10) {
        this.a.putInt(obj, j10, i10);
    }

    public abstract void c(Object obj, long j10, byte b10);

    public abstract void d(Object obj, long j10, double d);

    public abstract void e(Object obj, long j10, float f9);

    public final void f(Object obj, long j10, long j11) {
        this.a.putLong(obj, j10, j11);
    }

    public abstract void g(Object obj, long j10, boolean z10);

    public abstract boolean h(Object obj, long j10);

    public abstract float i(Object obj, long j10);

    public abstract double j(Object obj, long j10);

    public final int k(Object obj, long j10) {
        return this.a.getInt(obj, j10);
    }

    public final long l(Object obj, long j10) {
        return this.a.getLong(obj, j10);
    }
}
