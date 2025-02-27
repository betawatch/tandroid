package com.google.android.gms.cast.internal;

/* loaded from: classes.dex */
final class zzs implements Runnable {
    final /* synthetic */ zzw zza;
    final /* synthetic */ zzab zzb;

    zzs(zzv zzvVar, zzw zzwVar, zzab zzabVar) {
        this.zza = zzwVar;
        this.zzb = zzabVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzw.zzI(this.zza, this.zzb);
    }
}
