package com.google.android.recaptcha.internal;

import j3.r0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
final class zzpm extends zzpo {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzpm(String str, String str2, Character ch2) {
        super(r0, ch2);
        char[] cArr;
        zzpk zzpkVar = new zzpk(str, str2.toCharArray());
        cArr = zzpkVar.zzf;
        zzmd.zza(cArr.length == 64);
    }

    @Override // com.google.android.recaptcha.internal.zzpo, com.google.android.recaptcha.internal.zzpp
    public final int zza(byte[] bArr, CharSequence charSequence) {
        CharSequence zze = zze(charSequence);
        int length = zze.length();
        zzpk zzpkVar = this.zza;
        if (!zzpkVar.zzc(length)) {
            throw new zzpn(r0.l(zze.length(), "Invalid input length "));
        }
        int i9 = 0;
        int i10 = 0;
        while (i9 < zze.length()) {
            int i11 = i10 + 1;
            int zzb = (zzpkVar.zzb(zze.charAt(i9 + 1)) << 12) | (zzpkVar.zzb(zze.charAt(i9)) << 18);
            bArr[i10] = (byte) (zzb >>> 16);
            int i12 = i9 + 2;
            if (i12 < zze.length()) {
                int i13 = i9 + 3;
                int zzb2 = zzb | (zzpkVar.zzb(zze.charAt(i12)) << 6);
                int i14 = i10 + 2;
                bArr[i11] = (byte) ((zzb2 >>> 8) & 255);
                if (i13 < zze.length()) {
                    i9 += 4;
                    i10 += 3;
                    bArr[i14] = (byte) ((zzb2 | zzpkVar.zzb(zze.charAt(i13))) & 255);
                } else {
                    i10 = i14;
                    i9 = i13;
                }
            } else {
                i9 = i12;
                i10 = i11;
            }
        }
        return i10;
    }

    @Override // com.google.android.recaptcha.internal.zzpo, com.google.android.recaptcha.internal.zzpp
    public final void zzb(Appendable appendable, byte[] bArr, int i9, int i10) {
        int i11 = 0;
        zzmd.zzd(0, i10, bArr.length);
        for (int i12 = i10; i12 >= 3; i12 -= 3) {
            int i13 = bArr[i11] & 255;
            int i14 = bArr[i11 + 1] & 255;
            int i15 = bArr[i11 + 2] & 255;
            zzpk zzpkVar = this.zza;
            int i16 = (i14 << 8) | (i13 << 16) | i15;
            appendable.append(zzpkVar.zza(i16 >>> 18));
            appendable.append(zzpkVar.zza((i16 >>> 12) & 63));
            appendable.append(zzpkVar.zza((i16 >>> 6) & 63));
            appendable.append(zzpkVar.zza(i16 & 63));
            i11 += 3;
        }
        if (i11 < i10) {
            zzf(appendable, bArr, i11, i10 - i11);
        }
    }
}
