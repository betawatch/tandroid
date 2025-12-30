package com.google.android.recaptcha.internal;

import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.TimeoutKt;

/* loaded from: classes.dex */
final class zzd extends SuspendLambda implements Function2 {
    int zza;
    final /* synthetic */ zzg zzb;
    final /* synthetic */ long zzc;
    final /* synthetic */ zzxn zzd;
    private /* synthetic */ Object zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzd(zzg zzgVar, long j, zzxn zzxnVar, Continuation continuation) {
        super(2, continuation);
        this.zzb = zzgVar;
        this.zzc = j;
        this.zzd = zzxnVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        zzd zzdVar = new zzd(this.zzb, this.zzc, this.zzd, continuation);
        zzdVar.zze = obj;
        return zzdVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzd) create((zzgr) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0042, code lost:
    
        if (r10 != r0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0061, code lost:
    
        if (r10 != r0) goto L24;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.zza;
        try {
        } catch (Exception e) {
            zzg zzgVar = this.zzb;
            zzgVar.zza = false;
            this.zza = 2;
            obj = zzgVar.zzf(e, this);
        }
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            zzgr zzgrVar = (zzgr) this.zze;
            zzg zzgVar2 = this.zzb;
            if (zzgVar2.zzi()) {
                return Unit.INSTANCE;
            }
            long j = this.zzc;
            zzc zzcVar = new zzc(zzgrVar, zzgVar2, this.zzd, null);
            this.zza = 1;
            obj = TimeoutKt.withTimeout(j, zzcVar, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    zzcg zzcgVar = (zzcg) this.zze;
                    ResultKt.throwOnFailure(obj);
                    throw zzcgVar;
                }
                ResultKt.throwOnFailure(obj);
                zzg zzgVar3 = this.zzb;
                zzcg zzcgVar2 = (zzcg) obj;
                this.zze = zzcgVar2;
                this.zza = 3;
                if (zzgVar3.zzc(zzcgVar2, this) != coroutine_suspended) {
                    throw zzcgVar2;
                }
                return coroutine_suspended;
            }
            ResultKt.throwOnFailure(obj);
        }
        ResultKt.throwOnFailure(((Result) obj).unbox-impl());
        this.zzb.zza = true;
        return Unit.INSTANCE;
    }
}
