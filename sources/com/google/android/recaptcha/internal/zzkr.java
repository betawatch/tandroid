package com.google.android.recaptcha.internal;

import java.math.BigInteger;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class zzkr {
    private static final zzkq zza = new zzkq(11, 25214903917L, 281474976710656L);
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
