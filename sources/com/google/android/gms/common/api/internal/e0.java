package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import java.util.concurrent.locks.Lock;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes.dex */
public final class e0 implements com.google.android.gms.common.api.k, com.google.android.gms.common.api.l {
    public final /* synthetic */ f0 a;

    public /* synthetic */ e0(f0 f0Var) {
        this.a = f0Var;
    }

    @Override // com.google.android.gms.common.api.k
    public final void onConnected(Bundle bundle) {
        f0 f0Var = this.a;
        n6.l.h(f0Var.H);
        o8.a aVar = f0Var.v;
        n6.l.h(aVar);
        aVar.H(new d0(f0Var));
    }

    @Override // com.google.android.gms.common.api.l
    public final void onConnectionFailed(k6.a aVar) {
        f0 f0Var = this.a;
        Lock lock = f0Var.b;
        lock.lock();
        try {
            if (f0Var.w && !aVar.b()) {
                f0Var.c();
                f0Var.h();
            } else {
                f0Var.f(aVar);
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
