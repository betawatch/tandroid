package androidx.datastore.preferences.protobuf;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.telegram.messenger.hs;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
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
        Unsafe i3 = i();
        a = i3;
        b = c.a;
        boolean h = h(Long.TYPE);
        boolean h7 = h(Integer.TYPE);
        m1 m1Var = null;
        if (i3 != null) {
            if (!c.a()) {
                m1Var = new l1(i3);
            } else if (h) {
                m1Var = new k1(i3, 1);
            } else if (h7) {
                m1Var = new k1(i3, 0);
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
        Field g7 = g();
        if (g7 != null && m1Var != null) {
            m1Var.i(g7);
        }
        g = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    public static void a(Throwable th2) {
        Logger.getLogger(n1.class.getName()).log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th2);
    }

    public static boolean b(Object obj, long j10) {
        return ((byte) ((c.f(obj, (-4) & j10) >>> ((int) (((~j10) & 3) << 3))) & hs.e4)) != 0;
    }

    public static boolean c(Object obj, long j10) {
        return ((byte) ((c.f(obj, (-4) & j10) >>> ((int) ((j10 & 3) << 3))) & hs.e4)) != 0;
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

    public static void j(byte[] bArr, long j10, byte b10) {
        c.k(bArr, f + j10, b10);
    }

    public static void k(Object obj, long j10, byte b10) {
        long j11 = (-4) & j10;
        int f10 = c.f(obj, j11);
        int i3 = ((~((int) j10)) & 3) << 3;
        m(j11, obj, ((255 & b10) << i3) | (f10 & (~(hs.e4 << i3))));
    }

    public static void l(Object obj, long j10, byte b10) {
        long j11 = (-4) & j10;
        int i3 = (((int) j10) & 3) << 3;
        m(j11, obj, ((255 & b10) << i3) | (c.f(obj, j11) & (~(hs.e4 << i3))));
    }

    public static void m(long j10, Object obj, int i3) {
        c.n(j10, obj, i3);
    }

    public static void n(Object obj, long j10, long j11) {
        c.o(obj, j10, j11);
    }

    public static void o(Object obj, long j10, Object obj2) {
        c.p(obj, j10, obj2);
    }
}
