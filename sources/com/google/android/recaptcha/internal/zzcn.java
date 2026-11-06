package com.google.android.recaptcha.internal;

import org.telegram.ui.Cells.f1;
import xd.d;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public final class zzcn implements Comparable {
    private int zza;
    private long zzb;
    private long zzc;

    public final String toString() {
        return f1.n(d.k(10, String.valueOf(this.zzb)), " us| #Usages: ", d.k(5, String.valueOf(this.zza)), a.n("avgExecutionTime: ", d.k(10, String.valueOf(this.zzb / this.zza)), " us| maxExecutionTime: ", d.k(10, String.valueOf(this.zzc)), " us| totalTime: "));
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

    public final void zzg(int i7) {
        this.zza = i7;
    }
}
