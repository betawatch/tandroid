package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import java.util.concurrent.locks.Lock;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public final class b0 implements com.google.android.gms.common.api.k, com.google.android.gms.common.api.l {
    public final /* synthetic */ c0 a;

    public /* synthetic */ b0(c0 c0Var) {
        this.a = c0Var;
    }

    @Override // com.google.android.gms.common.api.k
    public final void onConnected(Bundle bundle) {
        c0 c0Var = this.a;
        q6.m.h(c0Var.I);
        r8.a aVar = c0Var.w;
        q6.m.h(aVar);
        aVar.B(new a0(c0Var));
    }

    @Override // com.google.android.gms.common.api.l
    public final void onConnectionFailed(n6.a aVar) {
        c0 c0Var = this.a;
        Lock lock = c0Var.b;
        Lock lock2 = c0Var.b;
        lock.lock();
        try {
            if (c0Var.x && !aVar.b()) {
                c0Var.g();
                c0Var.c();
            } else {
                c0Var.h(aVar);
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
