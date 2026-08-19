package com.google.android.recaptcha.internal;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes.dex */
final class zzfc extends SuspendLambda implements Function2 {
    Object zza;
    int zzb;
    final /* synthetic */ zzhk zzc;
    final /* synthetic */ zzfp zzd;
    final /* synthetic */ zzxn zze;
    final /* synthetic */ long zzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzfc(zzhk zzhkVar, zzfp zzfpVar, zzxn zzxnVar, long j, Continuation continuation) {
        super(2, continuation);
        this.zzc = zzhkVar;
        this.zzd = zzfpVar;
        this.zze = zzxnVar;
        this.zzf = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new zzfc(this.zzc, this.zzd, this.zze, this.zzf, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzfc) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003f, code lost:
    
        if (((com.google.android.recaptcha.internal.zzhg) r10).zza(r1, r9) == r0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0045, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0031, code lost:
    
        if (r10 != r0) goto L9;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        zzhk zzhkVar;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.zzb;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            zzhkVar = this.zzc;
            zzfp zzfpVar = this.zzd;
            zzxn zzxnVar = this.zze;
            long j = this.zzf;
            this.zza = zzhkVar;
            this.zzb = 1;
            obj = new zzhg(new zzfb(zzfpVar, zzxnVar, j, null));
        } else {
            if (i != 1) {
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            zzhkVar = (zzhk) this.zza;
            ResultKt.throwOnFailure(obj);
        }
        this.zza = null;
        this.zzb = 2;
    }
}
