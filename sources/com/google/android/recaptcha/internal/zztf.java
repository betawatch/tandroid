package com.google.android.recaptcha.internal;

import java.util.List;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
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
