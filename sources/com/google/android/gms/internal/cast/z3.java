package com.google.android.gms.internal.cast;

import b8.ga;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class z3 extends ga {
    @Override // b8.ga
    public final x3 a(d4 d4Var) {
        x3 x3Var;
        x3 x3Var2 = x3.d;
        synchronized (d4Var) {
            try {
                x3Var = d4Var.b;
                if (x3Var != x3Var2) {
                    d4Var.b = x3Var2;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return x3Var;
    }

    @Override // b8.ga
    public final c4 b(d4 d4Var) {
        c4 c4Var;
        c4 c4Var2 = c4.c;
        synchronized (d4Var) {
            try {
                c4Var = d4Var.c;
                if (c4Var != c4Var2) {
                    d4Var.c = c4Var2;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c4Var;
    }

    @Override // b8.ga
    public final void c(c4 c4Var, c4 c4Var2) {
        c4Var.b = c4Var2;
    }

    @Override // b8.ga
    public final void d(c4 c4Var, Thread thread) {
        c4Var.a = thread;
    }

    @Override // b8.ga
    public final boolean e(d4 d4Var, x3 x3Var, x3 x3Var2) {
        synchronized (d4Var) {
            try {
                if (d4Var.b != x3Var) {
                    return false;
                }
                d4Var.b = x3Var2;
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // b8.ga
    public final boolean f(d4 d4Var, Object obj, Object obj2) {
        synchronized (d4Var) {
            try {
                if (d4Var.a != obj) {
                    return false;
                }
                d4Var.a = obj2;
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // b8.ga
    public final boolean g(d4 d4Var, c4 c4Var, c4 c4Var2) {
        synchronized (d4Var) {
            try {
                if (d4Var.c != c4Var) {
                    return false;
                }
                d4Var.c = c4Var2;
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
