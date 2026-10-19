package com.google.android.gms.tasks;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
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
