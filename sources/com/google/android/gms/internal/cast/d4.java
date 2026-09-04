package com.google.android.gms.internal.cast;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public final class d4 extends v7.o5 {
    @Override // v7.o5
    public final b4 a(h4 h4Var) {
        b4 b4Var;
        b4 b4Var2 = b4.d;
        synchronized (h4Var) {
            try {
                b4Var = h4Var.b;
                if (b4Var != b4Var2) {
                    h4Var.b = b4Var2;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return b4Var;
    }

    @Override // v7.o5
    public final g4 b(h4 h4Var) {
        g4 g4Var;
        g4 g4Var2 = g4.c;
        synchronized (h4Var) {
            try {
                g4Var = h4Var.c;
                if (g4Var != g4Var2) {
                    h4Var.c = g4Var2;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return g4Var;
    }

    @Override // v7.o5
    public final void c(g4 g4Var, g4 g4Var2) {
        g4Var.b = g4Var2;
    }

    @Override // v7.o5
    public final void d(g4 g4Var, Thread thread) {
        g4Var.a = thread;
    }

    @Override // v7.o5
    public final boolean e(h4 h4Var, b4 b4Var, b4 b4Var2) {
        synchronized (h4Var) {
            try {
                if (h4Var.b != b4Var) {
                    return false;
                }
                h4Var.b = b4Var2;
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // v7.o5
    public final boolean f(h4 h4Var, Object obj, Object obj2) {
        synchronized (h4Var) {
            try {
                if (h4Var.a != obj) {
                    return false;
                }
                h4Var.a = obj2;
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // v7.o5
    public final boolean g(h4 h4Var, g4 g4Var, g4 g4Var2) {
        synchronized (h4Var) {
            try {
                if (h4Var.c != g4Var) {
                    return false;
                }
                h4Var.c = g4Var2;
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
