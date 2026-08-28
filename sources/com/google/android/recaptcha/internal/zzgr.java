package com.google.android.recaptcha.internal;

import g7.x5;
import oc.c;
import oc.g;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class zzgr {
    private final zzhk zza;
    private final Integer zzb;
    private final String zzc;
    private final long zzd;
    private final c zze;
    private final int zzf;

    public zzgr(zzhk zzhkVar, int i9, Integer num) {
        this.zza = zzhkVar;
        this.zzf = i9;
        this.zzb = num;
        int i10 = zzby.zza;
        this.zze = x5.a(zzgq.zza);
        zzd();
        this.zzc = zzvl.zzc(zzvl.zzb(System.currentTimeMillis()));
        zzd();
        this.zzd = System.currentTimeMillis();
    }

    private final zzdk zzd() {
        return (zzdk) ((g) this.zze).a();
    }

    private final zzwk zze(int i9) {
        zzwk zzj = zzwn.zzj();
        zzj.zzA(this.zzf);
        zzj.zzr(zzgl.zza());
        zzhk zzhkVar = this.zza;
        zzj.zzy(zzhkVar.zzb());
        zzj.zzu(zzhkVar.zza().zza());
        zzj.zzB(zzhkVar.zza().zzc());
        zzj.zzC(i9);
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
        int i9 = zzgl.zza;
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
        int i9 = zzgl.zza;
        zzgl.zzb(zze, zzhkVar.zza().zzb(), (zzwa) zzg.zzk());
    }
}
