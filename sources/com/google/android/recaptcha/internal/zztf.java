package com.google.android.recaptcha.internal;

import java.util.List;

/* loaded from: classes.dex */
final class zztf {
    zztf() {
    }

    public static final List zza(Object obj, long j) {
        zzsu zzsuVar = (zzsu) zzvc.zzf(obj, j);
        if (zzsuVar.zzc()) {
            return zzsuVar;
        }
        int size = zzsuVar.size();
        zzsu zzd = zzsuVar.zzd(size == 0 ? 10 : size + size);
        zzvc.zzs(obj, j, zzd);
        return zzd;
    }
}
