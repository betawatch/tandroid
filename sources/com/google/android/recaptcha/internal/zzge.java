package com.google.android.recaptcha.internal;

import com.google.android.recaptcha.RecaptchaAction;
import id.c;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
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
    public final Object zza(String str, RecaptchaAction recaptchaAction, long j3, c cVar) {
        return new zzhg(new zzgc(this, j3, str, recaptchaAction, null));
    }

    @Override // com.google.android.recaptcha.internal.zzdw
    public final Object zzb(long j3, c cVar) {
        return new zzhg(new zzgd(this, j3, null));
    }
}
