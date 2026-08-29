package com.google.android.gms.common.api.internal;

import android.os.Message;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.api.Status;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class g extends c2.v0 {
    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i10 = message.what;
        if (i10 != 1) {
            if (i10 != 2) {
                Log.wtf("BasePendingResult", j7.l1.k(i10, "Don't know how to handle message: "), new Exception());
                return;
            } else {
                ((BasePendingResult) message.obj).e(Status.n);
                return;
            }
        }
        Pair pair = (Pair) message.obj;
        q5.p pVar = (q5.p) pair.first;
        com.google.android.gms.common.api.q qVar = (com.google.android.gms.common.api.q) pair.second;
        try {
            pVar.a(qVar);
        } catch (RuntimeException e10) {
            BasePendingResult.m(qVar);
            throw e10;
        }
    }
}
