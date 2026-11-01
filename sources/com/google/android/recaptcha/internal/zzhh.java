package com.google.android.recaptcha.internal;

import java.util.UUID;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final class zzhh {
    private final String zza;
    private final String zzb = UUID.randomUUID().toString();
    private final int zzc;

    public zzhh(String str, int i10) {
        this.zza = str;
        this.zzc = i10;
    }

    public final String zza() {
        return this.zzb;
    }

    public final String zzb() {
        return this.zza;
    }

    public final int zzc() {
        return this.zzc;
    }
}
