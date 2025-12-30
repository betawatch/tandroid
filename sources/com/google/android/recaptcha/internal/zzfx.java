package com.google.android.recaptcha.internal;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CompletableDeferred;

/* loaded from: classes.dex */
final class zzfx extends SuspendLambda implements Function2 {
    Object zza;
    int zzb;
    final /* synthetic */ zzgb zzc;
    final /* synthetic */ long zzd;
    final /* synthetic */ CompletableDeferred zze;
    private /* synthetic */ Object zzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzfx(zzgb zzgbVar, long j, CompletableDeferred completableDeferred, Continuation continuation) {
        super(2, continuation);
        this.zzc = zzgbVar;
        this.zzd = j;
        this.zze = completableDeferred;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        zzfx zzfxVar = new zzfx(this.zzc, this.zzd, this.zze, continuation);
        zzfxVar.zzf = obj;
        return zzfxVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzfx) create((zzgr) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x007c, code lost:
    
        if (r9 == r0) goto L36;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        zzgr zzgrVar;
        zzfp zzfpVar;
        zzgr zzgrVar2;
        zzgr zzgrVar3;
        zzfp zzfpVar2;
        zzds zzdsVar;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.zzb;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                zzgrVar = (zzgr) this.zzf;
                zzfpVar = this.zzc.zza;
                long j = this.zzd;
                this.zzf = zzgrVar;
                this.zza = zzgrVar;
                this.zzb = 1;
                obj = zzfpVar.zzp(j, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                zzgrVar2 = zzgrVar;
            } else if (i == 1) {
                zzgrVar = (zzgr) this.zza;
                zzgrVar2 = (zzgr) this.zzf;
                ResultKt.throwOnFailure(obj);
            } else {
                if (i != 2) {
                    if (i != 3) {
                        ResultKt.throwOnFailure(obj);
                        zzgb zzgbVar = this.zzc;
                        zzdsVar = zzdv.zzb;
                        zzgbVar.zzf = zzdsVar;
                        return Boxing.boxBoolean(this.zze.complete(Unit.INSTANCE));
                    }
                    zzgrVar3 = (zzgr) this.zzf;
                    ResultKt.throwOnFailure(obj);
                    this.zzf = null;
                    this.zzb = 4;
                    if (((zzhg) obj).zza(zzgrVar3.zza(), this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    zzgb zzgbVar2 = this.zzc;
                    zzdsVar = zzdv.zzb;
                    zzgbVar2.zzf = zzdsVar;
                    return Boxing.boxBoolean(this.zze.complete(Unit.INSTANCE));
                }
                zzgrVar3 = (zzgr) this.zzf;
                ResultKt.throwOnFailure(obj);
                zzxn zzxnVar = (zzxn) obj;
                zzgb zzgbVar3 = this.zzc;
                zzgbVar3.zze = zzxnVar;
                zzfpVar2 = zzgbVar3.zza;
                long j2 = this.zzd;
                this.zzf = zzgrVar3;
                this.zzb = 3;
                obj = zzfpVar2.zzn(zzxnVar, j2, this);
            }
            this.zzf = zzgrVar2;
            this.zza = null;
            this.zzb = 2;
            obj = ((zzhf) obj).zza(zzgrVar.zza(), this);
            if (obj != coroutine_suspended) {
                zzgrVar3 = zzgrVar2;
                zzxn zzxnVar2 = (zzxn) obj;
                zzgb zzgbVar32 = this.zzc;
                zzgbVar32.zze = zzxnVar2;
                zzfpVar2 = zzgbVar32.zza;
                long j22 = this.zzd;
                this.zzf = zzgrVar3;
                this.zzb = 3;
                obj = zzfpVar2.zzn(zzxnVar2, j22, this);
            }
            return coroutine_suspended;
        } catch (zzcg e) {
            this.zzc.zzd = e;
            throw e;
        }
    }
}
