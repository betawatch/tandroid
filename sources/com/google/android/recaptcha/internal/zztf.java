package com.google.android.recaptcha.internal;

import java.util.List;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
