package com.google.android.recaptcha.internal;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CompletableDeferredKt;

/* loaded from: classes.dex */
final class zzga extends SuspendLambda implements Function2 {
    final /* synthetic */ zzgb zza;
    final /* synthetic */ long zzb;
    private /* synthetic */ Object zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzga(zzgb zzgbVar, long j, Continuation continuation) {
        super(2, continuation);
        this.zza = zzgbVar;
        this.zzb = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        zzga zzgaVar = new zzga(this.zza, this.zzb, continuation);
        zzgaVar.zzc = obj;
        return zzgaVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzga) create((zzhk) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        zzds zzdsVar;
        zzdt zzdtVar;
        zzdr zzdrVar;
        zzdt zzdtVar2;
        zzcg zzcgVar;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        zzhk zzhkVar = (zzhk) this.zzc;
        zzgb zzgbVar = this.zza;
        zzdv zze = zzgbVar.zze();
        zzdsVar = zzdv.zzb;
        if (!Intrinsics.areEqual(zze, zzdsVar)) {
            zzdv zze2 = zzgbVar.zze();
            zzdtVar = zzdv.zzc;
            if (!Intrinsics.areEqual(zze2, zzdtVar)) {
                zzdv zze3 = zzgbVar.zze();
                zzdrVar = zzdv.zzd;
                if (Intrinsics.areEqual(zze3, zzdrVar)) {
                    zzcgVar = zzgbVar.zzd;
                    if (!zzgb.zzo(zzgbVar, zzcgVar)) {
                        return Unit.INSTANCE;
                    }
                }
                zzdtVar2 = zzdv.zzc;
                zzgbVar.zzf = zzdtVar2;
                CompletableDeferred CompletableDeferred$default = CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
                zzgbVar.zzb = CompletableDeferred$default;
                BuildersKt__Builders_commonKt.launch$default(zzgb.zzd(zzgbVar).zza(), null, null, new zzfz(zzgbVar, CompletableDeferred$default, zzhkVar, this.zzb, null), 3, null);
                return Unit.INSTANCE;
            }
        }
        return Unit.INSTANCE;
    }
}
