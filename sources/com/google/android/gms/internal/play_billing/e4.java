package com.google.android.gms.internal.play_billing;

import b8.ua;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class e4 extends ua {
    @Override // b8.ua
    public final void a(f4 f4Var, f4 f4Var2) {
        f4Var.b = f4Var2;
    }

    @Override // b8.ua
    public final void b(f4 f4Var, Thread thread) {
        f4Var.a = thread;
    }

    @Override // b8.ua
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

    @Override // b8.ua
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

    @Override // b8.ua
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
