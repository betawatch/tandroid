package com.google.android.gms.tasks;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
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
