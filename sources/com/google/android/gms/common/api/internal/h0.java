package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class h0 extends c2.t0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h0(Object obj, Looper looper, int i10) {
        super(looper, 4);
        this.a = i10;
        this.b = obj;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        switch (this.a) {
            case 0:
                j0 j0Var = (j0) this.b;
                int i10 = message.what;
                if (i10 != 1) {
                    if (i10 == 2) {
                        j0.g(j0Var);
                        return;
                    }
                    Log.w("GoogleApiClientImpl", "Unknown message id: " + i10);
                    return;
                }
                ReentrantLock reentrantLock = j0Var.b;
                reentrantLock.lock();
                try {
                    if (j0Var.h()) {
                        j0Var.j();
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
                l0 l0Var = (l0) message.obj;
                m0 m0Var = (m0) this.b;
                l0Var.getClass();
                m0Var.a.lock();
                try {
                    if (m0Var.m == l0Var.a) {
                        l0Var.a();
                    }
                    return;
                } finally {
                    m0Var.a.unlock();
                }
        }
    }
}
