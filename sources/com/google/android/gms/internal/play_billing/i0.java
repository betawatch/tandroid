package com.google.android.gms.internal.play_billing;

import g7.y5;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class i0 extends y5 {
    @Override // g7.y5
    public final f0 a(w0 w0Var) {
        f0 f0Var;
        f0 f0Var2 = f0.d;
        synchronized (w0Var) {
            try {
                f0Var = w0Var.b;
                if (f0Var != f0Var2) {
                    w0Var.b = f0Var2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f0Var;
    }

    @Override // g7.y5
    public final k0 b(w0 w0Var) {
        k0 k0Var;
        k0 k0Var2 = k0.c;
        synchronized (w0Var) {
            try {
                k0Var = w0Var.c;
                if (k0Var != k0Var2) {
                    w0Var.c = k0Var2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return k0Var;
    }

    @Override // g7.y5
    public final void c(k0 k0Var, k0 k0Var2) {
        k0Var.b = k0Var2;
    }

    @Override // g7.y5
    public final void d(k0 k0Var, Thread thread) {
        k0Var.a = thread;
    }

    @Override // g7.y5
    public final boolean e(w0 w0Var, f0 f0Var, f0 f0Var2) {
        synchronized (w0Var) {
            try {
                if (w0Var.b != f0Var) {
                    return false;
                }
                w0Var.b = f0Var2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // g7.y5
    public final boolean f(l0 l0Var, Object obj, Object obj2) {
        synchronized (l0Var) {
            try {
                if (l0Var.a != obj) {
                    return false;
                }
                l0Var.a = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // g7.y5
    public final boolean g(l0 l0Var, k0 k0Var, k0 k0Var2) {
        synchronized (l0Var) {
            try {
                if (l0Var.c != k0Var) {
                    return false;
                }
                l0Var.c = k0Var2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
