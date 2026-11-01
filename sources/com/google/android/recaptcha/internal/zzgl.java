package com.google.android.recaptcha.internal;

import ad.h;
import ib.a;
import java.util.UUID;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final class zzgl {
    public static final /* synthetic */ int zza = 0;
    private static final String zzb = UUID.randomUUID().toString();

    public static final String zza() {
        return zzb;
    }

    public static final void zzb(zzwk zzwkVar, String str, zzwa zzwaVar) {
        int i10 = zzby.zza;
        h a2 = a.a(zzgi.zza);
        h a10 = a.a(zzgj.zza);
        if (zzwaVar != null) {
            zzwkVar.zzt(zzwaVar);
        }
        for (zzca zzcaVar : ((zzcc) a.a(zzgk.zza).a()).zza()) {
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
