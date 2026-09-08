package com.google.android.gms.internal.play_billing;

import v7.z5;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class e4 extends z5 {
    @Override // v7.z5
    public final void a(f4 f4Var, f4 f4Var2) {
        f4Var.b = f4Var2;
    }

    @Override // v7.z5
    public final void b(f4 f4Var, Thread thread) {
        f4Var.a = thread;
    }

    @Override // v7.z5
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

    @Override // v7.z5
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

    @Override // v7.z5
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
