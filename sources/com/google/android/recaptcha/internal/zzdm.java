package com.google.android.recaptcha.internal;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes.dex */
public final class zzdm extends Exception {
    private final Throwable zza;
    private final zzys zzb;
    private final int zzc;
    private final int zzd;

    public zzdm(int i7, int i10, Throwable th2) {
        this.zzc = i7;
        this.zzd = i10;
        this.zza = th2;
        zzys zzf = zzyt.zzf();
        zzf.zzq(i10);
        zzf.zzr(i7);
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
