package androidx.datastore.preferences.protobuf;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public abstract class q1 {
    public final Unsafe a;

    public q1(Unsafe unsafe) {
        this.a = unsafe;
    }

    public final int a(Class cls) {
        return this.a.arrayBaseOffset(cls);
    }

    public final int b(Class cls) {
        return this.a.arrayIndexScale(cls);
    }

    public abstract boolean c(Object obj, long j3);

    public abstract byte d(Object obj, long j3);

    public abstract double e(Object obj, long j3);

    public abstract float f(Object obj, long j3);

    public final int g(Object obj, long j3) {
        return this.a.getInt(obj, j3);
    }

    public final long h(Object obj, long j3) {
        return this.a.getLong(obj, j3);
    }

    public final Object i(Object obj, long j3) {
        return this.a.getObject(obj, j3);
    }

    public final long j(Field field) {
        return this.a.objectFieldOffset(field);
    }

    public abstract void k(Object obj, long j3, boolean z10);

    public abstract void l(Object obj, long j3, byte b10);

    public abstract void m(Object obj, long j3, double d);

    public abstract void n(Object obj, long j3, float f7);

    public final void o(long j3, Object obj, int i10) {
        this.a.putInt(obj, j3, i10);
    }

    public final void p(Object obj, long j3, long j10) {
        this.a.putLong(obj, j3, j10);
    }

    public final void q(Object obj, long j3, Object obj2) {
        this.a.putObject(obj, j3, obj2);
    }
}
