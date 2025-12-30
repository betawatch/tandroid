package com.google.android.recaptcha.internal;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.CompletableDeferred;

/* loaded from: classes.dex */
final class zzfy extends SuspendLambda implements Function1 {
    int zza;
    final /* synthetic */ zzhk zzb;
    final /* synthetic */ zzgb zzc;
    final /* synthetic */ long zzd;
    final /* synthetic */ CompletableDeferred zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzfy(zzhk zzhkVar, zzgb zzgbVar, long j, CompletableDeferred completableDeferred, Continuation continuation) {
        super(1, continuation);
        this.zzb = zzhkVar;
        this.zzc = zzgbVar;
        this.zzd = j;
        this.zze = completableDeferred;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new zzfy(this.zzb, this.zzc, this.zzd, this.zze, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return ((zzfy) create((Continuation) obj)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.zza;
        ResultKt.throwOnFailure(obj);
        if (i == 0) {
            zzhk zzhkVar = this.zzb;
            zzfx zzfxVar = new zzfx(this.zzc, this.zzd, this.zze, null);
            this.zza = 1;
            obj = zzhj.zze(zzhkVar, 41, zzfxVar, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return obj;
    }
}
