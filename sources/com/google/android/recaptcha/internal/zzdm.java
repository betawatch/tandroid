package com.google.android.recaptcha.internal;

/* loaded from: classes.dex */
public final class zzdm extends Exception {
    private final Throwable zza;
    private final zzys zzb;
    private final int zzc;
    private final int zzd;

    public zzdm(int i, int i2, Throwable th) {
        this.zzc = i;
        this.zzd = i2;
        this.zza = th;
        zzys zzf = zzyt.zzf();
        zzf.zzq(i2);
        zzf.zzr(i);
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
