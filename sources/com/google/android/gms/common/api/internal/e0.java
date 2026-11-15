package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes.dex */
public final class e0 extends com.google.android.gms.internal.cast.y {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e0(Object obj, Looper looper, int i7) {
        super(looper, 2);
        this.a = i7;
        this.b = obj;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        switch (this.a) {
            case 0:
                f0 f0Var = (f0) this.b;
                int i7 = message.what;
                if (i7 == 1) {
                    ReentrantLock reentrantLock = f0Var.b;
                    reentrantLock.lock();
                    try {
                        if (f0Var.h()) {
                            f0Var.n();
                        }
                        return;
                    } finally {
                        reentrantLock.unlock();
                    }
                }
                if (i7 == 2) {
                    f0Var.l();
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
                h0 h0Var = (h0) message.obj;
                i0 i0Var = (i0) this.b;
                h0Var.getClass();
                i0Var.a.lock();
                try {
                    if (i0Var.m == h0Var.a) {
                        h0Var.a();
                    }
                    return;
                } finally {
                    i0Var.a.unlock();
                }
        }
    }
}
