package com.google.android.gms.internal.cast;

import java.security.AccessController;
import java.security.PrivilegedActionException;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class c4 extends v7.r5 {
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
            unsafe = (Unsafe) AccessController.doPrivileged(new b4());
        }
        try {
            c = unsafe.objectFieldOffset(e4.class.getDeclaredField("c"));
            b = unsafe.objectFieldOffset(e4.class.getDeclaredField("b"));
            d = unsafe.objectFieldOffset(e4.class.getDeclaredField("a"));
            e = unsafe.objectFieldOffset(d4.class.getDeclaredField("a"));
            f = unsafe.objectFieldOffset(d4.class.getDeclaredField("b"));
            a = unsafe;
        } catch (NoSuchFieldException e10) {
            throw new RuntimeException(e10);
        } catch (RuntimeException e11) {
            throw e11;
        }
    }

    @Override // v7.r5
    public final y3 a(e4 e4Var) {
        y3 y3Var;
        y3 y3Var2 = y3.d;
        do {
            y3Var = e4Var.b;
            if (y3Var2 == y3Var) {
                break;
            }
        } while (!e(e4Var, y3Var, y3Var2));
        return y3Var;
    }

    @Override // v7.r5
    public final d4 b(e4 e4Var) {
        d4 d4Var;
        d4 d4Var2 = d4.c;
        do {
            d4Var = e4Var.c;
            if (d4Var2 == d4Var) {
                break;
            }
        } while (!g(e4Var, d4Var, d4Var2));
        return d4Var;
    }

    @Override // v7.r5
    public final void c(d4 d4Var, d4 d4Var2) {
        a.putObject(d4Var, f, d4Var2);
    }

    @Override // v7.r5
    public final void d(d4 d4Var, Thread thread) {
        a.putObject(d4Var, e, thread);
    }

    @Override // v7.r5
    public final boolean e(e4 e4Var, y3 y3Var, y3 y3Var2) {
        return g4.a(a, e4Var, b, y3Var, y3Var2);
    }

    @Override // v7.r5
    public final boolean f(e4 e4Var, Object obj, Object obj2) {
        return g4.a(a, e4Var, d, obj, obj2);
    }

    @Override // v7.r5
    public final boolean g(e4 e4Var, d4 d4Var, d4 d4Var2) {
        return g4.a(a, e4Var, c, d4Var, d4Var2);
    }
}
