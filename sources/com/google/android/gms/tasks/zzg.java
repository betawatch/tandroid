package com.google.android.gms.tasks;

import j$.util.Objects;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
final class zzg implements Runnable {
    final /* synthetic */ zzh zza;

    public zzg(zzh zzhVar) {
        Objects.requireNonNull(zzhVar);
        this.zza = zzhVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzh zzhVar = this.zza;
        synchronized (zzhVar.zzc()) {
            try {
                if (zzhVar.zzd() != null) {
                    zzhVar.zzd().onCanceled();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
