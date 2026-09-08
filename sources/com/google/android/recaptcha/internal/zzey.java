package com.google.android.recaptcha.internal;

import android.app.Application;
import android.os.Build;
import gd.i;
import id.c;
import jd.a;
import kd.j;
import rd.p;
import v7.t7;
import zd.c0;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
final class zzey extends j implements p {
    int zza;
    final /* synthetic */ zzfp zzb;
    final /* synthetic */ zzhk zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzey(zzfp zzfpVar, zzhk zzhkVar, c cVar) {
        super(2, cVar);
        this.zzb = zzfpVar;
        this.zzc = zzhkVar;
    }

    @Override // kd.a
    public final c create(Object obj, c cVar) {
        return new zzey(this.zzb, this.zzc, cVar);
    }

    @Override // rd.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzey) create((c0) obj, (c) obj2)).invokeSuspend(i.a);
    }

    @Override // kd.a
    public final Object invokeSuspend(Object obj) {
        String str;
        Application zzs;
        Application zzs2;
        a aVar = a.a;
        int i10 = this.zza;
        t7.b(obj);
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
