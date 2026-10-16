package com.google.android.gms.common.api.internal;

import android.os.Message;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.api.Status;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes.dex */
public final class g extends com.google.android.gms.internal.cast.a0 {
    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i10 = message.what;
        if (i10 != 1) {
            if (i10 != 2) {
                Log.wtf("BasePendingResult", i2.d.j(i10, "Don't know how to handle message: "), new Exception());
                return;
            } else {
                ((BasePendingResult) message.obj).e(Status.n);
                return;
            }
        }
        Pair pair = (Pair) message.obj;
        e6.q qVar = (e6.q) pair.first;
        com.google.android.gms.common.api.q qVar2 = (com.google.android.gms.common.api.q) pair.second;
        try {
            qVar.a(qVar2);
        } catch (RuntimeException e) {
            BasePendingResult.m(qVar2);
            throw e;
        }
    }
}
