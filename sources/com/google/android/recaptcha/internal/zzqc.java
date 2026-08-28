package com.google.android.recaptcha.internal;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
final class zzqc {
    public static final /* synthetic */ int zza = 0;
    private static volatile int zzb = 100;

    public static int zza(byte[] bArr, int i9, zzqb zzqbVar) {
        int zzi = zzi(bArr, i9, zzqbVar);
        int i10 = zzqbVar.zza;
        if (i10 < 0) {
            throw new zzsx("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i10 > bArr.length - zzi) {
            throw new zzsx("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        if (i10 == 0) {
            zzqbVar.zzc = zzqm.zzb;
            return zzi;
        }
        zzqbVar.zzc = zzqm.zzl(bArr, zzi, i10);
        return zzi + i10;
    }

    public static int zzb(byte[] bArr, int i9) {
        int i10 = bArr[i9] & 255;
        int i11 = bArr[i9 + 1] & 255;
        int i12 = bArr[i9 + 2] & 255;
        return ((bArr[i9 + 3] & 255) << 24) | (i11 << 8) | i10 | (i12 << 16);
    }

    public static int zzc(zzug zzugVar, byte[] bArr, int i9, int i10, int i11, zzqb zzqbVar) {
        Object zze = zzugVar.zze();
        int zzm = zzm(zze, zzugVar, bArr, i9, i10, i11, zzqbVar);
        zzugVar.zzf(zze);
        zzqbVar.zzc = zze;
        return zzm;
    }

    public static int zzd(zzug zzugVar, byte[] bArr, int i9, int i10, zzqb zzqbVar) {
        Object zze = zzugVar.zze();
        int zzn = zzn(zze, zzugVar, bArr, i9, i10, zzqbVar);
        zzugVar.zzf(zze);
        zzqbVar.zzc = zze;
        return zzn;
    }

    public static int zze(zzug zzugVar, int i9, byte[] bArr, int i10, int i11, zzsu zzsuVar, zzqb zzqbVar) {
        int zzd = zzd(zzugVar, bArr, i10, i11, zzqbVar);
        zzsuVar.add(zzqbVar.zzc);
        while (zzd < i11) {
            int zzi = zzi(bArr, zzd, zzqbVar);
            if (i9 != zzqbVar.zza) {
                break;
            }
            zzd = zzd(zzugVar, bArr, zzi, i11, zzqbVar);
            zzsuVar.add(zzqbVar.zzc);
        }
        return zzd;
    }

    public static int zzf(byte[] bArr, int i9, zzsu zzsuVar, zzqb zzqbVar) {
        zzso zzsoVar = (zzso) zzsuVar;
        int zzi = zzi(bArr, i9, zzqbVar);
        int i10 = zzqbVar.zza + zzi;
        while (zzi < i10) {
            zzi = zzi(bArr, zzi, zzqbVar);
            zzsoVar.zzh(zzqbVar.zza);
        }
        if (zzi == i10) {
            return zzi;
        }
        throw new zzsx("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public static int zzg(byte[] bArr, int i9, zzqb zzqbVar) {
        int zzi = zzi(bArr, i9, zzqbVar);
        int i10 = zzqbVar.zza;
        if (i10 < 0) {
            throw new zzsx("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i10 == 0) {
            zzqbVar.zzc = "";
            return zzi;
        }
        zzqbVar.zzc = new String(bArr, zzi, i10, zzsv.zza);
        return zzi + i10;
    }

    public static int zzh(int i9, byte[] bArr, int i10, int i11, zzuw zzuwVar, zzqb zzqbVar) {
        if ((i9 >>> 3) == 0) {
            throw new zzsx("Protocol message contained an invalid tag (zero).");
        }
        int i12 = i9 & 7;
        if (i12 == 0) {
            int zzl = zzl(bArr, i10, zzqbVar);
            zzuwVar.zzj(i9, Long.valueOf(zzqbVar.zzb));
            return zzl;
        }
        if (i12 == 1) {
            zzuwVar.zzj(i9, Long.valueOf(zzp(bArr, i10)));
            return i10 + 8;
        }
        if (i12 == 2) {
            int zzi = zzi(bArr, i10, zzqbVar);
            int i13 = zzqbVar.zza;
            if (i13 < 0) {
                throw new zzsx("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            if (i13 > bArr.length - zzi) {
                throw new zzsx("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            if (i13 == 0) {
                zzuwVar.zzj(i9, zzqm.zzb);
            } else {
                zzuwVar.zzj(i9, zzqm.zzl(bArr, zzi, i13));
            }
            return zzi + i13;
        }
        if (i12 != 3) {
            if (i12 != 5) {
                throw new zzsx("Protocol message contained an invalid tag (zero).");
            }
            zzuwVar.zzj(i9, Integer.valueOf(zzb(bArr, i10)));
            return i10 + 4;
        }
        int i14 = (i9 & (-8)) | 4;
        zzuw zzf = zzuw.zzf();
        int i15 = zzqbVar.zze + 1;
        zzqbVar.zze = i15;
        zzq(i15);
        int i16 = 0;
        while (true) {
            if (i10 >= i11) {
                break;
            }
            int zzi2 = zzi(bArr, i10, zzqbVar);
            int i17 = zzqbVar.zza;
            if (i17 == i14) {
                i16 = i17;
                i10 = zzi2;
                break;
            }
            i10 = zzh(i17, bArr, zzi2, i11, zzf, zzqbVar);
            i16 = i17;
        }
        zzqbVar.zze--;
        if (i10 > i11 || i16 != i14) {
            throw new zzsx("Failed to parse the message.");
        }
        zzuwVar.zzj(i9, zzf);
        return i10;
    }

    public static int zzi(byte[] bArr, int i9, zzqb zzqbVar) {
        int i10 = i9 + 1;
        byte b10 = bArr[i9];
        if (b10 < 0) {
            return zzj(b10, bArr, i10, zzqbVar);
        }
        zzqbVar.zza = b10;
        return i10;
    }

    public static int zzj(int i9, byte[] bArr, int i10, zzqb zzqbVar) {
        byte b10 = bArr[i10];
        int i11 = i10 + 1;
        int i12 = i9 & 127;
        if (b10 >= 0) {
            zzqbVar.zza = i12 | (b10 << 7);
            return i11;
        }
        int i13 = i12 | ((b10 & Byte.MAX_VALUE) << 7);
        int i14 = i10 + 2;
        byte b11 = bArr[i11];
        if (b11 >= 0) {
            zzqbVar.zza = i13 | (b11 << 14);
            return i14;
        }
        int i15 = i13 | ((b11 & Byte.MAX_VALUE) << 14);
        int i16 = i10 + 3;
        byte b12 = bArr[i14];
        if (b12 >= 0) {
            zzqbVar.zza = i15 | (b12 << 21);
            return i16;
        }
        int i17 = i15 | ((b12 & Byte.MAX_VALUE) << 21);
        int i18 = i10 + 4;
        byte b13 = bArr[i16];
        if (b13 >= 0) {
            zzqbVar.zza = i17 | (b13 << 28);
            return i18;
        }
        int i19 = i17 | ((b13 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i20 = i18 + 1;
            if (bArr[i18] >= 0) {
                zzqbVar.zza = i19;
                return i20;
            }
            i18 = i20;
        }
    }

    public static int zzk(int i9, byte[] bArr, int i10, int i11, zzsu zzsuVar, zzqb zzqbVar) {
        zzso zzsoVar = (zzso) zzsuVar;
        int zzi = zzi(bArr, i10, zzqbVar);
        zzsoVar.zzh(zzqbVar.zza);
        while (zzi < i11) {
            int zzi2 = zzi(bArr, zzi, zzqbVar);
            if (i9 != zzqbVar.zza) {
                break;
            }
            zzi = zzi(bArr, zzi2, zzqbVar);
            zzsoVar.zzh(zzqbVar.zza);
        }
        return zzi;
    }

    public static int zzl(byte[] bArr, int i9, zzqb zzqbVar) {
        long j10 = bArr[i9];
        int i10 = i9 + 1;
        if (j10 >= 0) {
            zzqbVar.zzb = j10;
            return i10;
        }
        int i11 = i9 + 2;
        byte b10 = bArr[i10];
        long j11 = (j10 & 127) | ((b10 & Byte.MAX_VALUE) << 7);
        int i12 = 7;
        while (b10 < 0) {
            int i13 = i11 + 1;
            i12 += 7;
            j11 |= (r10 & Byte.MAX_VALUE) << i12;
            b10 = bArr[i11];
            i11 = i13;
        }
        zzqbVar.zzb = j11;
        return i11;
    }

    public static int zzm(Object obj, zzug zzugVar, byte[] bArr, int i9, int i10, int i11, zzqb zzqbVar) {
        int i12 = zzqbVar.zze + 1;
        zzqbVar.zze = i12;
        zzq(i12);
        int zzc = ((zztv) zzugVar).zzc(obj, bArr, i9, i10, i11, zzqbVar);
        zzqbVar.zze--;
        zzqbVar.zzc = obj;
        return zzc;
    }

    public static int zzn(Object obj, zzug zzugVar, byte[] bArr, int i9, int i10, zzqb zzqbVar) {
        int i11 = i9 + 1;
        int i12 = bArr[i9];
        if (i12 < 0) {
            i11 = zzj(i12, bArr, i11, zzqbVar);
            i12 = zzqbVar.zza;
        }
        int i13 = i11;
        if (i12 < 0 || i12 > i10 - i13) {
            throw new zzsx("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        int i14 = zzqbVar.zze + 1;
        zzqbVar.zze = i14;
        zzq(i14);
        int i15 = i13 + i12;
        zzugVar.zzi(obj, bArr, i13, i15, zzqbVar);
        zzqbVar.zze--;
        zzqbVar.zzc = obj;
        return i15;
    }

    public static int zzo(int i9, byte[] bArr, int i10, int i11, zzqb zzqbVar) {
        if ((i9 >>> 3) == 0) {
            throw new zzsx("Protocol message contained an invalid tag (zero).");
        }
        int i12 = i9 & 7;
        if (i12 == 0) {
            return zzl(bArr, i10, zzqbVar);
        }
        if (i12 == 1) {
            return i10 + 8;
        }
        if (i12 == 2) {
            return zzi(bArr, i10, zzqbVar) + zzqbVar.zza;
        }
        if (i12 != 3) {
            if (i12 == 5) {
                return i10 + 4;
            }
            throw new zzsx("Protocol message contained an invalid tag (zero).");
        }
        int i13 = (i9 & (-8)) | 4;
        int i14 = 0;
        while (i10 < i11) {
            i10 = zzi(bArr, i10, zzqbVar);
            i14 = zzqbVar.zza;
            if (i14 == i13) {
                break;
            }
            i10 = zzo(i14, bArr, i10, i11, zzqbVar);
        }
        if (i10 > i11 || i14 != i13) {
            throw new zzsx("Failed to parse the message.");
        }
        return i10;
    }

    public static long zzp(byte[] bArr, int i9) {
        return (bArr[i9] & 255) | ((bArr[i9 + 1] & 255) << 8) | ((bArr[i9 + 2] & 255) << 16) | ((bArr[i9 + 3] & 255) << 24) | ((bArr[i9 + 4] & 255) << 32) | ((bArr[i9 + 5] & 255) << 40) | ((bArr[i9 + 6] & 255) << 48) | ((bArr[i9 + 7] & 255) << 56);
    }

    private static void zzq(int i9) {
        if (i9 >= zzb) {
            throw new zzsx("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
    }
}
