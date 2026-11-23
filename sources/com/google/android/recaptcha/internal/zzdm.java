package com.google.android.recaptcha.internal;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
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
