package com.google.android.gms.internal.play_billing;

import j7.q6;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class i0 extends q6 {
    @Override // j7.q6
    public final f0 a(w0 w0Var) {
        f0 f0Var;
        f0 f0Var2 = f0.d;
        synchronized (w0Var) {
            try {
                f0Var = w0Var.b;
                if (f0Var != f0Var2) {
                    w0Var.b = f0Var2;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f0Var;
    }

    @Override // j7.q6
    public final k0 b(w0 w0Var) {
        k0 k0Var;
        k0 k0Var2 = k0.c;
        synchronized (w0Var) {
            try {
                k0Var = w0Var.c;
                if (k0Var != k0Var2) {
                    w0Var.c = k0Var2;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return k0Var;
    }

    @Override // j7.q6
    public final void c(k0 k0Var, k0 k0Var2) {
        k0Var.b = k0Var2;
    }

    @Override // j7.q6
    public final void d(k0 k0Var, Thread thread) {
        k0Var.a = thread;
    }

    @Override // j7.q6
    public final boolean e(w0 w0Var, f0 f0Var, f0 f0Var2) {
        synchronized (w0Var) {
            try {
                if (w0Var.b != f0Var) {
                    return false;
                }
                w0Var.b = f0Var2;
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // j7.q6
    public final boolean f(l0 l0Var, Object obj, Object obj2) {
        synchronized (l0Var) {
            try {
                if (l0Var.a != obj) {
                    return false;
                }
                l0Var.a = obj2;
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // j7.q6
    public final boolean g(l0 l0Var, k0 k0Var, k0 k0Var2) {
        synchronized (l0Var) {
            try {
                if (l0Var.c != k0Var) {
                    return false;
                }
                l0Var.c = k0Var2;
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
