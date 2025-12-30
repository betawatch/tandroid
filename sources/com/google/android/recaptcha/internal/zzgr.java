package com.google.android.recaptcha.internal;

import kotlin.Lazy;
import kotlin.LazyKt;

/* loaded from: classes.dex */
public final class zzgr {
    private final zzhk zza;
    private final Integer zzb;
    private final String zzc;
    private final long zzd;
    private final Lazy zze;
    private final int zzf;

    public zzgr(zzhk zzhkVar, int i, Integer num) {
        this.zza = zzhkVar;
        this.zzf = i;
        this.zzb = num;
        int i2 = zzby.zza;
        this.zze = LazyKt.lazy(zzgq.zza);
        zzd();
        this.zzc = zzvl.zzc(zzvl.zzb(System.currentTimeMillis()));
        zzd();
        this.zzd = System.currentTimeMillis();
    }

    private final zzdk zzd() {
        return (zzdk) this.zze.getValue();
    }

    private final zzwk zze(int i) {
        zzwk zzj = zzwn.zzj();
        zzj.zzA(this.zzf);
        zzj.zzr(zzgl.zza());
        zzhk zzhkVar = this.zza;
        zzj.zzy(zzhkVar.zzb());
        zzj.zzu(zzhkVar.zza().zza());
        zzj.zzB(zzhkVar.zza().zzc());
        zzj.zzC(i);
        zzj.zzx(this.zzc);
        zzd();
        zzj.zzs(System.currentTimeMillis() - this.zzd);
        Integer num = this.zzb;
        if (num != null) {
            zzj.zzw(num.intValue());
        }
        return zzj;
    }

    public final zzhk zza() {
        return this.zza;
    }

    public final void zzb() {
        zzwk zze = zze(3);
        int i = zzgl.zza;
        zzgl.zzb(zze, this.zza.zza().zzb(), null);
    }

    public final void zzc(zzcg zzcgVar) {
        zzvy zzg = zzwa.zzg();
        zzg.zzr(String.valueOf(zzcgVar.zzb().zza()));
        zzg.zze(zzcgVar.zza().zza());
        zzg.zzq(zzcgVar.zzc().getErrorCode().getErrorCode());
        String zzd = zzcgVar.zzd();
        if (zzd != null) {
            zzg.zzf(zzd);
        }
        zzwk zze = zze(4);
        zzhk zzhkVar = this.zza;
        int i = zzgl.zza;
        zzgl.zzb(zze, zzhkVar.zza().zzb(), (zzwa) zzg.zzk());
    }
}
