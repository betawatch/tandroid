package com.google.android.recaptcha.internal;

import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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
