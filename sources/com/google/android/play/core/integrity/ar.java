package com.google.android.play.core.integrity;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes.dex */
final class ar extends ResultReceiver {
    final /* synthetic */ as a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ar(as asVar, Handler handler) {
        super(handler);
        this.a = asVar;
    }

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i10, Bundle bundle) {
        if (i10 == 1) {
            this.a.a.trySetResult(3);
        } else if (i10 == 2) {
            this.a.a.trySetResult(2);
        } else {
            if (i10 != 3) {
                return;
            }
            this.a.a.trySetResult(1);
        }
    }
}
