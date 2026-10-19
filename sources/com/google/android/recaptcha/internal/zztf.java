package com.google.android.recaptcha.internal;

import java.util.List;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
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
