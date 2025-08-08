package com.google.android.recaptcha.internal;

import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.telegram.tgnet.TLObject;

/* loaded from: classes.dex */
final class zzer extends ContinuationImpl {
    /* synthetic */ Object zza;
    final /* synthetic */ zzez zzb;
    int zzc;
    zzez zzd;
    String zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzer(zzez zzezVar, Continuation continuation) {
        super(continuation);
        this.zzb = zzezVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.zza = obj;
        this.zzc |= TLObject.FLAG_31;
        Object zza = this.zzb.zza(null, 0L, this);
        return zza == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? zza : Result.box-impl(zza);
    }
}
