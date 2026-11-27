package com.google.android.recaptcha.internal;

import java.util.List;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class zzkv implements zzkt {
    private final zzku zza;

    public zzkv(zzku zzkuVar, zzks zzksVar) {
        this.zza = zzkuVar;
    }

    private final zzzo zzb(String str, List list) {
        zzkq zzkqVar;
        if (str.length() == 0) {
            p3d.d(3, 17, null);
            return null;
        }
        try {
            long zza = this.zza.zza(sl2.l(list));
            zzkqVar = zzkr.zza;
            zzkr zzkrVar = new zzkr(zza, 255L, zzkqVar);
            StringBuilder sb = new StringBuilder(str.length());
            for (int i = 0; i < str.length(); i++) {
                sb.append((char) (str.charAt(i) ^ ((int) zzkrVar.zza())));
            }
            return zzzo.zzg(zzpp.zzh().zzj(sb.toString()));
        } catch (Exception e) {
            p3d.d(3, 18, e);
            return null;
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
