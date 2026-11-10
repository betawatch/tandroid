package com.google.android.gms.common.api.internal;

import android.os.Looper;
import java.lang.ref.WeakReference;
import java.util.concurrent.locks.Lock;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final class w implements q6.b {
    public final WeakReference a;
    public final com.google.android.gms.common.api.e b;
    public final boolean c;

    public w(b0 b0Var, com.google.android.gms.common.api.e eVar, boolean z9) {
        this.a = new WeakReference(b0Var);
        this.b = eVar;
        this.c = z9;
    }

    @Override // q6.b
    public final void a(n6.a aVar) {
        b0 b0Var = (b0) this.a.get();
        if (b0Var == null) {
            return;
        }
        Lock lock = b0Var.b;
        q6.m.i("onReportServiceBinding must be called on the GoogleApiClient handler thread", Looper.myLooper() == b0Var.a.o.h);
        lock.lock();
        try {
            if (b0Var.j(0)) {
                if (!aVar.c()) {
                    b0Var.f(aVar, this.b, this.c);
                }
                if (b0Var.k()) {
                    b0Var.d();
                }
            }
        } finally {
            lock.unlock();
        }
    }
}
