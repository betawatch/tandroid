package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import java.util.concurrent.locks.Lock;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class f0 implements com.google.android.gms.common.api.k, com.google.android.gms.common.api.l {
    public final /* synthetic */ g0 a;

    public /* synthetic */ f0(g0 g0Var) {
        this.a = g0Var;
    }

    @Override // com.google.android.gms.common.api.k
    public final void onConnected(Bundle bundle) {
        g0 g0Var = this.a;
        n6.l.g(g0Var.H);
        o8.a aVar = g0Var.w;
        n6.l.g(aVar);
        aVar.I(new e0(g0Var));
    }

    @Override // com.google.android.gms.common.api.l
    public final void onConnectionFailed(k6.a aVar) {
        g0 g0Var = this.a;
        Lock lock = g0Var.b;
        lock.lock();
        try {
            if (g0Var.x && !aVar.b()) {
                g0Var.a();
                g0Var.f();
            } else {
                g0Var.d(aVar);
            }
            lock.unlock();
        } catch (Throwable th2) {
            lock.unlock();
            throw th2;
        }
    }

    @Override // com.google.android.gms.common.api.k
    public final void onConnectionSuspended(int i10) {
    }
}
