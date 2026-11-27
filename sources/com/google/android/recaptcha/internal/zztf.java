package com.google.android.recaptcha.internal;

import java.util.List;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
final class zztf {
    public static final List zza(Object obj, long j) {
        zzsu zzsuVar = (zzsu) zzvc.zzf(obj, j);
        if (zzsuVar.zzc()) {
            return zzsuVar;
        }
        int size = zzsuVar.size();
        zzsu zzd = zzsuVar.zzd(size == 0 ? 10 : size << 1);
        zzvc.zzs(obj, j, zzd);
        return zzd;
    }
}
