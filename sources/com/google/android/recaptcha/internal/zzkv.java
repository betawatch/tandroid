package com.google.android.recaptcha.internal;

import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.UInt;
import kotlin.collections.CollectionsKt;

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
            long zza = this.zza.zza(CollectionsKt.toLongArray(list));
            zzkqVar = zzkr.zza;
            zzkr zzkrVar = new zzkr(zza, 255L, zzkqVar);
            StringBuilder sb = new StringBuilder(str.length());
            for (int i = 0; i < str.length(); i++) {
                sb.append((char) UInt.constructor-impl(UInt.constructor-impl(str.charAt(i)) ^ UInt.constructor-impl((int) zzkrVar.zza())));
            }
            return zzzo.zzg(zzpp.zzh().zzj(sb.toString()));
        } catch (Exception e) {
            throw new zzdm(3, 18, e);
        }
    }

    @Override // com.google.android.recaptcha.internal.zzkt
    public final zzzo zza(zzzq zzzqVar) {
        zzmf zzb = zzmf.zzb();
        zzzo zzb2 = zzb(zzzqVar.zzj(), zzzqVar.zzk());
        zzb.zzf();
        long zza = zzb.zza(TimeUnit.MICROSECONDS);
        int i = zzco.zza;
        zzco.zza(zzcp.zza.zza(), zza);
        return zzb2;
    }
}
