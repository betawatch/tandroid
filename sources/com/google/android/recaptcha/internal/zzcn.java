package com.google.android.recaptcha.internal;

import kotlin.comparisons.ComparisonsKt;
import kotlin.text.StringsKt;

/* loaded from: classes.dex */
public final class zzcn implements Comparable {
    private int zza;
    private long zzb;
    private long zzc;

    public final String toString() {
        return "avgExecutionTime: " + StringsKt.padEnd$default(String.valueOf(this.zzb / this.zza), 10, (char) 0, 2, null) + " us| maxExecutionTime: " + StringsKt.padEnd$default(String.valueOf(this.zzc), 10, (char) 0, 2, null) + " us| totalTime: " + StringsKt.padEnd$default(String.valueOf(this.zzb), 10, (char) 0, 2, null) + " us| #Usages: " + StringsKt.padEnd$default(String.valueOf(this.zza), 5, (char) 0, 2, null);
    }

    @Override // java.lang.Comparable
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final int compareTo(zzcn zzcnVar) {
        return ComparisonsKt.compareValues(Long.valueOf(this.zzb), Long.valueOf(zzcnVar.zzb));
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
