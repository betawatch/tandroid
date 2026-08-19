package com.google.android.recaptcha.internal;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
final class zzfu extends SuspendLambda implements Function2 {
    int zza;
    final /* synthetic */ zzgb zzb;
    final /* synthetic */ long zzc;
    private /* synthetic */ Object zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzfu(zzgb zzgbVar, long j, Continuation continuation) {
        super(2, continuation);
        this.zzb = zzgbVar;
        this.zzc = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        zzfu zzfuVar = new zzfu(this.zzb, this.zzc, continuation);
        zzfuVar.zzd = obj;
        return zzfuVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzfu) create((zzhk) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0042, code lost:
    
        if (((com.google.android.recaptcha.internal.zzhg) r13).zza(r1, r12) != r0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0036, code lost:
    
        if (r13 != r0) goto L14;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x006b A[Catch: Exception -> 0x0013, TRY_ENTER, TryCatch #0 {Exception -> 0x0013, blocks: (B:6:0x000f, B:7:0x0057, B:13:0x006b, B:14:0x0079, B:17:0x0044), top: B:2:0x0009 }] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        zzdr zzdrVar;
        zzcg zzcgVar;
        zzdt zzdtVar;
        zzhk zzhkVar;
        long longValue;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.zza;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                zzhkVar = (zzhk) this.zzd;
                zzgb zzgbVar = this.zzb;
                long j = this.zzc;
                this.zzd = zzhkVar;
                this.zza = 1;
                obj = zzgbVar.zzq(j, this);
            } else if (i == 1) {
                zzhkVar = (zzhk) this.zzd;
                ResultKt.throwOnFailure(obj);
            } else {
                if (i != 2) {
                    ResultKt.throwOnFailure(obj);
                    longValue = this.zzc - ((Number) obj).longValue();
                    if (longValue < 500) {
                        return Boxing.boxLong(longValue);
                    }
                    throw new zzcg(zzce.zzc, zzcd.zzas, null, null, 12, null);
                }
                ResultKt.throwOnFailure(obj);
                zzgb zzgbVar2 = this.zzb;
                zzft zzftVar = new zzft(this.zzc, zzgbVar2, null);
                this.zza = 3;
                obj = zzgbVar2.zzp(zzftVar, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                longValue = this.zzc - ((Number) obj).longValue();
                if (longValue < 500) {
                }
            }
            this.zzd = null;
            this.zza = 2;
        } catch (Exception e) {
            zzcg zzcgVar2 = e instanceof zzcg ? (zzcg) e : null;
            if (zzcgVar2 == null) {
                zzcgVar2 = new zzcg(zzce.zzc, zzcd.zzas, e.getMessage(), null, 8, null);
            }
            zzgb zzgbVar3 = this.zzb;
            zzdv zze = zzgbVar3.zze();
            zzdrVar = zzdv.zzd;
            if (!Intrinsics.areEqual(zze, zzdrVar)) {
                zzdv zze2 = zzgbVar3.zze();
                zzdtVar = zzdv.zzc;
                if (!Intrinsics.areEqual(zze2, zzdtVar)) {
                    throw zzcgVar2;
                }
            }
            zzcgVar = zzgbVar3.zzd;
            if (zzcgVar != null) {
                throw zzcgVar;
            }
            throw zzcgVar2;
        }
    }
}
