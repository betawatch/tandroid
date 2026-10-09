package com.google.android.gms.internal.cast;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public final class b4 extends v7.p5 {
    @Override // v7.p5
    public final z3 a(f4 f4Var) {
        z3 z3Var;
        z3 z3Var2 = z3.d;
        synchronized (f4Var) {
            try {
                z3Var = f4Var.b;
                if (z3Var != z3Var2) {
                    f4Var.b = z3Var2;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z3Var;
    }

    @Override // v7.p5
    public final e4 b(f4 f4Var) {
        e4 e4Var;
        e4 e4Var2 = e4.c;
        synchronized (f4Var) {
            try {
                e4Var = f4Var.c;
                if (e4Var != e4Var2) {
                    f4Var.c = e4Var2;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return e4Var;
    }

    @Override // v7.p5
    public final void c(e4 e4Var, e4 e4Var2) {
        e4Var.b = e4Var2;
    }

    @Override // v7.p5
    public final void d(e4 e4Var, Thread thread) {
        e4Var.a = thread;
    }

    @Override // v7.p5
    public final boolean e(f4 f4Var, z3 z3Var, z3 z3Var2) {
        synchronized (f4Var) {
            try {
                if (f4Var.b != z3Var) {
                    return false;
                }
                f4Var.b = z3Var2;
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // v7.p5
    public final boolean f(f4 f4Var, Object obj, Object obj2) {
        synchronized (f4Var) {
            try {
                if (f4Var.a != obj) {
                    return false;
                }
                f4Var.a = obj2;
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // v7.p5
    public final boolean g(f4 f4Var, e4 e4Var, e4 e4Var2) {
        synchronized (f4Var) {
            try {
                if (f4Var.c != e4Var) {
                    return false;
                }
                f4Var.c = e4Var2;
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
