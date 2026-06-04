package com.google.android.gms.wearable;

import com.google.android.gms.wearable.internal.zzfx;

/* loaded from: classes.dex */
final class zzr implements Runnable {
    final /* synthetic */ zzfx zza;
    final /* synthetic */ zzaa zzb;

    zzr(zzaa zzaaVar, zzfx zzfxVar) {
        this.zzb = zzaaVar;
        this.zza = zzfxVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zza.onMessageReceived(this.zza);
    }
}
