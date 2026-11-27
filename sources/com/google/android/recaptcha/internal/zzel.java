package com.google.android.recaptcha.internal;

import com.google.android.recaptcha.RecaptchaAction;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
final class zzel extends yfb implements is4 {
    int zza;
    final /* synthetic */ zzeq zzb;
    final /* synthetic */ long zzc;
    final /* synthetic */ RecaptchaAction zzd;
    private /* synthetic */ Object zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzel(zzeq zzeqVar, long j, RecaptchaAction recaptchaAction, zw2 zw2Var) {
        super(2, zw2Var);
        this.zzb = zzeqVar;
        this.zzc = j;
        this.zzd = recaptchaAction;
    }

    @Override // qf0
    public final zw2 create(Object obj, zw2 zw2Var) {
        zzel zzelVar = new zzel(this.zzb, this.zzc, this.zzd, zw2Var);
        zzelVar.zze = obj;
        return zzelVar;
    }

    @Override // is4
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzel) create((zzhk) obj, (zw2) obj2)).invokeSuspend(f9c.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0042, code lost:
    
        if (r11 == r3) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0044, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0035, code lost:
    
        if (r11 != r3) goto L13;
     */
    @Override // qf0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        zzhk zzhkVar;
        int i = this.zza;
        vx2 vx2Var = vx2.a;
        try {
        } catch (zzcg e) {
            obj = ixe.a(e.zzc());
        }
        if (i == 0) {
            ixe.b(obj);
            zzhkVar = (zzhk) this.zze;
            zzeq zzeqVar = this.zzb;
            long j = this.zzc;
            RecaptchaAction recaptchaAction = this.zzd;
            this.zze = zzhkVar;
            this.zza = 1;
            obj = new zzhf(9, new zzeo(zzeqVar, j, recaptchaAction, null), null);
        } else {
            if (i != 1) {
                ixe.b(obj);
                return new he9(obj);
            }
            zzhkVar = (zzhk) this.zze;
            ixe.b(obj);
        }
        this.zze = null;
        this.zza = 2;
        obj = ((zzhf) obj).zza(zzhkVar, this);
    }
}
