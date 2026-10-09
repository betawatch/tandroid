package com.google.android.gms.internal.cast;

import java.security.AccessController;
import java.security.PrivilegedActionException;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public final class d4 extends v7.p5 {
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
            } catch (PrivilegedActionException e7) {
                throw new RuntimeException("Could not initialize intrinsics", e7.getCause());
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

    @Override // v7.p5
    public final z3 a(f4 f4Var) {
        z3 z3Var;
        z3 z3Var2 = z3.d;
        do {
            z3Var = f4Var.b;
            if (z3Var2 == z3Var) {
                break;
            }
        } while (!e(f4Var, z3Var, z3Var2));
        return z3Var;
    }

    @Override // v7.p5
    public final e4 b(f4 f4Var) {
        e4 e4Var;
        e4 e4Var2 = e4.c;
        do {
            e4Var = f4Var.c;
            if (e4Var2 == e4Var) {
                break;
            }
        } while (!g(f4Var, e4Var, e4Var2));
        return e4Var;
    }

    @Override // v7.p5
    public final void c(e4 e4Var, e4 e4Var2) {
        a.putObject(e4Var, f, e4Var2);
    }

    @Override // v7.p5
    public final void d(e4 e4Var, Thread thread) {
        a.putObject(e4Var, e, thread);
    }

    @Override // v7.p5
    public final boolean e(f4 f4Var, z3 z3Var, z3 z3Var2) {
        return h4.a(a, f4Var, b, z3Var, z3Var2);
    }

    @Override // v7.p5
    public final boolean f(f4 f4Var, Object obj, Object obj2) {
        return h4.a(a, f4Var, d, obj, obj2);
    }

    @Override // v7.p5
    public final boolean g(f4 f4Var, e4 e4Var, e4 e4Var2) {
        return h4.a(a, f4Var, c, e4Var, e4Var2);
    }
}
