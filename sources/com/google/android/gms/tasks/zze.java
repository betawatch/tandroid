package com.google.android.gms.tasks;

import j$.util.Objects;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
final class zze implements Runnable {
    final /* synthetic */ Task zza;
    final /* synthetic */ zzf zzb;

    public zze(zzf zzfVar, Task task) {
        this.zza = task;
        Objects.requireNonNull(zzfVar);
        this.zzb = zzfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            Task task = (Task) this.zzb.zzc().then(this.zza);
            zzf zzfVar = this.zzb;
            if (task == null) {
                zzfVar.onFailure(new NullPointerException("Continuation returned null"));
                return;
            }
            Executor executor = TaskExecutors.zza;
            task.addOnSuccessListener(executor, zzfVar);
            task.addOnFailureListener(executor, zzfVar);
            task.addOnCanceledListener(executor, zzfVar);
        } catch (RuntimeExecutionException e) {
            boolean z = e.getCause() instanceof Exception;
            zzf zzfVar2 = this.zzb;
            if (!z) {
                zzfVar2.zzd().zzc(e);
            } else {
                zzfVar2.zzd().zzc((Exception) e.getCause());
            }
        } catch (Exception e2) {
            this.zzb.zzd().zzc(e2);
        }
    }
}
