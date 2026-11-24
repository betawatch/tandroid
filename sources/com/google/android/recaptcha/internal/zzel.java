package com.google.android.recaptcha.internal;

import com.google.android.recaptcha.RecaptchaAction;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
final class zzel extends eeb implements fs4 {
    int zza;
    final /* synthetic */ zzeq zzb;
    final /* synthetic */ long zzc;
    final /* synthetic */ RecaptchaAction zzd;
    private /* synthetic */ Object zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzel(zzeq zzeqVar, long j, RecaptchaAction recaptchaAction, px2 px2Var) {
        super(2, px2Var);
        this.zzb = zzeqVar;
        this.zzc = j;
        this.zzd = recaptchaAction;
    }

    @Override // og0
    public final px2 create(Object obj, px2 px2Var) {
        zzel zzelVar = new zzel(this.zzb, this.zzc, this.zzd, px2Var);
        zzelVar.zze = obj;
        return zzelVar;
    }

    @Override // fs4
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzel) create((zzhk) obj, (px2) obj2)).invokeSuspend(g7c.a);
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
    @Override // og0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        zzhk zzhkVar;
        int i = this.zza;
        ly2 ly2Var = ly2.a;
        try {
        } catch (zzcg e) {
            obj = tue.a(e.zzc());
        }
        if (i == 0) {
            tue.b(obj);
            zzhkVar = (zzhk) this.zze;
            zzeq zzeqVar = this.zzb;
            long j = this.zzc;
            RecaptchaAction recaptchaAction = this.zzd;
            this.zze = zzhkVar;
            this.zza = 1;
            obj = new zzhf(9, new zzeo(zzeqVar, j, recaptchaAction, null), null);
        } else {
            if (i != 1) {
                tue.b(obj);
                return new tc9(obj);
            }
            zzhkVar = (zzhk) this.zze;
            tue.b(obj);
        }
        this.zze = null;
        this.zza = 2;
        obj = ((zzhf) obj).zza(zzhkVar, this);
    }
}
