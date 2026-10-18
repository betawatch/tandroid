package com.google.android.recaptcha.internal;

import java.util.UUID;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
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
