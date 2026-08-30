package com.google.android.recaptcha.internal;

import android.support.v4.media.a;
import jd.j;
import org.telegram.ui.yh;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class zzcn implements Comparable {
    private int zza;
    private long zzb;
    private long zzc;

    public final String toString() {
        return a.p(j.f(10, String.valueOf(this.zzb)), " us| #Usages: ", j.f(5, String.valueOf(this.zza)), yh.m("avgExecutionTime: ", j.f(10, String.valueOf(this.zzb / this.zza)), " us| maxExecutionTime: ", j.f(10, String.valueOf(this.zzc)), " us| totalTime: "));
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

    public final void zzg(int i10) {
        this.zza = i10;
    }
}
