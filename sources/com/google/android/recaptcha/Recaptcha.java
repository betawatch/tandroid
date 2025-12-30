package com.google.android.recaptcha;

import android.app.Application;
import com.google.android.gms.tasks.Task;
import com.google.android.recaptcha.internal.zzdz;
import com.google.android.recaptcha.internal.zzeq;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import org.telegram.tgnet.TLObject;

/* loaded from: classes.dex */
public final class Recaptcha {
    public static final Recaptcha INSTANCE = new Recaptcha();

    private Recaptcha() {
    }

    public static final Task<RecaptchaTasksClient> fetchTaskClient(Application application, String str) {
        return zzdz.zze(application, str);
    }

    public static /* synthetic */ Object getClient-BWLJW6A$default(Recaptcha recaptcha, Application application, String str, long j, Continuation continuation, int i, Object obj) {
        if ((i & 4) != 0) {
            j = 10000;
        }
        return recaptcha.getClient-BWLJW6A(application, str, j, continuation);
    }

    public static final Task<RecaptchaTasksClient> getTasksClient(Application application, String str) {
        return zzdz.zzc(application, str, 10000L);
    }

    public final Object fetchClient(Application application, String str, Continuation continuation) {
        return zzdz.zzd(application, str, continuation);
    }

    public static final Task<RecaptchaTasksClient> getTasksClient(Application application, String str, long j) {
        return zzdz.zzc(application, str, j);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getClient-BWLJW6A(Application application, String str, long j, Continuation continuation) {
        Recaptcha$getClient$1 recaptcha$getClient$1;
        int i;
        try {
            if (continuation instanceof Recaptcha$getClient$1) {
                recaptcha$getClient$1 = (Recaptcha$getClient$1) continuation;
                int i2 = recaptcha$getClient$1.zzc;
                if ((i2 & TLObject.FLAG_31) != 0) {
                    recaptcha$getClient$1.zzc = i2 - TLObject.FLAG_31;
                    Object obj = recaptcha$getClient$1.zza;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = recaptcha$getClient$1.zzc;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        Result.Companion companion = Result.Companion;
                        recaptcha$getClient$1.zzc = 1;
                        obj = zzdz.zzb(application, str, j, recaptcha$getClient$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    return Result.constructor-impl((zzeq) obj);
                }
            }
            if (i != 0) {
            }
            return Result.constructor-impl((zzeq) obj);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            return Result.constructor-impl(ResultKt.createFailure(th));
        }
        recaptcha$getClient$1 = new Recaptcha$getClient$1(this, continuation);
        Object obj2 = recaptcha$getClient$1.zza;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = recaptcha$getClient$1.zzc;
    }
}
