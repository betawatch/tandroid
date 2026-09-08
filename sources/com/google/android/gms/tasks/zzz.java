package com.google.android.gms.tasks;

import java.util.concurrent.Callable;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
final class zzz implements Runnable {
    final /* synthetic */ zzw zza;
    final /* synthetic */ Callable zzb;

    public zzz(zzw zzwVar, Callable callable) {
        this.zza = zzwVar;
        this.zzb = callable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.zza.zzb(this.zzb.call());
        } catch (Exception e7) {
            this.zza.zza(e7);
        } catch (Throwable th2) {
            this.zza.zza(new RuntimeException(th2));
        }
    }
}
