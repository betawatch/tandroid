package com.google.android.recaptcha.internal;

import com.google.android.recaptcha.RecaptchaAction;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
final class zzen extends yfb implements is4 {
    int zza;
    final /* synthetic */ zzeq zzb;
    final /* synthetic */ RecaptchaAction zzc;
    final /* synthetic */ long zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzen(zzeq zzeqVar, RecaptchaAction recaptchaAction, long j, zw2 zw2Var) {
        super(2, zw2Var);
        this.zzb = zzeqVar;
        this.zzc = recaptchaAction;
        this.zzd = j;
    }

    @Override // qf0
    public final zw2 create(Object obj, zw2 zw2Var) {
        return new zzen(this.zzb, this.zzc, this.zzd, zw2Var);
    }

    @Override // is4
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzen) create((ux2) obj, (zw2) obj2)).invokeSuspend(g9c.a);
    }

    @Override // qf0
    public final Object invokeSuspend(Object obj) {
        Object zze;
        int i = this.zza;
        ixe.b(obj);
        if (i != 0) {
            zze = ((he9) obj).a;
        } else {
            zzeq zzeqVar = this.zzb;
            RecaptchaAction recaptchaAction = this.zzc;
            long j = this.zzd;
            this.zza = 1;
            zze = zzeqVar.zze(recaptchaAction, j, this);
            vx2 vx2Var = vx2.a;
            if (zze == vx2Var) {
                return vx2Var;
            }
        }
        ixe.b(zze);
        return zze;
    }
}
