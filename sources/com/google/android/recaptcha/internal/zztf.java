package com.google.android.recaptcha.internal;

import java.util.List;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
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
