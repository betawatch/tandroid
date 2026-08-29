package com.google.android.gms.internal.play_billing;

import h7.o6;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class d4 extends o6 {
    @Override // h7.o6
    public final void a(e4 e4Var, e4 e4Var2) {
        e4Var.b = e4Var2;
    }

    @Override // h7.o6
    public final void b(e4 e4Var, Thread thread) {
        e4Var.a = thread;
    }

    @Override // h7.o6
    public final boolean c(f4 f4Var, u2 u2Var, u2 u2Var2) {
        synchronized (f4Var) {
            try {
                if (f4Var.b != u2Var) {
                    return false;
                }
                f4Var.b = u2Var2;
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // h7.o6
    public final boolean d(f4 f4Var, Object obj, Object obj2) {
        synchronized (f4Var) {
            try {
                if (f4Var.a != obj) {
                    return false;
                }
                f4Var.a = obj2;
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // h7.o6
    public final boolean e(f4 f4Var, e4 e4Var, e4 e4Var2) {
        synchronized (f4Var) {
            try {
                if (f4Var.c != e4Var) {
                    return false;
                }
                f4Var.c = e4Var2;
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
