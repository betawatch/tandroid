package com.google.android.gms.internal.cast;

import a8.ja;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class y3 extends ja {
    @Override // a8.ja
    public final w3 a(c4 c4Var) {
        w3 w3Var;
        w3 w3Var2 = w3.d;
        synchronized (c4Var) {
            try {
                w3Var = c4Var.b;
                if (w3Var != w3Var2) {
                    c4Var.b = w3Var2;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return w3Var;
    }

    @Override // a8.ja
    public final b4 b(c4 c4Var) {
        b4 b4Var;
        b4 b4Var2 = b4.c;
        synchronized (c4Var) {
            try {
                b4Var = c4Var.c;
                if (b4Var != b4Var2) {
                    c4Var.c = b4Var2;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return b4Var;
    }

    @Override // a8.ja
    public final void c(b4 b4Var, b4 b4Var2) {
        b4Var.b = b4Var2;
    }

    @Override // a8.ja
    public final void d(b4 b4Var, Thread thread) {
        b4Var.a = thread;
    }

    @Override // a8.ja
    public final boolean e(c4 c4Var, w3 w3Var, w3 w3Var2) {
        synchronized (c4Var) {
            try {
                if (c4Var.b != w3Var) {
                    return false;
                }
                c4Var.b = w3Var2;
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // a8.ja
    public final boolean f(c4 c4Var, Object obj, Object obj2) {
        synchronized (c4Var) {
            try {
                if (c4Var.a != obj) {
                    return false;
                }
                c4Var.a = obj2;
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // a8.ja
    public final boolean g(c4 c4Var, b4 b4Var, b4 b4Var2) {
        synchronized (c4Var) {
            try {
                if (c4Var.c != b4Var) {
                    return false;
                }
                c4Var.c = b4Var2;
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
