package com.google.android.recaptcha.internal;

import kotlin.jvm.internal.i;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes.dex */
public final class zzgp {
    private final String zza;
    private final long zzb;
    private final int zzc;

    public zzgp(String str, long j10, int i10) {
        this.zza = str;
        this.zzb = j10;
        this.zzc = i10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzgp)) {
            return false;
        }
        zzgp zzgpVar = (zzgp) obj;
        return i.a(zzgpVar.zza, this.zza) && zzgpVar.zzb == this.zzb && zzgpVar.zzc == this.zzc;
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
