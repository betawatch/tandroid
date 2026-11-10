package com.google.android.gms.tasks;

import j$.util.Objects;
import q6.m;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
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
