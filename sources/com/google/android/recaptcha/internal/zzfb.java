package com.google.android.recaptcha.internal;

import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.sequences.SequencesKt;
import kotlinx.coroutines.AwaitKt;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.JobKt__JobKt;

/* loaded from: classes.dex */
final class zzfb extends SuspendLambda implements Function2 {
    int zza;
    final /* synthetic */ zzfp zzb;
    final /* synthetic */ zzxn zzc;
    final /* synthetic */ long zzd;
    private /* synthetic */ Object zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzfb(zzfp zzfpVar, zzxn zzxnVar, long j, Continuation continuation) {
        super(2, continuation);
        this.zzb = zzfpVar;
        this.zzc = zzxnVar;
        this.zzd = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        zzfb zzfbVar = new zzfb(this.zzb, this.zzc, this.zzd, continuation);
        zzfbVar.zze = obj;
        return zzfbVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzfb) create((zzhk) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0052, code lost:
    
        if (((com.google.android.recaptcha.internal.zzhf) r9).zza(r1, r8) == r0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x008e, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0046, code lost:
    
        if (r9 != r0) goto L17;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        zzhk zzhkVar;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.zza;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                zzhkVar = (zzhk) this.zze;
                zzfp zzfpVar = this.zzb;
                zzxn zzxnVar = this.zzc;
                zzfp.zzv(zzxnVar.zzP());
                zzq zzb = zzfp.zzb(zzfpVar);
                long j = this.zzd;
                this.zze = zzhkVar;
                this.zza = 1;
                obj = zzb.zzc(j, zzxnVar, this);
            } else {
                if (i != 1) {
                    if (i == 2) {
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    zzcg zzcgVar = (zzcg) this.zze;
                    ResultKt.throwOnFailure(obj);
                    throw zzcgVar;
                }
                zzhkVar = (zzhk) this.zze;
                ResultKt.throwOnFailure(obj);
            }
            this.zze = null;
            this.zza = 2;
        } catch (zzcg e) {
            zzfp zzfpVar2 = this.zzb;
            JobKt__JobKt.cancelChildren$default(zzfp.zzf(zzfpVar2).zzd().getCoroutineContext(), null, 1, null);
            List list = SequencesKt.toList(JobKt.getJob(zzfp.zzf(zzfpVar2).zzd().getCoroutineContext()).getChildren());
            this.zze = e;
            this.zza = 3;
            if (AwaitKt.joinAll(list, this) != coroutine_suspended) {
                throw e;
            }
        }
    }
}
