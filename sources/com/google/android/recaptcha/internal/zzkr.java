package com.google.android.recaptcha.internal;

import java.math.BigInteger;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class zzkr {
    private static final zzkq zza;
    private final zzkq zzb;
    private long zzc;

    static {
        long pow = (long) Math.pow(2.0d, 32.0d);
        zza = new zzkq(11L, 20919936621L ^ pow, (long) Math.pow(2.0d, 48.0d));
    }

    public zzkr(long j10, long j11, zzkq zzkqVar) {
        this.zzb = zzkqVar;
        this.zzc = Math.abs(j10);
    }

    public final long zza() {
        zzkq zzkqVar = this.zzb;
        long longValue = (BigInteger.valueOf(zzkqVar.zzb()).multiply(BigInteger.valueOf(this.zzc)).mod(BigInteger.valueOf(zzkqVar.zza())).longValue() + 11) % zzkqVar.zza();
        this.zzc = longValue;
        return longValue % 255;
    }
}
