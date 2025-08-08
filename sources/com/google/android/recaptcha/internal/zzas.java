package com.google.android.recaptcha.internal;

import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.telegram.tgnet.TLObject;

/* loaded from: classes.dex */
final class zzas extends ContinuationImpl {
    /* synthetic */ Object zza;
    final /* synthetic */ zzaw zzb;
    int zzc;
    zzaw zzd;
    zzbd zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzas(zzaw zzawVar, Continuation continuation) {
        super(continuation);
        this.zzb = zzawVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object zzk;
        this.zza = obj;
        this.zzc |= TLObject.FLAG_31;
        zzk = this.zzb.zzk(null, 0L, this);
        return zzk == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? zzk : Result.box-impl(zzk);
    }
}
