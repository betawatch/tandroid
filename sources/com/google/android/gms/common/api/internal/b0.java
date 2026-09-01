package com.google.android.gms.common.api.internal;

import android.os.Looper;
import java.lang.ref.WeakReference;
import java.util.concurrent.locks.Lock;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final class b0 implements b6.b {
    public final WeakReference a;
    public final com.google.android.gms.common.api.e b;
    public final boolean c;

    public b0(g0 g0Var, com.google.android.gms.common.api.e eVar, boolean z4) {
        this.a = new WeakReference(g0Var);
        this.b = eVar;
        this.c = z4;
    }

    @Override // b6.b
    public final void a(y5.a aVar) {
        g0 g0Var = (g0) this.a.get();
        if (g0Var == null) {
            return;
        }
        Lock lock = g0Var.b;
        b6.m.j("onReportServiceBinding must be called on the GoogleApiClient handler thread", Looper.myLooper() == g0Var.a.o.h);
        lock.lock();
        try {
            if (g0Var.j(0)) {
                if (!aVar.f()) {
                    g0Var.h(aVar, this.b, this.c);
                }
                if (g0Var.k()) {
                    g0Var.i();
                }
            }
        } finally {
            lock.unlock();
        }
    }
}
