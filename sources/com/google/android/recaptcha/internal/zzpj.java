package com.google.android.recaptcha.internal;

import java.io.Serializable;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes.dex */
final class zzpj extends zzoz implements Serializable {
    private final MessageDigest zza;
    private final int zzb;
    private final boolean zzc;
    private final String zzd;

    public zzpj(String str, String str2) {
        MessageDigest zzc = zzc("SHA-256");
        this.zza = zzc;
        this.zzb = zzc.getDigestLength();
        this.zzd = "Hashing.sha256()";
        this.zzc = zzd(zzc);
    }

    private static MessageDigest zzc(String str) {
        try {
            return MessageDigest.getInstance(str);
        } catch (NoSuchAlgorithmException e) {
            throw new AssertionError(e);
        }
    }

    private static boolean zzd(MessageDigest messageDigest) {
        try {
            messageDigest.clone();
            return true;
        } catch (CloneNotSupportedException unused) {
            return false;
        }
    }

    public final String toString() {
        return this.zzd;
    }

    @Override // com.google.android.recaptcha.internal.zzpd
    public final zzpe zzb() {
        zzpi zzpiVar = null;
        if (this.zzc) {
            try {
                return new zzph((MessageDigest) this.zza.clone(), this.zzb, zzpiVar);
            } catch (CloneNotSupportedException unused) {
            }
        }
        return new zzph(zzc(this.zza.getAlgorithm()), this.zzb, zzpiVar);
    }
}
