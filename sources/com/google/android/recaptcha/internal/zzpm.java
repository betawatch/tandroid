package com.google.android.recaptcha.internal;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
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
            throw new zzpn(i0.a.k(zze.length(), "Invalid input length "));
        }
        int i10 = 0;
        int i11 = 0;
        while (i10 < zze.length()) {
            int i12 = i11 + 1;
            int zzb = (zzpkVar.zzb(zze.charAt(i10 + 1)) << 12) | (zzpkVar.zzb(zze.charAt(i10)) << 18);
            bArr[i11] = (byte) (zzb >>> 16);
            int i13 = i10 + 2;
            if (i13 < zze.length()) {
                int i14 = i10 + 3;
                int zzb2 = zzb | (zzpkVar.zzb(zze.charAt(i13)) << 6);
                int i15 = i11 + 2;
                bArr[i12] = (byte) ((zzb2 >>> 8) & 255);
                if (i14 < zze.length()) {
                    i10 += 4;
                    i11 += 3;
                    bArr[i15] = (byte) ((zzb2 | zzpkVar.zzb(zze.charAt(i14))) & 255);
                } else {
                    i11 = i15;
                    i10 = i14;
                }
            } else {
                i10 = i13;
                i11 = i12;
            }
        }
        return i11;
    }

    @Override // com.google.android.recaptcha.internal.zzpo, com.google.android.recaptcha.internal.zzpp
    public final void zzb(Appendable appendable, byte[] bArr, int i10, int i11) {
        int i12 = 0;
        zzmd.zzd(0, i11, bArr.length);
        for (int i13 = i11; i13 >= 3; i13 -= 3) {
            int i14 = bArr[i12] & 255;
            int i15 = bArr[i12 + 1] & 255;
            int i16 = bArr[i12 + 2] & 255;
            zzpk zzpkVar = this.zza;
            int i17 = (i15 << 8) | (i14 << 16) | i16;
            appendable.append(zzpkVar.zza(i17 >>> 18));
            appendable.append(zzpkVar.zza((i17 >>> 12) & 63));
            appendable.append(zzpkVar.zza((i17 >>> 6) & 63));
            appendable.append(zzpkVar.zza(i17 & 63));
            i12 += 3;
        }
        if (i12 < i11) {
            zzf(appendable, bArr, i12, i11 - i12);
        }
    }
}
