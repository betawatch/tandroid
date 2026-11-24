package com.google.android.recaptcha.internal;

import com.google.android.recaptcha.RecaptchaAction;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
final class zzen extends ccb implements eq4 {
    int zza;
    final /* synthetic */ zzeq zzb;
    final /* synthetic */ RecaptchaAction zzc;
    final /* synthetic */ long zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzen(zzeq zzeqVar, RecaptchaAction recaptchaAction, long j, fw2 fw2Var) {
        super(2, fw2Var);
        this.zzb = zzeqVar;
        this.zzc = recaptchaAction;
        this.zzd = j;
    }

    @Override // of0
    public final fw2 create(Object obj, fw2 fw2Var) {
        return new zzen(this.zzb, this.zzc, this.zzd, fw2Var);
    }

    @Override // eq4
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzen) create((ax2) obj, (fw2) obj2)).invokeSuspend(g5c.a);
    }

    @Override // of0
    public final Object invokeSuspend(Object obj) {
        Object zze;
        int i = this.zza;
        qse.b(obj);
        if (i != 0) {
            zze = ((ta9) obj).a;
        } else {
            zzeq zzeqVar = this.zzb;
            RecaptchaAction recaptchaAction = this.zzc;
            long j = this.zzd;
            this.zza = 1;
            zze = zzeqVar.zze(recaptchaAction, j, this);
            bx2 bx2Var = bx2.a;
            if (zze == bx2Var) {
                return bx2Var;
            }
        }
        qse.b(zze);
        return zze;
    }
}
