package com.google.android.gms.tasks;

import java.util.concurrent.Executor;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
final class zze implements Runnable {
    final /* synthetic */ Task zza;
    final /* synthetic */ zzf zzb;

    public zze(zzf zzfVar, Task task) {
        this.zzb = zzfVar;
        this.zza = task;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzw zzwVar;
        zzw zzwVar2;
        zzw zzwVar3;
        Continuation continuation;
        try {
            continuation = this.zzb.zzb;
            Task task = (Task) continuation.then(this.zza);
            if (task == null) {
                this.zzb.onFailure(new NullPointerException("Continuation returned null"));
                return;
            }
            zzf zzfVar = this.zzb;
            Executor executor = TaskExecutors.zza;
            task.addOnSuccessListener(executor, zzfVar);
            task.addOnFailureListener(executor, this.zzb);
            task.addOnCanceledListener(executor, this.zzb);
        } catch (RuntimeExecutionException e7) {
            if (e7.getCause() instanceof Exception) {
                zzwVar3 = this.zzb.zzc;
                zzwVar3.zza((Exception) e7.getCause());
            } else {
                zzwVar2 = this.zzb.zzc;
                zzwVar2.zza(e7);
            }
        } catch (Exception e10) {
            zzwVar = this.zzb.zzc;
            zzwVar.zza(e10);
        }
    }
}
