package com.google.android.recaptcha.internal;

import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
final class zzll extends SuspendLambda implements Function2 {
    int zza;
    final /* synthetic */ zzxn zzb;
    final /* synthetic */ zzly zzc;
    private /* synthetic */ Object zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzll(zzxn zzxnVar, zzly zzlyVar, Continuation continuation) {
        super(2, continuation);
        this.zzb = zzxnVar;
        this.zzc = zzlyVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        zzll zzllVar = new zzll(this.zzb, this.zzc, continuation);
        zzllVar.zzd = obj;
        return zzllVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzll) create((zzhk) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0056, code lost:
    
        if (((com.google.android.recaptcha.internal.zzhg) r8).zza(r1, r7) == r0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0048, code lost:
    
        if (r8 != r0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0070, code lost:
    
        if (r8.zzc(r1, r7) != r0) goto L24;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        zzhk zzhkVar;
        Object obj2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.zza;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            zzhkVar = (zzhk) this.zzd;
            zzxn zzxnVar = this.zzb;
            if (zzxnVar.zzV() && zzxnVar.zzT() && zzxnVar.zzS()) {
                zzly zzlyVar = this.zzc;
                zzlyVar.zze = zzxnVar;
                this.zzd = zzhkVar;
                this.zza = 2;
                obj = zzly.zzu(zzlyVar, this);
            } else {
                zzdj zzn = this.zzc.zzn();
                zzmc zzmcVar = zzmc.zzd;
                this.zza = 1;
            }
            return coroutine_suspended;
        }
        if (i == 1) {
            ResultKt.throwOnFailure(obj);
            Result.Companion companion = Result.Companion;
            obj2 = Result.constructor-impl(ResultKt.createFailure(new zzcg(zzce.zzb, zzcd.zzay, null, null, 12, null)));
            return Result.box-impl(obj2);
        }
        if (i != 2) {
            ResultKt.throwOnFailure(obj);
            Result.Companion companion2 = Result.Companion;
            obj2 = Result.constructor-impl(Unit.INSTANCE);
            return Result.box-impl(obj2);
        }
        zzhkVar = (zzhk) this.zzd;
        ResultKt.throwOnFailure(obj);
        this.zzd = null;
        this.zza = 3;
    }
}
