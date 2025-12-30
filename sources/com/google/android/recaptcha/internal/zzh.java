package com.google.android.recaptcha.internal;

import kotlinx.coroutines.TimeoutCancellationException;

/* loaded from: classes.dex */
public final class zzh {
    public static final zzcg zza(Exception exc, zzcg zzcgVar) {
        return exc instanceof TimeoutCancellationException ? new zzcg(zzce.zzb, zzcd.zzb, exc.getMessage(), null, 8, null) : exc instanceof zzcg ? (zzcg) exc : zzcgVar;
    }
}
