package com.google.android.recaptcha.internal;

import aa.d;
import fd.j;
import j3.r0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class zzcn implements Comparable {
    private int zza;
    private long zzb;
    private long zzc;

    public final String toString() {
        return d.p(j.f(10, String.valueOf(this.zzb)), " us| #Usages: ", j.f(5, String.valueOf(this.zza)), r0.q("avgExecutionTime: ", j.f(10, String.valueOf(this.zzb / this.zza)), " us| maxExecutionTime: ", j.f(10, String.valueOf(this.zzc)), " us| totalTime: "));
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

    public final void zze(long j10) {
        this.zzc = j10;
    }

    public final void zzf(long j10) {
        this.zzb = j10;
    }

    public final void zzg(int i9) {
        this.zza = i9;
    }
}
