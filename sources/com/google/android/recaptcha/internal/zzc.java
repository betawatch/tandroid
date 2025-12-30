package com.google.android.recaptcha.internal;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes.dex */
final class zzc extends SuspendLambda implements Function2 {
    Object zza;
    int zzb;
    final /* synthetic */ zzgr zzc;
    final /* synthetic */ zzg zzd;
    final /* synthetic */ zzxn zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzc(zzgr zzgrVar, zzg zzgVar, zzxn zzxnVar, Continuation continuation) {
        super(2, continuation);
        this.zzc = zzgrVar;
        this.zzd = zzgVar;
        this.zze = zzxnVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new zzc(this.zzc, this.zzd, this.zze, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzc) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        zzgr zzgrVar;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.zzb;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            zzgrVar = this.zzc;
            zzg zzgVar = this.zzd;
            zzxn zzxnVar = this.zze;
            this.zza = zzgrVar;
            this.zzb = 1;
            obj = zzgVar.zzd(zzxnVar, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                ResultKt.throwOnFailure(obj);
            }
            zzgrVar = (zzgr) this.zza;
            ResultKt.throwOnFailure(obj);
        }
        this.zza = null;
        this.zzb = 2;
        obj = ((zzhg) obj).zza(zzgrVar.zza(), this);
        return obj == coroutine_suspended ? coroutine_suspended : obj;
    }
}
