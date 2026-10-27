package com.google.android.gms.common.api.internal;

import android.os.Message;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.api.Status;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class g extends com.google.android.gms.internal.cast.y {
    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i10 = message.what;
        if (i10 != 1) {
            if (i10 != 2) {
                Log.wtf("BasePendingResult", ic.a.i(i10, "Don't know how to handle message: "), new Exception());
                return;
            } else {
                ((BasePendingResult) message.obj).e(Status.n);
                return;
            }
        }
        Pair pair = (Pair) message.obj;
        f6.q qVar = (f6.q) pair.first;
        com.google.android.gms.common.api.q qVar2 = (com.google.android.gms.common.api.q) pair.second;
        try {
            qVar.a(qVar2);
        } catch (RuntimeException e) {
            BasePendingResult.m(qVar2);
            throw e;
        }
    }
}
