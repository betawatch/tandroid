package com.google.android.recaptcha.internal;

import java.math.BigInteger;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final class zzkr {
    private static final zzkq zza;
    private final zzkq zzb;
    private long zzc;

    static {
        long pow = (long) Math.pow(2.0d, 32.0d);
        zza = new zzkq(11L, 20919936621L ^ pow, (long) Math.pow(2.0d, 48.0d));
    }

    public zzkr(long j3, long j10, zzkq zzkqVar) {
        this.zzb = zzkqVar;
        this.zzc = Math.abs(j3);
    }

    public final long zza() {
        zzkq zzkqVar = this.zzb;
        long longValue = (BigInteger.valueOf(zzkqVar.zzb()).multiply(BigInteger.valueOf(this.zzc)).mod(BigInteger.valueOf(zzkqVar.zza())).longValue() + 11) % zzkqVar.zza();
        this.zzc = longValue;
        return longValue % 255;
    }
}
