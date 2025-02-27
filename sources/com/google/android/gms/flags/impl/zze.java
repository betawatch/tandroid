package com.google.android.gms.flags.impl;

import android.content.Context;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
final class zze implements Callable {
    final /* synthetic */ Context zza;

    zze(Context context) {
        this.zza = context;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        return this.zza.getSharedPreferences("google_sdk_flags", 0);
    }
}
