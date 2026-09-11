package com.google.android.gms.internal.cast;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import libcore.io.Memory;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
public abstract class u6 {
    public static final Unsafe a;
    public static final Class b;
    public static final t6 c;
    public static final boolean d;
    public static final boolean e;
    public static final long f;
    public static final boolean g;

    /* JADX WARN: Removed duplicated region for block: B:20:0x015f  */
    static {
        char c10;
        boolean z10;
        Field b10;
        t6 t6Var;
        Unsafe i10 = i();
        a = i10;
        int i11 = x4.a;
        b = Memory.class;
        Class<?> cls = Long.TYPE;
        boolean o9 = o(cls);
        Class<?> cls2 = Integer.TYPE;
        boolean o10 = o(cls2);
        t6 t6Var2 = null;
        if (i10 != null) {
            if (o9) {
                t6Var2 = new s6(i10);
            } else if (o10) {
                t6Var2 = new r6(i10);
            }
        }
        c = t6Var2;
        boolean z11 = false;
        if (t6Var2 != null) {
            try {
                Class<?> cls3 = t6Var2.a.getClass();
                cls3.getMethod("objectFieldOffset", Field.class);
                cls3.getMethod("getLong", Object.class, cls);
                if (b() != null) {
                    z11 = true;
                }
            } catch (Throwable th2) {
                c10 = 0;
                Logger.getLogger(u6.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th2.toString()));
                z11 = false;
            }
        }
        c10 = 0;
        d = z11;
        t6 t6Var3 = c;
        if (t6Var3 != null) {
            try {
                Class<?> cls4 = t6Var3.a.getClass();
                Class<?>[] clsArr = new Class[1];
                clsArr[c10] = Field.class;
                cls4.getMethod("objectFieldOffset", clsArr);
                Class<?>[] clsArr2 = new Class[1];
                clsArr2[c10] = Class.class;
                cls4.getMethod("arrayBaseOffset", clsArr2);
                Class<?>[] clsArr3 = new Class[1];
                clsArr3[c10] = Class.class;
                cls4.getMethod("arrayIndexScale", clsArr3);
                Class<?>[] clsArr4 = new Class[2];
                clsArr4[c10] = Object.class;
                clsArr4[1] = cls;
                cls4.getMethod("getInt", clsArr4);
                Class<?>[] clsArr5 = new Class[3];
                clsArr5[c10] = Object.class;
                clsArr5[1] = cls;
                clsArr5[2] = cls2;
                cls4.getMethod("putInt", clsArr5);
                Class<?>[] clsArr6 = new Class[2];
                clsArr6[c10] = Object.class;
                clsArr6[1] = cls;
                cls4.getMethod("getLong", clsArr6);
                Class<?>[] clsArr7 = new Class[3];
                clsArr7[c10] = Object.class;
                clsArr7[1] = cls;
                clsArr7[2] = cls;
                cls4.getMethod("putLong", clsArr7);
                Class<?>[] clsArr8 = new Class[2];
                clsArr8[c10] = Object.class;
                clsArr8[1] = cls;
                cls4.getMethod("getObject", clsArr8);
                Class<?>[] clsArr9 = new Class[3];
                clsArr9[c10] = Object.class;
                clsArr9[1] = cls;
                clsArr9[2] = Object.class;
                cls4.getMethod("putObject", clsArr9);
                z10 = true;
            } catch (Throwable th3) {
                Logger.getLogger(u6.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th3.toString()));
            }
            e = z10;
            f = p(byte[].class);
            p(boolean[].class);
            a(boolean[].class);
            p(int[].class);
            a(int[].class);
            p(long[].class);
            a(long[].class);
            p(float[].class);
            a(float[].class);
            p(double[].class);
            a(double[].class);
            p(Object[].class);
            a(Object[].class);
            b10 = b();
            if (b10 != null && (t6Var = c) != null) {
                t6Var.a.objectFieldOffset(b10);
            }
            g = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
        }
        z10 = false;
        e = z10;
        f = p(byte[].class);
        p(boolean[].class);
        a(boolean[].class);
        p(int[].class);
        a(int[].class);
        p(long[].class);
        a(long[].class);
        p(float[].class);
        a(float[].class);
        p(double[].class);
        a(double[].class);
        p(Object[].class);
        a(Object[].class);
        b10 = b();
        if (b10 != null) {
            t6Var.a.objectFieldOffset(b10);
        }
        g = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    public static void a(Class cls) {
        if (e) {
            c.a.arrayIndexScale(cls);
        }
    }

    public static Field b() {
        Field field;
        Field field2;
        int i10 = x4.a;
        try {
            field = Buffer.class.getDeclaredField("effectiveDirectAddress");
        } catch (Throwable unused) {
            field = null;
        }
        if (field != null) {
            return field;
        }
        try {
            field2 = Buffer.class.getDeclaredField("address");
        } catch (Throwable unused2) {
            field2 = null;
        }
        if (field2 == null || field2.getType() != Long.TYPE) {
            return null;
        }
        return field2;
    }

    public static void c(Object obj, long j3, byte b10) {
        t6 t6Var = c;
        long j10 = (-4) & j3;
        int i10 = t6Var.a.getInt(obj, j10);
        int i11 = ((~((int) j3)) & 3) << 3;
        t6Var.a.putInt(obj, j10, ((255 & b10) << i11) | (i10 & (~(255 << i11))));
    }

    public static void d(Object obj, long j3, byte b10) {
        t6 t6Var = c;
        long j10 = (-4) & j3;
        int i10 = (((int) j3) & 3) << 3;
        t6Var.a.putInt(obj, j10, ((255 & b10) << i10) | (t6Var.a.getInt(obj, j10) & (~(255 << i10))));
    }

    public static int e(Object obj, long j3) {
        return c.a.getInt(obj, j3);
    }

    public static long f(Object obj, long j3) {
        return c.a.getLong(obj, j3);
    }

    public static Object g(Class cls) {
        try {
            return a.allocateInstance(cls);
        } catch (InstantiationException e7) {
            throw new IllegalStateException(e7);
        }
    }

    public static Object h(Object obj, long j3) {
        return c.a.getObject(obj, j3);
    }

    public static Unsafe i() {
        try {
            return (Unsafe) AccessController.doPrivileged(new q6());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void j(Object obj, long j3, int i10) {
        c.a.putInt(obj, j3, i10);
    }

    public static void k(Object obj, long j3, long j10) {
        c.a.putLong(obj, j3, j10);
    }

    public static void l(Object obj, long j3, Object obj2) {
        c.a.putObject(obj, j3, obj2);
    }

    public static /* bridge */ /* synthetic */ boolean m(Object obj, long j3) {
        return ((byte) ((c.a.getInt(obj, (-4) & j3) >>> ((int) (((~j3) & 3) << 3))) & 255)) != 0;
    }

    public static /* bridge */ /* synthetic */ boolean n(Object obj, long j3) {
        return ((byte) ((c.a.getInt(obj, (-4) & j3) >>> ((int) ((j3 & 3) << 3))) & 255)) != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean o(Class cls) {
        int i10 = x4.a;
        try {
            Class cls2 = b;
            Class cls3 = Boolean.TYPE;
            cls2.getMethod("peekLong", cls, cls3);
            cls2.getMethod("pokeLong", cls, Long.TYPE, cls3);
            Class cls4 = Integer.TYPE;
            cls2.getMethod("pokeInt", cls, cls4, cls3);
            cls2.getMethod("peekInt", cls, cls3);
            cls2.getMethod("pokeByte", cls, Byte.TYPE);
            cls2.getMethod("peekByte", cls);
            cls2.getMethod("pokeByteArray", cls, byte[].class, cls4, cls4);
            cls2.getMethod("peekByteArray", cls, byte[].class, cls4, cls4);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static int p(Class cls) {
        if (e) {
            return c.a.arrayBaseOffset(cls);
        }
        return -1;
    }
}
