package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class i0 extends com.google.android.gms.internal.cast.z {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i0(Object obj, Looper looper, int i10) {
        super(looper, 2);
        this.a = i10;
        this.b = obj;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        switch (this.a) {
            case 0:
                k0 k0Var = (k0) this.b;
                int i10 = message.what;
                if (i10 != 1) {
                    if (i10 == 2) {
                        k0.g(k0Var);
                        return;
                    }
                    Log.w("GoogleApiClientImpl", "Unknown message id: " + i10);
                    return;
                }
                ReentrantLock reentrantLock = k0Var.b;
                reentrantLock.lock();
                try {
                    if (k0Var.h()) {
                        k0Var.j();
                    }
                    return;
                } finally {
                    reentrantLock.unlock();
                }
            default:
                int i11 = message.what;
                if (i11 != 1) {
                    if (i11 == 2) {
                        throw ((RuntimeException) message.obj);
                    }
                    Log.w("GACStateManager", "Unknown message id: " + i11);
                    return;
                }
                m0 m0Var = (m0) message.obj;
                n0 n0Var = (n0) this.b;
                m0Var.getClass();
                n0Var.a.lock();
                try {
                    if (n0Var.m == m0Var.a) {
                        m0Var.a();
                    }
                    return;
                } finally {
                    n0Var.a.unlock();
                }
        }
    }
}
