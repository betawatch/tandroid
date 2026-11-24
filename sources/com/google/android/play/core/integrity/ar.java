package com.google.android.play.core.integrity;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
final class ar extends ResultReceiver {
    final /* synthetic */ as a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ar(as asVar, Handler handler) {
        super(handler);
        this.a = asVar;
    }

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i, Bundle bundle) {
        if (i == 1) {
            this.a.a.trySetResult(3);
        } else if (i == 2) {
            this.a.a.trySetResult(2);
        } else {
            if (i != 3) {
                return;
            }
            this.a.a.trySetResult(1);
        }
    }
}
