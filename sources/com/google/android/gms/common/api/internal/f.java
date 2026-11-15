package com.google.android.gms.common.api.internal;

import android.os.Message;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.api.Status;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final class f extends com.google.android.gms.internal.cast.y {
    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i7 = message.what;
        if (i7 != 1) {
            if (i7 == 2) {
                ((BasePendingResult) message.obj).e(Status.n);
                return;
            }
            StringBuilder sb2 = new StringBuilder(String.valueOf(i7).length() + 34);
            sb2.append("Don't know how to handle message: ");
            sb2.append(i7);
            Log.wtf("BasePendingResult", sb2.toString(), new Exception());
            return;
        }
        Pair pair = (Pair) message.obj;
        h6.q qVar = (h6.q) pair.first;
        com.google.android.gms.common.api.r rVar = (com.google.android.gms.common.api.r) pair.second;
        try {
            qVar.a(rVar);
        } catch (RuntimeException e10) {
            BasePendingResult.m(rVar);
            throw e10;
        }
    }
}
