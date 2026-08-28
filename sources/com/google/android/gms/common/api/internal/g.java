package com.google.android.gms.common.api.internal;

import android.os.Message;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.api.Status;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class g extends c2.u0 {
    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i9 = message.what;
        if (i9 != 1) {
            if (i9 != 2) {
                Log.wtf("BasePendingResult", j3.r0.l(i9, "Don't know how to handle message: "), new Exception());
                return;
            } else {
                ((BasePendingResult) message.obj).e(Status.n);
                return;
            }
        }
        Pair pair = (Pair) message.obj;
        o5.q qVar = (o5.q) pair.first;
        com.google.android.gms.common.api.q qVar2 = (com.google.android.gms.common.api.q) pair.second;
        try {
            qVar.a(qVar2);
        } catch (RuntimeException e10) {
            BasePendingResult.m(qVar2);
            throw e10;
        }
    }
}
