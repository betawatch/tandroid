package com.google.android.gms.tasks;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
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
