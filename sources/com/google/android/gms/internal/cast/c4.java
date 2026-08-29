package com.google.android.gms.internal.cast;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class c4 extends h7.x5 {
    @Override // h7.x5
    public final a4 a(g4 g4Var) {
        a4 a4Var;
        a4 a4Var2 = a4.d;
        synchronized (g4Var) {
            try {
                a4Var = g4Var.b;
                if (a4Var != a4Var2) {
                    g4Var.b = a4Var2;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return a4Var;
    }

    @Override // h7.x5
    public final f4 b(g4 g4Var) {
        f4 f4Var;
        f4 f4Var2 = f4.c;
        synchronized (g4Var) {
            try {
                f4Var = g4Var.c;
                if (f4Var != f4Var2) {
                    g4Var.c = f4Var2;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f4Var;
    }

    @Override // h7.x5
    public final void c(f4 f4Var, f4 f4Var2) {
        f4Var.b = f4Var2;
    }

    @Override // h7.x5
    public final void d(f4 f4Var, Thread thread) {
        f4Var.a = thread;
    }

    @Override // h7.x5
    public final boolean e(g4 g4Var, Object obj, Object obj2) {
        synchronized (g4Var) {
            try {
                if (g4Var.a != obj) {
                    return false;
                }
                g4Var.a = obj2;
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // h7.x5
    public final boolean f(g4 g4Var, f4 f4Var, f4 f4Var2) {
        synchronized (g4Var) {
            try {
                if (g4Var.c != f4Var) {
                    return false;
                }
                g4Var.c = f4Var2;
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
