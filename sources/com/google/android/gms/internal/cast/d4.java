package com.google.android.gms.internal.cast;

import java.security.AccessController;
import java.security.PrivilegedActionException;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class d4 extends f7.q5 {
    public static final Unsafe a;
    public static final long b;
    public static final long c;
    public static final long d;
    public static final long e;
    public static final long f;

    static {
        Unsafe unsafe;
        try {
            try {
                unsafe = Unsafe.getUnsafe();
            } catch (PrivilegedActionException e10) {
                throw new RuntimeException("Could not initialize intrinsics", e10.getCause());
            }
        } catch (SecurityException unused) {
            unsafe = (Unsafe) AccessController.doPrivileged(new c4());
        }
        try {
            c = unsafe.objectFieldOffset(f4.class.getDeclaredField("c"));
            b = unsafe.objectFieldOffset(f4.class.getDeclaredField("b"));
            d = unsafe.objectFieldOffset(f4.class.getDeclaredField("a"));
            e = unsafe.objectFieldOffset(e4.class.getDeclaredField("a"));
            f = unsafe.objectFieldOffset(e4.class.getDeclaredField("b"));
            a = unsafe;
        } catch (NoSuchFieldException e11) {
            throw new RuntimeException(e11);
        } catch (RuntimeException e12) {
            throw e12;
        }
    }

    @Override // f7.q5
    public final z3 a(f4 f4Var) {
        z3 z3Var;
        z3 z3Var2 = z3.d;
        while (true) {
            z3Var = f4Var.b;
            if (z3Var2 == z3Var) {
                break;
            }
            f4 f4Var2 = f4Var;
            if (h4.a(a, f4Var2, b, z3Var, z3Var2)) {
                break;
            }
            f4Var = f4Var2;
        }
        return z3Var;
    }

    @Override // f7.q5
    public final e4 b(f4 f4Var) {
        e4 e4Var;
        e4 e4Var2 = e4.c;
        do {
            e4Var = f4Var.c;
            if (e4Var2 == e4Var) {
                break;
            }
        } while (!f(f4Var, e4Var, e4Var2));
        return e4Var;
    }

    @Override // f7.q5
    public final void c(e4 e4Var, e4 e4Var2) {
        a.putObject(e4Var, f, e4Var2);
    }

    @Override // f7.q5
    public final void d(e4 e4Var, Thread thread) {
        a.putObject(e4Var, e, thread);
    }

    @Override // f7.q5
    public final boolean e(f4 f4Var, Object obj, Object obj2) {
        return h4.a(a, f4Var, d, obj, obj2);
    }

    @Override // f7.q5
    public final boolean f(f4 f4Var, e4 e4Var, e4 e4Var2) {
        return h4.a(a, f4Var, c, e4Var, e4Var2);
    }
}
