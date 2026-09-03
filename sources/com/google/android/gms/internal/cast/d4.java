package com.google.android.gms.internal.cast;

import java.security.AccessController;
import java.security.PrivilegedActionException;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class d4 extends j7.a6 {
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
            } catch (PrivilegedActionException e6) {
                throw new RuntimeException("Could not initialize intrinsics", e6.getCause());
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
        } catch (NoSuchFieldException e10) {
            throw new RuntimeException(e10);
        } catch (RuntimeException e11) {
            throw e11;
        }
    }

    @Override // j7.a6
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

    @Override // j7.a6
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

    @Override // j7.a6
    public final void c(e4 e4Var, e4 e4Var2) {
        a.putObject(e4Var, f, e4Var2);
    }

    @Override // j7.a6
    public final void d(e4 e4Var, Thread thread) {
        a.putObject(e4Var, e, thread);
    }

    @Override // j7.a6
    public final boolean e(f4 f4Var, Object obj, Object obj2) {
        return h4.a(a, f4Var, d, obj, obj2);
    }

    @Override // j7.a6
    public final boolean f(f4 f4Var, e4 e4Var, e4 e4Var2) {
        return h4.a(a, f4Var, c, e4Var, e4Var2);
    }
}
