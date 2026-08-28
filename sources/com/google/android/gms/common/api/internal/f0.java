package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import java.util.concurrent.locks.Lock;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class f0 implements com.google.android.gms.common.api.k, com.google.android.gms.common.api.l {
    public final /* synthetic */ g0 a;

    public /* synthetic */ f0(g0 g0Var) {
        this.a = g0Var;
    }

    @Override // com.google.android.gms.common.api.k
    public final void onConnected(Bundle bundle) {
        g0 g0Var = this.a;
        x5.l.h(g0Var.D);
        y7.a aVar = g0Var.v;
        x5.l.h(aVar);
        aVar.H(new e0(g0Var));
    }

    @Override // com.google.android.gms.common.api.l
    public final void onConnectionFailed(u5.a aVar) {
        g0 g0Var = this.a;
        Lock lock = g0Var.b;
        lock.lock();
        try {
            if (g0Var.w && !aVar.b()) {
                g0Var.a();
                g0Var.g();
            } else {
                g0Var.e(aVar);
            }
            lock.unlock();
        } catch (Throwable th) {
            lock.unlock();
            throw th;
        }
    }

    @Override // com.google.android.gms.common.api.k
    public final void onConnectionSuspended(int i9) {
    }
}
