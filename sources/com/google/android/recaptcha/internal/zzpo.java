package com.google.android.recaptcha.internal;

import j$.util.Objects;
import java.math.RoundingMode;

/* loaded from: classes.dex */
class zzpo extends zzpp {
    public static final /* synthetic */ int zzc = 0;
    final zzpk zza;
    final Character zzb;

    zzpo(zzpk zzpkVar, Character ch) {
        this.zza = zzpkVar;
        if (ch != null && zzpkVar.zzd('=')) {
            throw new IllegalArgumentException(zzmg.zza("Padding character %s was already in alphabet", ch));
        }
        this.zzb = ch;
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
        Character ch = this.zzb;
        return Objects.hashCode(ch) ^ this.zza.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BaseEncoding.");
        zzpk zzpkVar = this.zza;
        sb.append(zzpkVar);
        if (8 % zzpkVar.zzb != 0) {
            Character ch = this.zzb;
            if (ch == null) {
                sb.append(".omitPadding()");
            } else {
                sb.append(".withPadChar('");
                sb.append(ch);
                sb.append("')");
            }
        }
        return sb.toString();
    }

    @Override // com.google.android.recaptcha.internal.zzpp
    int zza(byte[] bArr, CharSequence charSequence) {
        int i;
        CharSequence zze = zze(charSequence);
        int length = zze.length();
        zzpk zzpkVar = this.zza;
        if (!zzpkVar.zzc(length)) {
            throw new zzpn("Invalid input length " + zze.length());
        }
        int i2 = 0;
        int i3 = 0;
        while (i2 < zze.length()) {
            long j = 0;
            int i4 = 0;
            int i5 = 0;
            while (true) {
                i = zzpkVar.zzc;
                if (i4 >= i) {
                    break;
                }
                j <<= zzpkVar.zzb;
                if (i2 + i4 < zze.length()) {
                    j |= zzpkVar.zzb(zze.charAt(i5 + i2));
                    i5++;
                }
                i4++;
            }
            int i6 = zzpkVar.zzd;
            int i7 = i5 * zzpkVar.zzb;
            int i8 = (i6 - 1) * 8;
            while (i8 >= (i6 * 8) - i7) {
                bArr[i3] = (byte) ((j >>> i8) & 255);
                i8 -= 8;
                i3++;
            }
            i2 += i;
        }
        return i3;
    }

    @Override // com.google.android.recaptcha.internal.zzpp
    void zzb(Appendable appendable, byte[] bArr, int i, int i2) {
        int i3 = 0;
        zzmd.zzd(0, i2, bArr.length);
        while (i3 < i2) {
            int i4 = this.zza.zzd;
            zzf(appendable, bArr, i3, Math.min(i4, i2 - i3));
            i3 += i4;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzpp
    final int zzc(int i) {
        return (int) (((this.zza.zzb * i) + 7) / 8);
    }

    @Override // com.google.android.recaptcha.internal.zzpp
    final int zzd(int i) {
        zzpk zzpkVar = this.zza;
        return zzpkVar.zzc * zzpr.zza(i, zzpkVar.zzd, RoundingMode.CEILING);
    }

    final void zzf(Appendable appendable, byte[] bArr, int i, int i2) {
        zzmd.zzd(i, i + i2, bArr.length);
        zzpk zzpkVar = this.zza;
        int i3 = zzpkVar.zzd;
        int i4 = 0;
        zzmd.zza(i2 <= i3);
        long j = 0;
        for (int i5 = 0; i5 < i2; i5++) {
            j = (j | (bArr[i + i5] & 255)) << 8;
        }
        int i6 = (i2 + 1) * 8;
        int i7 = zzpkVar.zzb;
        while (i4 < i2 * 8) {
            appendable.append(zzpkVar.zza(zzpkVar.zza & ((int) (j >>> ((i6 - i7) - i4)))));
            i4 += i7;
        }
        if (this.zzb != null) {
            while (i4 < i3 * 8) {
                appendable.append('=');
                i4 += i7;
            }
        }
    }

    zzpo(String str, String str2, Character ch) {
        this(new zzpk(str, str2.toCharArray()), ch);
    }

    @Override // com.google.android.recaptcha.internal.zzpp
    final CharSequence zze(CharSequence charSequence) {
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
}
