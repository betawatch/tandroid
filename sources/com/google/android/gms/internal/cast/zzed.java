package com.google.android.gms.internal.cast;

import android.os.Handler;
import android.os.Looper;

/* loaded from: classes.dex */
public final class zzed extends Handler {
    private final Looper zza;

    public zzed(Looper looper) {
        super(looper);
        this.zza = Looper.getMainLooper();
    }
}
