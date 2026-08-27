package com.google.android.gms.internal.play_billing;

import g7.a6;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class d4 extends a6 {
    @Override // g7.a6
    public final void a(e4 e4Var, e4 e4Var2) {
        e4Var.b = e4Var2;
    }

    @Override // g7.a6
    public final void b(e4 e4Var, Thread thread) {
        e4Var.a = thread;
    }

    @Override // g7.a6
    public final boolean c(f4 f4Var, u2 u2Var, u2 u2Var2) {
        synchronized (f4Var) {
            try {
                if (f4Var.b != u2Var) {
                    return false;
                }
                f4Var.b = u2Var2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // g7.a6
    public final boolean d(f4 f4Var, Object obj, Object obj2) {
        synchronized (f4Var) {
            try {
                if (f4Var.a != obj) {
                    return false;
                }
                f4Var.a = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // g7.a6
    public final boolean e(f4 f4Var, e4 e4Var, e4 e4Var2) {
        synchronized (f4Var) {
            try {
                if (f4Var.c != e4Var) {
                    return false;
                }
                f4Var.c = e4Var2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
