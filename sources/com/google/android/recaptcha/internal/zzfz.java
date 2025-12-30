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
        zzdr zzdrVar;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        try {
            if (this.zza != 0) {
                ResultKt.throwOnFailure(obj);
            } else {
                ResultKt.throwOnFailure(obj);
                zzcx zzcxVar = zzcx.zza;
                zzgb zzgbVar = this.zzb;
                zzfw zzfwVar = new zzfw(zzgbVar);
                zzfy zzfyVar = new zzfy(this.zzd, zzgbVar, this.zze, this.zzc, null);
                this.zza = 1;
                obj = zzcxVar.zzb(zzfwVar, 100L, 1000L, 2.0d, zzfyVar, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            ((Boolean) obj).booleanValue();
        } catch (zzcg e) {
            zzgb zzgbVar2 = this.zzb;
            zzdrVar = zzdv.zzd;
            zzgbVar2.zzf = zzdrVar;
            this.zzc.completeExceptionally(e);
        }
        return Unit.INSTANCE;
    }
}
