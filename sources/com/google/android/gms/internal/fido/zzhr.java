package com.google.android.gms.internal.fido;

/* loaded from: classes.dex */
public final class zzhr {
    private final byte zza;
    private final byte zzb;

    zzhr(int i) {
        this.zza = (byte) (i & 224);
        this.zzb = (byte) (i & 31);
    }

    public final byte zza() {
        return this.zzb;
    }

    public final byte zzb() {
        return this.zza;
    }

    public final int zzc() {
        return (this.zza >> 5) & 7;
    }
}
