package com.google.android.gms.tasks;

import j$.util.Objects;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes.dex */
final class zzc implements Runnable {
    final /* synthetic */ Task zza;
    final /* synthetic */ zzd zzb;

    public zzc(zzd zzdVar, Task task) {
        this.zza = task;
        Objects.requireNonNull(zzdVar);
        this.zzb = zzdVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Task task = this.zza;
        if (task.isCanceled()) {
            this.zzb.zzd().zze();
            return;
        }
        try {
            this.zzb.zzd().zza(this.zzb.zzc().then(task));
        } catch (RuntimeExecutionException e10) {
            if (!(e10.getCause() instanceof Exception)) {
                this.zzb.zzd().zzc(e10);
                return;
            }
            zzd zzdVar = this.zzb;
            zzdVar.zzd().zzc((Exception) e10.getCause());
        } catch (Exception e11) {
            this.zzb.zzd().zzc(e11);
        }
    }
}
