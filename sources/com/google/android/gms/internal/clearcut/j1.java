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

    public final void b(long j10, Object obj, int i10) {
        this.a.putInt(obj, j10, i10);
    }

    public abstract void c(Object obj, long j10, double d);

    public abstract void d(Object obj, long j10, float f10);

    public final void e(Object obj, long j10, long j11) {
        this.a.putLong(obj, j10, j11);
    }

    public abstract void f(Object obj, long j10, boolean z4);

    public final int g(Object obj, long j10) {
        return this.a.getInt(obj, j10);
    }

    public final long h(Object obj, long j10) {
        return this.a.getLong(obj, j10);
    }

    public abstract boolean i(Object obj, long j10);

    public abstract float j(Object obj, long j10);

    public abstract double k(Object obj, long j10);

    public abstract byte l(Object obj, long j10);
}
