package com.google.android.gms.tasks;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
final class zzi implements Runnable {
    final /* synthetic */ Task zza;
    final /* synthetic */ zzj zzb;

    public zzi(zzj zzjVar, Task task) {
        this.zzb = zzjVar;
        this.zza = task;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        OnCompleteListener onCompleteListener;
        OnCompleteListener onCompleteListener2;
        obj = this.zzb.zzb;
        synchronized (obj) {
            try {
                zzj zzjVar = this.zzb;
                onCompleteListener = zzjVar.zzc;
                if (onCompleteListener != null) {
                    onCompleteListener2 = zzjVar.zzc;
                    onCompleteListener2.onComplete(this.zza);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
