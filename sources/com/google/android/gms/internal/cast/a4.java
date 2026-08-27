package com.google.android.gms.internal.cast;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class a4 extends g7.p5 {
    @Override // g7.p5
    public final y3 a(e4 e4Var) {
        y3 y3Var;
        y3 y3Var2 = y3.d;
        synchronized (e4Var) {
            try {
                y3Var = e4Var.b;
                if (y3Var != y3Var2) {
                    e4Var.b = y3Var2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return y3Var;
    }

    @Override // g7.p5
    public final d4 b(e4 e4Var) {
        d4 d4Var;
        d4 d4Var2 = d4.c;
        synchronized (e4Var) {
            try {
                d4Var = e4Var.c;
                if (d4Var != d4Var2) {
                    e4Var.c = d4Var2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return d4Var;
    }

    @Override // g7.p5
    public final void c(d4 d4Var, d4 d4Var2) {
        d4Var.b = d4Var2;
    }

    @Override // g7.p5
    public final void d(d4 d4Var, Thread thread) {
        d4Var.a = thread;
    }

    @Override // g7.p5
    public final boolean e(e4 e4Var, Object obj, Object obj2) {
        synchronized (e4Var) {
            try {
                if (e4Var.a != obj) {
                    return false;
                }
                e4Var.a = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // g7.p5
    public final boolean f(e4 e4Var, d4 d4Var, d4 d4Var2) {
        synchronized (e4Var) {
            try {
                if (e4Var.c != d4Var) {
                    return false;
                }
                e4Var.c = d4Var2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
