package com.google.android.recaptcha.internal;

import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
final class zzb extends SuspendLambda implements Function2 {
    int zza;
    final /* synthetic */ zzg zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ long zzd;
    private /* synthetic */ Object zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzb(zzg zzgVar, String str, long j, Continuation continuation) {
        super(2, continuation);
        this.zzb = zzgVar;
        this.zzc = str;
        this.zzd = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        zzb zzbVar = new zzb(this.zzb, this.zzc, this.zzd, continuation);
        zzbVar.zze = obj;
        return zzbVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzb) create((zzhk) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x004f, code lost:
    
        if (r12 != r0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0067, code lost:
    
        if (r12 != r0) goto L24;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        zzhk zzhkVar;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.zza;
        try {
        } catch (Exception unused) {
            Result.Companion companion = Result.Companion;
            zzg zzgVar = this.zzb;
            String str = this.zzc;
            this.zze = null;
            this.zza = 3;
            obj = zzgVar.zza(str, this);
        }
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            zzhkVar = (zzhk) this.zze;
            zzg zzgVar2 = this.zzb;
            String str2 = this.zzc;
            long j = this.zzd;
            this.zze = zzhkVar;
            this.zza = 1;
            zzhf zzhfVar = new zzhf(zzgVar2.zzj(), new zzf(j, zzgVar2, str2, null), null);
            if (zzhfVar != coroutine_suspended) {
                obj = zzhfVar;
            }
            return coroutine_suspended;
        }
        if (i != 1) {
            if (i != 2) {
                ResultKt.throwOnFailure(obj);
                obj2 = Result.constructor-impl(obj);
                return Result.box-impl(obj2);
            }
            ResultKt.throwOnFailure(obj);
            obj2 = Result.constructor-impl((zzxx) obj);
            return Result.box-impl(obj2);
        }
        zzhkVar = (zzhk) this.zze;
        ResultKt.throwOnFailure(obj);
        this.zze = null;
        this.zza = 2;
        obj = ((zzhf) obj).zza(zzhkVar, this);
    }
}
