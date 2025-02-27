package com.google.android.gms.internal.cast;

/* loaded from: classes.dex */
final class zzuj extends zzul {
    /* synthetic */ zzuj(zzui zzuiVar) {
        super(null);
    }

    @Override // com.google.android.gms.internal.cast.zzul
    final void zza(Object obj, long j) {
        ((zztx) zzwj.zzf(obj, j)).zzb();
    }

    @Override // com.google.android.gms.internal.cast.zzul
    final void zzb(Object obj, Object obj2, long j) {
        zztx zztxVar = (zztx) zzwj.zzf(obj, j);
        zztx zztxVar2 = (zztx) zzwj.zzf(obj2, j);
        int size = zztxVar.size();
        int size2 = zztxVar2.size();
        if (size > 0 && size2 > 0) {
            if (!zztxVar.zzc()) {
                zztxVar = zztxVar.zzg(size2 + size);
            }
            zztxVar.addAll(zztxVar2);
        }
        if (size > 0) {
            zztxVar2 = zztxVar;
        }
        zzwj.zzs(obj, j, zztxVar2);
    }
}
