// default package

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public abstract class a5f {
    public static final Unsafe a;
    public static final Class b;
    public static final cac c;
    public static final boolean d;
    public static final boolean e;
    public static final long f;
    public static final boolean g;

    /* JADX WARN: Removed duplicated region for block: B:20:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0130 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    static {
        Unsafe unsafe;
        Class<?> cls;
        Class<?> cls2;
        Class<?> cls3;
        boolean z;
        Unsafe unsafe2;
        boolean z2;
        boolean z3;
        Class<?> cls4;
        Field m;
        cac cacVar;
        cac cacVar2 = null;
        try {
            unsafe = (Unsafe) AccessController.doPrivileged(new r2((byte) 5));
        } catch (Throwable unused) {
            unsafe = null;
        }
        a = unsafe;
        b = aje.a;
        Class<?> cls5 = Long.TYPE;
        boolean k = k(cls5);
        Class<?> cls6 = Integer.TYPE;
        boolean k2 = k(cls6);
        if (unsafe != null) {
            if (!aje.a()) {
                cacVar2 = new x4f(unsafe);
            } else if (k) {
                cacVar2 = new w4f(unsafe, (byte) 1);
            } else if (k2) {
                cacVar2 = new w4f(unsafe, (byte) 0);
            }
        }
        c = cacVar2;
        Class<?> cls7 = Byte.TYPE;
        if (unsafe == null) {
            cls = cls5;
        } else {
            try {
                cls3 = unsafe.getClass();
                cls = cls5;
                try {
                    cls3.getMethod("objectFieldOffset", Field.class);
                    cls3.getMethod("getLong", Object.class, cls);
                } catch (Throwable th) {
                    th = th;
                    Logger logger = Logger.getLogger(a5f.class.getName());
                    Level level = Level.WARNING;
                    String valueOf = String.valueOf(th);
                    cls2 = cls6;
                    StringBuilder sb = new StringBuilder(valueOf.length() + 71);
                    sb.append("platform method missing - proto runtime falling back to safer methods: ");
                    sb.append(valueOf);
                    logger.logp(level, "com.google.protobuf.UnsafeUtil", "supportsUnsafeByteBufferOperations", sb.toString());
                    z = false;
                    d = z;
                    unsafe2 = a;
                    if (unsafe2 == null) {
                    }
                    z2 = true;
                    e = z3;
                    f = f(byte[].class);
                    f(boolean[].class);
                    i(boolean[].class);
                    f(int[].class);
                    i(int[].class);
                    f(long[].class);
                    i(long[].class);
                    f(float[].class);
                    i(float[].class);
                    f(double[].class);
                    i(double[].class);
                    f(Object[].class);
                    i(Object[].class);
                    m = m();
                    if (m != null) {
                    }
                    g = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN ? z2 : false;
                }
            } catch (Throwable th2) {
                th = th2;
                cls = cls5;
            }
            if (m() != null) {
                if (!aje.a()) {
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
                z = true;
                d = z;
                unsafe2 = a;
                if (unsafe2 == null) {
                    z3 = false;
                } else {
                    try {
                        cls4 = unsafe2.getClass();
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
                            z2 = true;
                            try {
                                clsArr2[1] = cls;
                                cls4.getMethod("getObject", clsArr2);
                                Class<?>[] clsArr3 = new Class[3];
                                clsArr3[0] = Object.class;
                                clsArr3[1] = cls;
                                clsArr3[2] = Object.class;
                                cls4.getMethod("putObject", clsArr3);
                            } catch (Throwable th3) {
                                th = th3;
                                Logger logger2 = Logger.getLogger(a5f.class.getName());
                                Level level2 = Level.WARNING;
                                String valueOf2 = String.valueOf(th);
                                StringBuilder sb2 = new StringBuilder(valueOf2.length() + 71);
                                sb2.append("platform method missing - proto runtime falling back to safer methods: ");
                                sb2.append(valueOf2);
                                logger2.logp(level2, "com.google.protobuf.UnsafeUtil", "supportsUnsafeArrayOperations", sb2.toString());
                                z3 = false;
                                e = z3;
                                f = f(byte[].class);
                                f(boolean[].class);
                                i(boolean[].class);
                                f(int[].class);
                                i(int[].class);
                                f(long[].class);
                                i(long[].class);
                                f(float[].class);
                                i(float[].class);
                                f(double[].class);
                                i(double[].class);
                                f(Object[].class);
                                i(Object[].class);
                                m = m();
                                if (m != null) {
                                }
                                g = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN ? z2 : false;
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            z2 = true;
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        z2 = true;
                    }
                    if (!aje.a()) {
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
                        z2 = true;
                        clsArr10[1] = cls;
                        cls4.getMethod("getDouble", clsArr10);
                        cls4.getMethod("putDouble", Object.class, cls, Double.TYPE);
                        z3 = true;
                        e = z3;
                        f = f(byte[].class);
                        f(boolean[].class);
                        i(boolean[].class);
                        f(int[].class);
                        i(int[].class);
                        f(long[].class);
                        i(long[].class);
                        f(float[].class);
                        i(float[].class);
                        f(double[].class);
                        i(double[].class);
                        f(Object[].class);
                        i(Object[].class);
                        m = m();
                        if (m != null && (cacVar = c) != null) {
                            cacVar.a.objectFieldOffset(m);
                        }
                        g = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN ? z2 : false;
                    }
                    z3 = true;
                }
                z2 = true;
                e = z3;
                f = f(byte[].class);
                f(boolean[].class);
                i(boolean[].class);
                f(int[].class);
                i(int[].class);
                f(long[].class);
                i(long[].class);
                f(float[].class);
                i(float[].class);
                f(double[].class);
                i(double[].class);
                f(Object[].class);
                i(Object[].class);
                m = m();
                if (m != null) {
                    cacVar.a.objectFieldOffset(m);
                }
                g = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN ? z2 : false;
            }
        }
        cls2 = cls6;
        z = false;
        d = z;
        unsafe2 = a;
        if (unsafe2 == null) {
        }
        z2 = true;
        e = z3;
        f = f(byte[].class);
        f(boolean[].class);
        i(boolean[].class);
        f(int[].class);
        i(int[].class);
        f(long[].class);
        i(long[].class);
        f(float[].class);
        i(float[].class);
        f(double[].class);
        i(double[].class);
        f(Object[].class);
        i(Object[].class);
        m = m();
        if (m != null) {
        }
        g = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN ? z2 : false;
    }

    public static byte a(long j, byte[] bArr) {
        return c.j(f + j, bArr);
    }

    public static int b(long j, Object obj) {
        return c.a.getInt(obj, j);
    }

    public static void c(long j, Object obj, int i) {
        c.a.putInt(obj, j, i);
    }

    public static void d(long j, Object obj, Object obj2) {
        c.a.putObject(obj, j, obj2);
    }

    public static void e(byte[] bArr, long j, byte b2) {
        c.l(f + j, bArr, b2);
    }

    public static int f(Class cls) {
        if (e) {
            return c.a.arrayBaseOffset(cls);
        }
        return -1;
    }

    public static long g(long j, Object obj) {
        return c.a.getLong(obj, j);
    }

    public static void h(long j, Object obj, byte b2) {
        long j2 = (-4) & j;
        int b3 = b(j2, obj);
        int i = ((~((int) j)) & 3) << 3;
        c(j2, obj, (b3 & (~(jn7.d4 << i))) | ((b2 & 255) << i));
    }

    public static void i(Class cls) {
        if (e) {
            c.a.arrayIndexScale(cls);
        }
    }

    public static void j(Object obj, long j, byte b2) {
        long j2 = (-4) & j;
        int i = (((int) j) & 3) << 3;
        c(j2, obj, (b(j2, obj) & (~(jn7.d4 << i))) | ((b2 & 255) << i));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean k(Class cls) {
        if (!aje.a()) {
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

    public static Object l(Object obj, long j) {
        return c.a.getObject(obj, j);
    }

    public static Field m() {
        Field field;
        Field field2;
        if (aje.a()) {
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

    public static byte n(long j, Object obj) {
        return (byte) (b((-4) & j, obj) >>> ((int) (((~j) & 3) << 3)));
    }

    public static byte o(long j, Object obj) {
        return (byte) (b((-4) & j, obj) >>> ((int) ((j & 3) << 3)));
    }
}
