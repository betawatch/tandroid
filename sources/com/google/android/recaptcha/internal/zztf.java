package com.google.android.recaptcha.internal;

import java.util.List;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
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
