package com.google.android.recaptcha.internal;

import gd.g;
import java.util.UUID;
import v7.s7;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class zzgl {
    public static final /* synthetic */ int zza = 0;
    private static final String zzb = UUID.randomUUID().toString();

    public static final String zza() {
        return zzb;
    }

    public static final void zzb(zzwk zzwkVar, String str, zzwa zzwaVar) {
        int i10 = zzby.zza;
        g a2 = s7.a(zzgi.zza);
        g a10 = s7.a(zzgj.zza);
        if (zzwaVar != null) {
            zzwkVar.zzt(zzwaVar);
        }
        for (zzca zzcaVar : ((zzcc) s7.a(zzgk.zza).a()).zza()) {
            zzwkVar.zzq(0);
        }
        if (zzwkVar.zzz()) {
            int i11 = zzco.zza;
            zzco.zza(zzwkVar.zze() + 20000, zzwkVar.zzf() * 1000);
        } else {
            int i12 = zzco.zza;
            int zzD = zzwkVar.zzD();
            zzco.zza(zzwl.zza(zzD) + 10000, zzwkVar.zzf() * 1000);
        }
        zzwkVar.zzv(((zzgh) a2.a()).zza(str));
        zzzl zzi = zzzm.zzi();
        zzi.zze(zzwkVar);
        ((zzgs) a10.a()).zza((zzzm) zzi.zzk());
    }
}
