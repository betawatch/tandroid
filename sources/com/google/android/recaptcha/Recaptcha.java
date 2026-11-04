package com.google.android.recaptcha;

import android.app.Application;
import b8.ib;
import com.google.android.gms.tasks.Task;
import com.google.android.recaptcha.internal.zzdz;
import com.google.android.recaptcha.internal.zzeq;
import fd.c;
import gd.a;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class Recaptcha {
    public static final Recaptcha INSTANCE = new Recaptcha();

    private Recaptcha() {
    }

    public static final Task<RecaptchaTasksClient> fetchTaskClient(Application application, String str) {
        return zzdz.zze(application, str);
    }

    public static /* synthetic */ Object getClient-BWLJW6A$default(Recaptcha recaptcha, Application application, String str, long j10, c cVar, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            j10 = 10000;
        }
        return recaptcha.getClient-BWLJW6A(application, str, j10, cVar);
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
    public final Object getClient-BWLJW6A(Application application, String str, long j10, c cVar) {
        Recaptcha$getClient$1 recaptcha$getClient$1;
        int i3;
        try {
            if (cVar instanceof Recaptcha$getClient$1) {
                recaptcha$getClient$1 = (Recaptcha$getClient$1) cVar;
                int i10 = recaptcha$getClient$1.zzc;
                if ((i10 & TLObject.FLAG_31) != 0) {
                    recaptcha$getClient$1.zzc = i10 - TLObject.FLAG_31;
                    Object obj = recaptcha$getClient$1.zza;
                    a aVar = a.a;
                    i3 = recaptcha$getClient$1.zzc;
                    if (i3 != 0) {
                        ib.b(obj);
                        recaptcha$getClient$1.zzc = 1;
                        obj = zzdz.zzb(application, str, j10, recaptcha$getClient$1);
                        if (obj == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i3 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ib.b(obj);
                    }
                    return (zzeq) obj;
                }
            }
            if (i3 != 0) {
            }
            return (zzeq) obj;
        } catch (Throwable th2) {
            return ib.a(th2);
        }
        recaptcha$getClient$1 = new Recaptcha$getClient$1(this, cVar);
        Object obj2 = recaptcha$getClient$1.zza;
        a aVar2 = a.a;
        i3 = recaptcha$getClient$1.zzc;
    }

    public static final Task<RecaptchaTasksClient> getTasksClient(Application application, String str, long j10) {
        return zzdz.zzc(application, str, j10);
    }
}
