package com.google.android.gms.tasks;

import j$.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
final class zzo implements Runnable {
    final /* synthetic */ Task zza;
    final /* synthetic */ zzp zzb;

    public zzo(zzp zzpVar, Task task) {
        this.zza = task;
        Objects.requireNonNull(zzpVar);
        this.zzb = zzpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            Task then = this.zzb.zzc().then(this.zza.getResult());
            if (then == null) {
                this.zzb.onFailure(new NullPointerException("Continuation returned null"));
                return;
            }
            zzp zzpVar = this.zzb;
            Executor executor = TaskExecutors.zza;
            then.addOnSuccessListener(executor, zzpVar);
            then.addOnFailureListener(executor, zzpVar);
            then.addOnCanceledListener(executor, zzpVar);
        } catch (RuntimeExecutionException e10) {
            if (e10.getCause() instanceof Exception) {
                this.zzb.onFailure((Exception) e10.getCause());
            } else {
                this.zzb.onFailure(e10);
            }
        } catch (CancellationException unused) {
            this.zzb.onCanceled();
        } catch (Exception e11) {
            this.zzb.onFailure(e11);
        }
    }
}
