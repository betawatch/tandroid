package com.google.android.gms.internal.cast;

import android.os.Handler;
import android.os.Looper;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
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
