package com.google.android.gms.internal.clearcut;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
public abstract class k1 {
    public static final Logger a = Logger.getLogger(k1.class.getName());
    public static final Unsafe b;
    public static final Class c;
    public static final j1 d;
    public static final boolean e;
    public static final boolean f;
    public static final long g;
    public static final boolean h;

    /* JADX WARN: Can't wrap try/catch for region: R(27:0|1|(24:3|(1:(1:6)(1:(1:67)))(1:68)|7|(3:55|56|(1:58)(21:59|(1:62)|61|11|(18:47|48|(1:51)|50|14|(1:18)|19|20|21|22|23|24|(1:40)(1:28)|(1:32)|33|(1:35)(1:39)|36|37)|13|14|(2:16|18)|19|20|21|22|23|24|(1:26)|40|(2:30|32)|33|(0)(0)|36|37))|9|10|11|(0)|13|14|(0)|19|20|21|22|23|24|(0)|40|(0)|33|(0)(0)|36|37)|69|7|(0)|9|10|11|(0)|13|14|(0)|19|20|21|22|23|24|(0)|40|(0)|33|(0)(0)|36|37|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0290, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0127 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x006d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    static {
        j1 j1Var;
        Class<?> cls;
        Class<?> cls2;
        boolean z4;
        Unsafe unsafe;
        boolean z10;
        Field g10;
        Field field;
        j1 j1Var2;
        j1 j1Var3;
        Unsafe f10 = f();
        b = f10;
        c = l.a;
        Class<?> cls3 = Long.TYPE;
        boolean j10 = j(cls3);
        Class<?> cls4 = Integer.TYPE;
        boolean j11 = j(cls4);
        if (f10 != null) {
            if (!l.a()) {
                j1Var = new i1(f10);
            } else if (j10) {
                j1Var = new h1(f10, 1);
            } else if (j11) {
                j1Var = new h1(f10, 0);
            }
            d = j1Var;
            Class<?> cls5 = Byte.TYPE;
            if (f10 != null) {
                try {
                    cls2 = f10.getClass();
                    cls2.getMethod("objectFieldOffset", Field.class);
                    cls2.getMethod("getLong", Object.class, cls3);
                } catch (Throwable th2) {
                    Logger logger = a;
                    Level level = Level.WARNING;
                    String valueOf = String.valueOf(th2);
                    cls = cls3;
                    StringBuilder sb = new StringBuilder(valueOf.length() + 71);
                    sb.append("platform method missing - proto runtime falling back to safer methods: ");
                    sb.append(valueOf);
                    logger.logp(level, "com.google.protobuf.UnsafeUtil", "supportsUnsafeByteBufferOperations", sb.toString());
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
                    z4 = true;
                    e = z4;
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
                            z10 = true;
                        } catch (Throwable th3) {
                            Logger logger2 = a;
                            Level level2 = Level.WARNING;
                            String valueOf2 = String.valueOf(th3);
                            StringBuilder sb2 = new StringBuilder(valueOf2.length() + 71);
                            sb2.append("platform method missing - proto runtime falling back to safer methods: ");
                            sb2.append(valueOf2);
                            logger2.logp(level2, "com.google.protobuf.UnsafeUtil", "supportsUnsafeArrayOperations", sb2.toString());
                        }
                        f = z10;
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
                        if (g10 != null && (j1Var3 = d) != null) {
                            j1Var3.a(g10);
                        }
                        Field field2 = String.class.getDeclaredField("value");
                        field2.setAccessible(true);
                        field = (field2 == null && field2.getType() == char[].class) ? field2 : null;
                        if (field != null && (j1Var2 = d) != null) {
                            j1Var2.a(field);
                        }
                        h = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
                    }
                    z10 = false;
                    f = z10;
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
                        j1Var3.a(g10);
                    }
                    Field field22 = String.class.getDeclaredField("value");
                    field22.setAccessible(true);
                    if (field22 == null) {
                    }
                    if (field != null) {
                        j1Var2.a(field);
                    }
                    h = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
                }
            }
            cls = cls3;
            z4 = false;
            e = z4;
            unsafe = b;
            if (unsafe != null) {
            }
            z10 = false;
            f = z10;
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
        z4 = false;
        e = z4;
        unsafe = b;
        if (unsafe != null) {
        }
        z10 = false;
        f = z10;
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
            return (Unsafe) AccessController.doPrivileged(new l1());
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
