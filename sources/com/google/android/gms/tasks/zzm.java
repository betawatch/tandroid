package com.google.android.gms.tasks;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
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
