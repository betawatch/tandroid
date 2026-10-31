package com.google.android.recaptcha.internal;

import java.util.UUID;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
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
