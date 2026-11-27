package com.google.android.recaptcha.internal;

import java.security.MessageDigest;
import java.util.Arrays;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
