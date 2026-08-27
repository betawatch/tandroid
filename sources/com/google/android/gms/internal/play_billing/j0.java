package com.google.android.gms.internal.play_billing;

import g7.y5;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class j0 extends y5 {
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
            } catch (PrivilegedActionException e9) {
                throw new RuntimeException("Could not initialize intrinsics", e9.getCause());
            }
        } catch (SecurityException unused) {
            unsafe = (Unsafe) AccessController.doPrivileged(new o0());
        }
        try {
            c = unsafe.objectFieldOffset(l0.class.getDeclaredField("c"));
            b = unsafe.objectFieldOffset(l0.class.getDeclaredField("b"));
            d = unsafe.objectFieldOffset(l0.class.getDeclaredField("a"));
            e = unsafe.objectFieldOffset(k0.class.getDeclaredField("a"));
            f = unsafe.objectFieldOffset(k0.class.getDeclaredField("b"));
            a = unsafe;
        } catch (NoSuchFieldException e10) {
            throw new RuntimeException(e10);
        }
    }

    @Override // g7.y5
    public final f0 a(w0 w0Var) {
        f0 f0Var;
        f0 f0Var2 = f0.d;
        do {
            f0Var = w0Var.b;
            if (f0Var2 == f0Var) {
                break;
            }
        } while (!e(w0Var, f0Var, f0Var2));
        return f0Var;
    }

    @Override // g7.y5
    public final k0 b(w0 w0Var) {
        k0 k0Var;
        k0 k0Var2 = k0.c;
        do {
            k0Var = w0Var.c;
            if (k0Var2 == k0Var) {
                break;
            }
        } while (!g(w0Var, k0Var, k0Var2));
        return k0Var;
    }

    @Override // g7.y5
    public final void c(k0 k0Var, k0 k0Var2) {
        a.putObject(k0Var, f, k0Var2);
    }

    @Override // g7.y5
    public final void d(k0 k0Var, Thread thread) {
        a.putObject(k0Var, e, thread);
    }

    @Override // g7.y5
    public final boolean e(w0 w0Var, f0 f0Var, f0 f0Var2) {
        return n0.a(a, w0Var, b, f0Var, f0Var2);
    }

    @Override // g7.y5
    public final boolean f(l0 l0Var, Object obj, Object obj2) {
        return n0.a(a, l0Var, d, obj, obj2);
    }

    @Override // g7.y5
    public final boolean g(l0 l0Var, k0 k0Var, k0 k0Var2) {
        return n0.a(a, l0Var, c, k0Var, k0Var2);
    }
}
