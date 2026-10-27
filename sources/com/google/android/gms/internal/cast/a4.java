package com.google.android.gms.internal.cast;

import a8.ja;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class a4 extends ja {
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
            unsafe = (Unsafe) AccessController.doPrivileged(new z3());
        }
        try {
            c = unsafe.objectFieldOffset(c4.class.getDeclaredField("c"));
            b = unsafe.objectFieldOffset(c4.class.getDeclaredField("b"));
            d = unsafe.objectFieldOffset(c4.class.getDeclaredField("a"));
            e = unsafe.objectFieldOffset(b4.class.getDeclaredField("a"));
            f = unsafe.objectFieldOffset(b4.class.getDeclaredField("b"));
            a = unsafe;
        } catch (NoSuchFieldException e11) {
            throw new RuntimeException(e11);
        } catch (RuntimeException e12) {
            throw e12;
        }
    }

    @Override // a8.ja
    public final w3 a(c4 c4Var) {
        w3 w3Var;
        w3 w3Var2 = w3.d;
        do {
            w3Var = c4Var.b;
            if (w3Var2 == w3Var) {
                break;
            }
        } while (!e(c4Var, w3Var, w3Var2));
        return w3Var;
    }

    @Override // a8.ja
    public final b4 b(c4 c4Var) {
        b4 b4Var;
        b4 b4Var2 = b4.c;
        do {
            b4Var = c4Var.c;
            if (b4Var2 == b4Var) {
                break;
            }
        } while (!g(c4Var, b4Var, b4Var2));
        return b4Var;
    }

    @Override // a8.ja
    public final void c(b4 b4Var, b4 b4Var2) {
        a.putObject(b4Var, f, b4Var2);
    }

    @Override // a8.ja
    public final void d(b4 b4Var, Thread thread) {
        a.putObject(b4Var, e, thread);
    }

    @Override // a8.ja
    public final boolean e(c4 c4Var, w3 w3Var, w3 w3Var2) {
        return e4.a(a, c4Var, b, w3Var, w3Var2);
    }

    @Override // a8.ja
    public final boolean f(c4 c4Var, Object obj, Object obj2) {
        return e4.a(a, c4Var, d, obj, obj2);
    }

    @Override // a8.ja
    public final boolean g(c4 c4Var, b4 b4Var, b4 b4Var2) {
        return e4.a(a, c4Var, c, b4Var, b4Var2);
    }
}
