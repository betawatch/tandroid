package com.google.android.recaptcha;

import android.app.Application;
import com.google.android.gms.tasks.Task;
import com.google.android.recaptcha.internal.zzdz;
import com.google.android.recaptcha.internal.zzeq;
import id.c;
import jd.a;
import org.telegram.tgnet.TLObject;
import v7.t7;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class Recaptcha {
    public static final Recaptcha INSTANCE = new Recaptcha();

    private Recaptcha() {
    }

    public static final Task<RecaptchaTasksClient> fetchTaskClient(Application application, String str) {
        return zzdz.zze(application, str);
    }

    public static /* synthetic */ Object getClient-BWLJW6A$default(Recaptcha recaptcha, Application application, String str, long j3, c cVar, int i10, Object obj) {
        if ((i10 & 4) != 0) {
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
        int i10;
        try {
            if (cVar instanceof Recaptcha$getClient$1) {
                recaptcha$getClient$1 = (Recaptcha$getClient$1) cVar;
                int i11 = recaptcha$getClient$1.zzc;
                if ((i11 & TLObject.FLAG_31) != 0) {
                    recaptcha$getClient$1.zzc = i11 - TLObject.FLAG_31;
                    Object obj = recaptcha$getClient$1.zza;
                    a aVar = a.a;
                    i10 = recaptcha$getClient$1.zzc;
                    if (i10 != 0) {
                        t7.b(obj);
                        recaptcha$getClient$1.zzc = 1;
                        obj = zzdz.zzb(application, str, j3, recaptcha$getClient$1);
                        if (obj == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        t7.b(obj);
                    }
                    return (zzeq) obj;
                }
            }
            if (i10 != 0) {
            }
            return (zzeq) obj;
        } catch (Throwable th2) {
            return t7.a(th2);
        }
        recaptcha$getClient$1 = new Recaptcha$getClient$1(this, cVar);
        Object obj2 = recaptcha$getClient$1.zza;
        a aVar2 = a.a;
        i10 = recaptcha$getClient$1.zzc;
    }

    public static final Task<RecaptchaTasksClient> getTasksClient(Application application, String str, long j3) {
        return zzdz.zzc(application, str, j3);
    }
}
