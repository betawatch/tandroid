package com.google.android.gms.common.api.internal;

import android.os.Looper;
import java.lang.ref.WeakReference;
import java.util.concurrent.locks.Lock;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class b0 implements x5.b {
    public final WeakReference a;
    public final com.google.android.gms.common.api.e b;
    public final boolean c;

    public b0(g0 g0Var, com.google.android.gms.common.api.e eVar, boolean z10) {
        this.a = new WeakReference(g0Var);
        this.b = eVar;
        this.c = z10;
    }

    @Override // x5.b
    public final void a(u5.a aVar) {
        g0 g0Var = (g0) this.a.get();
        if (g0Var == null) {
            return;
        }
        Lock lock = g0Var.b;
        x5.l.j("onReportServiceBinding must be called on the GoogleApiClient handler thread", Looper.myLooper() == g0Var.a.o.h);
        lock.lock();
        try {
            if (g0Var.h(0)) {
                if (!aVar.c()) {
                    g0Var.f(aVar, this.b, this.c);
                }
                if (g0Var.i()) {
                    g0Var.g();
                }
            }
        } finally {
            lock.unlock();
        }
    }
}
