package com.google.android.recaptcha.internal;

import org.telegram.messenger.NotificationCenter;

/* loaded from: classes.dex */
final class zzqc {
    public static final /* synthetic */ int zza = 0;
    private static volatile int zzb = 100;

    static int zza(byte[] bArr, int i, zzqb zzqbVar) {
        int zzi = zzi(bArr, i, zzqbVar);
        int i2 = zzqbVar.zza;
        if (i2 < 0) {
            throw new zzsx("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i2 > bArr.length - zzi) {
            throw new zzsx("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        if (i2 == 0) {
            zzqbVar.zzc = zzqm.zzb;
            return zzi;
        }
        zzqbVar.zzc = zzqm.zzl(bArr, zzi, i2);
        return zzi + i2;
    }

    static int zzb(byte[] bArr, int i) {
        int i2 = bArr[i] & 255;
        int i3 = bArr[i + 1] & 255;
        int i4 = bArr[i + 2] & 255;
        return ((bArr[i + 3] & 255) << 24) | (i3 << 8) | i2 | (i4 << 16);
    }

    static int zzc(zzug zzugVar, byte[] bArr, int i, int i2, int i3, zzqb zzqbVar) {
        Object zze = zzugVar.zze();
        int zzm = zzm(zze, zzugVar, bArr, i, i2, i3, zzqbVar);
        zzugVar.zzf(zze);
        zzqbVar.zzc = zze;
        return zzm;
    }

    static int zzd(zzug zzugVar, byte[] bArr, int i, int i2, zzqb zzqbVar) {
        Object zze = zzugVar.zze();
        int zzn = zzn(zze, zzugVar, bArr, i, i2, zzqbVar);
        zzugVar.zzf(zze);
        zzqbVar.zzc = zze;
        return zzn;
    }

    static int zze(zzug zzugVar, int i, byte[] bArr, int i2, int i3, zzsu zzsuVar, zzqb zzqbVar) {
        int zzd = zzd(zzugVar, bArr, i2, i3, zzqbVar);
        zzsuVar.add(zzqbVar.zzc);
        while (zzd < i3) {
            int zzi = zzi(bArr, zzd, zzqbVar);
            if (i != zzqbVar.zza) {
                break;
            }
            zzd = zzd(zzugVar, bArr, zzi, i3, zzqbVar);
            zzsuVar.add(zzqbVar.zzc);
        }
        return zzd;
    }

    static int zzf(byte[] bArr, int i, zzsu zzsuVar, zzqb zzqbVar) {
        zzso zzsoVar = (zzso) zzsuVar;
        int zzi = zzi(bArr, i, zzqbVar);
        int i2 = zzqbVar.zza + zzi;
        while (zzi < i2) {
            zzi = zzi(bArr, zzi, zzqbVar);
            zzsoVar.zzh(zzqbVar.zza);
        }
        if (zzi == i2) {
            return zzi;
        }
        throw new zzsx("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    static int zzg(byte[] bArr, int i, zzqb zzqbVar) {
        int zzi = zzi(bArr, i, zzqbVar);
        int i2 = zzqbVar.zza;
        if (i2 < 0) {
            throw new zzsx("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i2 == 0) {
            zzqbVar.zzc = "";
            return zzi;
        }
        zzqbVar.zzc = new String(bArr, zzi, i2, zzsv.zza);
        return zzi + i2;
    }

    static int zzh(int i, byte[] bArr, int i2, int i3, zzuw zzuwVar, zzqb zzqbVar) {
        if ((i >>> 3) == 0) {
            throw new zzsx("Protocol message contained an invalid tag (zero).");
        }
        int i4 = i & 7;
        if (i4 == 0) {
            int zzl = zzl(bArr, i2, zzqbVar);
            zzuwVar.zzj(i, Long.valueOf(zzqbVar.zzb));
            return zzl;
        }
        if (i4 == 1) {
            zzuwVar.zzj(i, Long.valueOf(zzp(bArr, i2)));
            return i2 + 8;
        }
        if (i4 == 2) {
            int zzi = zzi(bArr, i2, zzqbVar);
            int i5 = zzqbVar.zza;
            if (i5 < 0) {
                throw new zzsx("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            if (i5 > bArr.length - zzi) {
                throw new zzsx("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            if (i5 == 0) {
                zzuwVar.zzj(i, zzqm.zzb);
            } else {
                zzuwVar.zzj(i, zzqm.zzl(bArr, zzi, i5));
            }
            return zzi + i5;
        }
        if (i4 != 3) {
            if (i4 != 5) {
                throw new zzsx("Protocol message contained an invalid tag (zero).");
            }
            zzuwVar.zzj(i, Integer.valueOf(zzb(bArr, i2)));
            return i2 + 4;
        }
        int i6 = (i & (-8)) | 4;
        zzuw zzf = zzuw.zzf();
        int i7 = zzqbVar.zze + 1;
        zzqbVar.zze = i7;
        zzq(i7);
        int i8 = 0;
        while (true) {
            if (i2 >= i3) {
                break;
            }
            int zzi2 = zzi(bArr, i2, zzqbVar);
            i8 = zzqbVar.zza;
            if (i8 == i6) {
                i2 = zzi2;
                break;
            }
            i2 = zzh(i8, bArr, zzi2, i3, zzf, zzqbVar);
        }
        zzqbVar.zze--;
        if (i2 > i3 || i8 != i6) {
            throw new zzsx("Failed to parse the message.");
        }
        zzuwVar.zzj(i, zzf);
        return i2;
    }

    static int zzi(byte[] bArr, int i, zzqb zzqbVar) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b < 0) {
            return zzj(b, bArr, i2, zzqbVar);
        }
        zzqbVar.zza = b;
        return i2;
    }

    static int zzj(int i, byte[] bArr, int i2, zzqb zzqbVar) {
        byte b = bArr[i2];
        int i3 = i2 + 1;
        int i4 = i & NotificationCenter.needDeleteBusinessLink;
        if (b >= 0) {
            zzqbVar.zza = i4 | (b << 7);
            return i3;
        }
        int i5 = i4 | ((b & Byte.MAX_VALUE) << 7);
        int i6 = i2 + 2;
        byte b2 = bArr[i3];
        if (b2 >= 0) {
            zzqbVar.zza = i5 | (b2 << 14);
            return i6;
        }
        int i7 = i5 | ((b2 & Byte.MAX_VALUE) << 14);
        int i8 = i2 + 3;
        byte b3 = bArr[i6];
        if (b3 >= 0) {
            zzqbVar.zza = i7 | (b3 << 21);
            return i8;
        }
        int i9 = i7 | ((b3 & Byte.MAX_VALUE) << 21);
        int i10 = i2 + 4;
        byte b4 = bArr[i8];
        if (b4 >= 0) {
            zzqbVar.zza = i9 | (b4 << 28);
            return i10;
        }
        int i11 = i9 | ((b4 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] >= 0) {
                zzqbVar.zza = i11;
                return i12;
            }
            i10 = i12;
        }
    }

    static int zzk(int i, byte[] bArr, int i2, int i3, zzsu zzsuVar, zzqb zzqbVar) {
        zzso zzsoVar = (zzso) zzsuVar;
        int zzi = zzi(bArr, i2, zzqbVar);
        zzsoVar.zzh(zzqbVar.zza);
        while (zzi < i3) {
            int zzi2 = zzi(bArr, zzi, zzqbVar);
            if (i != zzqbVar.zza) {
                break;
            }
            zzi = zzi(bArr, zzi2, zzqbVar);
            zzsoVar.zzh(zzqbVar.zza);
        }
        return zzi;
    }

    static int zzl(byte[] bArr, int i, zzqb zzqbVar) {
        long j = bArr[i];
        int i2 = i + 1;
        if (j >= 0) {
            zzqbVar.zzb = j;
            return i2;
        }
        int i3 = i + 2;
        byte b = bArr[i2];
        long j2 = (j & 127) | ((b & Byte.MAX_VALUE) << 7);
        int i4 = 7;
        while (b < 0) {
            int i5 = i3 + 1;
            i4 += 7;
            j2 |= (r10 & Byte.MAX_VALUE) << i4;
            b = bArr[i3];
            i3 = i5;
        }
        zzqbVar.zzb = j2;
        return i3;
    }

    static int zzm(Object obj, zzug zzugVar, byte[] bArr, int i, int i2, int i3, zzqb zzqbVar) {
        zztv zztvVar = (zztv) zzugVar;
        int i4 = zzqbVar.zze + 1;
        zzqbVar.zze = i4;
        zzq(i4);
        int zzc = zztvVar.zzc(obj, bArr, i, i2, i3, zzqbVar);
        zzqbVar.zze--;
        zzqbVar.zzc = obj;
        return zzc;
    }

    static int zzn(Object obj, zzug zzugVar, byte[] bArr, int i, int i2, zzqb zzqbVar) {
        int i3 = i + 1;
        int i4 = bArr[i];
        if (i4 < 0) {
            i3 = zzj(i4, bArr, i3, zzqbVar);
            i4 = zzqbVar.zza;
        }
        int i5 = i3;
        if (i4 < 0 || i4 > i2 - i5) {
            throw new zzsx("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        int i6 = zzqbVar.zze + 1;
        zzqbVar.zze = i6;
        zzq(i6);
        int i7 = i4 + i5;
        zzugVar.zzi(obj, bArr, i5, i7, zzqbVar);
        zzqbVar.zze--;
        zzqbVar.zzc = obj;
        return i7;
    }

    static int zzo(int i, byte[] bArr, int i2, int i3, zzqb zzqbVar) {
        if ((i >>> 3) == 0) {
            throw new zzsx("Protocol message contained an invalid tag (zero).");
        }
        int i4 = i & 7;
        if (i4 == 0) {
            return zzl(bArr, i2, zzqbVar);
        }
        if (i4 == 1) {
            return i2 + 8;
        }
        if (i4 == 2) {
            return zzi(bArr, i2, zzqbVar) + zzqbVar.zza;
        }
        if (i4 != 3) {
            if (i4 == 5) {
                return i2 + 4;
            }
            throw new zzsx("Protocol message contained an invalid tag (zero).");
        }
        int i5 = (i & (-8)) | 4;
        int i6 = 0;
        while (i2 < i3) {
            i2 = zzi(bArr, i2, zzqbVar);
            i6 = zzqbVar.zza;
            if (i6 == i5) {
                break;
            }
            i2 = zzo(i6, bArr, i2, i3, zzqbVar);
        }
        if (i2 > i3 || i6 != i5) {
            throw new zzsx("Failed to parse the message.");
        }
        return i2;
    }

    static long zzp(byte[] bArr, int i) {
        return (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48) | ((bArr[i + 7] & 255) << 56);
    }

    private static void zzq(int i) {
        if (i >= zzb) {
            throw new zzsx("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
    }
}
