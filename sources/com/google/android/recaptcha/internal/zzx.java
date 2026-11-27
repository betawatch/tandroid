package com.google.android.recaptcha.internal;

import android.content.ContentResolver;
import android.os.Build;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class zzx implements zzar {
    private final h26 zza;

    public zzx() {
        int i = zzby.zza;
        this.zza = ure.b(zzw.zza);
    }

    public static final /* synthetic */ ContentResolver zzb(zzx zzxVar) {
        return (ContentResolver) zzxVar.zza.getValue();
    }

    @Override // com.google.android.recaptcha.internal.zzar
    public final int zza() {
        return 17;
    }

    @Override // com.google.android.recaptcha.internal.zzar
    public final /* synthetic */ Object zzc(String str, zw2 zw2Var) {
        return zzam.zza(this, str, zw2Var);
    }

    @Override // com.google.android.recaptcha.internal.zzar
    public final /* synthetic */ Object zzd(zzxp zzxpVar, zw2 zw2Var) {
        Object zzd;
        zzd = zzhj.zzd(36, zza(), new zzap(this, zzxpVar, null), zw2Var);
        return zzd;
    }

    @Override // com.google.android.recaptcha.internal.zzar
    public final Object zze(String str, zw2 zw2Var) {
        return new zzhg(new zzv(this, null));
    }

    @Override // com.google.android.recaptcha.internal.zzar
    public final /* synthetic */ Object zzf(zzxp zzxpVar, zw2 zw2Var) {
        return zzam.zzc(this, zzxpVar, zw2Var);
    }

    @Override // com.google.android.recaptcha.internal.zzar
    public final Object zzg(Exception exc, zw2 zw2Var) {
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
