package com.google.android.gms.tasks;

import n6.l;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes.dex */
final class zzk implements Runnable {
    final /* synthetic */ Task zza;
    final /* synthetic */ zzl zzb;

    public zzk(zzl zzlVar, Task task) {
        this.zzb = zzlVar;
        this.zza = task;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        OnFailureListener onFailureListener;
        OnFailureListener onFailureListener2;
        obj = this.zzb.zzb;
        synchronized (obj) {
            try {
                zzl zzlVar = this.zzb;
                onFailureListener = zzlVar.zzc;
                if (onFailureListener != null) {
                    onFailureListener2 = zzlVar.zzc;
                    Exception exception = this.zza.getException();
                    l.h(exception);
                    onFailureListener2.onFailure(exception);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
