package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class c0 extends com.google.android.gms.internal.cast.y {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c0(Object obj, Looper looper, int i7) {
        super(looper, 2);
        this.a = i7;
        this.b = obj;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        switch (this.a) {
            case 0:
                d0 d0Var = (d0) this.b;
                int i7 = message.what;
                if (i7 == 1) {
                    ReentrantLock reentrantLock = d0Var.b;
                    reentrantLock.lock();
                    try {
                        if (d0Var.h()) {
                            d0Var.n();
                        }
                        return;
                    } finally {
                        reentrantLock.unlock();
                    }
                }
                if (i7 == 2) {
                    d0Var.l();
                    return;
                }
                StringBuilder sb2 = new StringBuilder(String.valueOf(i7).length() + 20);
                sb2.append("Unknown message id: ");
                sb2.append(i7);
                Log.w("GoogleApiClientImpl", sb2.toString());
                return;
            default:
                int i10 = message.what;
                if (i10 != 1) {
                    if (i10 == 2) {
                        throw ((RuntimeException) message.obj);
                    }
                    StringBuilder sb3 = new StringBuilder(String.valueOf(i10).length() + 20);
                    sb3.append("Unknown message id: ");
                    sb3.append(i10);
                    Log.w("GACStateManager", sb3.toString());
                    return;
                }
                f0 f0Var = (f0) message.obj;
                g0 g0Var = (g0) this.b;
                f0Var.getClass();
                g0Var.a.lock();
                try {
                    if (g0Var.m == f0Var.a) {
                        f0Var.a();
                    }
                    return;
                } finally {
                    g0Var.a.unlock();
                }
        }
    }
}
