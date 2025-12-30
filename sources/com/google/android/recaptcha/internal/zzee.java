package com.google.android.recaptcha.internal;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
final class zzee extends SuspendLambda implements Function2 {
    int zza;
    final /* synthetic */ zzeh zzb;
    final /* synthetic */ long zzc;
    final /* synthetic */ zzdw zzd;
    final /* synthetic */ String zze;
    final /* synthetic */ zzhh zzf;
    private /* synthetic */ Object zzg;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzee(zzeh zzehVar, long j, zzdw zzdwVar, String str, zzhh zzhhVar, Continuation continuation) {
        super(2, continuation);
        this.zzb = zzehVar;
        this.zzc = j;
        this.zzd = zzdwVar;
        this.zze = str;
        this.zzf = zzhhVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        zzee zzeeVar = new zzee(this.zzb, this.zzc, this.zzd, this.zze, this.zzf, continuation);
        zzeeVar.zzg = obj;
        return zzeeVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzee) create((zzhk) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        zzhk zzhkVar;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.zza;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                zzhkVar = (zzhk) this.zzg;
                zzeh zzehVar = this.zzb;
                long j = this.zzc;
                zzeh.zzf(zzehVar, j);
                zzdw zzdwVar = this.zzd;
                this.zzg = zzhkVar;
                this.zza = 1;
                obj = zzdwVar.zzb(j, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    ResultKt.throwOnFailure(obj);
                    zzeq zzeqVar = new zzeq(this.zzd, this.zze, this.zzf);
                    this.zzb.zzc = zzeqVar;
                    return zzeqVar;
                }
                zzhkVar = (zzhk) this.zzg;
                ResultKt.throwOnFailure(obj);
            }
            this.zzg = null;
            this.zza = 2;
            if (((zzhg) obj).zza(zzhkVar, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            zzeq zzeqVar2 = new zzeq(this.zzd, this.zze, this.zzf);
            this.zzb.zzc = zzeqVar2;
            return zzeqVar2;
        } catch (zzcg e) {
            throw e;
        } catch (Exception e2) {
            throw new zzcg(zzce.zzb, zzcd.zza, e2.getMessage(), null, 8, null);
        }
    }
}
