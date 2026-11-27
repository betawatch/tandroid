package com.google.android.recaptcha.internal;

import android.app.Application;
import android.os.Build;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
final class zzey extends yfb implements is4 {
    int zza;
    final /* synthetic */ zzfp zzb;
    final /* synthetic */ zzhk zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzey(zzfp zzfpVar, zzhk zzhkVar, zw2 zw2Var) {
        super(2, zw2Var);
        this.zzb = zzfpVar;
        this.zzc = zzhkVar;
    }

    @Override // qf0
    public final zw2 create(Object obj, zw2 zw2Var) {
        return new zzey(this.zzb, this.zzc, zw2Var);
    }

    @Override // is4
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzey) create((ux2) obj, (zw2) obj2)).invokeSuspend(f9c.a);
    }

    @Override // qf0
    public final Object invokeSuspend(Object obj) {
        String str;
        Application zzs;
        Application zzs2;
        int i = this.zza;
        ixe.b(obj);
        if (i != 0) {
            return obj;
        }
        zzfp zzfpVar = this.zzb;
        str = zzfpVar.zza;
        zzs = zzfpVar.zzs();
        String packageName = zzs.getPackageName();
        String zza = this.zzc.zza().zza();
        zzci zze = zzfp.zze(zzfpVar);
        zzda zzh = zzfp.zzh(zzfpVar);
        zzs2 = zzfpVar.zzs();
        int i2 = Build.VERSION.SDK_INT;
        String zza2 = zze.zza();
        zzzc zzf = zzzd.zzf();
        zzf.zzw(str);
        zzf.zzt(packageName);
        zzf.zzx(zzh.zzd(zzs2));
        zzf.zzu("18.7.1");
        zzf.zzv(zza);
        zzf.zzs(String.valueOf(i2));
        zzf.zzr(zza2);
        zzf.zzf(zzh.zzb(zzs2));
        zzf.zzq(zzh.zzc(zzs2));
        zzf.zze(zzh.zza(zzs2));
        zzzd zzzdVar = (zzzd) zzf.zzk();
        zzzd zza3 = zzfp.zzb(zzfpVar).zza();
        zzzc zzzcVar = (zzzc) zzzdVar.zzr();
        zzzcVar.zzh(zza3);
        zzzd zzzdVar2 = (zzzd) zzzcVar.zzk();
        zzht zzi = zzfp.zzi(zzfpVar);
        String zzb = zzfp.zzg(zzfpVar).zzb();
        this.zza = 1;
        Object zzc = zzi.zzc(zzb, zzzdVar2, this);
        vx2 vx2Var = vx2.a;
        return zzc == vx2Var ? vx2Var : zzc;
    }
}
