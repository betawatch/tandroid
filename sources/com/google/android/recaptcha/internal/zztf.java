package com.google.android.recaptcha.internal;

import java.util.List;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
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
