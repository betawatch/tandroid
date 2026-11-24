package com.google.android.gms.tasks;

import java.util.concurrent.Callable;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
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
        } catch (Exception e) {
            this.zza.zzc(e);
        } catch (Throwable th) {
            this.zza.zzc(new RuntimeException(th));
        }
    }
}
