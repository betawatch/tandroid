package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import java.util.concurrent.locks.Lock;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class a0 implements com.google.android.gms.common.api.k, com.google.android.gms.common.api.l {
    public final /* synthetic */ b0 a;

    public /* synthetic */ a0(b0 b0Var) {
        this.a = b0Var;
    }

    @Override // com.google.android.gms.common.api.k
    public final void onConnected(Bundle bundle) {
        b0 b0Var = this.a;
        p6.m.g(b0Var.I);
        q8.a aVar = b0Var.w;
        p6.m.g(aVar);
        aVar.A(new z(b0Var));
    }

    @Override // com.google.android.gms.common.api.l
    public final void onConnectionFailed(m6.a aVar) {
        b0 b0Var = this.a;
        Lock lock = b0Var.b;
        Lock lock2 = b0Var.b;
        lock.lock();
        try {
            if (b0Var.x && !aVar.b()) {
                b0Var.f();
                b0Var.c();
            } else {
                b0Var.g(aVar);
            }
            lock2.unlock();
        } catch (Throwable th2) {
            lock2.unlock();
            throw th2;
        }
    }

    @Override // com.google.android.gms.common.api.k
    public final void onConnectionSuspended(int i3) {
    }
}
