package com.google.android.gms.common.api.internal;

import android.os.Message;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.api.Status;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes.dex */
public final class g extends com.google.android.gms.internal.cast.c0 {
    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i10 = message.what;
        if (i10 != 1) {
            if (i10 != 2) {
                Log.wtf("BasePendingResult", hg.k0.h(i10, "Don't know how to handle message: "), new Exception());
                return;
            } else {
                ((BasePendingResult) message.obj).e(Status.n);
                return;
            }
        }
        Pair pair = (Pair) message.obj;
        e6.r rVar = (e6.r) pair.first;
        com.google.android.gms.common.api.q qVar = (com.google.android.gms.common.api.q) pair.second;
        try {
            rVar.a(qVar);
        } catch (RuntimeException e) {
            BasePendingResult.m(qVar);
            throw e;
        }
    }
}
