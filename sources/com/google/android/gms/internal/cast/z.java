package com.google.android.gms.internal.cast;

import android.os.Handler;
import android.os.Looper;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public class z extends Handler {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(Looper looper, int i10) {
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

    public z(Looper looper, Handler.Callback callback) {
        super(looper, callback);
        Looper.getMainLooper();
    }
}
