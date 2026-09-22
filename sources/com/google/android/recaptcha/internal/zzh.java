package com.google.android.recaptcha.internal;

import zd.d2;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes.dex */
public final class zzh {
    public static final zzcg zza(Exception exc, zzcg zzcgVar) {
        return exc instanceof d2 ? new zzcg(zzce.zzb, zzcd.zzb, exc.getMessage(), null, 8, null) : exc instanceof zzcg ? (zzcg) exc : zzcgVar;
    }
}
