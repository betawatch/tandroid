package com.google.android.recaptcha.internal;

import k2.p1;
import org.telegram.messenger.hs;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
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
            throw new zzpn(p1.i(zze.length(), "Invalid input length "));
        }
        int i3 = 0;
        int i10 = 0;
        while (i3 < zze.length()) {
            int i11 = i10 + 1;
            int zzb = (zzpkVar.zzb(zze.charAt(i3 + 1)) << 12) | (zzpkVar.zzb(zze.charAt(i3)) << 18);
            bArr[i10] = (byte) (zzb >>> 16);
            int i12 = i3 + 2;
            if (i12 < zze.length()) {
                int i13 = i3 + 3;
                int zzb2 = zzb | (zzpkVar.zzb(zze.charAt(i12)) << 6);
                int i14 = i10 + 2;
                bArr[i11] = (byte) ((zzb2 >>> 8) & hs.e4);
                if (i13 < zze.length()) {
                    i3 += 4;
                    i10 += 3;
                    bArr[i14] = (byte) ((zzb2 | zzpkVar.zzb(zze.charAt(i13))) & hs.e4);
                } else {
                    i10 = i14;
                    i3 = i13;
                }
            } else {
                i3 = i12;
                i10 = i11;
            }
        }
        return i10;
    }

    @Override // com.google.android.recaptcha.internal.zzpo, com.google.android.recaptcha.internal.zzpp
    public final void zzb(Appendable appendable, byte[] bArr, int i3, int i10) {
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
