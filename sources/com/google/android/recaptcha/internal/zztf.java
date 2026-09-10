package com.google.android.recaptcha.internal;

import java.util.List;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
final class zztf {
    public static final List zza(Object obj, long j3) {
        zzsu zzsuVar = (zzsu) zzvc.zzf(obj, j3);
        if (zzsuVar.zzc()) {
            return zzsuVar;
        }
        int size = zzsuVar.size();
        zzsu zzd = zzsuVar.zzd(size == 0 ? 10 : size + size);
        zzvc.zzs(obj, j3, zzd);
        return zzd;
    }
}
