package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final class d0 extends com.google.android.gms.internal.cast.y {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d0(Object obj, Looper looper, int i7) {
        super(looper, 2);
        this.a = i7;
        this.b = obj;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        switch (this.a) {
            case 0:
                e0 e0Var = (e0) this.b;
                int i7 = message.what;
                if (i7 == 1) {
                    ReentrantLock reentrantLock = e0Var.b;
                    reentrantLock.lock();
                    try {
                        if (e0Var.g()) {
                            e0Var.m();
                        }
                        return;
                    } finally {
                        reentrantLock.unlock();
                    }
                }
                if (i7 == 2) {
                    e0Var.k();
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
                g0 g0Var = (g0) message.obj;
                h0 h0Var = (h0) this.b;
                g0Var.getClass();
                h0Var.a.lock();
                try {
                    if (h0Var.m == g0Var.a) {
                        g0Var.a();
                    }
                    return;
                } finally {
                    h0Var.a.unlock();
                }
        }
    }
}
