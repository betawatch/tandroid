package com.google.android.gms.internal.play_billing;

import f7.b6;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class e4 extends b6 {
    @Override // f7.b6
    public final void a(f4 f4Var, f4 f4Var2) {
        f4Var.b = f4Var2;
    }

    @Override // f7.b6
    public final void b(f4 f4Var, Thread thread) {
        f4Var.a = thread;
    }

    @Override // f7.b6
    public final boolean c(g4 g4Var, v2 v2Var, v2 v2Var2) {
        synchronized (g4Var) {
            try {
                if (g4Var.b != v2Var) {
                    return false;
                }
                g4Var.b = v2Var2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // f7.b6
    public final boolean d(g4 g4Var, Object obj, Object obj2) {
        synchronized (g4Var) {
            try {
                if (g4Var.a != obj) {
                    return false;
                }
                g4Var.a = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // f7.b6
    public final boolean e(g4 g4Var, f4 f4Var, f4 f4Var2) {
        synchronized (g4Var) {
            try {
                if (g4Var.c != f4Var) {
                    return false;
                }
                g4Var.c = f4Var2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
