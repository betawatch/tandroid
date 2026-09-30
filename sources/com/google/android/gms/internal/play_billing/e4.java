package com.google.android.gms.internal.play_billing;

import v7.b6;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes.dex */
public final class e4 extends b6 {
    @Override // v7.b6
    public final void a(f4 f4Var, f4 f4Var2) {
        f4Var.b = f4Var2;
    }

    @Override // v7.b6
    public final void b(f4 f4Var, Thread thread) {
        f4Var.a = thread;
    }

    @Override // v7.b6
    public final boolean c(g4 g4Var, v2 v2Var, v2 v2Var2) {
        synchronized (g4Var) {
            try {
                if (g4Var.b != v2Var) {
                    return false;
                }
                g4Var.b = v2Var2;
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // v7.b6
    public final boolean d(g4 g4Var, Object obj, Object obj2) {
        synchronized (g4Var) {
            try {
                if (g4Var.a != obj) {
                    return false;
                }
                g4Var.a = obj2;
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // v7.b6
    public final boolean e(g4 g4Var, f4 f4Var, f4 f4Var2) {
        synchronized (g4Var) {
            try {
                if (g4Var.c != f4Var) {
                    return false;
                }
                g4Var.c = f4Var2;
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
