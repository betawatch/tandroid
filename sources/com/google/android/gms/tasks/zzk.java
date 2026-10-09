package com.google.android.gms.tasks;

import n6.l;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
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
