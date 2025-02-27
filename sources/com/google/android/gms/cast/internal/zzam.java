package com.google.android.gms.cast.internal;

/* loaded from: classes.dex */
final class zzam implements zzas {
    final /* synthetic */ zzas zza;
    final /* synthetic */ zzaq zzb;

    zzam(zzaq zzaqVar, zzas zzasVar) {
        this.zzb = zzaqVar;
        this.zza = zzasVar;
    }

    @Override // com.google.android.gms.cast.internal.zzas
    public final void zza(String str, long j, int i, Object obj, long j2, long j3) {
        int i2;
        int i3;
        zzan zzanVar;
        if (this.zza != null) {
            if (i == 2001) {
                zzaq zzaqVar = this.zzb;
                i3 = zzaqVar.zzz;
                zzaqVar.zza.w("Possibility of local queue out of sync with receiver queue. Refetching sequence number. Current Local Sequence Number = %d", Integer.valueOf(i3));
                zzanVar = this.zzb.zzy;
                zzanVar.zzl();
                i2 = 2001;
            } else {
                i2 = i;
            }
            this.zza.zza(str, j, i2, obj, j2, j3);
        }
    }

    @Override // com.google.android.gms.cast.internal.zzas
    public final void zzb(String str, long j, long j2, long j3) {
        zzas zzasVar = this.zza;
        if (zzasVar != null) {
            zzasVar.zzb(str, j, j2, j3);
        }
    }
}
