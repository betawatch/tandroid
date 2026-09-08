package com.google.android.gms.tasks;

import java.util.concurrent.Executor;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
final class zzl implements zzq {
    private final Executor zza;
    private final Object zzb = new Object();
    private OnFailureListener zzc;

    public zzl(Executor executor, OnFailureListener onFailureListener) {
        this.zza = executor;
        this.zzc = onFailureListener;
    }

    @Override // com.google.android.gms.tasks.zzq
    public final void zzc() {
        synchronized (this.zzb) {
            this.zzc = null;
        }
    }

    @Override // com.google.android.gms.tasks.zzq
    public final void zzd(Task task) {
        if (task.isSuccessful() || task.isCanceled()) {
            return;
        }
        synchronized (this.zzb) {
            try {
                if (this.zzc == null) {
                    return;
                }
                this.zza.execute(new zzk(this, task));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
