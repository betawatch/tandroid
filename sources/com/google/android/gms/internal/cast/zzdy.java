package com.google.android.gms.internal.cast;

import android.os.Build;

/* loaded from: classes.dex */
public abstract class zzdy {
    public static final int zza;

    static {
        zza = Build.VERSION.SDK_INT >= 23 ? 67108864 : 0;
    }
}
