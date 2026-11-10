package com.google.android.gms.common.api.internal;

import android.os.Message;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.api.Status;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
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
        com.google.android.gms.common.api.q qVar2 = (com.google.android.gms.common.api.q) pair.second;
        try {
            qVar.a(qVar2);
        } catch (RuntimeException e10) {
            BasePendingResult.m(qVar2);
            throw e10;
        }
    }
}
