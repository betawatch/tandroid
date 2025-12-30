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
final class zzex extends SuspendLambda implements Function2 {
    int zza;
    final /* synthetic */ zzfp zzb;
    final /* synthetic */ long zzc;
    final /* synthetic */ zzye zzd;
    private /* synthetic */ Object zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzex(zzfp zzfpVar, long j, zzye zzyeVar, Continuation continuation) {
        super(2, continuation);
        this.zzb = zzfpVar;
        this.zzc = j;
        this.zzd = zzyeVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        zzex zzexVar = new zzex(this.zzb, this.zzc, this.zzd, continuation);
        zzexVar.zze = obj;
        return zzexVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzex) create((zzgr) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.zza;
        ResultKt.throwOnFailure(obj);
        if (i == 0) {
            zzgr zzgrVar = (zzgr) this.zze;
            zzfp zzfpVar = this.zzb;
            CoroutineContext coroutineContext = zzfp.zzf(zzfpVar).zza().getCoroutineContext();
            zzew zzewVar = new zzew(this.zzc, zzfpVar, zzgrVar, this.zzd, null);
            this.zza = 1;
            obj = BuildersKt.withContext(coroutineContext, zzewVar, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return obj;
    }
}
