package com.google.android.recaptcha.internal;

import com.google.android.recaptcha.RecaptchaAction;
import uc.c;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
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
    public final Object zza(String str, RecaptchaAction recaptchaAction, long j10, c cVar) {
        return new zzhg(new zzgc(this, j10, str, recaptchaAction, null));
    }

    @Override // com.google.android.recaptcha.internal.zzdw
    public final Object zzb(long j10, c cVar) {
        return new zzhg(new zzgd(this, j10, null));
    }
}
