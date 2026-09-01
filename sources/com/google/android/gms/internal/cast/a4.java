package com.google.android.gms.internal.cast;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final class a4 extends j7.y5 {
    @Override // j7.y5
    public final y3 a(e4 e4Var) {
        y3 y3Var;
        y3 y3Var2 = y3.d;
        synchronized (e4Var) {
            try {
                y3Var = e4Var.b;
                if (y3Var != y3Var2) {
                    e4Var.b = y3Var2;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return y3Var;
    }

    @Override // j7.y5
    public final d4 b(e4 e4Var) {
        d4 d4Var;
        d4 d4Var2 = d4.c;
        synchronized (e4Var) {
            try {
                d4Var = e4Var.c;
                if (d4Var != d4Var2) {
                    e4Var.c = d4Var2;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return d4Var;
    }

    @Override // j7.y5
    public final void c(d4 d4Var, d4 d4Var2) {
        d4Var.b = d4Var2;
    }

    @Override // j7.y5
    public final void d(d4 d4Var, Thread thread) {
        d4Var.a = thread;
    }

    @Override // j7.y5
    public final boolean e(e4 e4Var, Object obj, Object obj2) {
        synchronized (e4Var) {
            try {
                if (e4Var.a != obj) {
                    return false;
                }
                e4Var.a = obj2;
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // j7.y5
    public final boolean f(e4 e4Var, d4 d4Var, d4 d4Var2) {
        synchronized (e4Var) {
            try {
                if (e4Var.c != d4Var) {
                    return false;
                }
                e4Var.c = d4Var2;
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
