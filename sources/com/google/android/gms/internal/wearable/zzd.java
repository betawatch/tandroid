package com.google.android.gms.internal.wearable;

import android.os.Build;

/* loaded from: classes.dex */
public abstract class zzd {
    public static final int zza;

    static {
        zza = Build.VERSION.SDK_INT >= 31 ? 33554432 : 0;
    }
}
