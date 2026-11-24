package com.google.android.gms.tasks;

import j$.util.Objects;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
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
        } catch (RuntimeExecutionException e) {
            boolean z = e.getCause() instanceof Exception;
            zzd zzdVar = this.zzb;
            if (!z) {
                zzdVar.zzd().zzc(e);
            } else {
                zzdVar.zzd().zzc((Exception) e.getCause());
            }
        } catch (Exception e2) {
            this.zzb.zzd().zzc(e2);
        }
    }
}
