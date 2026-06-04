package com.google.android.gms.wearable;

import com.google.android.gms.wearable.internal.zzi;

/* loaded from: classes.dex */
final class zzx implements Runnable {
    final /* synthetic */ zzi zza;
    final /* synthetic */ zzaa zzb;

    zzx(zzaa zzaaVar, zzi zziVar) {
        this.zzb = zzaaVar;
        this.zza = zziVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zza.onEntityUpdate(this.zza);
    }
}
