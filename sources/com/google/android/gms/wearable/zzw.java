package com.google.android.gms.wearable;

/* loaded from: classes.dex */
final class zzw implements Runnable {
    final /* synthetic */ com.google.android.gms.wearable.internal.zzl zza;
    final /* synthetic */ zzaa zzb;

    zzw(zzaa zzaaVar, com.google.android.gms.wearable.internal.zzl zzlVar) {
        this.zzb = zzaaVar;
        this.zza = zzlVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zza.onNotificationReceived(this.zza);
    }
}
