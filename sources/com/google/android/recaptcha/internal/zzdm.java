package com.google.android.recaptcha.internal;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes.dex */
public final class zzdm extends Exception {
    private final Throwable zza;
    private final zzys zzb;
    private final int zzc;
    private final int zzd;

    public zzdm(int i10, int i11, Throwable th2) {
        this.zzc = i10;
        this.zzd = i11;
        this.zza = th2;
        zzys zzf = zzyt.zzf();
        zzf.zzq(i11);
        zzf.zzr(i10);
        this.zzb = zzf;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.zza;
    }

    public final zzys zza() {
        return this.zzb;
    }

    public final int zzb() {
        return this.zzd;
    }
}
