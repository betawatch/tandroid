package com.google.android.recaptcha.internal;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;

/* loaded from: classes.dex */
final class zzez extends SuspendLambda implements Function2 {
    int zza;
    final /* synthetic */ zzfp zzb;
    private /* synthetic */ Object zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzez(zzfp zzfpVar, Continuation continuation) {
        super(2, continuation);
        this.zzb = zzfpVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        zzez zzezVar = new zzez(this.zzb, continuation);
        zzezVar.zzc = obj;
        return zzezVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzez) create((zzhk) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.zza;
        ResultKt.throwOnFailure(obj);
        if (i == 0) {
            zzhk zzhkVar = (zzhk) this.zzc;
            zzfp zzfpVar = this.zzb;
            CoroutineContext coroutineContext = zzfp.zzf(zzfpVar).zza().getCoroutineContext();
            zzey zzeyVar = new zzey(zzfpVar, zzhkVar, null);
            this.zza = 1;
            obj = BuildersKt.withContext(coroutineContext, zzeyVar, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return obj;
    }
}
