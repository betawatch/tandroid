package com.google.android.gms.common.api.internal;

import android.os.Message;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.api.Status;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class f extends com.google.android.gms.internal.cast.z {
    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i3 = message.what;
        if (i3 != 1) {
            if (i3 == 2) {
                ((BasePendingResult) message.obj).e(Status.n);
                return;
            }
            StringBuilder sb2 = new StringBuilder(String.valueOf(i3).length() + 34);
            sb2.append("Don't know how to handle message: ");
            sb2.append(i3);
            Log.wtf("BasePendingResult", sb2.toString(), new Exception());
            return;
        }
        Pair pair = (Pair) message.obj;
        g6.p pVar = (g6.p) pair.first;
        com.google.android.gms.common.api.q qVar = (com.google.android.gms.common.api.q) pair.second;
        try {
            pVar.a(qVar);
        } catch (RuntimeException e10) {
            BasePendingResult.m(qVar);
            throw e10;
        }
    }
}
