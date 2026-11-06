package com.google.android.gms.internal.vision;

import sun.misc.Unsafe;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public abstract class w2 {
    public final Unsafe a;

    public w2(Unsafe unsafe) {
        this.a = unsafe;
    }

    public abstract byte a(Object obj, long j3);

    public final void b(long j3, Object obj, int i7) {
        this.a.putInt(obj, j3, i7);
    }

    public abstract void c(Object obj, long j3, byte b10);

    public abstract void d(Object obj, long j3, double d);

    public abstract void e(Object obj, long j3, float f10);

    public final void f(Object obj, long j3, long j10) {
        this.a.putLong(obj, j3, j10);
    }

    public abstract void g(Object obj, long j3, boolean z9);

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
