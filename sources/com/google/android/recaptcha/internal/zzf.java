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
final class zzf extends SuspendLambda implements Function2 {
    int zza;
    final /* synthetic */ long zzb;
    final /* synthetic */ zzg zzc;
    final /* synthetic */ String zzd;
    private /* synthetic */ Object zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzf(long j, zzg zzgVar, String str, Continuation continuation) {
        super(2, continuation);
        this.zzb = j;
        this.zzc = zzgVar;
        this.zzd = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        zzf zzfVar = new zzf(this.zzb, this.zzc, this.zzd, continuation);
        zzfVar.zze = obj;
        return zzfVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzf) create((zzgr) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0034, code lost:
    
        if (r15 != r1) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0069, code lost:
    
        return r1;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.zza;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                zzgr zzgrVar = (zzgr) this.zze;
                long j = this.zzb;
                zze zzeVar = new zze(zzgrVar, this.zzc, this.zzd, null);
                this.zza = 1;
                obj = TimeoutKt.withTimeout(j, zzeVar, this);
            } else {
                if (i != 1) {
                    zzcg zzcgVar = (zzcg) this.zze;
                    ResultKt.throwOnFailure(obj);
                    throw zzcgVar;
                }
                ResultKt.throwOnFailure(obj);
            }
            Object obj2 = ((Result) obj).unbox-impl();
            ResultKt.throwOnFailure(obj2);
            return (zzxx) obj2;
        } catch (Exception e) {
            zzcg zza = zzh.zza(e, new zzcg(zzce.zzb, zzcd.zzaa, e.getMessage(), null, 8, null));
            zzg zzgVar = this.zzc;
            String str = this.zzd;
            long j2 = this.zzb;
            this.zze = zza;
            this.zza = 2;
            if (zzgVar.zze(str, j2, e, this) != coroutine_suspended) {
                throw zza;
            }
        }
    }
}
