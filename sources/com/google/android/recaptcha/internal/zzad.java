package com.google.android.recaptcha.internal;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class zzad implements zzar {
    private final d26 zza;
    private boolean zzb;

    public zzad() {
        int i = zzby.zza;
        this.zza = fpe.b(zzac.zza);
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
        return new zzhg(new zzaa(this, null));
    }

    @Override // com.google.android.recaptcha.internal.zzar
    public final Object zzf(zzxp zzxpVar, px2 px2Var) {
        return new zzhg(new zzab(zzxpVar, this, null));
    }

    @Override // com.google.android.recaptcha.internal.zzar
    public final /* synthetic */ Object zzg(Exception exc, px2 px2Var) {
        return zzam.zzd(this, exc, px2Var);
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
