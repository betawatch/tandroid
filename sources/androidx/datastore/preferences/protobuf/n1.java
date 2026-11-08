package androidx.datastore.preferences.protobuf;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.telegram.messenger.qs;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public abstract class n1 {
    public static final Unsafe a;
    public static final Class b;
    public static final m1 c;
    public static final boolean d;
    public static final boolean e;
    public static final long f;
    public static final boolean g;

    static {
        Unsafe i7 = i();
        a = i7;
        b = c.a;
        boolean h = h(Long.TYPE);
        boolean h7 = h(Integer.TYPE);
        m1 m1Var = null;
        if (i7 != null) {
            if (!c.a()) {
                m1Var = new l1(i7);
            } else if (h) {
                m1Var = new k1(i7, 1);
            } else if (h7) {
                m1Var = new k1(i7, 0);
            }
        }
        c = m1Var;
        d = m1Var == null ? false : m1Var.r();
        e = m1Var == null ? false : m1Var.q();
        f = e(byte[].class);
        e(boolean[].class);
        f(boolean[].class);
        e(int[].class);
        f(int[].class);
        e(long[].class);
        f(long[].class);
        e(float[].class);
        f(float[].class);
        e(double[].class);
        f(double[].class);
        e(Object[].class);
        f(Object[].class);
        Field g10 = g();
        if (g10 != null && m1Var != null) {
            m1Var.i(g10);
        }
        g = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    public static void a(Throwable th2) {
        Logger.getLogger(n1.class.getName()).log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th2);
    }

    public static boolean b(Object obj, long j3) {
        return ((byte) ((c.f(obj, (-4) & j3) >>> ((int) (((~j3) & 3) << 3))) & qs.e4)) != 0;
    }

    public static boolean c(Object obj, long j3) {
        return ((byte) ((c.f(obj, (-4) & j3) >>> ((int) ((j3 & 3) << 3))) & qs.e4)) != 0;
    }

    public static Object d(Class cls) {
        try {
            return a.allocateInstance(cls);
        } catch (InstantiationException e10) {
            throw new IllegalStateException(e10);
        }
    }

    public static int e(Class cls) {
        if (e) {
            return c.a(cls);
        }
        return -1;
    }

    public static void f(Class cls) {
        if (e) {
            c.b(cls);
        }
    }

    public static Field g() {
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
    public static boolean h(Class cls) {
        if (!c.a()) {
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

    public static Unsafe i() {
        try {
            return (Unsafe) AccessController.doPrivileged(new j1());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void j(byte[] bArr, long j3, byte b10) {
        c.k(bArr, f + j3, b10);
    }

    public static void k(Object obj, long j3, byte b10) {
        long j10 = (-4) & j3;
        int f10 = c.f(obj, j10);
        int i7 = ((~((int) j3)) & 3) << 3;
        m(j10, obj, ((255 & b10) << i7) | (f10 & (~(qs.e4 << i7))));
    }

    public static void l(Object obj, long j3, byte b10) {
        long j10 = (-4) & j3;
        int i7 = (((int) j3) & 3) << 3;
        m(j10, obj, ((255 & b10) << i7) | (c.f(obj, j10) & (~(qs.e4 << i7))));
    }

    public static void m(long j3, Object obj, int i7) {
        c.n(j3, obj, i7);
    }

    public static void n(Object obj, long j3, long j10) {
        c.o(obj, j3, j10);
    }

    public static void o(Object obj, long j3, Object obj2) {
        c.p(obj, j3, obj2);
    }
}
