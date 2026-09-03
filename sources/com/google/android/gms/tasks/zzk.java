package com.google.android.gms.tasks;

import b6.m;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
                    m.h(exception);
                    onFailureListener2.onFailure(exception);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
