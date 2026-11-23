package com.google.android.gms.tasks;

import j$.util.Objects;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
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
