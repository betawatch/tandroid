package com.google.android.recaptcha.internal;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$LongRef;
import org.telegram.tgnet.TLObject;

/* loaded from: classes.dex */
final class zzcu extends ContinuationImpl {
    long zza;
    double zzb;
    Object zzc;
    int zzd;
    int zze;
    /* synthetic */ Object zzf;
    final /* synthetic */ zzcx zzg;
    int zzh;
    Ref$LongRef zzi;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzcu(zzcx zzcxVar, Continuation continuation) {
        super(continuation);
        this.zzg = zzcxVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.zzf = obj;
        this.zzh |= TLObject.FLAG_31;
        return this.zzg.zza(0, 0L, 0L, 0.0d, null, this);
    }
}
