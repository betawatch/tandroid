package com.google.android.recaptcha.internal;

import zd.x1;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class zzh {
    public static final zzcg zza(Exception exc, zzcg zzcgVar) {
        return exc instanceof x1 ? new zzcg(zzce.zzb, zzcd.zzb, exc.getMessage(), null, 8, null) : exc instanceof zzcg ? (zzcg) exc : zzcgVar;
    }
}
