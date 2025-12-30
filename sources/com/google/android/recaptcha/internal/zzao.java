package com.google.android.recaptcha.internal;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
final class zzao extends SuspendLambda implements Function2 {
    int zza;
    final /* synthetic */ zzar zzb;
    final /* synthetic */ String zzc;
    private /* synthetic */ Object zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzao(zzar zzarVar, String str, Continuation continuation) {
        super(2, continuation);
        this.zzb = zzarVar;
        this.zzc = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        zzao zzaoVar = new zzao(this.zzb, this.zzc, continuation);
        zzaoVar.zzd = obj;
        return zzaoVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzao) create((zzhk) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.zza;
        try {
        } catch (Exception e) {
            zzar zzarVar = this.zzb;
            this.zza = 2;
            obj = zzarVar.zzg(e, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            zzhk zzhkVar = (zzhk) this.zzd;
            zzar zzarVar2 = this.zzb;
            int zza = zzarVar2.zza();
            zzan zzanVar = new zzan(zzarVar2, this.zzc, null);
            this.zza = 1;
            obj = new zzhf(37, zzanVar, Boxing.boxInt(zza)).zza(zzhkVar, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                ResultKt.throwOnFailure(obj);
                return (zzat) obj;
            }
            ResultKt.throwOnFailure(obj);
        }
        return (zzat) obj;
    }
}
