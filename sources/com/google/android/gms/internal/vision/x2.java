package com.google.android.gms.internal.vision;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public abstract class x2 {
    public static final Unsafe a;
    public static final Class b;
    public static final w2 c;
    public static final boolean d;
    public static final boolean e;
    public static final long f;
    public static final boolean g;

    /* JADX WARN: Removed duplicated region for block: B:14:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0137 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0067 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x005f  */
    static {
        w2 w2Var;
        Class<?> cls;
        Class<?> cls2;
        Class<?> cls3;
        boolean z10;
        Unsafe unsafe;
        boolean z11;
        boolean z12;
        Class<?> cls4;
        Field m10;
        w2 w2Var2;
        Unsafe g7 = g();
        a = g7;
        b = m0.a;
        Class<?> cls5 = Long.TYPE;
        boolean k10 = k(cls5);
        Class<?> cls6 = Integer.TYPE;
        boolean k11 = k(cls6);
        if (g7 != null) {
            if (!m0.a()) {
                w2Var = new v2(g7);
            } else if (k10) {
                w2Var = new u2(g7, 1);
            } else if (k11) {
                w2Var = new u2(g7, 0);
            }
            c = w2Var;
            Class<?> cls7 = Byte.TYPE;
            if (g7 != null) {
                cls = cls5;
            } else {
                try {
                    cls3 = g7.getClass();
                    cls = cls5;
                    try {
                        cls3.getMethod("objectFieldOffset", Field.class);
                        cls3.getMethod("getLong", Object.class, cls);
                    } catch (Throwable th2) {
                        th = th2;
                        Logger logger = Logger.getLogger(x2.class.getName());
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
                        z11 = true;
                        e = z12;
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
                        g = ByteOrder.nativeOrder() != ByteOrder.BIG_ENDIAN ? z11 : false;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    cls = cls5;
                }
                if (m() != null) {
                    if (m0.a()) {
                        cls2 = cls6;
                        z10 = true;
                    } else {
                        cls3.getMethod("getByte", cls);
                        cls3.getMethod("putByte", cls, cls7);
                        cls3.getMethod("getInt", cls);
                        cls3.getMethod("putInt", cls, cls6);
                        cls3.getMethod("getLong", cls);
                        cls3.getMethod("putLong", cls, cls);
                        cls3.getMethod("copyMemory", cls, cls, cls);
                        cls3.getMethod("copyMemory", Object.class, cls, Object.class, cls, cls);
                        cls2 = cls6;
                        z10 = true;
                    }
                    d = z10;
                    unsafe = a;
                    if (unsafe != null) {
                        z12 = false;
                    } else {
                        try {
                            cls4 = unsafe.getClass();
                            try {
                                cls4.getMethod("objectFieldOffset", Field.class);
                                cls4.getMethod("arrayBaseOffset", Class.class);
                                cls4.getMethod("arrayIndexScale", Class.class);
                                cls4.getMethod("getInt", Object.class, cls);
                                cls4.getMethod("putInt", Object.class, cls, cls2);
                                cls4.getMethod("getLong", Object.class, cls);
                                Class<?>[] clsArr = new Class[3];
                                clsArr[0] = Object.class;
                                clsArr[1] = cls;
                                clsArr[2] = cls;
                                cls4.getMethod("putLong", clsArr);
                                Class<?>[] clsArr2 = new Class[2];
                                clsArr2[0] = Object.class;
                                z11 = true;
                                try {
                                    clsArr2[1] = cls;
                                    cls4.getMethod("getObject", clsArr2);
                                    Class<?>[] clsArr3 = new Class[3];
                                    clsArr3[0] = Object.class;
                                    clsArr3[1] = cls;
                                    clsArr3[2] = Object.class;
                                    cls4.getMethod("putObject", clsArr3);
                                } catch (Throwable th4) {
                                    th = th4;
                                    Logger logger2 = Logger.getLogger(x2.class.getName());
                                    Level level2 = Level.WARNING;
                                    String valueOf2 = String.valueOf(th);
                                    StringBuilder sb3 = new StringBuilder(valueOf2.length() + 71);
                                    sb3.append("platform method missing - proto runtime falling back to safer methods: ");
                                    sb3.append(valueOf2);
                                    logger2.logp(level2, "com.google.protobuf.UnsafeUtil", "supportsUnsafeArrayOperations", sb3.toString());
                                    z12 = false;
                                    e = z12;
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
                                    g = ByteOrder.nativeOrder() != ByteOrder.BIG_ENDIAN ? z11 : false;
                                }
                            } catch (Throwable th5) {
                                th = th5;
                                z11 = true;
                            }
                        } catch (Throwable th6) {
                            th = th6;
                            z11 = true;
                        }
                        if (!m0.a()) {
                            Class<?>[] clsArr4 = new Class[2];
                            clsArr4[0] = Object.class;
                            clsArr4[1] = cls;
                            cls4.getMethod("getByte", clsArr4);
                            Class<?>[] clsArr5 = new Class[3];
                            clsArr5[0] = Object.class;
                            clsArr5[1] = cls;
                            clsArr5[2] = cls7;
                            cls4.getMethod("putByte", clsArr5);
                            Class<?>[] clsArr6 = new Class[2];
                            clsArr6[0] = Object.class;
                            clsArr6[1] = cls;
                            cls4.getMethod("getBoolean", clsArr6);
                            Class<?>[] clsArr7 = new Class[3];
                            clsArr7[0] = Object.class;
                            clsArr7[1] = cls;
                            clsArr7[2] = Boolean.TYPE;
                            cls4.getMethod("putBoolean", clsArr7);
                            Class<?>[] clsArr8 = new Class[2];
                            clsArr8[0] = Object.class;
                            clsArr8[1] = cls;
                            cls4.getMethod("getFloat", clsArr8);
                            Class<?>[] clsArr9 = new Class[3];
                            clsArr9[0] = Object.class;
                            clsArr9[1] = cls;
                            clsArr9[2] = Float.TYPE;
                            cls4.getMethod("putFloat", clsArr9);
                            Class<?>[] clsArr10 = new Class[2];
                            clsArr10[0] = Object.class;
                            z11 = true;
                            clsArr10[1] = cls;
                            cls4.getMethod("getDouble", clsArr10);
                            cls4.getMethod("putDouble", Object.class, cls, Double.TYPE);
                            z12 = true;
                            e = z12;
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
                            if (m10 != null && (w2Var2 = c) != null) {
                                w2Var2.a.objectFieldOffset(m10);
                            }
                            g = ByteOrder.nativeOrder() != ByteOrder.BIG_ENDIAN ? z11 : false;
                        }
                        z12 = true;
                    }
                    z11 = true;
                    e = z12;
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
                        w2Var2.a.objectFieldOffset(m10);
                    }
                    g = ByteOrder.nativeOrder() != ByteOrder.BIG_ENDIAN ? z11 : false;
                }
            }
            cls2 = cls6;
            z10 = false;
            d = z10;
            unsafe = a;
            if (unsafe != null) {
            }
            z11 = true;
            e = z12;
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
            g = ByteOrder.nativeOrder() != ByteOrder.BIG_ENDIAN ? z11 : false;
        }
        w2Var = null;
        c = w2Var;
        Class<?> cls72 = Byte.TYPE;
        if (g7 != null) {
        }
        cls2 = cls6;
        z10 = false;
        d = z10;
        unsafe = a;
        if (unsafe != null) {
        }
        z11 = true;
        e = z12;
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
        g = ByteOrder.nativeOrder() != ByteOrder.BIG_ENDIAN ? z11 : false;
    }

    public static byte a(long j10, byte[] bArr) {
        return c.a(bArr, f + j10);
    }

    public static Object b(Class cls) {
        try {
            return a.allocateInstance(cls);
        } catch (InstantiationException e10) {
            throw new IllegalStateException(e10);
        }
    }

    public static void c(long j10, Object obj, int i10) {
        c.b(j10, obj, i10);
    }

    public static void d(Object obj, long j10, Object obj2) {
        c.a.putObject(obj, j10, obj2);
    }

    public static void e(byte[] bArr, long j10, byte b10) {
        c.c(bArr, f + j10, b10);
    }

    public static int f(Class cls) {
        if (e) {
            return c.a.arrayBaseOffset(cls);
        }
        return -1;
    }

    public static Unsafe g() {
        try {
            return (Unsafe) AccessController.doPrivileged(new z2());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void h(Class cls) {
        if (e) {
            c.a.arrayIndexScale(cls);
        }
    }

    public static void i(Object obj, long j10, byte b10) {
        long j11 = (-4) & j10;
        int k10 = c.k(obj, j11);
        int i10 = ((~((int) j10)) & 3) << 3;
        c(j11, obj, ((255 & b10) << i10) | (k10 & (~(255 << i10))));
    }

    public static void j(Object obj, long j10, byte b10) {
        long j11 = (-4) & j10;
        int i10 = (((int) j10) & 3) << 3;
        c(j11, obj, ((255 & b10) << i10) | (c.k(obj, j11) & (~(255 << i10))));
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

    public static Object l(Object obj, long j10) {
        return c.a.getObject(obj, j10);
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

    public static byte n(Object obj, long j10) {
        return (byte) (c.k(obj, (-4) & j10) >>> ((int) (((~j10) & 3) << 3)));
    }

    public static byte o(Object obj, long j10) {
        return (byte) (c.k(obj, (-4) & j10) >>> ((int) ((j10 & 3) << 3)));
    }
}
