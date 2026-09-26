package com.google.android.gms.tasks;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes.dex */
final class zzm implements Runnable {
    final /* synthetic */ Task zza;
    final /* synthetic */ zzn zzb;

    public zzm(zzn zznVar, Task task) {
        this.zzb = zznVar;
        this.zza = task;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        OnSuccessListener onSuccessListener;
        OnSuccessListener onSuccessListener2;
        obj = this.zzb.zzb;
        synchronized (obj) {
            try {
                zzn zznVar = this.zzb;
                onSuccessListener = zznVar.zzc;
                if (onSuccessListener != null) {
                    onSuccessListener2 = zznVar.zzc;
                    onSuccessListener2.onSuccess(this.zza.getResult());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
