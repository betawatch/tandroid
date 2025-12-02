package com.google.android.gms.common.util;

import android.os.StrictMode;

/* loaded from: classes.dex */
abstract class zzb {
    static StrictMode.VmPolicy.Builder zza(StrictMode.VmPolicy.Builder builder) {
        StrictMode.VmPolicy.Builder permitUnsafeIntentLaunch;
        permitUnsafeIntentLaunch = builder.permitUnsafeIntentLaunch();
        return permitUnsafeIntentLaunch;
    }
}
