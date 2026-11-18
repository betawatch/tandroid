package com.google.android.gms.common.api.internal;

import android.os.Looper;
import java.lang.ref.WeakReference;
import java.util.concurrent.locks.Lock;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes.dex */
public final class x implements q6.b {
    public final WeakReference a;
    public final com.google.android.gms.common.api.e b;
    public final boolean c;

    public x(c0 c0Var, com.google.android.gms.common.api.e eVar, boolean z10) {
        this.a = new WeakReference(c0Var);
        this.b = eVar;
        this.c = z10;
    }

    @Override // q6.b
    public final void a(n6.a aVar) {
        c0 c0Var = (c0) this.a.get();
        if (c0Var == null) {
            return;
        }
        Lock lock = c0Var.b;
        q6.m.j("onReportServiceBinding must be called on the GoogleApiClient handler thread", Looper.myLooper() == c0Var.a.o.h);
        lock.lock();
        try {
            if (c0Var.j(0)) {
                if (!aVar.c()) {
                    c0Var.f(aVar, this.b, this.c);
                }
                if (c0Var.k()) {
                    c0Var.c();
                }
            }
        } finally {
            lock.unlock();
        }
    }
}
