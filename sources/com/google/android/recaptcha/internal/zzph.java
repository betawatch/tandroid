package com.google.android.recaptcha.internal;

import java.security.MessageDigest;
import java.util.Arrays;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
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
