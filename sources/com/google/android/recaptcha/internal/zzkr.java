package com.google.android.recaptcha.internal;

import java.math.BigInteger;

/* loaded from: classes.dex */
public final class zzkr {
    private static final zzkq zza = new zzkq(11, ((long) Math.pow(2.0d, 32.0d)) ^ 20919936621L, (long) Math.pow(2.0d, 48.0d));
    private final zzkq zzb;
    private long zzc;

    public zzkr(long j, long j2, zzkq zzkqVar) {
        this.zzb = zzkqVar;
        this.zzc = Math.abs(j);
    }

    public final long zza() {
        zzkq zzkqVar = this.zzb;
        long longValue = (BigInteger.valueOf(zzkqVar.zzb()).multiply(BigInteger.valueOf(this.zzc)).mod(BigInteger.valueOf(zzkqVar.zza())).longValue() + 11) % zzkqVar.zza();
        this.zzc = longValue;
        return longValue % 255;
    }
}
