package com.google.android.gms.internal.cast;

import android.os.Handler;
import android.os.Looper;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public class y extends Handler {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(Looper looper, int i7) {
        super(looper);
        switch (i7) {
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

    public y(Looper looper, Handler.Callback callback) {
        super(looper, callback);
        Looper.getMainLooper();
    }
}
