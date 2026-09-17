package com.google.android.recaptcha.internal;

import hd.g;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes.dex */
public final class zzkv implements zzkt {
    private final zzku zza;

    public zzkv(zzku zzkuVar, zzks zzksVar) {
        this.zza = zzkuVar;
    }

    private final zzzo zzb(String str, List list) {
        zzkq zzkqVar;
        if (str.length() == 0) {
            throw new zzdm(3, 17, null);
        }
        try {
            long zza = this.zza.zza(g.n(list));
            zzkqVar = zzkr.zza;
            zzkr zzkrVar = new zzkr(zza, 255L, zzkqVar);
            StringBuilder sb2 = new StringBuilder(str.length());
            for (int i10 = 0; i10 < str.length(); i10++) {
                sb2.append((char) (str.charAt(i10) ^ ((int) zzkrVar.zza())));
            }
            return zzzo.zzg(zzpp.zzh().zzj(sb2.toString()));
        } catch (Exception e7) {
            throw new zzdm(3, 18, e7);
        }
    }

    @Override // com.google.android.recaptcha.internal.zzkt
    public final zzzo zza(zzzq zzzqVar) {
        zzmf zzb = zzmf.zzb();
        zzzo zzb2 = zzb(zzzqVar.zzj(), zzzqVar.zzk());
        zzb.zzf();
        long zza = zzb.zza(TimeUnit.MICROSECONDS);
        int i10 = zzco.zza;
        zzco.zza(zzcp.zza.zza(), zza);
        return zzb2;
    }
}
