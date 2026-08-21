package com.google.android.gms.internal.play_billing;

import org.telegram.messenger.NotificationCenter;

/* loaded from: classes.dex */
abstract class zzdx {
    public static final /* synthetic */ int $r8$clinit = 0;
    private static volatile int zzb = 100;

    static int zza(byte[] bArr, int i, zzdw zzdwVar) {
        int zzi = zzi(bArr, i, zzdwVar);
        int i2 = zzdwVar.zza;
        if (i2 < 0) {
            throw new zzfq("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i2 > bArr.length - zzi) {
            throw new zzfq("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        if (i2 == 0) {
            zzdwVar.zzc = zzei.zzb;
            return zzi;
        }
        zzdwVar.zzc = zzei.zzj(bArr, zzi, i2);
        return zzi + i2;
    }

    static int zzb(byte[] bArr, int i) {
        int i2 = bArr[i] & 255;
        int i3 = bArr[i + 1] & 255;
        int i4 = bArr[i + 2] & 255;
        return ((bArr[i + 3] & 255) << 24) | (i3 << 8) | i2 | (i4 << 16);
    }

    static int zzc(zzgv zzgvVar, byte[] bArr, int i, int i2, int i3, zzdw zzdwVar) {
        Object zze = zzgvVar.zze();
        int zzm = zzm(zze, zzgvVar, bArr, i, i2, i3, zzdwVar);
        zzgvVar.zzf(zze);
        zzdwVar.zzc = zze;
        return zzm;
    }

    static int zzd(zzgv zzgvVar, byte[] bArr, int i, int i2, zzdw zzdwVar) {
        Object zze = zzgvVar.zze();
        int zzn = zzn(zze, zzgvVar, bArr, i, i2, zzdwVar);
        zzgvVar.zzf(zze);
        zzdwVar.zzc = zze;
        return zzn;
    }

    static int zze(zzgv zzgvVar, int i, byte[] bArr, int i2, int i3, zzfn zzfnVar, zzdw zzdwVar) {
        int zzd = zzd(zzgvVar, bArr, i2, i3, zzdwVar);
        zzfnVar.add(zzdwVar.zzc);
        while (zzd < i3) {
            int zzi = zzi(bArr, zzd, zzdwVar);
            if (i != zzdwVar.zza) {
                break;
            }
            zzd = zzd(zzgvVar, bArr, zzi, i3, zzdwVar);
            zzfnVar.add(zzdwVar.zzc);
        }
        return zzd;
    }

    static int zzf(byte[] bArr, int i, zzfn zzfnVar, zzdw zzdwVar) {
        zzfj zzfjVar = (zzfj) zzfnVar;
        int zzi = zzi(bArr, i, zzdwVar);
        int i2 = zzdwVar.zza + zzi;
        while (zzi < i2) {
            zzi = zzi(bArr, zzi, zzdwVar);
            zzfjVar.zzg(zzdwVar.zza);
        }
        if (zzi == i2) {
            return zzi;
        }
        throw new zzfq("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    static int zzg(byte[] bArr, int i, zzdw zzdwVar) {
        int i2;
        int zzi = zzi(bArr, i, zzdwVar);
        int i3 = zzdwVar.zza;
        if (i3 < 0) {
            throw new zzfq("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i3 == 0) {
            zzdwVar.zzc = "";
            return zzi;
        }
        int i4 = zzhr.$r8$clinit;
        int length = bArr.length;
        if ((((length - zzi) - i3) | zzi | i3) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(length), Integer.valueOf(zzi), Integer.valueOf(i3)));
        }
        int i5 = zzi + i3;
        char[] cArr = new char[i3];
        int i6 = 0;
        while (zzi < i5) {
            byte b = bArr[zzi];
            if (!zzhp.zzd(b)) {
                break;
            }
            zzi++;
            cArr[i6] = (char) b;
            i6++;
        }
        int i7 = i6;
        while (zzi < i5) {
            int i8 = zzi + 1;
            byte b2 = bArr[zzi];
            if (zzhp.zzd(b2)) {
                cArr[i7] = (char) b2;
                i7++;
                zzi = i8;
                while (zzi < i5) {
                    byte b3 = bArr[zzi];
                    if (zzhp.zzd(b3)) {
                        zzi++;
                        cArr[i7] = (char) b3;
                        i7++;
                    }
                }
            } else {
                if (b2 < -32) {
                    if (i8 >= i5) {
                        throw new zzfq("Protocol message had invalid UTF-8.");
                    }
                    i2 = i7 + 1;
                    zzi += 2;
                    zzhp.zzc(b2, bArr[i8], cArr, i7);
                } else if (b2 < -16) {
                    if (i8 >= i5 - 1) {
                        throw new zzfq("Protocol message had invalid UTF-8.");
                    }
                    i2 = i7 + 1;
                    int i9 = zzi + 2;
                    zzi += 3;
                    zzhp.zzb(b2, bArr[i8], bArr[i9], cArr, i7);
                } else {
                    if (i8 >= i5 - 2) {
                        throw new zzfq("Protocol message had invalid UTF-8.");
                    }
                    byte b4 = bArr[i8];
                    int i10 = zzi + 3;
                    byte b5 = bArr[zzi + 2];
                    zzi += 4;
                    zzhp.zza(b2, b4, b5, bArr[i10], cArr, i7);
                    i7 += 2;
                }
                i7 = i2;
            }
        }
        zzdwVar.zzc = new String(cArr, 0, i7);
        return i5;
    }

    static int zzh(int i, byte[] bArr, int i2, int i3, zzhi zzhiVar, zzdw zzdwVar) {
        if ((i >>> 3) == 0) {
            throw new zzfq("Protocol message contained an invalid tag (zero).");
        }
        int i4 = i & 7;
        if (i4 == 0) {
            int zzl = zzl(bArr, i2, zzdwVar);
            zzhiVar.zzj(i, Long.valueOf(zzdwVar.zzb));
            return zzl;
        }
        if (i4 == 1) {
            zzhiVar.zzj(i, Long.valueOf(zzo(bArr, i2)));
            return i2 + 8;
        }
        if (i4 == 2) {
            int zzi = zzi(bArr, i2, zzdwVar);
            int i5 = zzdwVar.zza;
            if (i5 < 0) {
                throw new zzfq("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            if (i5 > bArr.length - zzi) {
                throw new zzfq("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            if (i5 == 0) {
                zzhiVar.zzj(i, zzei.zzb);
            } else {
                zzhiVar.zzj(i, zzei.zzj(bArr, zzi, i5));
            }
            return zzi + i5;
        }
        if (i4 != 3) {
            if (i4 != 5) {
                throw new zzfq("Protocol message contained an invalid tag (zero).");
            }
            zzhiVar.zzj(i, Integer.valueOf(zzb(bArr, i2)));
            return i2 + 4;
        }
        int i6 = (i & (-8)) | 4;
        zzhi zzf = zzhi.zzf();
        int i7 = zzdwVar.zze + 1;
        zzdwVar.zze = i7;
        zzp(i7);
        int i8 = 0;
        while (true) {
            if (i2 >= i3) {
                break;
            }
            int zzi2 = zzi(bArr, i2, zzdwVar);
            int i9 = zzdwVar.zza;
            if (i9 == i6) {
                i8 = i9;
                i2 = zzi2;
                break;
            }
            i2 = zzh(i9, bArr, zzi2, i3, zzf, zzdwVar);
            i8 = i9;
        }
        zzdwVar.zze--;
        if (i2 > i3 || i8 != i6) {
            throw new zzfq("Failed to parse the message.");
        }
        zzhiVar.zzj(i, zzf);
        return i2;
    }

    static int zzi(byte[] bArr, int i, zzdw zzdwVar) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b < 0) {
            return zzj(b, bArr, i2, zzdwVar);
        }
        zzdwVar.zza = b;
        return i2;
    }

    static int zzj(int i, byte[] bArr, int i2, zzdw zzdwVar) {
        byte b = bArr[i2];
        int i3 = i2 + 1;
        int i4 = i & NotificationCenter.needDeleteBusinessLink;
        if (b >= 0) {
            zzdwVar.zza = i4 | (b << 7);
            return i3;
        }
        int i5 = i4 | ((b & Byte.MAX_VALUE) << 7);
        int i6 = i2 + 2;
        byte b2 = bArr[i3];
        if (b2 >= 0) {
            zzdwVar.zza = i5 | (b2 << 14);
            return i6;
        }
        int i7 = i5 | ((b2 & Byte.MAX_VALUE) << 14);
        int i8 = i2 + 3;
        byte b3 = bArr[i6];
        if (b3 >= 0) {
            zzdwVar.zza = i7 | (b3 << 21);
            return i8;
        }
        int i9 = i7 | ((b3 & Byte.MAX_VALUE) << 21);
        int i10 = i2 + 4;
        byte b4 = bArr[i8];
        if (b4 >= 0) {
            zzdwVar.zza = i9 | (b4 << 28);
            return i10;
        }
        int i11 = i9 | ((b4 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] >= 0) {
                zzdwVar.zza = i11;
                return i12;
            }
            i10 = i12;
        }
    }

    static int zzk(int i, byte[] bArr, int i2, int i3, zzfn zzfnVar, zzdw zzdwVar) {
        zzfj zzfjVar = (zzfj) zzfnVar;
        int zzi = zzi(bArr, i2, zzdwVar);
        zzfjVar.zzg(zzdwVar.zza);
        while (zzi < i3) {
            int zzi2 = zzi(bArr, zzi, zzdwVar);
            if (i != zzdwVar.zza) {
                break;
            }
            zzi = zzi(bArr, zzi2, zzdwVar);
            zzfjVar.zzg(zzdwVar.zza);
        }
        return zzi;
    }

    static int zzl(byte[] bArr, int i, zzdw zzdwVar) {
        long j = bArr[i];
        int i2 = i + 1;
        if (j >= 0) {
            zzdwVar.zzb = j;
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
        zzdwVar.zzb = j2;
        return i3;
    }

    static int zzm(Object obj, zzgv zzgvVar, byte[] bArr, int i, int i2, int i3, zzdw zzdwVar) {
        int i4 = zzdwVar.zze + 1;
        zzdwVar.zze = i4;
        zzp(i4);
        int zzc = ((zzgo) zzgvVar).zzc(obj, bArr, i, i2, i3, zzdwVar);
        zzdwVar.zze--;
        zzdwVar.zzc = obj;
        return zzc;
    }

    static int zzn(Object obj, zzgv zzgvVar, byte[] bArr, int i, int i2, zzdw zzdwVar) {
        int i3 = i + 1;
        int i4 = bArr[i];
        if (i4 < 0) {
            i3 = zzj(i4, bArr, i3, zzdwVar);
            i4 = zzdwVar.zza;
        }
        int i5 = i3;
        if (i4 < 0 || i4 > i2 - i5) {
            throw new zzfq("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        int i6 = zzdwVar.zze + 1;
        zzdwVar.zze = i6;
        zzp(i6);
        int i7 = i5 + i4;
        zzgvVar.zzh(obj, bArr, i5, i7, zzdwVar);
        zzdwVar.zze--;
        zzdwVar.zzc = obj;
        return i7;
    }

    static long zzo(byte[] bArr, int i) {
        return (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48) | ((bArr[i + 7] & 255) << 56);
    }

    private static void zzp(int i) {
        if (i >= zzb) {
            throw new zzfq("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
    }
}
