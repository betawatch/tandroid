package com.google.android.gms.internal.play_billing;

import v7.c6;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes.dex */
public final class f4 extends c6 {
    @Override // v7.c6
    public final void a(g4 g4Var, g4 g4Var2) {
        g4Var.b = g4Var2;
    }

    @Override // v7.c6
    public final void b(g4 g4Var, Thread thread) {
        g4Var.a = thread;
    }

    @Override // v7.c6
    public final boolean c(h4 h4Var, v2 v2Var, v2 v2Var2) {
        synchronized (h4Var) {
            try {
                if (h4Var.b != v2Var) {
                    return false;
                }
                h4Var.b = v2Var2;
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // v7.c6
    public final boolean d(h4 h4Var, Object obj, Object obj2) {
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

    @Override // v7.c6
    public final boolean e(h4 h4Var, g4 g4Var, g4 g4Var2) {
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
