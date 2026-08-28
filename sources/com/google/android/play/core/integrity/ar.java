package com.google.android.play.core.integrity;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
final class ar extends ResultReceiver {
    final /* synthetic */ as a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ar(as asVar, Handler handler) {
        super(handler);
        this.a = asVar;
    }

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i9, Bundle bundle) {
        if (i9 == 1) {
            this.a.a.trySetResult(3);
        } else if (i9 == 2) {
            this.a.a.trySetResult(2);
        } else {
            if (i9 != 3) {
                return;
            }
            this.a.a.trySetResult(1);
        }
    }
}
