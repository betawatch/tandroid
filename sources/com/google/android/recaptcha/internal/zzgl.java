package com.google.android.recaptcha.internal;

import java.util.UUID;
import kotlin.Lazy;
import kotlin.LazyKt;

/* loaded from: classes.dex */
public final class zzgl {
    public static final /* synthetic */ int zza = 0;
    private static final String zzb = UUID.randomUUID().toString();

    public static final String zza() {
        return zzb;
    }

    public static final void zzb(zzwk zzwkVar, String str, zzwa zzwaVar) {
        int i = zzby.zza;
        Lazy lazy = LazyKt.lazy(zzgi.zza);
        Lazy lazy2 = LazyKt.lazy(zzgj.zza);
        if (zzwaVar != null) {
            zzwkVar.zzt(zzwaVar);
        }
        for (zzca zzcaVar : ((zzcc) LazyKt.lazy(zzgk.zza).getValue()).zza()) {
            zzwkVar.zzq(0);
        }
        if (zzwkVar.zzz()) {
            int i2 = zzco.zza;
            zzco.zza(zzwkVar.zze() + 20000, zzwkVar.zzf() * 1000);
        } else {
            int i3 = zzco.zza;
            int zzD = zzwkVar.zzD();
            zzco.zza(zzwl.zza(zzD) + 10000, zzwkVar.zzf() * 1000);
        }
        zzwkVar.zzv(((zzgh) lazy.getValue()).zza(str));
        zzzl zzi = zzzm.zzi();
        zzi.zze(zzwkVar);
        ((zzgs) lazy2.getValue()).zza((zzzm) zzi.zzk());
    }
}
