package com.google.android.recaptcha.internal;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CompletableDeferredKt;

/* loaded from: classes.dex */
final class zzlu extends SuspendLambda implements Function2 {
    int zza;
    final /* synthetic */ zzly zzb;
    private /* synthetic */ Object zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzlu(zzly zzlyVar, Continuation continuation) {
        super(2, continuation);
        this.zzb = zzlyVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        zzlu zzluVar = new zzlu(this.zzb, continuation);
        zzluVar.zzc = obj;
        return zzluVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzlu) create((zzhk) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        zzhk zzhkVar;
        zzhk zzhkVar2;
        zzcr zzD;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.zza;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            zzhk zzhkVar3 = (zzhk) this.zzc;
            zzdj zzn = this.zzb.zzn();
            zzmc[] zzmcVarArr = {zzmc.zzd, zzmc.zzc, zzmc.zzb};
            this.zzc = zzhkVar3;
            this.zza = 1;
            Object zzb = zzn.zzb(zzmcVarArr, this);
            if (zzb != coroutine_suspended) {
                zzhkVar = zzhkVar3;
                obj = zzb;
            }
            return coroutine_suspended;
        }
        if (i != 1) {
            zzhkVar2 = (zzhk) this.zzc;
            ResultKt.throwOnFailure(obj);
            zzly zzlyVar = this.zzb;
            zzlyVar.zza = CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
            zzD = zzlyVar.zzD();
            BuildersKt__Builders_commonKt.launch$default(zzD.zza(), null, null, new zzlt(zzhkVar2, zzlyVar, null), 3, null);
            return Unit.INSTANCE;
        }
        zzhkVar = (zzhk) this.zzc;
        ResultKt.throwOnFailure(obj);
        if (((Boolean) obj).booleanValue()) {
            return Unit.INSTANCE;
        }
        zzdj zzn2 = this.zzb.zzn();
        zzmc zzmcVar = zzmc.zzb;
        this.zzc = zzhkVar;
        this.zza = 2;
        if (zzn2.zzc(zzmcVar, this) != coroutine_suspended) {
            zzhkVar2 = zzhkVar;
            zzly zzlyVar2 = this.zzb;
            zzlyVar2.zza = CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
            zzD = zzlyVar2.zzD();
            BuildersKt__Builders_commonKt.launch$default(zzD.zza(), null, null, new zzlt(zzhkVar2, zzlyVar2, null), 3, null);
            return Unit.INSTANCE;
        }
        return coroutine_suspended;
    }
}
