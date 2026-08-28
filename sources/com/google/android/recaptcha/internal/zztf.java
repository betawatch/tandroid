package com.google.android.recaptcha.internal;

import java.util.List;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
final class zztf {
    public static final List zza(Object obj, long j10) {
        zzsu zzsuVar = (zzsu) zzvc.zzf(obj, j10);
        if (zzsuVar.zzc()) {
            return zzsuVar;
        }
        int size = zzsuVar.size();
        zzsu zzd = zzsuVar.zzd(size == 0 ? 10 : size + size);
        zzvc.zzs(obj, j10, zzd);
        return zzd;
    }
}
