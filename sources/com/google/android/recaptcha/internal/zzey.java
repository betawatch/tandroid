package com.google.android.recaptcha.internal;

import a8.jd;
import android.app.Application;
import android.os.Build;
import ce.c0;
import ld.c;
import md.a;
import nd.i;
import ud.p;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
final class zzey extends i implements p {
    int zza;
    final /* synthetic */ zzfp zzb;
    final /* synthetic */ zzhk zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzey(zzfp zzfpVar, zzhk zzhkVar, c cVar) {
        super(2, cVar);
        this.zzb = zzfpVar;
        this.zzc = zzhkVar;
    }

    @Override // nd.a
    public final c create(Object obj, c cVar) {
        return new zzey(this.zzb, this.zzc, cVar);
    }

    @Override // ud.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzey) create((c0) obj, (c) obj2)).invokeSuspend(jd.i.a);
    }

    @Override // nd.a
    public final Object invokeSuspend(Object obj) {
        String str;
        Application zzs;
        Application zzs2;
        a aVar = a.a;
        int i10 = this.zza;
        jd.b(obj);
        if (i10 != 0) {
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
        int i11 = Build.VERSION.SDK_INT;
        String zza2 = zze.zza();
        zzzc zzf = zzzd.zzf();
        zzf.zzw(str);
        zzf.zzt(packageName);
        zzf.zzx(zzh.zzd(zzs2));
        zzf.zzu("18.7.1");
        zzf.zzv(zza);
        zzf.zzs(String.valueOf(i11));
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
        return zzc == aVar ? aVar : zzc;
    }
}
