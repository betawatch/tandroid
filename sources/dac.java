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
public abstract class dac {
    public static final Unsafe a;
    public static final Class b;
    public static final cac c;
    public static final boolean d;
    public static final boolean e;
    public static final long f;
    public static final boolean g;

    static {
        Unsafe unsafe;
        cac cacVar = null;
        try {
            unsafe = (Unsafe) AccessController.doPrivileged(new r2((byte) 1));
        } catch (Throwable unused) {
            unsafe = null;
        }
        a = unsafe;
        b = xj.a;
        boolean d2 = d(Long.TYPE);
        boolean d3 = d(Integer.TYPE);
        if (unsafe != null) {
            if (!xj.a()) {
                cacVar = new bac(unsafe);
            } else if (d2) {
                cacVar = new aac(unsafe, (byte) 1);
            } else if (d3) {
                cacVar = new aac(unsafe, (byte) 0);
            }
        }
        c = cacVar;
        d = cacVar == null ? false : cacVar.i();
        e = cacVar == null ? false : cacVar.h();
        f = a(byte[].class);
        a(boolean[].class);
        b(boolean[].class);
        a(int[].class);
        b(int[].class);
        a(long[].class);
        b(long[].class);
        a(float[].class);
        b(float[].class);
        a(double[].class);
        b(double[].class);
        a(Object[].class);
        b(Object[].class);
        Field c2 = c();
        if (c2 != null && cacVar != null) {
            cacVar.a.objectFieldOffset(c2);
        }
        g = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    public static int a(Class cls) {
        if (e) {
            return c.a.arrayBaseOffset(cls);
        }
        return -1;
    }

    public static void b(Class cls) {
        if (e) {
            c.a.arrayIndexScale(cls);
        }
    }

    public static Field c() {
        Field field;
        Field field2;
        if (xj.a()) {
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
    public static boolean d(Class cls) {
        if (!xj.a()) {
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

    public static boolean e(long j, Object obj) {
        return ((byte) ((f((-4) & j, obj) >>> ((int) (((~j) & 3) << 3))) & jn7.d4)) != 0;
    }

    public static int f(long j, Object obj) {
        return c.a.getInt(obj, j);
    }

    public static long g(long j, Object obj) {
        return c.a.getLong(obj, j);
    }

    public static Object h(long j, Object obj) {
        return c.a.getObject(obj, j);
    }

    public static void i(Throwable th) {
        Logger.getLogger(dac.class.getName()).log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th);
    }

    public static void j(byte[] bArr, long j, byte b2) {
        c.e(f + j, bArr, b2);
    }

    public static void k(long j, Object obj, byte b2) {
        long j2 = (-4) & j;
        int f2 = f(j2, obj);
        int i = ((~((int) j)) & 3) << 3;
        m(j2, obj, (f2 & (~(jn7.d4 << i))) | ((b2 & 255) << i));
    }

    public static void l(long j, Object obj, byte b2) {
        long j2 = (-4) & j;
        int i = (((int) j) & 3) << 3;
        m(j2, obj, (f(j2, obj) & (~(jn7.d4 << i))) | ((b2 & 255) << i));
    }

    public static void m(long j, Object obj, int i) {
        c.a.putInt(obj, j, i);
    }

    public static void n(Object obj, long j, long j2) {
        c.a.putLong(obj, j, j2);
    }

    public static void o(long j, Object obj, Object obj2) {
        c.a.putObject(obj, j, obj2);
    }
}
