package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import java.util.concurrent.locks.Lock;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final class a0 implements com.google.android.gms.common.api.k, com.google.android.gms.common.api.l {
    public final /* synthetic */ b0 a;

    public /* synthetic */ a0(b0 b0Var) {
        this.a = b0Var;
    }

    @Override // com.google.android.gms.common.api.k
    public final void onConnected(Bundle bundle) {
        b0 b0Var = this.a;
        q6.m.g(b0Var.H);
        r8.a aVar = b0Var.w;
        q6.m.g(aVar);
        aVar.B(new z(b0Var));
    }

    @Override // com.google.android.gms.common.api.l
    public final void onConnectionFailed(n6.a aVar) {
        b0 b0Var = this.a;
        Lock lock = b0Var.b;
        Lock lock2 = b0Var.b;
        lock.lock();
        try {
            if (b0Var.x && !aVar.b()) {
                b0Var.g();
                b0Var.d();
            } else {
                b0Var.h(aVar);
            }
            lock2.unlock();
        } catch (Throwable th2) {
            lock2.unlock();
            throw th2;
        }
    }

    @Override // com.google.android.gms.common.api.k
    public final void onConnectionSuspended(int i7) {
    }
}
