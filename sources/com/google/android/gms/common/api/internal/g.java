package com.google.android.gms.common.api.internal;

import android.os.Message;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.api.Status;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public final class g extends com.google.android.gms.internal.cast.c0 {
    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i10 = message.what;
        if (i10 != 1) {
            if (i10 != 2) {
                Log.wtf("BasePendingResult", i2.g.i(i10, "Don't know how to handle message: "), new Exception());
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
        } catch (RuntimeException e7) {
            BasePendingResult.m(qVar);
            throw e7;
        }
    }
}
