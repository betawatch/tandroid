package com.google.android.gms.internal.cast;

import java.security.AccessController;
import java.security.PrivilegedActionException;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class f4 extends v7.o5 {
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
            unsafe = (Unsafe) AccessController.doPrivileged(new e4());
        }
        try {
            c = unsafe.objectFieldOffset(h4.class.getDeclaredField("c"));
            b = unsafe.objectFieldOffset(h4.class.getDeclaredField("b"));
            d = unsafe.objectFieldOffset(h4.class.getDeclaredField("a"));
            e = unsafe.objectFieldOffset(g4.class.getDeclaredField("a"));
            f = unsafe.objectFieldOffset(g4.class.getDeclaredField("b"));
            a = unsafe;
        } catch (NoSuchFieldException e10) {
            throw new RuntimeException(e10);
        } catch (RuntimeException e11) {
            throw e11;
        }
    }

    @Override // v7.o5
    public final b4 a(h4 h4Var) {
        b4 b4Var;
        b4 b4Var2 = b4.d;
        do {
            b4Var = h4Var.b;
            if (b4Var2 == b4Var) {
                break;
            }
        } while (!e(h4Var, b4Var, b4Var2));
        return b4Var;
    }

    @Override // v7.o5
    public final g4 b(h4 h4Var) {
        g4 g4Var;
        g4 g4Var2 = g4.c;
        do {
            g4Var = h4Var.c;
            if (g4Var2 == g4Var) {
                break;
            }
        } while (!g(h4Var, g4Var, g4Var2));
        return g4Var;
    }

    @Override // v7.o5
    public final void c(g4 g4Var, g4 g4Var2) {
        a.putObject(g4Var, f, g4Var2);
    }

    @Override // v7.o5
    public final void d(g4 g4Var, Thread thread) {
        a.putObject(g4Var, e, thread);
    }

    @Override // v7.o5
    public final boolean e(h4 h4Var, b4 b4Var, b4 b4Var2) {
        return j4.a(a, h4Var, b, b4Var, b4Var2);
    }

    @Override // v7.o5
    public final boolean f(h4 h4Var, Object obj, Object obj2) {
        return j4.a(a, h4Var, d, obj, obj2);
    }

    @Override // v7.o5
    public final boolean g(h4 h4Var, g4 g4Var, g4 g4Var2) {
        return j4.a(a, h4Var, c, g4Var, g4Var2);
    }
}
