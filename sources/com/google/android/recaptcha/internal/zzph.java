package com.google.android.recaptcha.internal;

import java.security.MessageDigest;
import java.util.Arrays;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
final class zzph extends zzoy {
    private final MessageDigest zza;
    private final int zzb;
    private boolean zzc;

    public /* synthetic */ zzph(MessageDigest messageDigest, int i10, zzpi zzpiVar) {
        this.zza = messageDigest;
        this.zzb = i10;
    }

    private final void zzc() {
        zzmd.zze(!this.zzc, "Cannot re-use a Hasher after calling hash() on it");
    }

    @Override // com.google.android.recaptcha.internal.zzoy
    public final void zza(byte[] bArr, int i10, int i11) {
        zzc();
        this.zza.update(bArr, 0, i11);
    }

    @Override // com.google.android.recaptcha.internal.zzpe
    public final zzpc zzb() {
        zzc();
        this.zzc = true;
        int i10 = this.zzb;
        MessageDigest messageDigest = this.zza;
        if (i10 == messageDigest.getDigestLength()) {
            byte[] digest = messageDigest.digest();
            int i11 = zzpc.zzb;
            return new zzpb(digest);
        }
        byte[] copyOf = Arrays.copyOf(messageDigest.digest(), i10);
        int i12 = zzpc.zzb;
        return new zzpb(copyOf);
    }
}
