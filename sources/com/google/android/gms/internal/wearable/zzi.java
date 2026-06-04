package com.google.android.gms.internal.wearable;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* loaded from: classes.dex */
public abstract class zzi extends Handler {
    public zzi(Looper looper) {
        super(looper);
    }

    @Override // android.os.Handler
    public final void dispatchMessage(Message message) {
        zza(message);
    }

    protected void zza(Message message) {
        super.dispatchMessage(message);
    }
}
