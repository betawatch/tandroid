package com.google.android.gms.tasks;

import j$.util.Objects;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
final class zzm implements Runnable {
    final /* synthetic */ Task zza;
    final /* synthetic */ zzn zzb;

    public zzm(zzn zznVar, Task task) {
        this.zza = task;
        Objects.requireNonNull(zznVar);
        this.zzb = zznVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzn zznVar = this.zzb;
        synchronized (zznVar.zzc()) {
            if (zznVar.zzd() != null) {
                zznVar.zzd().onSuccess(this.zza.getResult());
            }
        }
    }
}
