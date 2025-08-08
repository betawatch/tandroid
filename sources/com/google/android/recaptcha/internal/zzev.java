package com.google.android.recaptcha.internal;

import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.telegram.tgnet.TLObject;

/* loaded from: classes.dex */
final class zzev extends ContinuationImpl {
    long zza;
    /* synthetic */ Object zzb;
    final /* synthetic */ zzez zzc;
    int zzd;
    zzez zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzev(zzez zzezVar, Continuation continuation) {
        super(continuation);
        this.zzc = zzezVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.zzb = obj;
        this.zzd |= TLObject.FLAG_31;
        Object zzb = this.zzc.zzb(0L, null, this);
        return zzb == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? zzb : Result.box-impl(zzb);
    }
}
