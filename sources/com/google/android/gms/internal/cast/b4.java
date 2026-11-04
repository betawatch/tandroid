package com.google.android.gms.internal.cast;

import b8.ga;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class b4 extends ga {
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
            unsafe = (Unsafe) AccessController.doPrivileged(new a4());
        }
        try {
            c = unsafe.objectFieldOffset(d4.class.getDeclaredField("c"));
            b = unsafe.objectFieldOffset(d4.class.getDeclaredField("b"));
            d = unsafe.objectFieldOffset(d4.class.getDeclaredField("a"));
            e = unsafe.objectFieldOffset(c4.class.getDeclaredField("a"));
            f = unsafe.objectFieldOffset(c4.class.getDeclaredField("b"));
            a = unsafe;
        } catch (NoSuchFieldException e11) {
            throw new RuntimeException(e11);
        } catch (RuntimeException e12) {
            throw e12;
        }
    }

    @Override // b8.ga
    public final x3 a(d4 d4Var) {
        x3 x3Var;
        x3 x3Var2 = x3.d;
        do {
            x3Var = d4Var.b;
            if (x3Var2 == x3Var) {
                break;
            }
        } while (!e(d4Var, x3Var, x3Var2));
        return x3Var;
    }

    @Override // b8.ga
    public final c4 b(d4 d4Var) {
        c4 c4Var;
        c4 c4Var2 = c4.c;
        do {
            c4Var = d4Var.c;
            if (c4Var2 == c4Var) {
                break;
            }
        } while (!g(d4Var, c4Var, c4Var2));
        return c4Var;
    }

    @Override // b8.ga
    public final void c(c4 c4Var, c4 c4Var2) {
        a.putObject(c4Var, f, c4Var2);
    }

    @Override // b8.ga
    public final void d(c4 c4Var, Thread thread) {
        a.putObject(c4Var, e, thread);
    }

    @Override // b8.ga
    public final boolean e(d4 d4Var, x3 x3Var, x3 x3Var2) {
        return f4.a(a, d4Var, b, x3Var, x3Var2);
    }

    @Override // b8.ga
    public final boolean f(d4 d4Var, Object obj, Object obj2) {
        return f4.a(a, d4Var, d, obj, obj2);
    }

    @Override // b8.ga
    public final boolean g(d4 d4Var, c4 c4Var, c4 c4Var2) {
        return f4.a(a, d4Var, c, c4Var, c4Var2);
    }
}
