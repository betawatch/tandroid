package com.google.android.recaptcha.internal;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes.dex */
final class zzid extends SuspendLambda implements Function2 {
    final /* synthetic */ zzif zza;
    final /* synthetic */ zzcy zzb;
    final /* synthetic */ zzye zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzid(zzif zzifVar, zzcy zzcyVar, zzye zzyeVar, Continuation continuation) {
        super(2, continuation);
        this.zza = zzifVar;
        this.zzb = zzcyVar;
        this.zzc = zzyeVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new zzid(this.zza, this.zzb, this.zzc, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzid) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        zzhl zzhlVar = null;
        try {
            try {
                try {
                    zzhlVar = zzif.zza(this.zza).zza(this.zzb.zzd());
                    zzhlVar.zzc();
                    zzhlVar.zze(this.zzc.zzd());
                    zzyg zzygVar = (zzyg) zzhlVar.zza(zzyg.zzi());
                    zzhlVar.zzd();
                    return zzygVar;
                } catch (Exception e) {
                    throw new zzcg(zzce.zzc, zzcd.zzF, e.getMessage(), null, 8, null);
                }
            } catch (zzcg e2) {
                throw e2;
            }
        } catch (Throwable th) {
            if (zzhlVar != null) {
                zzhlVar.zzd();
            }
            throw th;
        }
    }
}
