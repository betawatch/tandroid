package com.google.android.recaptcha.internal;

import android.content.ContentResolver;
import android.os.Build;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class zzx implements zzar {
    private final d26 zza;

    public zzx() {
        int i = zzby.zza;
        this.zza = fpe.b(zzw.zza);
    }

    public static final /* synthetic */ ContentResolver zzb(zzx zzxVar) {
        return (ContentResolver) zzxVar.zza.getValue();
    }

    @Override // com.google.android.recaptcha.internal.zzar
    public final int zza() {
        return 17;
    }

    @Override // com.google.android.recaptcha.internal.zzar
    public final /* synthetic */ Object zzc(String str, px2 px2Var) {
        return zzam.zza(this, str, px2Var);
    }

    @Override // com.google.android.recaptcha.internal.zzar
    public final /* synthetic */ Object zzd(zzxp zzxpVar, px2 px2Var) {
        Object zzd;
        zzd = zzhj.zzd(36, zza(), new zzap(this, zzxpVar, null), px2Var);
        return zzd;
    }

    @Override // com.google.android.recaptcha.internal.zzar
    public final Object zze(String str, px2 px2Var) {
        return new zzhg(new zzv(this, null));
    }

    @Override // com.google.android.recaptcha.internal.zzar
    public final /* synthetic */ Object zzf(zzxp zzxpVar, px2 px2Var) {
        return zzam.zzc(this, zzxpVar, px2Var);
    }

    @Override // com.google.android.recaptcha.internal.zzar
    public final Object zzg(Exception exc, px2 px2Var) {
        int i = Build.VERSION.SDK_INT;
        zzys zzf = zzyt.zzf();
        zzf.zzr(16);
        zzf.zzq(i > 34 ? 59 : 58);
        return zzas.zza(this, (zzyt) zzf.zzk());
    }

    @Override // com.google.android.recaptcha.internal.zzar
    public final boolean zzi() {
        return true;
    }

    @Override // com.google.android.recaptcha.internal.zzar
    public final /* synthetic */ void zzh(zzyg zzygVar) {
    }
}
