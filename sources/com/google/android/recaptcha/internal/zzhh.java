package com.google.android.recaptcha.internal;

import java.util.UUID;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
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
