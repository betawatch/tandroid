package com.google.android.recaptcha.internal;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
final class zzpm extends zzpo {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzpm(String str, String str2, Character ch) {
        super(r0, ch);
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
            throw new zzpn(uh9.k(zze.length(), "Invalid input length "));
        }
        int i = 0;
        int i2 = 0;
        while (i < zze.length()) {
            int i3 = i2 + 1;
            int zzb = (zzpkVar.zzb(zze.charAt(i)) << 18) | (zzpkVar.zzb(zze.charAt(i + 1)) << 12);
            bArr[i2] = (byte) (zzb >>> 16);
            int i4 = i + 2;
            if (i4 < zze.length()) {
                int i5 = i + 3;
                int zzb2 = zzb | (zzpkVar.zzb(zze.charAt(i4)) << 6);
                int i6 = i2 + 2;
                bArr[i3] = (byte) ((zzb2 >>> 8) & jn7.d4);
                if (i5 < zze.length()) {
                    i += 4;
                    i2 += 3;
                    bArr[i6] = (byte) ((zzb2 | zzpkVar.zzb(zze.charAt(i5))) & jn7.d4);
                } else {
                    i2 = i6;
                    i = i5;
                }
            } else {
                i = i4;
                i2 = i3;
            }
        }
        return i2;
    }

    @Override // com.google.android.recaptcha.internal.zzpo, com.google.android.recaptcha.internal.zzpp
    public final void zzb(Appendable appendable, byte[] bArr, int i, int i2) {
        int i3 = 0;
        zzmd.zzd(0, i2, bArr.length);
        for (int i4 = i2; i4 >= 3; i4 -= 3) {
            int i5 = bArr[i3] & 255;
            int i6 = bArr[i3 + 1] & 255;
            int i7 = bArr[i3 + 2] & 255;
            zzpk zzpkVar = this.zza;
            int i8 = (i5 << 16) | (i6 << 8) | i7;
            appendable.append(zzpkVar.zza(i8 >>> 18));
            appendable.append(zzpkVar.zza((i8 >>> 12) & 63));
            appendable.append(zzpkVar.zza((i8 >>> 6) & 63));
            appendable.append(zzpkVar.zza(i8 & 63));
            i3 += 3;
        }
        if (i3 < i2) {
            zzf(appendable, bArr, i3, i2 - i3);
        }
    }
}
