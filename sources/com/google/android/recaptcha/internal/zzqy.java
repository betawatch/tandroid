package com.google.android.recaptcha.internal;

import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public enum zzqy implements zzsp {
    zza(0),
    zzb(900),
    zzc(998),
    zzd(999),
    zze(1000),
    zzf(1001),
    zzg(1),
    zzh(2),
    zzi(99997),
    zzj(99998),
    zzk(99999),
    zzl(ConnectionsManager.DEFAULT_DATACENTER_ID);

    private final int zzn;

    zzqy(int i7) {
        this.zzn = i7;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.zzn);
    }

    @Override // com.google.android.recaptcha.internal.zzsp
    public final int zza() {
        return this.zzn;
    }
}
