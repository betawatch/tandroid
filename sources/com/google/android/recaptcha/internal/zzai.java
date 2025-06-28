package com.google.android.recaptcha.internal;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.sync.Mutex;
import org.telegram.tgnet.TLRPC;

/* loaded from: classes.dex */
final class zzai extends ContinuationImpl {
    Object zza;
    Object zzb;
    Object zzc;
    long zzd;
    /* synthetic */ Object zze;
    final /* synthetic */ zzam zzf;
    int zzg;
    Mutex zzh;
    zzt zzi;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzai(zzam zzamVar, Continuation continuation) {
        super(continuation);
        this.zzf = zzamVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.zze = obj;
        this.zzg |= TLRPC.FLAG_31;
        return this.zzf.zza(null, null, 0L, null, null, null, null, this);
    }
}
