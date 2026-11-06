package com.google.android.recaptcha.internal;

import kotlin.jvm.internal.j;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public final class zzgp {
    private final String zza;
    private final long zzb;
    private final int zzc;

    public zzgp(String str, long j3, int i7) {
        this.zza = str;
        this.zzb = j3;
        this.zzc = i7;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzgp)) {
            return false;
        }
        zzgp zzgpVar = (zzgp) obj;
        return j.a(zzgpVar.zza, this.zza) && zzgpVar.zzb == this.zzb && zzgpVar.zzc == this.zzc;
    }

    public final int zza() {
        return this.zzc;
    }

    public final long zzb() {
        return this.zzb;
    }

    public final String zzc() {
        return this.zza;
    }
}
