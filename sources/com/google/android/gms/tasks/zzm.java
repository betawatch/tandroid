package com.google.android.gms.tasks;

import j$.util.Objects;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
final class zzm implements Runnable {
    final /* synthetic */ Task zza;
    final /* synthetic */ zzn zzb;

    public zzm(zzn zznVar, Task task) {
        this.zza = task;
        Objects.requireNonNull(zznVar);
        this.zzb = zznVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzn zznVar = this.zzb;
        synchronized (zznVar.zzc()) {
            try {
                if (zznVar.zzd() != null) {
                    zznVar.zzd().onSuccess(this.zza.getResult());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
