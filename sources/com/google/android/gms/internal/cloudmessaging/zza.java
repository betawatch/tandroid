package com.google.android.gms.internal.cloudmessaging;

import android.os.Build;

/* loaded from: classes.dex */
public abstract class zza {
    public static final int zza;

    static {
        zza = Build.VERSION.SDK_INT >= 31 ? 33554432 : 0;
    }
}
