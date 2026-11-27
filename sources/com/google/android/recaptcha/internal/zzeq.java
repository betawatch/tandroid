package com.google.android.recaptcha.internal;

import com.google.android.gms.tasks.Task;
import com.google.android.recaptcha.RecaptchaAction;
import com.google.android.recaptcha.RecaptchaClient;
import com.google.android.recaptcha.RecaptchaTasksClient;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class zzeq implements RecaptchaClient, RecaptchaTasksClient {
    private static final u89 zza = new u89("^[a-zA-Z0-9/_]{1,100}$");
    private final zzdw zzb;
    private final String zzc;
    private final zzhh zzd;
    private final h26 zze;

    public zzeq(zzdw zzdwVar, String str, zzhh zzhhVar) {
        this.zzb = zzdwVar;
        this.zzc = str;
        this.zzd = zzhhVar;
        int i = zzby.zza;
        this.zze = ure.b(zzep.zza);
    }

    public static final void zzd(zzeq zzeqVar, long j, RecaptchaAction recaptchaAction) {
        u89 u89Var = zza;
        String action = recaptchaAction.getAction();
        u89Var.getClass();
        action.getClass();
        zzcg zzcgVar = !u89Var.a.matcher(action).matches() ? new zzcg(zzce.zzg, zzcd.zzh, null, null, 12, null) : null;
        if (j < 5000) {
            zzcgVar = new zzcg(zzce.zzb, zzcd.zzI, null, null, 12, null);
        }
        if (zzcgVar != null) {
            throw zzcgVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zze(RecaptchaAction recaptchaAction, long j, zw2 zw2Var) {
        zzek zzekVar;
        int i;
        if (zw2Var instanceof zzek) {
            zzekVar = (zzek) zw2Var;
            int i2 = zzekVar.zzc;
            if ((i2 & TLObject.FLAG_31) != 0) {
                zzekVar.zzc = i2 - TLObject.FLAG_31;
                Object obj = zzekVar.zza;
                i = zzekVar.zzc;
                if (i != 0) {
                    ixe.b(obj);
                    zzhh zzhhVar = this.zzd;
                    zzem zzemVar = new zzem(this, j, recaptchaAction, null);
                    zzekVar.zzc = 1;
                    obj = zzemVar.invoke(zzhhVar, zzekVar);
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
                return ((he9) obj).a;
            }
        }
        zzekVar = new zzek(this, zw2Var);
        Object obj2 = zzekVar.zza;
        i = zzekVar.zzc;
        if (i != 0) {
        }
        return ((he9) obj2).a;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    @Override // com.google.android.recaptcha.RecaptchaClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object execute-0E7RQCE(RecaptchaAction recaptchaAction, long j, zw2 zw2Var) {
        zzei zzeiVar;
        int i;
        if (zw2Var instanceof zzei) {
            zzeiVar = (zzei) zw2Var;
            int i2 = zzeiVar.zzc;
            if ((i2 & TLObject.FLAG_31) != 0) {
                zzeiVar.zzc = i2 - TLObject.FLAG_31;
                Object obj = zzeiVar.zza;
                i = zzeiVar.zzc;
                if (i == 0) {
                    if (i == 1) {
                        ixe.b(obj);
                        return ((he9) obj).a;
                    }
                    grb.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ixe.b(obj);
                zzeiVar.zzc = 1;
                Object zze = zze(recaptchaAction, j, zzeiVar);
                Object obj2 = vx2.a;
                return zze == obj2 ? obj2 : zze;
            }
        }
        zzeiVar = new zzei(this, zw2Var);
        Object obj3 = zzeiVar.zza;
        i = zzeiVar.zzc;
        if (i == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    @Override // com.google.android.recaptcha.RecaptchaClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object execute-gIAlu-s(RecaptchaAction recaptchaAction, zw2 zw2Var) {
        zzej zzejVar;
        int i;
        if (zw2Var instanceof zzej) {
            zzejVar = (zzej) zw2Var;
            int i2 = zzejVar.zzc;
            if ((i2 & TLObject.FLAG_31) != 0) {
                zzejVar.zzc = i2 - TLObject.FLAG_31;
                Object obj = zzejVar.zza;
                i = zzejVar.zzc;
                if (i == 0) {
                    if (i == 1) {
                        ixe.b(obj);
                        return ((he9) obj).a;
                    }
                    grb.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ixe.b(obj);
                zzejVar.zzc = 1;
                Object obj2 = execute-0E7RQCE(recaptchaAction, 10000L, zzejVar);
                Object obj3 = vx2.a;
                return obj2 == obj3 ? obj3 : obj2;
            }
        }
        zzejVar = new zzej(this, zw2Var);
        Object obj4 = zzejVar.zza;
        i = zzejVar.zzc;
        if (i == 0) {
        }
    }

    @Override // com.google.android.recaptcha.RecaptchaTasksClient
    public final Task<String> executeTask(RecaptchaAction recaptchaAction) {
        return zzbv.zza(fud.a(((zzcr) this.zze.getValue()).zzb(), new zzen(this, recaptchaAction, 10000L, null)));
    }

    public final String zzc() {
        return this.zzc;
    }

    @Override // com.google.android.recaptcha.RecaptchaTasksClient
    public final Task<String> executeTask(RecaptchaAction recaptchaAction, long j) {
        return zzbv.zza(fud.a(((zzcr) this.zze.getValue()).zzb(), new zzen(this, recaptchaAction, j, null)));
    }
}
