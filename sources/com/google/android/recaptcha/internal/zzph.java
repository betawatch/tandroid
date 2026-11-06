package com.google.android.recaptcha.internal;

import java.security.MessageDigest;
import java.util.Arrays;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
final class zzph extends zzoy {
    private final MessageDigest zza;
    private final int zzb;
    private boolean zzc;

    public /* synthetic */ zzph(MessageDigest messageDigest, int i7, zzpi zzpiVar) {
        this.zza = messageDigest;
        this.zzb = i7;
    }

    private final void zzc() {
        zzmd.zze(!this.zzc, "Cannot re-use a Hasher after calling hash() on it");
    }

    @Override // com.google.android.recaptcha.internal.zzoy
    public final void zza(byte[] bArr, int i7, int i10) {
        zzc();
        this.zza.update(bArr, 0, i10);
    }

    @Override // com.google.android.recaptcha.internal.zzpe
    public final zzpc zzb() {
        zzc();
        this.zzc = true;
        int i7 = this.zzb;
        MessageDigest messageDigest = this.zza;
        if (i7 == messageDigest.getDigestLength()) {
            byte[] digest = messageDigest.digest();
            int i10 = zzpc.zzb;
            return new zzpb(digest);
        }
        byte[] copyOf = Arrays.copyOf(messageDigest.digest(), i7);
        int i11 = zzpc.zzb;
        return new zzpb(copyOf);
    }
}
