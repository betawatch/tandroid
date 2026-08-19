package com.google.android.recaptcha.internal;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes.dex */
final class zzfz extends SuspendLambda implements Function2 {
    int zza;
    final /* synthetic */ zzgb zzb;
    final /* synthetic */ CompletableDeferred zzc;
    final /* synthetic */ zzhk zzd;
    final /* synthetic */ long zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzfz(zzgb zzgbVar, CompletableDeferred completableDeferred, zzhk zzhkVar, long j, Continuation continuation) {
        super(2, continuation);
        this.zzb = zzgbVar;
        this.zzc = completableDeferred;
        this.zzd = zzhkVar;
        this.zze = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new zzfz(this.zzb, this.zzc, this.zzd, this.zze, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzfz) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        zzcg zzcgVar;
        zzfz zzfzVar;
        zzdr zzdrVar;
        zzcg e;
        zzcx zzcxVar;
        zzfw zzfwVar;
        zzfy zzfyVar;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.zza != 0) {
            try {
                ResultKt.throwOnFailure(obj);
                zzfzVar = this;
            } catch (zzcg e2) {
                zzcgVar = e2;
                zzfzVar = this;
                zzgb zzgbVar = zzfzVar.zzb;
                zzdrVar = zzdv.zzd;
                zzgbVar.zzf = zzdrVar;
                zzfzVar.zzc.completeExceptionally(zzcgVar);
                return Unit.INSTANCE;
            }
        } else {
            ResultKt.throwOnFailure(obj);
            try {
                zzcxVar = zzcx.zza;
                zzgb zzgbVar2 = this.zzb;
                zzfwVar = new zzfw(zzgbVar2);
                zzfyVar = new zzfy(this.zzd, zzgbVar2, this.zze, this.zzc, null);
                this.zza = 1;
                zzfzVar = this;
            } catch (zzcg e3) {
                e = e3;
                zzfzVar = this;
                zzcgVar = e;
                zzgb zzgbVar3 = zzfzVar.zzb;
                zzdrVar = zzdv.zzd;
                zzgbVar3.zzf = zzdrVar;
                zzfzVar.zzc.completeExceptionally(zzcgVar);
                return Unit.INSTANCE;
            }
            try {
                obj = zzcxVar.zzb(zzfwVar, 100L, 1000L, 2.0d, zzfyVar, zzfzVar);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } catch (zzcg e4) {
                e = e4;
                zzcgVar = e;
                zzgb zzgbVar32 = zzfzVar.zzb;
                zzdrVar = zzdv.zzd;
                zzgbVar32.zzf = zzdrVar;
                zzfzVar.zzc.completeExceptionally(zzcgVar);
                return Unit.INSTANCE;
            }
        }
        ((Boolean) obj).getClass();
        return Unit.INSTANCE;
    }
}
