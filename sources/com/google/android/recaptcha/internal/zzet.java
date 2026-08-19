package com.google.android.recaptcha.internal;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.TimeoutCancellationException;

/* loaded from: classes.dex */
final class zzet extends SuspendLambda implements Function2 {
    int zza;
    final /* synthetic */ zzfp zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ long zzd;
    private /* synthetic */ Object zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzet(zzfp zzfpVar, String str, long j, Continuation continuation) {
        super(2, continuation);
        this.zzb = zzfpVar;
        this.zzc = str;
        this.zzd = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        zzet zzetVar = new zzet(this.zzb, this.zzc, this.zzd, continuation);
        zzetVar.zze = obj;
        return zzetVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzet) create((zzgr) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x003a, code lost:
    
        if (r8 != r0) goto L19;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        zzgr zzgrVar;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.zza;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                zzgrVar = (zzgr) this.zze;
                zzq zzb = zzfp.zzb(this.zzb);
                String str = this.zzc;
                long j = this.zzd;
                this.zze = zzgrVar;
                this.zza = 1;
                obj = zzb.zzb(str, j, this);
            } else {
                if (i != 1) {
                    ResultKt.throwOnFailure(obj);
                    return (zzxx) obj;
                }
                zzgrVar = (zzgr) this.zze;
                ResultKt.throwOnFailure(obj);
            }
            this.zze = null;
            this.zza = 2;
            obj = ((zzhf) obj).zza(zzgrVar.zza(), this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            return (zzxx) obj;
        } catch (zzcg e) {
            throw e;
        } catch (TimeoutCancellationException e2) {
            throw new zzcg(zzce.zzb, zzcd.zzb, e2.getMessage(), null, 8, null);
        } catch (Exception e3) {
            throw new zzcg(zzce.zzb, zzcd.zzaa, e3.getMessage(), null, 8, null);
        }
    }
}
