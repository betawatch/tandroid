// default package

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import libcore.io.Memory;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public abstract class nfe {
    public static final Unsafe a;
    public static final Class b;
    public static final c6c c;
    public static final boolean d;
    public static final boolean e;
    public static final long f;
    public static final boolean g;

    /* JADX WARN: Removed duplicated region for block: B:22:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008b  */
    static {
        Unsafe unsafe;
        boolean z;
        c6c c6cVar;
        boolean z2;
        Field b2;
        c6c c6cVar2;
        zee zeeVar = null;
        try {
            unsafe = (Unsafe) AccessController.doPrivileged(new q2((byte) 4));
        } catch (Throwable unused) {
            unsafe = null;
        }
        a = unsafe;
        int i = esd.a;
        b = Memory.class;
        Class<?> cls = Long.TYPE;
        boolean l = l(cls);
        Class<?> cls2 = Integer.TYPE;
        boolean l2 = l(cls2);
        char c2 = 1;
        byte b3 = 0;
        if (unsafe != null) {
            if (l) {
                zeeVar = new zee(unsafe, c2 == true ? 1 : 0);
            } else if (l2) {
                zeeVar = new zee(unsafe, b3);
            }
        }
        c = zeeVar;
        if (zeeVar != null) {
            try {
                Class<?> cls3 = zeeVar.a.getClass();
                cls3.getMethod("objectFieldOffset", Field.class);
                cls3.getMethod("getLong", Object.class, cls);
            } catch (Throwable th) {
                Logger.getLogger(nfe.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th.toString()));
            }
            if (b() != null) {
                z = true;
                d = z;
                c6cVar = c;
                if (c6cVar != null) {
                    try {
                        Class<?> cls4 = c6cVar.a.getClass();
                        cls4.getMethod("objectFieldOffset", Field.class);
                        cls4.getMethod("arrayBaseOffset", Class.class);
                        cls4.getMethod("arrayIndexScale", Class.class);
                        cls4.getMethod("getInt", Object.class, cls);
                        cls4.getMethod("putInt", Object.class, cls, cls2);
                        cls4.getMethod("getLong", Object.class, cls);
                        cls4.getMethod("putLong", Object.class, cls, cls);
                        cls4.getMethod("getObject", Object.class, cls);
                        cls4.getMethod("putObject", Object.class, cls, Object.class);
                        z2 = true;
                    } catch (Throwable th2) {
                        Logger.getLogger(nfe.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th2.toString()));
                    }
                    e = z2;
                    f = m(byte[].class);
                    m(boolean[].class);
                    a(boolean[].class);
                    m(int[].class);
                    a(int[].class);
                    m(long[].class);
                    a(long[].class);
                    m(float[].class);
                    a(float[].class);
                    m(double[].class);
                    a(double[].class);
                    m(Object[].class);
                    a(Object[].class);
                    b2 = b();
                    if (b2 != null && (c6cVar2 = c) != null) {
                        c6cVar2.a.objectFieldOffset(b2);
                    }
                    g = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
                }
                z2 = false;
                e = z2;
                f = m(byte[].class);
                m(boolean[].class);
                a(boolean[].class);
                m(int[].class);
                a(int[].class);
                m(long[].class);
                a(long[].class);
                m(float[].class);
                a(float[].class);
                m(double[].class);
                a(double[].class);
                m(Object[].class);
                a(Object[].class);
                b2 = b();
                if (b2 != null) {
                    c6cVar2.a.objectFieldOffset(b2);
                }
                g = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
            }
        }
        z = false;
        d = z;
        c6cVar = c;
        if (c6cVar != null) {
        }
        z2 = false;
        e = z2;
        f = m(byte[].class);
        m(boolean[].class);
        a(boolean[].class);
        m(int[].class);
        a(int[].class);
        m(long[].class);
        a(long[].class);
        m(float[].class);
        a(float[].class);
        m(double[].class);
        a(double[].class);
        m(Object[].class);
        a(Object[].class);
        b2 = b();
        if (b2 != null) {
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
        int i = esd.a;
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

    public static void c(Object obj, long j, byte b2) {
        Unsafe unsafe = c.a;
        long j2 = (-4) & j;
        int i = unsafe.getInt(obj, j2);
        int i2 = ((~((int) j)) & 3) << 3;
        unsafe.putInt(obj, j2, (i & (~(kk7.d4 << i2))) | ((b2 & 255) << i2));
    }

    public static void d(Object obj, long j, byte b2) {
        Unsafe unsafe = c.a;
        long j2 = (-4) & j;
        int i = (((int) j) & 3) << 3;
        unsafe.putInt(obj, j2, (unsafe.getInt(obj, j2) & (~(kk7.d4 << i))) | ((b2 & 255) << i));
    }

    public static int e(Object obj, long j) {
        return c.a.getInt(obj, j);
    }

    public static long f(Object obj, long j) {
        return c.a.getLong(obj, j);
    }

    public static Object g(Object obj, long j) {
        return c.a.getObject(obj, j);
    }

    public static void h(Object obj, long j, int i) {
        c.a.putInt(obj, j, i);
    }

    public static void i(Object obj, long j, Object obj2) {
        c.a.putObject(obj, j, obj2);
    }

    public static /* bridge */ /* synthetic */ boolean j(Object obj, long j) {
        return ((byte) ((c.a.getInt(obj, (-4) & j) >>> ((int) (((~j) & 3) << 3))) & kk7.d4)) != 0;
    }

    public static /* bridge */ /* synthetic */ boolean k(Object obj, long j) {
        return ((byte) ((c.a.getInt(obj, (-4) & j) >>> ((int) ((j & 3) << 3))) & kk7.d4)) != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean l(Class cls) {
        int i = esd.a;
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

    public static int m(Class cls) {
        if (e) {
            return c.a.arrayBaseOffset(cls);
        }
        return -1;
    }
}
