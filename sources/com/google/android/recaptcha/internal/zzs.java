package com.google.android.recaptcha.internal;

import com.google.android.gms.recaptchabase.InitRequest;
import com.google.android.gms.recaptchabase.RecaptchaBase;
import com.google.android.gms.recaptchabase.RecaptchaBaseClient;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
final class zzs extends SuspendLambda implements Function2 {
    final /* synthetic */ zzu zza;
    final /* synthetic */ zzxn zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzs(zzu zzuVar, zzxn zzxnVar, Continuation continuation) {
        super(2, continuation);
        this.zza = zzuVar;
        this.zzb = zzxnVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new zzs(this.zza, this.zzb, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzs) create((zzhk) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        zzcz zzczVar;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        zzu zzuVar = this.zza;
        zzczVar = zzuVar.zza;
        if (!zzczVar.zzb(zzu.zzl(zzuVar))) {
            Result.Companion companion = Result.Companion;
            return Result.box-impl(Result.constructor-impl(ResultKt.createFailure(new zzcg(zzce.zzb, zzcd.zzar, null, null, 12, null))));
        }
        zzxn zzxnVar = this.zzb;
        if (!zzxnVar.zzR() || zzxnVar.zzg().zzf().zzn()) {
            Result.Companion companion2 = Result.Companion;
            return Result.box-impl(Result.constructor-impl(ResultKt.createFailure(new zzcg(zzce.zzb, zzcd.zzaD, null, null, 12, null))));
        }
        zzuVar.zzb = zzxnVar.zzg().zzf().zzm();
        InitRequest build = new InitRequest.Builder().build();
        RecaptchaBaseClient client = RecaptchaBase.getClient(zzu.zzl(zzuVar));
        Intrinsics.checkNotNull(build);
        zzuVar.zzc = zzdf.zza(client.init(build));
        Result.Companion companion3 = Result.Companion;
        return Result.box-impl(Result.constructor-impl(Unit.INSTANCE));
    }
}
