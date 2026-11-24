package com.google.android.recaptcha.internal;

import com.google.android.recaptcha.RecaptchaAction;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
final class zzel extends ccb implements eq4 {
    int zza;
    final /* synthetic */ zzeq zzb;
    final /* synthetic */ long zzc;
    final /* synthetic */ RecaptchaAction zzd;
    private /* synthetic */ Object zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzel(zzeq zzeqVar, long j, RecaptchaAction recaptchaAction, fw2 fw2Var) {
        super(2, fw2Var);
        this.zzb = zzeqVar;
        this.zzc = j;
        this.zzd = recaptchaAction;
    }

    @Override // of0
    public final fw2 create(Object obj, fw2 fw2Var) {
        zzel zzelVar = new zzel(this.zzb, this.zzc, this.zzd, fw2Var);
        zzelVar.zze = obj;
        return zzelVar;
    }

    @Override // eq4
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzel) create((zzhk) obj, (fw2) obj2)).invokeSuspend(g5c.a);
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
    @Override // of0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        zzhk zzhkVar;
        int i = this.zza;
        bx2 bx2Var = bx2.a;
        try {
        } catch (zzcg e) {
            obj = qse.a(e.zzc());
        }
        if (i == 0) {
            qse.b(obj);
            zzhkVar = (zzhk) this.zze;
            zzeq zzeqVar = this.zzb;
            long j = this.zzc;
            RecaptchaAction recaptchaAction = this.zzd;
            this.zze = zzhkVar;
            this.zza = 1;
            obj = new zzhf(9, new zzeo(zzeqVar, j, recaptchaAction, null), null);
        } else {
            if (i != 1) {
                qse.b(obj);
                return new ta9(obj);
            }
            zzhkVar = (zzhk) this.zze;
            qse.b(obj);
        }
        this.zze = null;
        this.zza = 2;
        obj = ((zzhf) obj).zza(zzhkVar, this);
    }
}
