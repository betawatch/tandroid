package com.google.android.recaptcha.internal;

import java.util.Timer;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
final class zzbj extends SuspendLambda implements Function2 {
    final /* synthetic */ zzbo zza;
    private /* synthetic */ Object zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzbj(zzbo zzboVar, Continuation continuation) {
        super(2, continuation);
        this.zza = zzboVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        zzbj zzbjVar = new zzbj(this.zza, continuation);
        zzbjVar.zzb = obj;
        return zzbjVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzbj) create((zzhk) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        boolean z;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        zzhk zzhkVar = (zzhk) this.zzb;
        zzbo zzboVar = this.zza;
        z = zzboVar.zzg;
        if (!z) {
            new Timer().schedule(new zzbi(zzboVar, zzhkVar), 28800000L, 28800000L);
            zzboVar.zzg = true;
        }
        return Unit.INSTANCE;
    }
}
