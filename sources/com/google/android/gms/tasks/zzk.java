package com.google.android.gms.tasks;

import j$.util.Objects;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
final class zzk implements Runnable {
    final /* synthetic */ Task zza;
    final /* synthetic */ zzl zzb;

    public zzk(zzl zzlVar, Task task) {
        this.zza = task;
        Objects.requireNonNull(zzlVar);
        this.zzb = zzlVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzl zzlVar = this.zzb;
        synchronized (zzlVar.zzc()) {
            if (zzlVar.zzd() != null) {
                OnFailureListener zzd = zzlVar.zzd();
                Exception exception = this.zza.getException();
                fre.h(exception);
                zzd.onFailure(exception);
            }
        }
    }
}
