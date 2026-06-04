package com.google.android.gms.wearable;

import com.google.android.gms.wearable.internal.zzgm;

/* loaded from: classes.dex */
final class zzt implements Runnable {
    final /* synthetic */ zzgm zza;
    final /* synthetic */ zzaa zzb;

    zzt(zzaa zzaaVar, zzgm zzgmVar) {
        this.zzb = zzaaVar;
        this.zza = zzgmVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zza.onPeerDisconnected(this.zza);
    }
}
