package com.google.android.recaptcha.internal;

import java.security.MessageDigest;
import java.util.Arrays;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
final class zzph extends zzoy {
    private final MessageDigest zza;
    private final int zzb;
    private boolean zzc;

    public /* synthetic */ zzph(MessageDigest messageDigest, int i3, zzpi zzpiVar) {
        this.zza = messageDigest;
        this.zzb = i3;
    }

    private final void zzc() {
        zzmd.zze(!this.zzc, "Cannot re-use a Hasher after calling hash() on it");
    }

    @Override // com.google.android.recaptcha.internal.zzoy
    public final void zza(byte[] bArr, int i3, int i10) {
        zzc();
        this.zza.update(bArr, 0, i10);
    }

    @Override // com.google.android.recaptcha.internal.zzpe
    public final zzpc zzb() {
        zzc();
        this.zzc = true;
        int i3 = this.zzb;
        MessageDigest messageDigest = this.zza;
        if (i3 == messageDigest.getDigestLength()) {
            byte[] digest = messageDigest.digest();
            int i10 = zzpc.zzb;
            return new zzpb(digest);
        }
        byte[] copyOf = Arrays.copyOf(messageDigest.digest(), i3);
        int i11 = zzpc.zzb;
        return new zzpb(copyOf);
    }
}
