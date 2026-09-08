package com.google.android.recaptcha.internal;

import i2.g;
import j$.util.Objects;
import java.math.RoundingMode;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
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
        int i10;
        CharSequence zze = zze(charSequence);
        int length = zze.length();
        zzpk zzpkVar = this.zza;
        if (!zzpkVar.zzc(length)) {
            throw new zzpn(g.i(zze.length(), "Invalid input length "));
        }
        int i11 = 0;
        int i12 = 0;
        while (i11 < zze.length()) {
            long j3 = 0;
            int i13 = 0;
            int i14 = 0;
            while (true) {
                i10 = zzpkVar.zzc;
                if (i13 >= i10) {
                    break;
                }
                j3 <<= zzpkVar.zzb;
                if (i11 + i13 < zze.length()) {
                    j3 |= zzpkVar.zzb(zze.charAt(i14 + i11));
                    i14++;
                }
                i13++;
            }
            int i15 = zzpkVar.zzd;
            int i16 = i14 * zzpkVar.zzb;
            int i17 = (i15 - 1) * 8;
            while (i17 >= (i15 * 8) - i16) {
                bArr[i12] = (byte) ((j3 >>> i17) & 255);
                i17 -= 8;
                i12++;
            }
            i11 += i10;
        }
        return i12;
    }

    @Override // com.google.android.recaptcha.internal.zzpp
    public void zzb(Appendable appendable, byte[] bArr, int i10, int i11) {
        int i12 = 0;
        zzmd.zzd(0, i11, bArr.length);
        while (i12 < i11) {
            int i13 = this.zza.zzd;
            zzf(appendable, bArr, i12, Math.min(i13, i11 - i12));
            i12 += i13;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzpp
    public final int zzc(int i10) {
        return (int) (((this.zza.zzb * i10) + 7) / 8);
    }

    @Override // com.google.android.recaptcha.internal.zzpp
    public final int zzd(int i10) {
        zzpk zzpkVar = this.zza;
        return zzpkVar.zzc * zzpr.zza(i10, zzpkVar.zzd, RoundingMode.CEILING);
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

    public final void zzf(Appendable appendable, byte[] bArr, int i10, int i11) {
        zzmd.zzd(i10, i10 + i11, bArr.length);
        zzpk zzpkVar = this.zza;
        int i12 = zzpkVar.zzd;
        int i13 = 0;
        zzmd.zza(i11 <= i12);
        long j3 = 0;
        for (int i14 = 0; i14 < i11; i14++) {
            j3 = (j3 | (bArr[i10 + i14] & 255)) << 8;
        }
        int i15 = (i11 + 1) * 8;
        int i16 = zzpkVar.zzb;
        while (i13 < i11 * 8) {
            appendable.append(zzpkVar.zza(zzpkVar.zza & ((int) (j3 >>> ((i15 - i16) - i13)))));
            i13 += i16;
        }
        if (this.zzb != null) {
            while (i13 < i12 * 8) {
                appendable.append('=');
                i13 += i16;
            }
        }
    }

    public zzpo(String str, String str2, Character ch2) {
        this(new zzpk(str, str2.toCharArray()), ch2);
    }
}
