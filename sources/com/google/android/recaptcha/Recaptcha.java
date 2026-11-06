package com.google.android.recaptcha;

import af.b;
import android.app.Application;
import com.google.android.gms.tasks.Task;
import com.google.android.recaptcha.internal.zzdz;
import com.google.android.recaptcha.internal.zzeq;
import id.c;
import jd.a;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final class Recaptcha {
    public static final Recaptcha INSTANCE = new Recaptcha();

    private Recaptcha() {
    }

    public static final Task<RecaptchaTasksClient> fetchTaskClient(Application application, String str) {
        return zzdz.zze(application, str);
    }

    public static /* synthetic */ Object getClient-BWLJW6A$default(Recaptcha recaptcha, Application application, String str, long j3, c cVar, int i7, Object obj) {
        if ((i7 & 4) != 0) {
            j3 = 10000;
        }
        return recaptcha.getClient-BWLJW6A(application, str, j3, cVar);
    }

    public static final Task<RecaptchaTasksClient> getTasksClient(Application application, String str) {
        return zzdz.zzc(application, str, 10000L);
    }

    public final Object fetchClient(Application application, String str, c cVar) {
        return zzdz.zzd(application, str, cVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getClient-BWLJW6A(Application application, String str, long j3, c cVar) {
        Recaptcha$getClient$1 recaptcha$getClient$1;
        int i7;
        try {
            if (cVar instanceof Recaptcha$getClient$1) {
                recaptcha$getClient$1 = (Recaptcha$getClient$1) cVar;
                int i10 = recaptcha$getClient$1.zzc;
                if ((i10 & TLObject.FLAG_31) != 0) {
                    recaptcha$getClient$1.zzc = i10 - TLObject.FLAG_31;
                    Object obj = recaptcha$getClient$1.zza;
                    a aVar = a.a;
                    i7 = recaptcha$getClient$1.zzc;
                    if (i7 != 0) {
                        b.c(obj);
                        recaptcha$getClient$1.zzc = 1;
                        obj = zzdz.zzb(application, str, j3, recaptcha$getClient$1);
                        if (obj == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i7 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        b.c(obj);
                    }
                    return (zzeq) obj;
                }
            }
            if (i7 != 0) {
            }
            return (zzeq) obj;
        } catch (Throwable th2) {
            return b.b(th2);
        }
        recaptcha$getClient$1 = new Recaptcha$getClient$1(this, cVar);
        Object obj2 = recaptcha$getClient$1.zza;
        a aVar2 = a.a;
        i7 = recaptcha$getClient$1.zzc;
    }

    public static final Task<RecaptchaTasksClient> getTasksClient(Application application, String str, long j3) {
        return zzdz.zzc(application, str, j3);
    }
}
