package com.google.android.recaptcha.internal;

import com.google.android.gms.recaptchabase.ExecuteRequest;
import com.google.android.gms.recaptchabase.ExecuteResult;
import com.google.android.gms.recaptchabase.RecaptchaBase;
import com.google.android.gms.recaptchabase.RecaptchaBaseClient;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Deferred;

/* loaded from: classes.dex */
final class zzr extends SuspendLambda implements Function2 {
    int zza;
    final /* synthetic */ zzu zzb;
    final /* synthetic */ String zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzr(zzu zzuVar, String str, Continuation continuation) {
        super(2, continuation);
        this.zzb = zzuVar;
        this.zzc = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new zzr(this.zzb, this.zzc, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzr) create((zzhk) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0026, code lost:
    
        if (r8 != r0) goto L15;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x006c  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Deferred deferred;
        String str;
        String payload;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.zza;
        try {
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    deferred = this.zzb.zzc;
                    if (deferred == null) {
                        deferred = null;
                    }
                    this.zza = 1;
                    obj = deferred.await(this);
                } else {
                    if (i != 1) {
                        ResultKt.throwOnFailure(obj);
                        payload = ((ExecuteResult) obj).getPayload();
                        if (payload != null) {
                            throw new IllegalStateException("Required value was null.");
                        }
                        String str2 = this.zzc;
                        zzxw zzf = zzxx.zzf();
                        zzf.zze(str2);
                        zzxi zzf2 = zzxj.zzf();
                        zzf2.zze(payload);
                        zzf.zzf((zzxj) zzf2.zzk());
                        return Result.box-impl(Result.constructor-impl((zzxx) zzf.zzk()));
                    }
                    ResultKt.throwOnFailure(obj);
                }
                ExecuteRequest.Builder builder = new ExecuteRequest.Builder();
                zzu zzuVar = this.zzb;
                str = zzuVar.zzb;
                ExecuteRequest build = builder.setNonce(str != null ? str : null).setExecuteId(this.zzc).build();
                RecaptchaBaseClient client = RecaptchaBase.getClient(zzu.zzl(zzuVar));
                Intrinsics.checkNotNull(build);
                Deferred zza = zzdf.zza(client.execute(build));
                this.zza = 2;
                obj = zza.await(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                payload = ((ExecuteResult) obj).getPayload();
                if (payload != null) {
                }
            } catch (Exception unused) {
                Result.Companion companion = Result.Companion;
                return Result.box-impl(Result.constructor-impl(ResultKt.createFailure(new zzcg(zzce.zzb, zzcd.zzau, null, null, 12, null))));
            }
        } catch (Exception unused2) {
            Result.Companion companion2 = Result.Companion;
            return Result.box-impl(Result.constructor-impl(ResultKt.createFailure(new zzcg(zzce.zzb, zzcd.zzat, null, null, 12, null))));
        }
    }
}
