package com.google.android.gms.internal.cast;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class b4 extends f7.q5 {
    @Override // f7.q5
    public final z3 a(f4 f4Var) {
        z3 z3Var;
        z3 z3Var2 = z3.d;
        synchronized (f4Var) {
            try {
                z3Var = f4Var.b;
                if (z3Var != z3Var2) {
                    f4Var.b = z3Var2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z3Var;
    }

    @Override // f7.q5
    public final e4 b(f4 f4Var) {
        e4 e4Var;
        e4 e4Var2 = e4.c;
        synchronized (f4Var) {
            try {
                e4Var = f4Var.c;
                if (e4Var != e4Var2) {
                    f4Var.c = e4Var2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return e4Var;
    }

    @Override // f7.q5
    public final void c(e4 e4Var, e4 e4Var2) {
        e4Var.b = e4Var2;
    }

    @Override // f7.q5
    public final void d(e4 e4Var, Thread thread) {
        e4Var.a = thread;
    }

    @Override // f7.q5
    public final boolean e(f4 f4Var, Object obj, Object obj2) {
        synchronized (f4Var) {
            try {
                if (f4Var.a != obj) {
                    return false;
                }
                f4Var.a = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // f7.q5
    public final boolean f(f4 f4Var, e4 e4Var, e4 e4Var2) {
        synchronized (f4Var) {
            try {
                if (f4Var.c != e4Var) {
                    return false;
                }
                f4Var.c = e4Var2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
