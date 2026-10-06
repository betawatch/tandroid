package com.google.android.recaptcha.internal;

import java.util.List;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
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
