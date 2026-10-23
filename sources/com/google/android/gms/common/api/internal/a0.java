package com.google.android.gms.common.api.internal;

import android.os.Looper;
import java.lang.ref.WeakReference;
import java.util.concurrent.locks.Lock;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes.dex */
public final class a0 implements n6.b {
    public final WeakReference a;
    public final com.google.android.gms.common.api.e b;
    public final boolean c;

    public a0(f0 f0Var, com.google.android.gms.common.api.e eVar, boolean z10) {
        this.a = new WeakReference(f0Var);
        this.b = eVar;
        this.c = z10;
    }

    @Override // n6.b
    public final void a(k6.a aVar) {
        f0 f0Var = (f0) this.a.get();
        if (f0Var == null) {
            return;
        }
        Lock lock = f0Var.b;
        n6.l.j("onReportServiceBinding must be called on the GoogleApiClient handler thread", Looper.myLooper() == f0Var.a.o.h);
        lock.lock();
        try {
            if (f0Var.i(0)) {
                if (!aVar.c()) {
                    f0Var.g(aVar, this.b, this.c);
                }
                if (f0Var.j()) {
                    f0Var.h();
                }
            }
        } finally {
            lock.unlock();
        }
    }
}
