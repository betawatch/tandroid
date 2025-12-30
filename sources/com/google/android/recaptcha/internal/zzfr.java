package com.google.android.recaptcha.internal;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.telegram.tgnet.TLObject;

/* loaded from: classes.dex */
final class zzfr extends ContinuationImpl {
    /* synthetic */ Object zza;
    final /* synthetic */ zzgb zzb;
    int zzc;
    zzcs zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzfr(zzgb zzgbVar, Continuation continuation) {
        super(continuation);
        this.zzb = zzgbVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object zzp;
        this.zza = obj;
        this.zzc |= TLObject.FLAG_31;
        zzp = this.zzb.zzp(null, this);
        return zzp;
    }
}
