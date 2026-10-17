package com.google.android.gms.tasks;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes.dex */
final class zzg implements Runnable {
    final /* synthetic */ zzh zza;

    public zzg(zzh zzhVar) {
        this.zza = zzhVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        OnCanceledListener onCanceledListener;
        OnCanceledListener onCanceledListener2;
        obj = this.zza.zzb;
        synchronized (obj) {
            try {
                zzh zzhVar = this.zza;
                onCanceledListener = zzhVar.zzc;
                if (onCanceledListener != null) {
                    onCanceledListener2 = zzhVar.zzc;
                    onCanceledListener2.onCanceled();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
