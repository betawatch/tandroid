package com.google.android.gms.internal.fido;

/* loaded from: classes.dex */
final class zzgd extends zzge {
    private zzgd(zzgb zzgbVar, Character ch) {
        super(zzgbVar, ch);
        char[] cArr;
        cArr = zzgbVar.zzf;
        zzbm.zzc(cArr.length == 64);
    }

    @Override // com.google.android.gms.internal.fido.zzge
    final zzgf zza(zzgb zzgbVar, Character ch) {
        return new zzgd(zzgbVar, ch);
    }

    @Override // com.google.android.gms.internal.fido.zzge, com.google.android.gms.internal.fido.zzgf
    final void zzb(Appendable appendable, byte[] bArr, int i, int i2) {
        int i3 = 0;
        zzbm.zze(0, i2, bArr.length);
        for (int i4 = i2; i4 >= 3; i4 -= 3) {
            int i5 = bArr[i3] & 255;
            int i6 = ((bArr[i3 + 1] & 255) << 8) | (i5 << 16) | (bArr[i3 + 2] & 255);
            appendable.append(this.zzb.zza(i6 >>> 18));
            appendable.append(this.zzb.zza((i6 >>> 12) & 63));
            appendable.append(this.zzb.zza((i6 >>> 6) & 63));
            appendable.append(this.zzb.zza(i6 & 63));
            i3 += 3;
        }
        if (i3 < i2) {
            zze(appendable, bArr, i3, i2 - i3);
        }
    }

    zzgd(String str, String str2, Character ch) {
        this(new zzgb(str, str2.toCharArray()), ch);
    }
}
