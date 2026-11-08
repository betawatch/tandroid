package com.google.android.gms.tasks;

import java.util.concurrent.Callable;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
final class zzx implements Runnable {
    final /* synthetic */ zzw zza;
    final /* synthetic */ Callable zzb;

    public zzx(zzw zzwVar, Callable callable) {
        this.zza = zzwVar;
        this.zzb = callable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.zza.zza(this.zzb.call());
        } catch (Exception e10) {
            this.zza.zzc(e10);
        } catch (Throwable th2) {
            this.zza.zzc(new RuntimeException(th2));
        }
    }
}
