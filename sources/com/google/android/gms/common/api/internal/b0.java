package com.google.android.gms.common.api.internal;

import android.os.Looper;
import java.lang.ref.WeakReference;
import java.util.concurrent.locks.Lock;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
public final class b0 implements n6.b {
    public final WeakReference a;
    public final com.google.android.gms.common.api.e b;
    public final boolean c;

    public b0(g0 g0Var, com.google.android.gms.common.api.e eVar, boolean z10) {
        this.a = new WeakReference(g0Var);
        this.b = eVar;
        this.c = z10;
    }

    @Override // n6.b
    public final void a(k6.a aVar) {
        g0 g0Var = (g0) this.a.get();
        if (g0Var == null) {
            return;
        }
        Lock lock = g0Var.b;
        n6.l.j("onReportServiceBinding must be called on the GoogleApiClient handler thread", Looper.myLooper() == g0Var.a.o.h);
        lock.lock();
        try {
            if (g0Var.i(0)) {
                if (!aVar.c()) {
                    g0Var.g(aVar, this.b, this.c);
                }
                if (g0Var.j()) {
                    g0Var.h();
                }
            }
        } finally {
            lock.unlock();
        }
    }
}
