package com.google.android.recaptcha.internal;

import j$.util.Objects;
import java.math.RoundingMode;
import jg.g;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
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
        int i7;
        CharSequence zze = zze(charSequence);
        int length = zze.length();
        zzpk zzpkVar = this.zza;
        if (!zzpkVar.zzc(length)) {
            throw new zzpn(g.j(zze.length(), "Invalid input length "));
        }
        int i10 = 0;
        int i11 = 0;
        while (i10 < zze.length()) {
            long j3 = 0;
            int i12 = 0;
            int i13 = 0;
            while (true) {
                i7 = zzpkVar.zzc;
                if (i12 >= i7) {
                    break;
                }
                j3 <<= zzpkVar.zzb;
                if (i10 + i12 < zze.length()) {
                    j3 |= zzpkVar.zzb(zze.charAt(i13 + i10));
                    i13++;
                }
                i12++;
            }
            int i14 = zzpkVar.zzd;
            int i15 = i13 * zzpkVar.zzb;
            int i16 = (i14 - 1) * 8;
            while (i16 >= (i14 * 8) - i15) {
                bArr[i11] = (byte) ((j3 >>> i16) & 255);
                i16 -= 8;
                i11++;
            }
            i10 += i7;
        }
        return i11;
    }

    @Override // com.google.android.recaptcha.internal.zzpp
    public void zzb(Appendable appendable, byte[] bArr, int i7, int i10) {
        int i11 = 0;
        zzmd.zzd(0, i10, bArr.length);
        while (i11 < i10) {
            int i12 = this.zza.zzd;
            zzf(appendable, bArr, i11, Math.min(i12, i10 - i11));
            i11 += i12;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzpp
    public final int zzc(int i7) {
        return (int) (((this.zza.zzb * i7) + 7) / 8);
    }

    @Override // com.google.android.recaptcha.internal.zzpp
    public final int zzd(int i7) {
        zzpk zzpkVar = this.zza;
        return zzpkVar.zzc * zzpr.zza(i7, zzpkVar.zzd, RoundingMode.CEILING);
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

    public final void zzf(Appendable appendable, byte[] bArr, int i7, int i10) {
        zzmd.zzd(i7, i7 + i10, bArr.length);
        zzpk zzpkVar = this.zza;
        int i11 = zzpkVar.zzd;
        int i12 = 0;
        zzmd.zza(i10 <= i11);
        long j3 = 0;
        for (int i13 = 0; i13 < i10; i13++) {
            j3 = (j3 | (bArr[i7 + i13] & 255)) << 8;
        }
        int i14 = (i10 + 1) * 8;
        int i15 = zzpkVar.zzb;
        while (i12 < i10 * 8) {
            appendable.append(zzpkVar.zza(zzpkVar.zza & ((int) (j3 >>> ((i14 - i15) - i12)))));
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
