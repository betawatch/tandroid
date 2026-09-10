package com.google.android.recaptcha.internal;

import a4.a;
import xd.j;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class zzcn implements Comparable {
    private int zza;
    private long zzb;
    private long zzc;

    public final String toString() {
        return a.q(j.f(10, String.valueOf(this.zzb)), " us| #Usages: ", j.f(5, String.valueOf(this.zza)), a.w("avgExecutionTime: ", j.f(10, String.valueOf(this.zzb / this.zza)), " us| maxExecutionTime: ", j.f(10, String.valueOf(this.zzc)), " us| totalTime: "));
    }

    @Override // java.lang.Comparable
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final int compareTo(zzcn zzcnVar) {
        Long valueOf = Long.valueOf(this.zzb);
        Long valueOf2 = Long.valueOf(zzcnVar.zzb);
        if (valueOf == valueOf2) {
            return 0;
        }
        return valueOf.compareTo(valueOf2);
    }

    public final int zzb() {
        return this.zza;
    }

    public final long zzc() {
        return this.zzc;
    }

    public final long zzd() {
        return this.zzb;
    }

    public final void zze(long j3) {
        this.zzc = j3;
    }

    public final void zzf(long j3) {
        this.zzb = j3;
    }

    public final void zzg(int i10) {
        this.zza = i10;
    }
}
