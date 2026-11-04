package androidx.datastore.preferences.protobuf;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public abstract class m1 {
    public final Unsafe a;

    public m1(Unsafe unsafe) {
        this.a = unsafe;
    }

    public final int a(Class cls) {
        return this.a.arrayBaseOffset(cls);
    }

    public final int b(Class cls) {
        return this.a.arrayIndexScale(cls);
    }

    public abstract boolean c(Object obj, long j10);

    public abstract double d(Object obj, long j10);

    public abstract float e(Object obj, long j10);

    public final int f(Object obj, long j10) {
        return this.a.getInt(obj, j10);
    }

    public final long g(Object obj, long j10) {
        return this.a.getLong(obj, j10);
    }

    public final Object h(Object obj, long j10) {
        return this.a.getObject(obj, j10);
    }

    public final long i(Field field) {
        return this.a.objectFieldOffset(field);
    }

    public abstract void j(Object obj, long j10, boolean z10);

    public abstract void k(Object obj, long j10, byte b10);

    public abstract void l(Object obj, long j10, double d);

    public abstract void m(Object obj, long j10, float f10);

    public final void n(long j10, Object obj, int i3) {
        this.a.putInt(obj, j10, i3);
    }

    public final void o(Object obj, long j10, long j11) {
        this.a.putLong(obj, j10, j11);
    }

    public final void p(Object obj, long j10, Object obj2) {
        this.a.putObject(obj, j10, obj2);
    }

    public boolean q() {
        Unsafe unsafe = this.a;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls = unsafe.getClass();
            cls.getMethod("objectFieldOffset", Field.class);
            cls.getMethod("arrayBaseOffset", Class.class);
            cls.getMethod("arrayIndexScale", Class.class);
            Class<?> cls2 = Long.TYPE;
            cls.getMethod("getInt", Object.class, cls2);
            cls.getMethod("putInt", Object.class, cls2, Integer.TYPE);
            cls.getMethod("getLong", Object.class, cls2);
            cls.getMethod("putLong", Object.class, cls2, cls2);
            cls.getMethod("getObject", Object.class, cls2);
            cls.getMethod("putObject", Object.class, cls2, Object.class);
            return true;
        } catch (Throwable th2) {
            n1.a(th2);
            return false;
        }
    }

    public abstract boolean r();
}
