package com.google.android.gms.tasks;

import j$.util.Objects;
import q6.m;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
final class zzk implements Runnable {
    final /* synthetic */ Task zza;
    final /* synthetic */ zzl zzb;

    public zzk(zzl zzlVar, Task task) {
        this.zza = task;
        Objects.requireNonNull(zzlVar);
        this.zzb = zzlVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzl zzlVar = this.zzb;
        synchronized (zzlVar.zzc()) {
            try {
                if (zzlVar.zzd() != null) {
                    OnFailureListener zzd = zzlVar.zzd();
                    Exception exception = this.zza.getException();
                    m.g(exception);
                    zzd.onFailure(exception);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
