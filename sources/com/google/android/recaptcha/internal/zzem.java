package com.google.android.recaptcha.internal;

import com.google.android.recaptcha.RecaptchaAction;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
final class zzem extends yfb implements is4 {
    int zza;
    final /* synthetic */ zzeq zzb;
    final /* synthetic */ long zzc;
    final /* synthetic */ RecaptchaAction zzd;
    private /* synthetic */ Object zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzem(zzeq zzeqVar, long j, RecaptchaAction recaptchaAction, zw2 zw2Var) {
        super(2, zw2Var);
        this.zzb = zzeqVar;
        this.zzc = j;
        this.zzd = recaptchaAction;
    }

    @Override // qf0
    public final zw2 create(Object obj, zw2 zw2Var) {
        zzem zzemVar = new zzem(this.zzb, this.zzc, this.zzd, zw2Var);
        zzemVar.zze = obj;
        return zzemVar;
    }

    @Override // is4
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzem) create((zzhh) obj, (zw2) obj2)).invokeSuspend(f9c.a);
    }

    @Override // qf0
    public final Object invokeSuspend(Object obj) {
        int i = this.zza;
        ixe.b(obj);
        if (i != 0) {
            return obj;
        }
        zzhh zzhhVar = (zzhh) this.zze;
        zzel zzelVar = new zzel(this.zzb, this.zzc, this.zzd, null);
        this.zza = 1;
        Object zza = zzhj.zza(zzhhVar, zzelVar, this);
        vx2 vx2Var = vx2.a;
        return zza == vx2Var ? vx2Var : zza;
    }
}
