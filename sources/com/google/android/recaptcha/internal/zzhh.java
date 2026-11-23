package com.google.android.recaptcha.internal;

import java.util.UUID;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final class zzhh {
    private final String zza;
    private final String zzb = UUID.randomUUID().toString();
    private final int zzc;

    public zzhh(String str, int i7) {
        this.zza = str;
        this.zzc = i7;
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
