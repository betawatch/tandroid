package com.google.android.recaptcha.internal;

import com.google.android.recaptcha.RecaptchaAction;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class zzge implements zzdw {
    private final zzfp zza;
    private zzdv zzb;
    private zzxn zzc;

    public zzge(zzfp zzfpVar) {
        zzdu zzduVar;
        this.zza = zzfpVar;
        zzduVar = zzdv.zza;
        this.zzb = zzduVar;
    }

    @Override // com.google.android.recaptcha.internal.zzdw
    public final Object zza(String str, RecaptchaAction recaptchaAction, long j, px2 px2Var) {
        return new zzhg(new zzgc(this, j, str, recaptchaAction, null));
    }

    @Override // com.google.android.recaptcha.internal.zzdw
    public final Object zzb(long j, px2 px2Var) {
        return new zzhg(new zzgd(this, j, null));
    }
}
