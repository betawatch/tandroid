package com.google.android.gms.internal.clearcut;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
public abstract class l1 {
    public static final Logger a = Logger.getLogger(l1.class.getName());
    public static final Unsafe b;
    public static final Class c;
    public static final k1 d;
    public static final boolean e;
    public static final boolean f;
    public static final long g;
    public static final boolean h;

    /* JADX WARN: Can't wrap try/catch for region: R(27:0|1|(24:63|(1:(1:66)(1:(1:68)))(1:69)|4|(3:52|53|(1:55)(21:56|(1:59)|58|8|(18:44|45|(1:48)|47|11|(1:15)|16|17|18|19|20|21|(1:37)(1:25)|(1:29)|30|(1:32)(1:36)|33|34)|10|11|(2:13|15)|16|17|18|19|20|21|(1:23)|37|(2:27|29)|30|(0)(0)|33|34))|6|7|8|(0)|10|11|(0)|16|17|18|19|20|21|(0)|37|(0)|30|(0)(0)|33|34)|3|4|(0)|6|7|8|(0)|10|11|(0)|16|17|18|19|20|21|(0)|37|(0)|30|(0)(0)|33|34|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0290, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0127 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x006d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    static {
        k1 j1Var;
        Class<?> cls;
        Class<?> cls2;
        boolean z10;
        Unsafe unsafe;
        boolean z11;
        Field g10;
        Field field;
        k1 k1Var;
        k1 k1Var2;
        Unsafe f10 = f();
        b = f10;
        c = l.a;
        Class<?> cls3 = Long.TYPE;
        boolean j10 = j(cls3);
        Class<?> cls4 = Integer.TYPE;
        boolean j11 = j(cls4);
        if (f10 != null) {
            if (!l.a()) {
                j1Var = new j1(f10);
            } else if (j10) {
                j1Var = new i1(f10, 1);
            } else if (j11) {
                j1Var = new i1(f10, 0);
            }
            d = j1Var;
            Class<?> cls5 = Byte.TYPE;
            if (f10 != null) {
                try {
                    cls2 = f10.getClass();
                    cls2.getMethod("objectFieldOffset", Field.class);
                    cls2.getMethod("getLong", Object.class, cls3);
                } catch (Throwable th) {
                    Logger logger = a;
                    Level level = Level.WARNING;
                    String valueOf = String.valueOf(th);
                    cls = cls3;
                    StringBuilder sb2 = new StringBuilder(valueOf.length() + 71);
                    sb2.append("platform method missing - proto runtime falling back to safer methods: ");
                    sb2.append(valueOf);
                    logger.logp(level, "com.google.protobuf.UnsafeUtil", "supportsUnsafeByteBufferOperations", sb2.toString());
                }
                if (g() != null) {
                    if (!l.a()) {
                        cls2.getMethod("getByte", cls3);
                        cls2.getMethod("putByte", cls3, cls5);
                        cls2.getMethod("getInt", cls3);
                        cls2.getMethod("putInt", cls3, cls4);
                        cls2.getMethod("getLong", cls3);
                        cls2.getMethod("putLong", cls3, cls3);
                        cls2.getMethod("copyMemory", cls3, cls3, cls3);
                        cls2.getMethod("copyMemory", Object.class, cls3, Object.class, cls3, cls3);
                    }
                    cls = cls3;
                    z10 = true;
                    e = z10;
                    unsafe = b;
                    if (unsafe != null) {
                        try {
                            Class<?> cls6 = unsafe.getClass();
                            cls6.getMethod("objectFieldOffset", Field.class);
                            cls6.getMethod("arrayBaseOffset", Class.class);
                            cls6.getMethod("arrayIndexScale", Class.class);
                            cls6.getMethod("getInt", Object.class, cls);
                            cls6.getMethod("putInt", Object.class, cls, cls4);
                            cls6.getMethod("getLong", Object.class, cls);
                            cls6.getMethod("putLong", Object.class, cls, cls);
                            cls6.getMethod("getObject", Object.class, cls);
                            cls6.getMethod("putObject", Object.class, cls, Object.class);
                            if (!l.a()) {
                                cls6.getMethod("getByte", Object.class, cls);
                                cls6.getMethod("putByte", Object.class, cls, cls5);
                                cls6.getMethod("getBoolean", Object.class, cls);
                                cls6.getMethod("putBoolean", Object.class, cls, Boolean.TYPE);
                                cls6.getMethod("getFloat", Object.class, cls);
                                cls6.getMethod("putFloat", Object.class, cls, Float.TYPE);
                                cls6.getMethod("getDouble", Object.class, cls);
                                cls6.getMethod("putDouble", Object.class, cls, Double.TYPE);
                            }
                            z11 = true;
                        } catch (Throwable th2) {
                            Logger logger2 = a;
                            Level level2 = Level.WARNING;
                            String valueOf2 = String.valueOf(th2);
                            StringBuilder sb3 = new StringBuilder(valueOf2.length() + 71);
                            sb3.append("platform method missing - proto runtime falling back to safer methods: ");
                            sb3.append(valueOf2);
                            logger2.logp(level2, "com.google.protobuf.UnsafeUtil", "supportsUnsafeArrayOperations", sb3.toString());
                        }
                        f = z11;
                        g = h(byte[].class);
                        h(boolean[].class);
                        i(boolean[].class);
                        h(int[].class);
                        i(int[].class);
                        h(long[].class);
                        i(long[].class);
                        h(float[].class);
                        i(float[].class);
                        h(double[].class);
                        i(double[].class);
                        h(Object[].class);
                        i(Object[].class);
                        g10 = g();
                        if (g10 != null && (k1Var2 = d) != null) {
                            k1Var2.a(g10);
                        }
                        Field field2 = String.class.getDeclaredField("value");
                        field2.setAccessible(true);
                        field = (field2 == null && field2.getType() == char[].class) ? field2 : null;
                        if (field != null && (k1Var = d) != null) {
                            k1Var.a(field);
                        }
                        h = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
                    }
                    z11 = false;
                    f = z11;
                    g = h(byte[].class);
                    h(boolean[].class);
                    i(boolean[].class);
                    h(int[].class);
                    i(int[].class);
                    h(long[].class);
                    i(long[].class);
                    h(float[].class);
                    i(float[].class);
                    h(double[].class);
                    i(double[].class);
                    h(Object[].class);
                    i(Object[].class);
                    g10 = g();
                    if (g10 != null) {
                        k1Var2.a(g10);
                    }
                    Field field22 = String.class.getDeclaredField("value");
                    field22.setAccessible(true);
                    if (field22 == null) {
                    }
                    if (field != null) {
                        k1Var.a(field);
                    }
                    h = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
                }
            }
            cls = cls3;
            z10 = false;
            e = z10;
            unsafe = b;
            if (unsafe != null) {
            }
            z11 = false;
            f = z11;
            g = h(byte[].class);
            h(boolean[].class);
            i(boolean[].class);
            h(int[].class);
            i(int[].class);
            h(long[].class);
            i(long[].class);
            h(float[].class);
            i(float[].class);
            h(double[].class);
            i(double[].class);
            h(Object[].class);
            i(Object[].class);
            g10 = g();
            if (g10 != null) {
            }
            Field field222 = String.class.getDeclaredField("value");
            field222.setAccessible(true);
            if (field222 == null) {
            }
            if (field != null) {
            }
            h = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
        }
        j1Var = null;
        d = j1Var;
        Class<?> cls52 = Byte.TYPE;
        if (f10 != null) {
        }
        cls = cls3;
        z10 = false;
        e = z10;
        unsafe = b;
        if (unsafe != null) {
        }
        z11 = false;
        f = z11;
        g = h(byte[].class);
        h(boolean[].class);
        i(boolean[].class);
        h(int[].class);
        i(int[].class);
        h(long[].class);
        i(long[].class);
        h(float[].class);
        i(float[].class);
        h(double[].class);
        i(double[].class);
        h(Object[].class);
        i(Object[].class);
        g10 = g();
        if (g10 != null) {
        }
        Field field2222 = String.class.getDeclaredField("value");
        field2222.setAccessible(true);
        if (field2222 == null) {
        }
        if (field != null) {
        }
        h = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    public static byte a(long j10, byte[] bArr) {
        return d.l(bArr, g + j10);
    }

    public static void b(long j10, Object obj, int i10) {
        d.b(j10, obj, i10);
    }

    public static void c(Object obj, long j10, byte b10) {
        long j11 = (-4) & j10;
        int g10 = d.g(obj, j11);
        int i10 = ((~((int) j10)) & 3) << 3;
        b(j11, obj, ((255 & b10) << i10) | (g10 & (~(255 << i10))));
    }

    public static void d(Object obj, long j10, Object obj2) {
        d.a.putObject(obj, j10, obj2);
    }

    public static void e(Object obj, long j10, byte b10) {
        long j11 = (-4) & j10;
        int i10 = (((int) j10) & 3) << 3;
        b(j11, obj, ((255 & b10) << i10) | (d.g(obj, j11) & (~(255 << i10))));
    }

    public static Unsafe f() {
        try {
            return (Unsafe) AccessController.doPrivileged(new m1());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Field g() {
        Field field;
        Field field2;
        if (l.a()) {
            try {
                field2 = Buffer.class.getDeclaredField("effectiveDirectAddress");
                field2.setAccessible(true);
            } catch (Throwable unused) {
                field2 = null;
            }
            if (field2 != null) {
                return field2;
            }
        }
        try {
            field = Buffer.class.getDeclaredField("address");
            field.setAccessible(true);
        } catch (Throwable unused2) {
            field = null;
        }
        if (field == null || field.getType() != Long.TYPE) {
            return null;
        }
        return field;
    }

    public static int h(Class cls) {
        if (f) {
            return d.a.arrayBaseOffset(cls);
        }
        return -1;
    }

    public static void i(Class cls) {
        if (f) {
            d.a.arrayIndexScale(cls);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean j(Class cls) {
        if (!l.a()) {
            return false;
        }
        try {
            Class cls2 = c;
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

    public static Object k(Object obj, long j10) {
        return d.a.getObject(obj, j10);
    }

    public static byte l(Object obj, long j10) {
        return (byte) (d.g(obj, (-4) & j10) >>> ((int) (((~j10) & 3) << 3)));
    }

    public static byte m(Object obj, long j10) {
        return (byte) (d.g(obj, (-4) & j10) >>> ((int) ((j10 & 3) << 3)));
    }
}
