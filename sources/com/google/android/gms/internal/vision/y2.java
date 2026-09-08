package com.google.android.gms.internal.vision;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public abstract class y2 {
    public static final Unsafe a;
    public static final Class b;
    public static final x2 c;
    public static final boolean d;
    public static final boolean e;
    public static final long f;
    public static final boolean g;

    /* JADX WARN: Removed duplicated region for block: B:14:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x012d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0065 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x005e  */
    static {
        x2 x2Var;
        Class<?> cls;
        Class<?> cls2;
        Class<?> cls3;
        boolean z10;
        Unsafe unsafe;
        boolean z11;
        Class<?> cls4;
        Field m10;
        x2 x2Var2;
        Unsafe g10 = g();
        a = g10;
        b = m0.a;
        Class<?> cls5 = Long.TYPE;
        boolean k10 = k(cls5);
        Class<?> cls6 = Integer.TYPE;
        boolean k11 = k(cls6);
        if (g10 != null) {
            if (!m0.a()) {
                x2Var = new w2(g10);
            } else if (k10) {
                x2Var = new v2(g10, 1);
            } else if (k11) {
                x2Var = new v2(g10, 0);
            }
            c = x2Var;
            Class<?> cls7 = Byte.TYPE;
            if (g10 != null) {
                cls = cls5;
            } else {
                try {
                    cls3 = g10.getClass();
                    cls = cls5;
                } catch (Throwable th2) {
                    th = th2;
                    cls = cls5;
                }
                try {
                    cls3.getMethod("objectFieldOffset", Field.class);
                    cls3.getMethod("getLong", Object.class, cls);
                } catch (Throwable th3) {
                    th = th3;
                    Logger logger = Logger.getLogger(y2.class.getName());
                    Level level = Level.WARNING;
                    String valueOf = String.valueOf(th);
                    cls2 = cls6;
                    StringBuilder sb2 = new StringBuilder(valueOf.length() + 71);
                    sb2.append("platform method missing - proto runtime falling back to safer methods: ");
                    sb2.append(valueOf);
                    logger.logp(level, "com.google.protobuf.UnsafeUtil", "supportsUnsafeByteBufferOperations", sb2.toString());
                    z10 = false;
                    d = z10;
                    unsafe = a;
                    if (unsafe != null) {
                    }
                    e = z11;
                    f = f(byte[].class);
                    f(boolean[].class);
                    h(boolean[].class);
                    f(int[].class);
                    h(int[].class);
                    f(long[].class);
                    h(long[].class);
                    f(float[].class);
                    h(float[].class);
                    f(double[].class);
                    h(double[].class);
                    f(Object[].class);
                    h(Object[].class);
                    m10 = m();
                    if (m10 != null) {
                    }
                    g = ByteOrder.nativeOrder() != ByteOrder.BIG_ENDIAN;
                }
                if (m() != null) {
                    if (!m0.a()) {
                        cls3.getMethod("getByte", cls);
                        cls3.getMethod("putByte", cls, cls7);
                        cls3.getMethod("getInt", cls);
                        cls3.getMethod("putInt", cls, cls6);
                        cls3.getMethod("getLong", cls);
                        cls3.getMethod("putLong", cls, cls);
                        cls3.getMethod("copyMemory", cls, cls, cls);
                        cls3.getMethod("copyMemory", Object.class, cls, Object.class, cls, cls);
                    }
                    cls2 = cls6;
                    z10 = true;
                    d = z10;
                    unsafe = a;
                    if (unsafe != null) {
                        z11 = false;
                    } else {
                        try {
                            cls4 = unsafe.getClass();
                            cls4.getMethod("objectFieldOffset", Field.class);
                            cls4.getMethod("arrayBaseOffset", Class.class);
                            cls4.getMethod("arrayIndexScale", Class.class);
                            cls4.getMethod("getInt", Object.class, cls);
                            cls4.getMethod("putInt", Object.class, cls, cls2);
                            cls4.getMethod("getLong", Object.class, cls);
                            cls4.getMethod("putLong", Object.class, cls, cls);
                            Class<?>[] clsArr = new Class[2];
                            clsArr[0] = Object.class;
                            try {
                                clsArr[1] = cls;
                                cls4.getMethod("getObject", clsArr);
                                Class<?>[] clsArr2 = new Class[3];
                                clsArr2[0] = Object.class;
                                clsArr2[1] = cls;
                                clsArr2[2] = Object.class;
                                cls4.getMethod("putObject", clsArr2);
                            } catch (Throwable th4) {
                                th = th4;
                                Logger logger2 = Logger.getLogger(y2.class.getName());
                                Level level2 = Level.WARNING;
                                String valueOf2 = String.valueOf(th);
                                StringBuilder sb3 = new StringBuilder(valueOf2.length() + 71);
                                sb3.append("platform method missing - proto runtime falling back to safer methods: ");
                                sb3.append(valueOf2);
                                logger2.logp(level2, "com.google.protobuf.UnsafeUtil", "supportsUnsafeArrayOperations", sb3.toString());
                                z11 = false;
                                e = z11;
                                f = f(byte[].class);
                                f(boolean[].class);
                                h(boolean[].class);
                                f(int[].class);
                                h(int[].class);
                                f(long[].class);
                                h(long[].class);
                                f(float[].class);
                                h(float[].class);
                                f(double[].class);
                                h(double[].class);
                                f(Object[].class);
                                h(Object[].class);
                                m10 = m();
                                if (m10 != null) {
                                }
                                g = ByteOrder.nativeOrder() != ByteOrder.BIG_ENDIAN;
                            }
                        } catch (Throwable th5) {
                            th = th5;
                        }
                        if (!m0.a()) {
                            Class<?>[] clsArr3 = new Class[2];
                            clsArr3[0] = Object.class;
                            clsArr3[1] = cls;
                            cls4.getMethod("getByte", clsArr3);
                            Class<?>[] clsArr4 = new Class[3];
                            clsArr4[0] = Object.class;
                            clsArr4[1] = cls;
                            clsArr4[2] = cls7;
                            cls4.getMethod("putByte", clsArr4);
                            Class<?>[] clsArr5 = new Class[2];
                            clsArr5[0] = Object.class;
                            clsArr5[1] = cls;
                            cls4.getMethod("getBoolean", clsArr5);
                            Class<?>[] clsArr6 = new Class[3];
                            clsArr6[0] = Object.class;
                            clsArr6[1] = cls;
                            clsArr6[2] = Boolean.TYPE;
                            cls4.getMethod("putBoolean", clsArr6);
                            Class<?>[] clsArr7 = new Class[2];
                            clsArr7[0] = Object.class;
                            clsArr7[1] = cls;
                            cls4.getMethod("getFloat", clsArr7);
                            Class<?>[] clsArr8 = new Class[3];
                            clsArr8[0] = Object.class;
                            clsArr8[1] = cls;
                            clsArr8[2] = Float.TYPE;
                            cls4.getMethod("putFloat", clsArr8);
                            Class<?>[] clsArr9 = new Class[2];
                            clsArr9[0] = Object.class;
                            clsArr9[1] = cls;
                            cls4.getMethod("getDouble", clsArr9);
                            cls4.getMethod("putDouble", Object.class, cls, Double.TYPE);
                            z11 = true;
                            e = z11;
                            f = f(byte[].class);
                            f(boolean[].class);
                            h(boolean[].class);
                            f(int[].class);
                            h(int[].class);
                            f(long[].class);
                            h(long[].class);
                            f(float[].class);
                            h(float[].class);
                            f(double[].class);
                            h(double[].class);
                            f(Object[].class);
                            h(Object[].class);
                            m10 = m();
                            if (m10 != null && (x2Var2 = c) != null) {
                                x2Var2.a.objectFieldOffset(m10);
                            }
                            g = ByteOrder.nativeOrder() != ByteOrder.BIG_ENDIAN;
                        }
                        z11 = true;
                    }
                    e = z11;
                    f = f(byte[].class);
                    f(boolean[].class);
                    h(boolean[].class);
                    f(int[].class);
                    h(int[].class);
                    f(long[].class);
                    h(long[].class);
                    f(float[].class);
                    h(float[].class);
                    f(double[].class);
                    h(double[].class);
                    f(Object[].class);
                    h(Object[].class);
                    m10 = m();
                    if (m10 != null) {
                        x2Var2.a.objectFieldOffset(m10);
                    }
                    g = ByteOrder.nativeOrder() != ByteOrder.BIG_ENDIAN;
                }
            }
            cls2 = cls6;
            z10 = false;
            d = z10;
            unsafe = a;
            if (unsafe != null) {
            }
            e = z11;
            f = f(byte[].class);
            f(boolean[].class);
            h(boolean[].class);
            f(int[].class);
            h(int[].class);
            f(long[].class);
            h(long[].class);
            f(float[].class);
            h(float[].class);
            f(double[].class);
            h(double[].class);
            f(Object[].class);
            h(Object[].class);
            m10 = m();
            if (m10 != null) {
            }
            g = ByteOrder.nativeOrder() != ByteOrder.BIG_ENDIAN;
        }
        x2Var = null;
        c = x2Var;
        Class<?> cls72 = Byte.TYPE;
        if (g10 != null) {
        }
        cls2 = cls6;
        z10 = false;
        d = z10;
        unsafe = a;
        if (unsafe != null) {
        }
        e = z11;
        f = f(byte[].class);
        f(boolean[].class);
        h(boolean[].class);
        f(int[].class);
        h(int[].class);
        f(long[].class);
        h(long[].class);
        f(float[].class);
        h(float[].class);
        f(double[].class);
        h(double[].class);
        f(Object[].class);
        h(Object[].class);
        m10 = m();
        if (m10 != null) {
        }
        g = ByteOrder.nativeOrder() != ByteOrder.BIG_ENDIAN;
    }

    public static byte a(long j3, byte[] bArr) {
        return c.a(bArr, f + j3);
    }

    public static Object b(Class cls) {
        try {
            return a.allocateInstance(cls);
        } catch (InstantiationException e7) {
            throw new IllegalStateException(e7);
        }
    }

    public static void c(long j3, Object obj, int i10) {
        c.b(j3, obj, i10);
    }

    public static void d(Object obj, long j3, Object obj2) {
        c.a.putObject(obj, j3, obj2);
    }

    public static void e(byte[] bArr, long j3, byte b10) {
        c.c(bArr, f + j3, b10);
    }

    public static int f(Class cls) {
        if (e) {
            return c.a.arrayBaseOffset(cls);
        }
        return -1;
    }

    public static Unsafe g() {
        try {
            return (Unsafe) AccessController.doPrivileged(new a3());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void h(Class cls) {
        if (e) {
            c.a.arrayIndexScale(cls);
        }
    }

    public static void i(Object obj, long j3, byte b10) {
        long j10 = (-4) & j3;
        int k10 = c.k(obj, j10);
        int i10 = ((~((int) j3)) & 3) << 3;
        c(j10, obj, ((255 & b10) << i10) | (k10 & (~(255 << i10))));
    }

    public static void j(Object obj, long j3, byte b10) {
        long j10 = (-4) & j3;
        int i10 = (((int) j3) & 3) << 3;
        c(j10, obj, ((255 & b10) << i10) | (c.k(obj, j10) & (~(255 << i10))));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean k(Class cls) {
        if (!m0.a()) {
            return false;
        }
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

    public static Object l(Object obj, long j3) {
        return c.a.getObject(obj, j3);
    }

    public static Field m() {
        Field field;
        Field field2;
        if (m0.a()) {
            try {
                field2 = Buffer.class.getDeclaredField("effectiveDirectAddress");
            } catch (Throwable unused) {
                field2 = null;
            }
            if (field2 != null) {
                return field2;
            }
        }
        try {
            field = Buffer.class.getDeclaredField("address");
        } catch (Throwable unused2) {
            field = null;
        }
        if (field == null || field.getType() != Long.TYPE) {
            return null;
        }
        return field;
    }

    public static byte n(Object obj, long j3) {
        return (byte) (c.k(obj, (-4) & j3) >>> ((int) (((~j3) & 3) << 3)));
    }

    public static byte o(Object obj, long j3) {
        return (byte) (c.k(obj, (-4) & j3) >>> ((int) ((j3 & 3) << 3)));
    }
}
