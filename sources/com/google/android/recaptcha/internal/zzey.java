package com.google.android.recaptcha.internal;

import android.app.Application;
import android.os.Build;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes.dex */
final class zzey extends SuspendLambda implements Function2 {
    int zza;
    final /* synthetic */ zzfp zzb;
    final /* synthetic */ zzhk zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzey(zzfp zzfpVar, zzhk zzhkVar, Continuation continuation) {
        super(2, continuation);
        this.zzb = zzfpVar;
        this.zzc = zzhkVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new zzey(this.zzb, this.zzc, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzey) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String str;
        Application zzs;
        Application zzs2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.zza;
        ResultKt.throwOnFailure(obj);
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
        return zzc == coroutine_suspended ? coroutine_suspended : zzc;
    }
}
