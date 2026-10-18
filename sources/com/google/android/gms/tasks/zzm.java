package com.google.android.gms.tasks;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
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
