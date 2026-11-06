package com.google.android.recaptcha.internal;

import a8.ab;
import gd.i;
import java.util.UUID;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final class zzgl {
    public static final /* synthetic */ int zza = 0;
    private static final String zzb = UUID.randomUUID().toString();

    public static final String zza() {
        return zzb;
    }

    public static final void zzb(zzwk zzwkVar, String str, zzwa zzwaVar) {
        int i7 = zzby.zza;
        i b10 = ab.b(zzgi.zza);
        i b11 = ab.b(zzgj.zza);
        if (zzwaVar != null) {
            zzwkVar.zzt(zzwaVar);
        }
        for (zzca zzcaVar : ((zzcc) ab.b(zzgk.zza).getValue()).zza()) {
            zzwkVar.zzq(0);
        }
        if (zzwkVar.zzz()) {
            int i10 = zzco.zza;
            zzco.zza(zzwkVar.zze() + 20000, zzwkVar.zzf() * 1000);
        } else {
            int i11 = zzco.zza;
            int zzD = zzwkVar.zzD();
            zzco.zza(zzwl.zza(zzD) + 10000, zzwkVar.zzf() * 1000);
        }
        zzwkVar.zzv(((zzgh) b10.getValue()).zza(str));
        zzzl zzi = zzzm.zzi();
        zzi.zze(zzwkVar);
        ((zzgs) b11.getValue()).zza((zzzm) zzi.zzk());
    }
}
