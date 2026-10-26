package com.google.android.gms.internal.play_billing;

import a8.sa;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class i0 extends sa {
    @Override // a8.sa
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

    @Override // a8.sa
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

    @Override // a8.sa
    public final void c(k0 k0Var, k0 k0Var2) {
        k0Var.b = k0Var2;
    }

    @Override // a8.sa
    public final void d(k0 k0Var, Thread thread) {
        k0Var.a = thread;
    }

    @Override // a8.sa
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

    @Override // a8.sa
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

    @Override // a8.sa
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
