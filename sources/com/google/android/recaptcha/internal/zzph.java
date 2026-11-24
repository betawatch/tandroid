package com.google.android.recaptcha.internal;

import java.security.MessageDigest;
import java.util.Arrays;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
final class zzph extends zzoy {
    private final MessageDigest zza;
    private final int zzb;
    private boolean zzc;

    public /* synthetic */ zzph(MessageDigest messageDigest, int i, zzpi zzpiVar) {
        this.zza = messageDigest;
        this.zzb = i;
    }

    private final void zzc() {
        zzmd.zze(!this.zzc, "Cannot re-use a Hasher after calling hash() on it");
    }

    @Override // com.google.android.recaptcha.internal.zzoy
    public final void zza(byte[] bArr, int i, int i2) {
        zzc();
        this.zza.update(bArr, 0, i2);
    }

    @Override // com.google.android.recaptcha.internal.zzpe
    public final zzpc zzb() {
        zzc();
        this.zzc = true;
        int i = this.zzb;
        MessageDigest messageDigest = this.zza;
        return i == messageDigest.getDigestLength() ? new zzpb(messageDigest.digest()) : new zzpb(Arrays.copyOf(messageDigest.digest(), i));
    }
}
