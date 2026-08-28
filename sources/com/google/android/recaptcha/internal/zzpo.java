package com.google.android.recaptcha.internal;

import j$.util.Objects;
import j3.r0;
import java.math.RoundingMode;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
class zzpo extends zzpp {
    public static final /* synthetic */ int zzc = 0;
    final zzpk zza;
    final Character zzb;

    public zzpo(zzpk zzpkVar, Character ch2) {
        this.zza = zzpkVar;
        if (ch2 != null && zzpkVar.zzd('=')) {
            throw new IllegalArgumentException(zzmg.zza("Padding character %s was already in alphabet", ch2));
        }
        this.zzb = ch2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzpo) {
            zzpo zzpoVar = (zzpo) obj;
            if (this.zza.equals(zzpoVar.zza) && Objects.equals(this.zzb, zzpoVar.zzb)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Character ch2 = this.zzb;
        return Objects.hashCode(ch2) ^ this.zza.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BaseEncoding.");
        zzpk zzpkVar = this.zza;
        sb2.append(zzpkVar);
        if (8 % zzpkVar.zzb != 0) {
            Character ch2 = this.zzb;
            if (ch2 == null) {
                sb2.append(".omitPadding()");
            } else {
                sb2.append(".withPadChar('");
                sb2.append(ch2);
                sb2.append("')");
            }
        }
        return sb2.toString();
    }

    @Override // com.google.android.recaptcha.internal.zzpp
    public int zza(byte[] bArr, CharSequence charSequence) {
        int i9;
        CharSequence zze = zze(charSequence);
        int length = zze.length();
        zzpk zzpkVar = this.zza;
        if (!zzpkVar.zzc(length)) {
            throw new zzpn(r0.l(zze.length(), "Invalid input length "));
        }
        int i10 = 0;
        int i11 = 0;
        while (i10 < zze.length()) {
            long j10 = 0;
            int i12 = 0;
            int i13 = 0;
            while (true) {
                i9 = zzpkVar.zzc;
                if (i12 >= i9) {
                    break;
                }
                j10 <<= zzpkVar.zzb;
                if (i10 + i12 < zze.length()) {
                    j10 |= zzpkVar.zzb(zze.charAt(i13 + i10));
                    i13++;
                }
                i12++;
            }
            int i14 = zzpkVar.zzd;
            int i15 = i13 * zzpkVar.zzb;
            int i16 = (i14 - 1) * 8;
            while (i16 >= (i14 * 8) - i15) {
                bArr[i11] = (byte) ((j10 >>> i16) & 255);
                i16 -= 8;
                i11++;
            }
            i10 += i9;
        }
        return i11;
    }

    @Override // com.google.android.recaptcha.internal.zzpp
    public void zzb(Appendable appendable, byte[] bArr, int i9, int i10) {
        int i11 = 0;
        zzmd.zzd(0, i10, bArr.length);
        while (i11 < i10) {
            int i12 = this.zza.zzd;
            zzf(appendable, bArr, i11, Math.min(i12, i10 - i11));
            i11 += i12;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzpp
    public final int zzc(int i9) {
        return (int) (((this.zza.zzb * i9) + 7) / 8);
    }

    @Override // com.google.android.recaptcha.internal.zzpp
    public final int zzd(int i9) {
        zzpk zzpkVar = this.zza;
        return zzpkVar.zzc * zzpr.zza(i9, zzpkVar.zzd, RoundingMode.CEILING);
    }

    @Override // com.google.android.recaptcha.internal.zzpp
    public final CharSequence zze(CharSequence charSequence) {
        charSequence.getClass();
        if (this.zzb == null) {
            return charSequence;
        }
        int length = charSequence.length();
        do {
            length--;
            if (length < 0) {
                break;
            }
        } while (charSequence.charAt(length) == '=');
        return charSequence.subSequence(0, length + 1);
    }

    public final void zzf(Appendable appendable, byte[] bArr, int i9, int i10) {
        zzmd.zzd(i9, i9 + i10, bArr.length);
        zzpk zzpkVar = this.zza;
        int i11 = zzpkVar.zzd;
        int i12 = 0;
        zzmd.zza(i10 <= i11);
        long j10 = 0;
        for (int i13 = 0; i13 < i10; i13++) {
            j10 = (j10 | (bArr[i9 + i13] & 255)) << 8;
        }
        int i14 = (i10 + 1) * 8;
        int i15 = zzpkVar.zzb;
        while (i12 < i10 * 8) {
            appendable.append(zzpkVar.zza(zzpkVar.zza & ((int) (j10 >>> ((i14 - i15) - i12)))));
            i12 += i15;
        }
        if (this.zzb != null) {
            while (i12 < i11 * 8) {
                appendable.append('=');
                i12 += i15;
            }
        }
    }

    public zzpo(String str, String str2, Character ch2) {
        this(new zzpk(str, str2.toCharArray()), ch2);
    }
}
