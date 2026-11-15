package com.google.android.recaptcha.internal;

import a8.bb;
import gd.i;
import java.util.UUID;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final class zzgl {
    public static final /* synthetic */ int zza = 0;
    private static final String zzb = UUID.randomUUID().toString();

    public static final String zza() {
        return zzb;
    }

    public static final void zzb(zzwk zzwkVar, String str, zzwa zzwaVar) {
        int i7 = zzby.zza;
        i b10 = bb.b(zzgi.zza);
        i b11 = bb.b(zzgj.zza);
        if (zzwaVar != null) {
            zzwkVar.zzt(zzwaVar);
        }
        for (zzca zzcaVar : ((zzcc) bb.b(zzgk.zza).getValue()).zza()) {
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
