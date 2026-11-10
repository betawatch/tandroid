package com.google.android.gms.tasks;

import java.util.concurrent.Executor;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
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
    public final void zza(Task task) {
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

    @Override // com.google.android.gms.tasks.zzq
    public final void zzb() {
        synchronized (this.zzb) {
            this.zzc = null;
        }
    }

    public final /* synthetic */ Object zzc() {
        return this.zzb;
    }

    public final /* synthetic */ OnSuccessListener zzd() {
        return this.zzc;
    }
}
