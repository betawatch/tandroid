package com.google.android.recaptcha.internal;

import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.RichMessageLayout;
import org.telegram.tgnet.ConnectionsManager;

/* loaded from: classes.dex */
public enum zzqy implements zzsp {
    zza(0),
    zzb(RichMessageLayout.PART_MAX_HEIGHT_DP),
    zzc(998),
    zzd(999),
    zze(MediaDataController.MAX_STYLE_RUNS_COUNT),
    zzf(1001),
    zzg(1),
    zzh(2),
    zzi(99997),
    zzj(99998),
    zzk(99999),
    zzl(ConnectionsManager.DEFAULT_DATACENTER_ID);

    private final int zzn;

    zzqy(int i) {
        this.zzn = i;
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
