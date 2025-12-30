package com.google.android.recaptcha.internal;

import com.google.android.gms.tasks.Task;
import com.google.android.recaptcha.RecaptchaAction;
import com.google.android.recaptcha.RecaptchaClient;
import com.google.android.recaptcha.RecaptchaTasksClient;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.text.Regex;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Deferred;
import org.telegram.tgnet.TLObject;

/* loaded from: classes.dex */
public final class zzeq implements RecaptchaClient, RecaptchaTasksClient {
    private static final Regex zza = new Regex("^[a-zA-Z0-9/_]{1,100}$");
    private final zzdw zzb;
    private final String zzc;
    private final zzhh zzd;
    private final Lazy zze;

    public zzeq(zzdw zzdwVar, String str, zzhh zzhhVar) {
        this.zzb = zzdwVar;
        this.zzc = str;
        this.zzd = zzhhVar;
        int i = zzby.zza;
        this.zze = LazyKt.lazy(zzep.zza);
    }

    public static final /* synthetic */ void zzd(zzeq zzeqVar, long j, RecaptchaAction recaptchaAction) {
        zzcg zzcgVar = !zza.matches(recaptchaAction.getAction()) ? new zzcg(zzce.zzg, zzcd.zzh, null, null, 12, null) : null;
        if (j < 5000) {
            zzcgVar = new zzcg(zzce.zzb, zzcd.zzI, null, null, 12, null);
        }
        if (zzcgVar != null) {
            throw zzcgVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zze(RecaptchaAction recaptchaAction, long j, Continuation continuation) {
        zzek zzekVar;
        int i;
        if (continuation instanceof zzek) {
            zzekVar = (zzek) continuation;
            int i2 = zzekVar.zzc;
            if ((i2 & TLObject.FLAG_31) != 0) {
                zzekVar.zzc = i2 - TLObject.FLAG_31;
                Object obj = zzekVar.zza;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = zzekVar.zzc;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    zzhh zzhhVar = this.zzd;
                    zzem zzemVar = new zzem(this, j, recaptchaAction, null);
                    zzekVar.zzc = 1;
                    obj = zzemVar.invoke(zzhhVar, zzekVar);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return ((Result) obj).unbox-impl();
            }
        }
        zzekVar = new zzek(this, continuation);
        Object obj2 = zzekVar.zza;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = zzekVar.zzc;
        if (i != 0) {
        }
        return ((Result) obj2).unbox-impl();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // com.google.android.recaptcha.RecaptchaClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object execute-0E7RQCE(RecaptchaAction recaptchaAction, long j, Continuation continuation) {
        zzei zzeiVar;
        int i;
        if (continuation instanceof zzei) {
            zzeiVar = (zzei) continuation;
            int i2 = zzeiVar.zzc;
            if ((i2 & TLObject.FLAG_31) != 0) {
                zzeiVar.zzc = i2 - TLObject.FLAG_31;
                Object obj = zzeiVar.zza;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = zzeiVar.zzc;
                if (i == 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return ((Result) obj).unbox-impl();
                }
                ResultKt.throwOnFailure(obj);
                zzeiVar.zzc = 1;
                Object zze = zze(recaptchaAction, j, zzeiVar);
                return zze == coroutine_suspended ? coroutine_suspended : zze;
            }
        }
        zzeiVar = new zzei(this, continuation);
        Object obj2 = zzeiVar.zza;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = zzeiVar.zzc;
        if (i == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // com.google.android.recaptcha.RecaptchaClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object execute-gIAlu-s(RecaptchaAction recaptchaAction, Continuation continuation) {
        zzej zzejVar;
        int i;
        if (continuation instanceof zzej) {
            zzejVar = (zzej) continuation;
            int i2 = zzejVar.zzc;
            if ((i2 & TLObject.FLAG_31) != 0) {
                zzejVar.zzc = i2 - TLObject.FLAG_31;
                Object obj = zzejVar.zza;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = zzejVar.zzc;
                if (i == 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return ((Result) obj).unbox-impl();
                }
                ResultKt.throwOnFailure(obj);
                zzejVar.zzc = 1;
                Object obj2 = execute-0E7RQCE(recaptchaAction, 10000L, zzejVar);
                return obj2 == coroutine_suspended ? coroutine_suspended : obj2;
            }
        }
        zzejVar = new zzej(this, continuation);
        Object obj3 = zzejVar.zza;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = zzejVar.zzc;
        if (i == 0) {
        }
    }

    @Override // com.google.android.recaptcha.RecaptchaTasksClient
    public final Task<String> executeTask(RecaptchaAction recaptchaAction) {
        Deferred async$default;
        async$default = BuildersKt__Builders_commonKt.async$default(((zzcr) this.zze.getValue()).zzb(), null, null, new zzen(this, recaptchaAction, 10000L, null), 3, null);
        return zzbv.zza(async$default);
    }

    public final String zzc() {
        return this.zzc;
    }

    @Override // com.google.android.recaptcha.RecaptchaTasksClient
    public final Task<String> executeTask(RecaptchaAction recaptchaAction, long j) {
        Deferred async$default;
        async$default = BuildersKt__Builders_commonKt.async$default(((zzcr) this.zze.getValue()).zzb(), null, null, new zzen(this, recaptchaAction, j, null), 3, null);
        return zzbv.zza(async$default);
    }
}
