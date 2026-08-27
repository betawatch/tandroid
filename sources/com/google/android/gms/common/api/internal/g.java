package com.google.android.gms.common.api.internal;

import android.os.Message;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.api.Status;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class g extends c2.t0 {
    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i10 = message.what;
        if (i10 != 1) {
            if (i10 != 2) {
                Log.wtf("BasePendingResult", i0.a.k(i10, "Don't know how to handle message: "), new Exception());
                return;
            } else {
                ((BasePendingResult) message.obj).e(Status.n);
                return;
            }
        }
        Pair pair = (Pair) message.obj;
        o5.p pVar = (o5.p) pair.first;
        com.google.android.gms.common.api.q qVar = (com.google.android.gms.common.api.q) pair.second;
        try {
            pVar.a(qVar);
        } catch (RuntimeException e9) {
            BasePendingResult.m(qVar);
            throw e9;
        }
    }
}
