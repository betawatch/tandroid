package com.google.android.gms.wearable;

import com.google.android.gms.wearable.internal.zzbc;
import com.google.android.gms.wearable.internal.zzbf;

/* loaded from: classes.dex */
final class zzy implements Runnable {
    final /* synthetic */ zzbf zza;
    final /* synthetic */ zzaa zzb;

    zzy(zzaa zzaaVar, zzbf zzbfVar) {
        this.zzb = zzaaVar;
        this.zza = zzbfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzbc zzbcVar;
        this.zza.zza(this.zzb.zza);
        zzbf zzbfVar = this.zza;
        zzbcVar = this.zzb.zza.zzh;
        zzbfVar.zza(zzbcVar);
    }
}
