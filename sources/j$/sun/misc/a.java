package j$.sun.misc;

import j$.util.concurrent.l;
import j$.util.concurrent.q;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import sun.misc.Unsafe;

/* loaded from: classes2.dex */
public final class a {
    public static final a b;
    public final Unsafe a;

    static {
        Field g10 = g();
        g10.setAccessible(true);
        try {
            b = new a((Unsafe) g10.get(null));
        } catch (IllegalAccessException e7) {
            throw new AssertionError("Couldn't get the Unsafe", e7);
        }
    }

    public a(Unsafe unsafe) {
        this.a = unsafe;
    }

    public static Field g() {
        try {
            return Unsafe.class.getDeclaredField("theUnsafe");
        } catch (NoSuchFieldException e7) {
            for (Field field : Unsafe.class.getDeclaredFields()) {
                if (Modifier.isStatic(field.getModifiers()) && Unsafe.class.isAssignableFrom(field.getType())) {
                    return field;
                }
            }
            throw new AssertionError("Couldn't find the Unsafe", e7);
        }
    }

    public final int e(q qVar, long j3) {
        while (true) {
            int intVolatile = this.a.getIntVolatile(qVar, j3);
            q qVar2 = qVar;
            long j10 = j3;
            if (this.a.compareAndSwapInt(qVar2, j10, intVolatile, intVolatile - 4)) {
                return intVolatile;
            }
            qVar = qVar2;
            j3 = j10;
        }
    }

    public final long i(Field field) {
        return this.a.objectFieldOffset(field);
    }

    public final long h(Class cls, String str) {
        try {
            return i(cls.getDeclaredField(str));
        } catch (NoSuchFieldException e7) {
            throw new AssertionError("Cannot find field:", e7);
        }
    }

    public final int a(Class cls) {
        return this.a.arrayBaseOffset(cls);
    }

    public final int b(Class cls) {
        return this.a.arrayIndexScale(cls);
    }

    public final Object f(Object obj, long j3) {
        return this.a.getObjectVolatile(obj, j3);
    }

    public final void j(Object obj, long j3, l lVar) {
        this.a.putObjectVolatile(obj, j3, lVar);
    }

    public final boolean c(Object obj, long j3, int i10, int i11) {
        return this.a.compareAndSwapInt(obj, j3, i10, i11);
    }

    public final boolean d(Object obj, long j3, long j10, long j11) {
        return this.a.compareAndSwapLong(obj, j3, j10, j11);
    }
}
