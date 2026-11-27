package com.google.android.recaptcha.internal;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class zzcn implements Comparable {
    private int zza;
    private long zzb;
    private long zzc;

    public final String toString() {
        return qu6.o(ddb.i(10, String.valueOf(this.zzb)), " us| #Usages: ", ddb.i(5, String.valueOf(this.zza)), xnb.l("avgExecutionTime: ", ddb.i(10, String.valueOf(this.zzb / this.zza)), " us| maxExecutionTime: ", ddb.i(10, String.valueOf(this.zzc)), " us| totalTime: "));
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

    public final void zze(long j) {
        this.zzc = j;
    }

    public final void zzf(long j) {
        this.zzb = j;
    }

    public final void zzg(int i) {
        this.zza = i;
    }
}
