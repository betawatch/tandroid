package androidx.datastore.preferences.protobuf;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
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

    public abstract boolean c(Object obj, long j3);

    public abstract double d(Object obj, long j3);

    public abstract float e(Object obj, long j3);

    public final int f(Object obj, long j3) {
        return this.a.getInt(obj, j3);
    }

    public final long g(Object obj, long j3) {
        return this.a.getLong(obj, j3);
    }

    public final Object h(Object obj, long j3) {
        return this.a.getObject(obj, j3);
    }

    public final long i(Field field) {
        return this.a.objectFieldOffset(field);
    }

    public abstract void j(Object obj, long j3, boolean z9);

    public abstract void k(Object obj, long j3, byte b10);

    public abstract void l(Object obj, long j3, double d);

    public abstract void m(Object obj, long j3, float f10);

    public final void n(long j3, Object obj, int i7) {
        this.a.putInt(obj, j3, i7);
    }

    public final void o(Object obj, long j3, long j10) {
        this.a.putLong(obj, j3, j10);
    }

    public final void p(Object obj, long j3, Object obj2) {
        this.a.putObject(obj, j3, obj2);
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
