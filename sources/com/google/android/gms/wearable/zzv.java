package com.google.android.gms.wearable;

import com.google.android.gms.wearable.internal.zzao;

/* loaded from: classes.dex */
final class zzv implements Runnable {
    final /* synthetic */ zzao zza;
    final /* synthetic */ zzaa zzb;

    zzv(zzaa zzaaVar, zzao zzaoVar) {
        this.zzb = zzaaVar;
        this.zza = zzaoVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zza.onCapabilityChanged(this.zza);
    }
}
