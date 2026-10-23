package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes.dex */
public final class g0 extends com.google.android.gms.internal.cast.a0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g0(Object obj, Looper looper, int i10) {
        super(looper, 2);
        this.a = i10;
        this.b = obj;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        switch (this.a) {
            case 0:
                i0 i0Var = (i0) this.b;
                int i10 = message.what;
                if (i10 != 1) {
                    if (i10 == 2) {
                        i0.h(i0Var);
                        return;
                    }
                    Log.w("GoogleApiClientImpl", "Unknown message id: " + i10);
                    return;
                }
                ReentrantLock reentrantLock = i0Var.b;
                reentrantLock.lock();
                try {
                    if (i0Var.i()) {
                        i0Var.k();
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
                k0 k0Var = (k0) message.obj;
                l0 l0Var = (l0) this.b;
                k0Var.getClass();
                l0Var.a.lock();
                try {
                    if (l0Var.m == k0Var.a) {
                        k0Var.a();
                    }
                    return;
                } finally {
                    l0Var.a.unlock();
                }
        }
    }
}
