package com.google.android.gms.common.api.internal;

import android.os.Looper;
import java.lang.ref.WeakReference;
import java.util.concurrent.locks.Lock;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class w implements p6.b {
    public final WeakReference a;
    public final com.google.android.gms.common.api.e b;
    public final boolean c;

    public w(b0 b0Var, com.google.android.gms.common.api.e eVar, boolean z10) {
        this.a = new WeakReference(b0Var);
        this.b = eVar;
        this.c = z10;
    }

    @Override // p6.b
    public final void a(m6.a aVar) {
        b0 b0Var = (b0) this.a.get();
        if (b0Var == null) {
            return;
        }
        Lock lock = b0Var.b;
        p6.m.i("onReportServiceBinding must be called on the GoogleApiClient handler thread", Looper.myLooper() == b0Var.a.o.h);
        lock.lock();
        try {
            if (b0Var.i(0)) {
                if (!aVar.c()) {
                    b0Var.e(aVar, this.b, this.c);
                }
                if (b0Var.j()) {
                    b0Var.c();
                }
            }
        } finally {
            lock.unlock();
        }
    }
}
