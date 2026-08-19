package com.google.android.recaptcha.internal;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScopeKt;

/* loaded from: classes.dex */
final class zzag extends SuspendLambda implements Function2 {
    int zza;
    final /* synthetic */ zzaj zzb;
    final /* synthetic */ String zzc;
    private /* synthetic */ Object zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzag(zzaj zzajVar, String str, Continuation continuation) {
        super(2, continuation);
        this.zzb = zzajVar;
        this.zzc = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        zzag zzagVar = new zzag(this.zzb, this.zzc, continuation);
        zzagVar.zzd = obj;
        return zzagVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzag) create((zzhk) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.zza;
        ResultKt.throwOnFailure(obj);
        if (i != 0) {
            return obj;
        }
        zzaf zzafVar = new zzaf(this.zzb, this.zzc, (zzhk) this.zzd, null);
        this.zza = 1;
        Object coroutineScope = CoroutineScopeKt.coroutineScope(zzafVar, this);
        return coroutineScope == coroutine_suspended ? coroutine_suspended : coroutineScope;
    }
}
