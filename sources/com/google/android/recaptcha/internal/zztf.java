package com.google.android.recaptcha.internal;

import java.util.List;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
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
