package com.google.android.gms.internal.cast;

import com.google.android.gms.common.util.DefaultClock;

/* loaded from: classes.dex */
public final class zzz {
    final long zza;
    private final Integer zzb;
    private final Boolean zzc;
    private long zzd;
    private final int zze;

    public zzz(zzy zzyVar) {
        int i;
        Integer num;
        Boolean bool;
        i = zzyVar.zzc;
        this.zze = i;
        num = zzyVar.zza;
        this.zzb = num;
        bool = zzyVar.zzb;
        this.zzc = bool;
        this.zza = DefaultClock.getInstance().currentTimeMillis();
    }

    public final zzns zza() {
        zznr zza = zzns.zza();
        zza.zzd(this.zze);
        zza.zzc((int) (this.zza - this.zzd));
        Integer num = this.zzb;
        if (num != null) {
            zza.zzb(num.intValue());
        }
        Boolean bool = this.zzc;
        if (bool != null) {
            zza.zza(bool.booleanValue());
        }
        return (zzns) zza.zzq();
    }

    public final void zzb(long j) {
        this.zzd = j;
    }

    public final int zzc() {
        return this.zze;
    }
}
