package com.google.android.recaptcha.internal;

import android.app.Application;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class zzu extends zzg {
    private final zzcz zza;
    private String zzb;
    private le3 zzc;
    private final d26 zzd;

    public zzu(zzcz zzczVar, z39 z39Var) {
        this.zza = zzczVar;
        int i = zzby.zza;
        this.zzd = fpe.b(zzt.zza);
    }

    public static final /* synthetic */ Application zzl(zzu zzuVar) {
        return (Application) zzuVar.zzd.getValue();
    }

    @Override // com.google.android.recaptcha.internal.zzg
    public final Object zza(String str, px2 px2Var) {
        zzxw zzf = zzxx.zzf();
        zzf.zze(str);
        return zzf.zzk();
    }

    @Override // com.google.android.recaptcha.internal.zzg
    public final Object zzb(String str, px2 px2Var) {
        return new zzhg(new zzr(this, str, null));
    }

    @Override // com.google.android.recaptcha.internal.zzg
    public final Object zzd(zzxn zzxnVar, px2 px2Var) {
        return new zzhg(new zzs(this, zzxnVar, null));
    }

    @Override // com.google.android.recaptcha.internal.zzg
    public final int zzj() {
        return 40;
    }

    @Override // com.google.android.recaptcha.internal.zzg
    public final int zzk() {
        return 39;
    }

    public zzu() {
        this(null, null, 3, null);
    }

    public zzu(zzcz zzczVar, z39 z39Var, int i, fb3 fb3Var) {
        this(new zzcz(e05.b), null);
    }
}
