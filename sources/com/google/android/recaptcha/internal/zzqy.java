package com.google.android.recaptcha.internal;

import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.RichMessageLayout;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
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

    zzqy(int i10) {
        this.zzn = i10;
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
