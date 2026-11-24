package com.google.android.recaptcha.internal;

import com.google.android.gms.tasks.Task;
import com.google.android.recaptcha.RecaptchaAction;
import com.google.android.recaptcha.RecaptchaClient;
import com.google.android.recaptcha.RecaptchaTasksClient;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class zzeq implements RecaptchaClient, RecaptchaTasksClient {
    private static final j79 zza = new j79("^[a-zA-Z0-9/_]{1,100}$");
    private final zzdw zzb;
    private final String zzc;
    private final zzhh zzd;
    private final d26 zze;

    public zzeq(zzdw zzdwVar, String str, zzhh zzhhVar) {
        this.zzb = zzdwVar;
        this.zzc = str;
        this.zzd = zzhhVar;
        int i = zzby.zza;
        this.zze = fpe.b(zzep.zza);
    }

    public static final void zzd(zzeq zzeqVar, long j, RecaptchaAction recaptchaAction) {
        j79 j79Var = zza;
        String action = recaptchaAction.getAction();
        j79Var.getClass();
        action.getClass();
        zzcg zzcgVar = !j79Var.a.matcher(action).matches() ? new zzcg(zzce.zzg, zzcd.zzh, null, null, 12, null) : null;
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
    public final Object zze(RecaptchaAction recaptchaAction, long j, px2 px2Var) {
        zzek zzekVar;
        int i;
        if (px2Var instanceof zzek) {
            zzekVar = (zzek) px2Var;
            int i2 = zzekVar.zzc;
            if ((i2 & TLObject.FLAG_31) != 0) {
                zzekVar.zzc = i2 - TLObject.FLAG_31;
                Object obj = zzekVar.zza;
                i = zzekVar.zzc;
                if (i != 0) {
                    tue.b(obj);
                    zzhh zzhhVar = this.zzd;
                    zzem zzemVar = new zzem(this, j, recaptchaAction, null);
                    zzekVar.zzc = 1;
                    obj = zzemVar.invoke(zzhhVar, zzekVar);
                    ly2 ly2Var = ly2.a;
                    if (obj == ly2Var) {
                        return ly2Var;
                    }
                } else {
                    if (i != 1) {
                        dq9.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    tue.b(obj);
                }
                return ((tc9) obj).a;
            }
        }
        zzekVar = new zzek(this, px2Var);
        Object obj2 = zzekVar.zza;
        i = zzekVar.zzc;
        if (i != 0) {
        }
        return ((tc9) obj2).a;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    @Override // com.google.android.recaptcha.RecaptchaClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object execute-0E7RQCE(RecaptchaAction recaptchaAction, long j, px2 px2Var) {
        zzei zzeiVar;
        int i;
        if (px2Var instanceof zzei) {
            zzeiVar = (zzei) px2Var;
            int i2 = zzeiVar.zzc;
            if ((i2 & TLObject.FLAG_31) != 0) {
                zzeiVar.zzc = i2 - TLObject.FLAG_31;
                Object obj = zzeiVar.zza;
                i = zzeiVar.zzc;
                if (i == 0) {
                    if (i == 1) {
                        tue.b(obj);
                        return ((tc9) obj).a;
                    }
                    dq9.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                tue.b(obj);
                zzeiVar.zzc = 1;
                Object zze = zze(recaptchaAction, j, zzeiVar);
                Object obj2 = ly2.a;
                return zze == obj2 ? obj2 : zze;
            }
        }
        zzeiVar = new zzei(this, px2Var);
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
    public final Object execute-gIAlu-s(RecaptchaAction recaptchaAction, px2 px2Var) {
        zzej zzejVar;
        int i;
        if (px2Var instanceof zzej) {
            zzejVar = (zzej) px2Var;
            int i2 = zzejVar.zzc;
            if ((i2 & TLObject.FLAG_31) != 0) {
                zzejVar.zzc = i2 - TLObject.FLAG_31;
                Object obj = zzejVar.zza;
                i = zzejVar.zzc;
                if (i == 0) {
                    if (i == 1) {
                        tue.b(obj);
                        return ((tc9) obj).a;
                    }
                    dq9.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                tue.b(obj);
                zzejVar.zzc = 1;
                Object obj2 = execute-0E7RQCE(recaptchaAction, 10000L, zzejVar);
                Object obj3 = ly2.a;
                return obj2 == obj3 ? obj3 : obj2;
            }
        }
        zzejVar = new zzej(this, px2Var);
        Object obj4 = zzejVar.zza;
        i = zzejVar.zzc;
        if (i == 0) {
        }
    }

    @Override // com.google.android.recaptcha.RecaptchaTasksClient
    public final Task<String> executeTask(RecaptchaAction recaptchaAction) {
        return zzbv.zza(srd.a(((zzcr) this.zze.getValue()).zzb(), new zzen(this, recaptchaAction, 10000L, null)));
    }

    public final String zzc() {
        return this.zzc;
    }

    @Override // com.google.android.recaptcha.RecaptchaTasksClient
    public final Task<String> executeTask(RecaptchaAction recaptchaAction, long j) {
        return zzbv.zza(srd.a(((zzcr) this.zze.getValue()).zzb(), new zzen(this, recaptchaAction, j, null)));
    }
}
