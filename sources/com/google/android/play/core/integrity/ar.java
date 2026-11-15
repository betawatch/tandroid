package com.google.android.play.core.integrity;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
final class ar extends ResultReceiver {
    final /* synthetic */ as a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ar(as asVar, Handler handler) {
        super(handler);
        this.a = asVar;
    }

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i7, Bundle bundle) {
        if (i7 == 1) {
            this.a.a.trySetResult(3);
        } else if (i7 == 2) {
            this.a.a.trySetResult(2);
        } else {
            if (i7 != 3) {
                return;
            }
            this.a.a.trySetResult(1);
        }
    }
}
