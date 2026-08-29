package com.google.android.gms.internal.cast;

import java.security.AccessController;
import java.security.PrivilegedActionException;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class e4 extends h7.x5 {
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
            unsafe = (Unsafe) AccessController.doPrivileged(new d4());
        }
        try {
            c = unsafe.objectFieldOffset(g4.class.getDeclaredField("c"));
            b = unsafe.objectFieldOffset(g4.class.getDeclaredField("b"));
            d = unsafe.objectFieldOffset(g4.class.getDeclaredField("a"));
            e = unsafe.objectFieldOffset(f4.class.getDeclaredField("a"));
            f = unsafe.objectFieldOffset(f4.class.getDeclaredField("b"));
            a = unsafe;
        } catch (NoSuchFieldException e11) {
            throw new RuntimeException(e11);
        } catch (RuntimeException e12) {
            throw e12;
        }
    }

    @Override // h7.x5
    public final a4 a(g4 g4Var) {
        a4 a4Var;
        a4 a4Var2 = a4.d;
        while (true) {
            a4Var = g4Var.b;
            if (a4Var2 == a4Var) {
                break;
            }
            g4 g4Var2 = g4Var;
            if (i4.a(a, g4Var2, b, a4Var, a4Var2)) {
                break;
            }
            g4Var = g4Var2;
        }
        return a4Var;
    }

    @Override // h7.x5
    public final f4 b(g4 g4Var) {
        f4 f4Var;
        f4 f4Var2 = f4.c;
        do {
            f4Var = g4Var.c;
            if (f4Var2 == f4Var) {
                break;
            }
        } while (!f(g4Var, f4Var, f4Var2));
        return f4Var;
    }

    @Override // h7.x5
    public final void c(f4 f4Var, f4 f4Var2) {
        a.putObject(f4Var, f, f4Var2);
    }

    @Override // h7.x5
    public final void d(f4 f4Var, Thread thread) {
        a.putObject(f4Var, e, thread);
    }

    @Override // h7.x5
    public final boolean e(g4 g4Var, Object obj, Object obj2) {
        return i4.a(a, g4Var, d, obj, obj2);
    }

    @Override // h7.x5
    public final boolean f(g4 g4Var, f4 f4Var, f4 f4Var2) {
        return i4.a(a, g4Var, c, f4Var, f4Var2);
    }
}
