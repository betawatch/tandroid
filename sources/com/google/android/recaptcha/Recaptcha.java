package com.google.android.recaptcha;

import android.app.Application;
import com.google.android.gms.tasks.Task;
import com.google.android.recaptcha.internal.zzdz;
import com.google.android.recaptcha.internal.zzeq;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class Recaptcha {
    public static final Recaptcha INSTANCE = new Recaptcha();

    private Recaptcha() {
    }

    public static final Task<RecaptchaTasksClient> fetchTaskClient(Application application, String str) {
        return zzdz.zze(application, str);
    }

    public static /* synthetic */ Object getClient-BWLJW6A$default(Recaptcha recaptcha, Application application, String str, long j, zw2 zw2Var, int i, Object obj) {
        if ((i & 4) != 0) {
            j = 10000;
        }
        return recaptcha.getClient-BWLJW6A(application, str, j, zw2Var);
    }

    public static final Task<RecaptchaTasksClient> getTasksClient(Application application, String str) {
        return zzdz.zzc(application, str, 10000L);
    }

    public final Object fetchClient(Application application, String str, zw2 zw2Var) {
        return zzdz.zzd(application, str, zw2Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getClient-BWLJW6A(Application application, String str, long j, zw2 zw2Var) {
        Recaptcha$getClient$1 recaptcha$getClient$1;
        int i;
        try {
            if (zw2Var instanceof Recaptcha$getClient$1) {
                recaptcha$getClient$1 = (Recaptcha$getClient$1) zw2Var;
                int i2 = recaptcha$getClient$1.zzc;
                if ((i2 & TLObject.FLAG_31) != 0) {
                    recaptcha$getClient$1.zzc = i2 - TLObject.FLAG_31;
                    Object obj = recaptcha$getClient$1.zza;
                    i = recaptcha$getClient$1.zzc;
                    if (i != 0) {
                        ixe.b(obj);
                        recaptcha$getClient$1.zzc = 1;
                        obj = zzdz.zzb(application, str, j, recaptcha$getClient$1);
                        vx2 vx2Var = vx2.a;
                        if (obj == vx2Var) {
                            return vx2Var;
                        }
                    } else {
                        if (i != 1) {
                            grb.i("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ixe.b(obj);
                    }
                    return (zzeq) obj;
                }
            }
            if (i != 0) {
            }
            return (zzeq) obj;
        } catch (Throwable th) {
            return new ge9(th);
        }
        recaptcha$getClient$1 = new Recaptcha$getClient$1(this, zw2Var);
        Object obj2 = recaptcha$getClient$1.zza;
        i = recaptcha$getClient$1.zzc;
    }

    public static final Task<RecaptchaTasksClient> getTasksClient(Application application, String str, long j) {
        return zzdz.zzc(application, str, j);
    }
}
