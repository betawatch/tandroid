package com.google.android.gms.tasks;

import java.util.concurrent.Executor;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes.dex */
final class zzn implements zzq {
    private final Executor zza;
    private final Object zzb = new Object();
    private OnSuccessListener zzc;

    public zzn(Executor executor, OnSuccessListener onSuccessListener) {
        this.zza = executor;
        this.zzc = onSuccessListener;
    }

    @Override // com.google.android.gms.tasks.zzq
    public final void zzc() {
        synchronized (this.zzb) {
            this.zzc = null;
        }
    }

    @Override // com.google.android.gms.tasks.zzq
    public final void zzd(Task task) {
        if (task.isSuccessful()) {
            synchronized (this.zzb) {
                try {
                    if (this.zzc == null) {
                        return;
                    }
                    this.zza.execute(new zzm(this, task));
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }
}
