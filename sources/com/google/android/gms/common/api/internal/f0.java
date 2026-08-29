package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import java.util.concurrent.locks.Lock;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class f0 implements com.google.android.gms.common.api.k, com.google.android.gms.common.api.l {
    public final /* synthetic */ g0 a;

    public /* synthetic */ f0(g0 g0Var) {
        this.a = g0Var;
    }

    @Override // com.google.android.gms.common.api.k
    public final void onConnected(Bundle bundle) {
        g0 g0Var = this.a;
        z5.l.h(g0Var.D);
        a8.a aVar = g0Var.v;
        z5.l.h(aVar);
        aVar.H(new e0(g0Var));
    }

    @Override // com.google.android.gms.common.api.l
    public final void onConnectionFailed(w5.a aVar) {
        g0 g0Var = this.a;
        Lock lock = g0Var.b;
        lock.lock();
        try {
            if (g0Var.w && !aVar.b()) {
                g0Var.b();
                g0Var.h();
            } else {
                g0Var.e(aVar);
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
