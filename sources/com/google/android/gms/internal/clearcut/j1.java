package com.google.android.gms.internal.clearcut;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
public abstract class j1 {
    public final Unsafe a;

    public j1(Unsafe unsafe) {
        this.a = unsafe;
    }

    public final long a(Field field) {
        return this.a.objectFieldOffset(field);
    }

    public final void b(long j3, Object obj, int i10) {
        this.a.putInt(obj, j3, i10);
    }

    public abstract void c(Object obj, long j3, double d);

    public abstract void d(Object obj, long j3, float f7);

    public final void e(Object obj, long j3, long j10) {
        this.a.putLong(obj, j3, j10);
    }

    public abstract void f(Object obj, long j3, boolean z10);

    public final int g(Object obj, long j3) {
        return this.a.getInt(obj, j3);
    }

    public final long h(Object obj, long j3) {
        return this.a.getLong(obj, j3);
    }

    public abstract boolean i(Object obj, long j3);

    public abstract float j(Object obj, long j3);

    public abstract double k(Object obj, long j3);

    public abstract byte l(Object obj, long j3);
}
