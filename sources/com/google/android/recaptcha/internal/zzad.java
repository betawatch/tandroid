package com.google.android.recaptcha.internal;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class zzad implements zzar {
    private final h26 zza;
    private boolean zzb;

    public zzad() {
        int i = zzby.zza;
        this.zza = ure.b(zzac.zza);
        this.zzb = true;
    }

    public static final /* synthetic */ zzci zzb(zzad zzadVar) {
        return (zzci) zzadVar.zza.getValue();
    }

    @Override // com.google.android.recaptcha.internal.zzar
    public final int zza() {
        return 25;
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
        return new zzhg(new zzaa(this, null));
    }

    @Override // com.google.android.recaptcha.internal.zzar
    public final Object zzf(zzxp zzxpVar, zw2 zw2Var) {
        return new zzhg(new zzab(zzxpVar, this, null));
    }

    @Override // com.google.android.recaptcha.internal.zzar
    public final /* synthetic */ Object zzg(Exception exc, zw2 zw2Var) {
        return zzam.zzd(this, exc, zw2Var);
    }

    @Override // com.google.android.recaptcha.internal.zzar
    public final boolean zzi() {
        return this.zzb;
    }

    public final void zzj(boolean z) {
        this.zzb = false;
    }

    @Override // com.google.android.recaptcha.internal.zzar
    public final void zzh(zzyg zzygVar) {
    }
}
