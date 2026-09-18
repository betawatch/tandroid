package com.google.android.gms.internal.cast;

import android.os.Handler;
import android.os.Looper;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes.dex */
public class c0 extends Handler {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(Looper looper, int i10) {
        super(looper);
        switch (i10) {
            case 2:
                super(looper);
                Looper.getMainLooper();
                break;
            case 3:
            default:
                Looper.getMainLooper();
                break;
            case 4:
                super(looper);
                Looper.getMainLooper();
                break;
        }
    }

    public c0(Looper looper, Handler.Callback callback) {
        super(looper, callback);
        Looper.getMainLooper();
    }
}
