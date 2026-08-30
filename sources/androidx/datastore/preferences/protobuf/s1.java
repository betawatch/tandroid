package androidx.datastore.preferences.protobuf;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public abstract class s1 {
    public static final Logger a = Logger.getLogger(s1.class.getName());
    public static final Unsafe b;
    public static final Class c;
    public static final r1 d;
    public static final boolean e;
    public static final boolean f;
    public static final long g;
    public static final boolean h;

    /* JADX WARN: Removed duplicated region for block: B:15:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x010f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    static {
        Class<?> cls;
        boolean z4;
        Unsafe unsafe;
        boolean z10;
        Class<?> cls2;
        Field d10;
        r1 r1Var;
        Unsafe i10 = i();
        b = i10;
        c = c.a;
        Class<?> cls3 = Long.TYPE;
        boolean e6 = e(cls3);
        Class<?> cls4 = Integer.TYPE;
        boolean e10 = e(cls4);
        r1 r1Var2 = null;
        if (i10 != null) {
            if (!c.a()) {
                r1Var2 = new q1(i10);
            } else if (e6) {
                r1Var2 = new p1(i10, 1);
            } else if (e10) {
                r1Var2 = new p1(i10, 0);
            }
        }
        d = r1Var2;
        Class<?> cls5 = Byte.TYPE;
        if (i10 != null) {
            try {
                cls = i10.getClass();
                cls.getMethod("objectFieldOffset", Field.class);
                cls.getMethod("getLong", Object.class, cls3);
            } catch (Throwable th2) {
                a.log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th2);
            }
            if (d() != null) {
                if (!c.a()) {
                    cls.getMethod("getByte", cls3);
                    cls.getMethod("putByte", cls3, cls5);
                    cls.getMethod("getInt", cls3);
                    cls.getMethod("putInt", cls3, cls4);
                    cls.getMethod("getLong", cls3);
                    cls.getMethod("putLong", cls3, cls3);
                    cls.getMethod("copyMemory", cls3, cls3, cls3);
                    cls.getMethod("copyMemory", Object.class, cls3, Object.class, cls3, cls3);
                }
                z4 = true;
                e = z4;
                unsafe = b;
                if (unsafe != null) {
                    z10 = false;
                } else {
                    try {
                        cls2 = unsafe.getClass();
                        cls2.getMethod("objectFieldOffset", Field.class);
                        cls2.getMethod("arrayBaseOffset", Class.class);
                        cls2.getMethod("arrayIndexScale", Class.class);
                        cls2.getMethod("getInt", Object.class, cls3);
                        cls2.getMethod("putInt", Object.class, cls3, cls4);
                        cls2.getMethod("getLong", Object.class, cls3);
                        cls2.getMethod("putLong", Object.class, cls3, cls3);
                        Class<?>[] clsArr = new Class[2];
                        clsArr[0] = Object.class;
                        try {
                            clsArr[1] = cls3;
                            cls2.getMethod("getObject", clsArr);
                            Class<?>[] clsArr2 = new Class[3];
                            clsArr2[0] = Object.class;
                            clsArr2[1] = cls3;
                            clsArr2[2] = Object.class;
                            cls2.getMethod("putObject", clsArr2);
                        } catch (Throwable th3) {
                            th = th3;
                            a.log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th);
                            z10 = false;
                            f = z10;
                            g = b(byte[].class);
                            b(boolean[].class);
                            c(boolean[].class);
                            b(int[].class);
                            c(int[].class);
                            b(long[].class);
                            c(long[].class);
                            b(float[].class);
                            c(float[].class);
                            b(double[].class);
                            c(double[].class);
                            b(Object[].class);
                            c(Object[].class);
                            d10 = d();
                            if (d10 != null) {
                            }
                            h = ByteOrder.nativeOrder() != ByteOrder.BIG_ENDIAN;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                    }
                    if (!c.a()) {
                        Class<?>[] clsArr3 = new Class[2];
                        clsArr3[0] = Object.class;
                        clsArr3[1] = cls3;
                        cls2.getMethod("getByte", clsArr3);
                        Class<?>[] clsArr4 = new Class[3];
                        clsArr4[0] = Object.class;
                        clsArr4[1] = cls3;
                        clsArr4[2] = cls5;
                        cls2.getMethod("putByte", clsArr4);
                        Class<?>[] clsArr5 = new Class[2];
                        clsArr5[0] = Object.class;
                        clsArr5[1] = cls3;
                        cls2.getMethod("getBoolean", clsArr5);
                        Class<?>[] clsArr6 = new Class[3];
                        clsArr6[0] = Object.class;
                        clsArr6[1] = cls3;
                        clsArr6[2] = Boolean.TYPE;
                        cls2.getMethod("putBoolean", clsArr6);
                        Class<?>[] clsArr7 = new Class[2];
                        clsArr7[0] = Object.class;
                        clsArr7[1] = cls3;
                        cls2.getMethod("getFloat", clsArr7);
                        Class<?>[] clsArr8 = new Class[3];
                        clsArr8[0] = Object.class;
                        clsArr8[1] = cls3;
                        clsArr8[2] = Float.TYPE;
                        cls2.getMethod("putFloat", clsArr8);
                        Class<?>[] clsArr9 = new Class[2];
                        clsArr9[0] = Object.class;
                        clsArr9[1] = cls3;
                        cls2.getMethod("getDouble", clsArr9);
                        cls2.getMethod("putDouble", Object.class, cls3, Double.TYPE);
                        z10 = true;
                        f = z10;
                        g = b(byte[].class);
                        b(boolean[].class);
                        c(boolean[].class);
                        b(int[].class);
                        c(int[].class);
                        b(long[].class);
                        c(long[].class);
                        b(float[].class);
                        c(float[].class);
                        b(double[].class);
                        c(double[].class);
                        b(Object[].class);
                        c(Object[].class);
                        d10 = d();
                        if (d10 != null && (r1Var = d) != null) {
                            r1Var.j(d10);
                        }
                        h = ByteOrder.nativeOrder() != ByteOrder.BIG_ENDIAN;
                    }
                    z10 = true;
                }
                f = z10;
                g = b(byte[].class);
                b(boolean[].class);
                c(boolean[].class);
                b(int[].class);
                c(int[].class);
                b(long[].class);
                c(long[].class);
                b(float[].class);
                c(float[].class);
                b(double[].class);
                c(double[].class);
                b(Object[].class);
                c(Object[].class);
                d10 = d();
                if (d10 != null) {
                    r1Var.j(d10);
                }
                h = ByteOrder.nativeOrder() != ByteOrder.BIG_ENDIAN;
            }
        }
        z4 = false;
        e = z4;
        unsafe = b;
        if (unsafe != null) {
        }
        f = z10;
        g = b(byte[].class);
        b(boolean[].class);
        c(boolean[].class);
        b(int[].class);
        c(int[].class);
        b(long[].class);
        c(long[].class);
        b(float[].class);
        c(float[].class);
        b(double[].class);
        c(double[].class);
        b(Object[].class);
        c(Object[].class);
        d10 = d();
        if (d10 != null) {
        }
        h = ByteOrder.nativeOrder() != ByteOrder.BIG_ENDIAN;
    }

    public static Object a(Class cls) {
        try {
            return b.allocateInstance(cls);
        } catch (InstantiationException e6) {
            throw new IllegalStateException(e6);
        }
    }

    public static int b(Class cls) {
        if (f) {
            return d.a(cls);
        }
        return -1;
    }

    public static void c(Class cls) {
        if (f) {
            d.b(cls);
        }
    }

    public static Field d() {
        Field field;
        Field field2;
        if (c.a()) {
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

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean e(Class cls) {
        if (!c.a()) {
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

    public static byte f(long j10, byte[] bArr) {
        return d.d(bArr, g + j10);
    }

    public static byte g(Object obj, long j10) {
        return (byte) ((d.g(obj, (-4) & j10) >>> ((int) (((~j10) & 3) << 3))) & 255);
    }

    public static byte h(Object obj, long j10) {
        return (byte) ((d.g(obj, (-4) & j10) >>> ((int) ((j10 & 3) << 3))) & 255);
    }

    public static Unsafe i() {
        try {
            return (Unsafe) AccessController.doPrivileged(new o1());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void j(byte[] bArr, long j10, byte b10) {
        d.l(bArr, g + j10, b10);
    }

    public static void k(Object obj, long j10, byte b10) {
        long j11 = (-4) & j10;
        int g10 = d.g(obj, j11);
        int i10 = ((~((int) j10)) & 3) << 3;
        m(j11, obj, ((255 & b10) << i10) | (g10 & (~(255 << i10))));
    }

    public static void l(Object obj, long j10, byte b10) {
        long j11 = (-4) & j10;
        int i10 = (((int) j10) & 3) << 3;
        m(j11, obj, ((255 & b10) << i10) | (d.g(obj, j11) & (~(255 << i10))));
    }

    public static void m(long j10, Object obj, int i10) {
        d.o(j10, obj, i10);
    }

    public static void n(Object obj, long j10, long j11) {
        d.p(obj, j10, j11);
    }

    public static void o(Object obj, long j10, Object obj2) {
        d.q(obj, j10, obj2);
    }
}
