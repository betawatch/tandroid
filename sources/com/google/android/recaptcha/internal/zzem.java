package com.google.android.recaptcha.internal;

import com.google.android.recaptcha.RecaptchaAction;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
final class zzem extends eeb implements fs4 {
    int zza;
    final /* synthetic */ zzeq zzb;
    final /* synthetic */ long zzc;
    final /* synthetic */ RecaptchaAction zzd;
    private /* synthetic */ Object zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzem(zzeq zzeqVar, long j, RecaptchaAction recaptchaAction, px2 px2Var) {
        super(2, px2Var);
        this.zzb = zzeqVar;
        this.zzc = j;
        this.zzd = recaptchaAction;
    }

    @Override // og0
    public final px2 create(Object obj, px2 px2Var) {
        zzem zzemVar = new zzem(this.zzb, this.zzc, this.zzd, px2Var);
        zzemVar.zze = obj;
        return zzemVar;
    }

    @Override // fs4
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzem) create((zzhh) obj, (px2) obj2)).invokeSuspend(g7c.a);
    }

    @Override // og0
    public final Object invokeSuspend(Object obj) {
        int i = this.zza;
        tue.b(obj);
        if (i != 0) {
            return obj;
        }
        zzhh zzhhVar = (zzhh) this.zze;
        zzel zzelVar = new zzel(this.zzb, this.zzc, this.zzd, null);
        this.zza = 1;
        Object zza = zzhj.zza(zzhhVar, zzelVar, this);
        ly2 ly2Var = ly2.a;
        return zza == ly2Var ? ly2Var : zza;
    }
}
