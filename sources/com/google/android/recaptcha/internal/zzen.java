package com.google.android.recaptcha.internal;

import com.google.android.recaptcha.RecaptchaAction;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
final class zzen extends eeb implements fs4 {
    int zza;
    final /* synthetic */ zzeq zzb;
    final /* synthetic */ RecaptchaAction zzc;
    final /* synthetic */ long zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzen(zzeq zzeqVar, RecaptchaAction recaptchaAction, long j, px2 px2Var) {
        super(2, px2Var);
        this.zzb = zzeqVar;
        this.zzc = recaptchaAction;
        this.zzd = j;
    }

    @Override // og0
    public final px2 create(Object obj, px2 px2Var) {
        return new zzen(this.zzb, this.zzc, this.zzd, px2Var);
    }

    @Override // fs4
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzen) create((ky2) obj, (px2) obj2)).invokeSuspend(g7c.a);
    }

    @Override // og0
    public final Object invokeSuspend(Object obj) {
        Object zze;
        int i = this.zza;
        tue.b(obj);
        if (i != 0) {
            zze = ((tc9) obj).a;
        } else {
            zzeq zzeqVar = this.zzb;
            RecaptchaAction recaptchaAction = this.zzc;
            long j = this.zzd;
            this.zza = 1;
            zze = zzeqVar.zze(recaptchaAction, j, this);
            ly2 ly2Var = ly2.a;
            if (zze == ly2Var) {
                return ly2Var;
            }
        }
        tue.b(zze);
        return zze;
    }
}
