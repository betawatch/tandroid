package com.google.android.recaptcha.internal;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
final class zzgd extends SuspendLambda implements Function2 {
    Object zza;
    double zzb;
    int zzc;
    final /* synthetic */ zzge zzd;
    final /* synthetic */ long zze;
    private /* synthetic */ Object zzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzgd(zzge zzgeVar, long j, Continuation continuation) {
        super(2, continuation);
        this.zzd = zzgeVar;
        this.zze = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        zzgd zzgdVar = new zzgd(this.zzd, this.zze, continuation);
        zzgdVar.zzf = obj;
        return zzgdVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzgd) create((zzhk) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x00b7, code lost:
    
        if (r13 == r0) goto L40;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        zzdr zzdrVar;
        zzhk zzhkVar;
        zzdv zzdvVar;
        zzds zzdsVar;
        zzdv zzdvVar2;
        zzdr zzdrVar2;
        zzdt zzdtVar;
        zzfp zzfpVar;
        double d;
        zzhk zzhkVar2;
        double d2;
        zzhk zzhkVar3;
        zzfp zzfpVar2;
        zzds zzdsVar2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.zzc;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                zzhkVar = (zzhk) this.zzf;
                zzge zzgeVar = this.zzd;
                zzdvVar = zzgeVar.zzb;
                zzdsVar = zzdv.zzb;
                if (!Intrinsics.areEqual(zzdvVar, zzdsVar)) {
                    zzdvVar2 = zzgeVar.zzb;
                    zzdrVar2 = zzdv.zzd;
                    if (!Intrinsics.areEqual(zzdvVar2, zzdrVar2)) {
                        zzdtVar = zzdv.zzc;
                        zzgeVar.zzb = zzdtVar;
                        double d3 = this.zze;
                        zzfpVar = zzgeVar.zza;
                        double d4 = 0.6d * d3;
                        this.zzf = zzhkVar;
                        this.zza = zzhkVar;
                        double d5 = d3 * 0.4d;
                        this.zzb = d5;
                        this.zzc = 1;
                        obj = zzfpVar.zzp((long) d4, this);
                        if (obj != coroutine_suspended) {
                            d = d5;
                            zzhkVar2 = zzhkVar;
                        }
                        return coroutine_suspended;
                    }
                }
                return Unit.INSTANCE;
            }
            if (i == 1) {
                d = this.zzb;
                zzhkVar = (zzhk) this.zza;
                zzhkVar2 = (zzhk) this.zzf;
                ResultKt.throwOnFailure(obj);
            } else {
                if (i != 2) {
                    if (i != 3) {
                        ResultKt.throwOnFailure(obj);
                        zzge zzgeVar2 = this.zzd;
                        zzdsVar2 = zzdv.zzb;
                        zzgeVar2.zzb = zzdsVar2;
                        return Unit.INSTANCE;
                    }
                    zzhkVar3 = (zzhk) this.zzf;
                    ResultKt.throwOnFailure(obj);
                    this.zzf = null;
                    this.zzc = 4;
                    if (((zzhg) obj).zza(zzhkVar3, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    zzge zzgeVar22 = this.zzd;
                    zzdsVar2 = zzdv.zzb;
                    zzgeVar22.zzb = zzdsVar2;
                    return Unit.INSTANCE;
                }
                d2 = this.zzb;
                zzhkVar3 = (zzhk) this.zzf;
                ResultKt.throwOnFailure(obj);
                zzxn zzxnVar = (zzxn) obj;
                zzge zzgeVar3 = this.zzd;
                zzgeVar3.zzc = zzxnVar;
                zzfpVar2 = zzgeVar3.zza;
                this.zzf = zzhkVar3;
                this.zzc = 3;
                obj = zzfpVar2.zzn(zzxnVar, (long) d2, this);
            }
            this.zzf = zzhkVar2;
            this.zza = null;
            this.zzb = d;
            this.zzc = 2;
            obj = ((zzhf) obj).zza(zzhkVar, this);
            if (obj != coroutine_suspended) {
                d2 = d;
                zzhkVar3 = zzhkVar2;
                zzxn zzxnVar2 = (zzxn) obj;
                zzge zzgeVar32 = this.zzd;
                zzgeVar32.zzc = zzxnVar2;
                zzfpVar2 = zzgeVar32.zza;
                this.zzf = zzhkVar3;
                this.zzc = 3;
                obj = zzfpVar2.zzn(zzxnVar2, (long) d2, this);
            }
            return coroutine_suspended;
        } catch (zzcg e) {
            zzge zzgeVar4 = this.zzd;
            zzdrVar = zzdv.zzd;
            zzgeVar4.zzb = zzdrVar;
            throw e;
        }
    }
}
