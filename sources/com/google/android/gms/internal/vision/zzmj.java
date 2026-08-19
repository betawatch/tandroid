package com.google.android.gms.internal.vision;

import org.telegram.messenger.NotificationCenter;

/* loaded from: classes.dex */
final class zzmj extends zzme {
    zzmj() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:72:0x0064, code lost:
    
        return -1;
     */
    @Override // com.google.android.gms.internal.vision.zzme
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final int zza(int i, byte[] bArr, int i2, int i3) {
        int i4;
        int i5 = 2;
        int i6 = 0;
        if ((i2 | i3 | (bArr.length - i3)) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("Array length=%d, index=%d, limit=%d", Integer.valueOf(bArr.length), Integer.valueOf(i2), Integer.valueOf(i3)));
        }
        long j = i2;
        int i7 = (int) (i3 - j);
        long j2 = 1;
        if (i7 >= 16) {
            long j3 = j;
            i4 = 0;
            while (true) {
                if (i4 >= i7) {
                    i4 = i7;
                    break;
                }
                long j4 = j3 + 1;
                if (zzma.zza(bArr, j3) < 0) {
                    break;
                }
                i4++;
                j3 = j4;
            }
        } else {
            i4 = 0;
        }
        int i8 = i7 - i4;
        long j5 = j + i4;
        while (true) {
            byte b = 0;
            while (true) {
                if (i8 <= 0) {
                    break;
                }
                long j6 = j5 + j2;
                b = zzma.zza(bArr, j5);
                if (b < 0) {
                    j5 = j6;
                    break;
                }
                i8--;
                j5 = j6;
            }
            if (i8 == 0) {
                return i6;
            }
            int i9 = i8 - 1;
            if (b >= -32) {
                if (b >= -16) {
                    if (i9 >= 3) {
                        i8 -= 4;
                        long j7 = j5 + j2;
                        byte zza = zzma.zza(bArr, j5);
                        if (zza > -65 || (((b << 28) + (zza + 112)) >> 30) != 0) {
                            break;
                        }
                        long j8 = j5 + 2;
                        if (zzma.zza(bArr, j7) > -65) {
                            break;
                        }
                        j5 += 3;
                        if (zzma.zza(bArr, j8) > -65) {
                            break;
                        }
                    } else {
                        return zza(bArr, b, j5, i9);
                    }
                } else if (i9 >= i5) {
                    i8 -= 3;
                    long j9 = j5 + j2;
                    byte zza2 = zzma.zza(bArr, j5);
                    if (zza2 > -65 || ((b == -32 && zza2 < -96) || (b == -19 && zza2 >= -96))) {
                        break;
                    }
                    j5 += 2;
                    if (zzma.zza(bArr, j9) > -65) {
                        break;
                    }
                    i5 = 2;
                    i6 = 0;
                } else {
                    return zza(bArr, b, j5, i9);
                }
            } else if (i9 != 0) {
                i8 -= 2;
                if (b < -62) {
                    break;
                }
                long j10 = j5 + j2;
                if (zzma.zza(bArr, j5) > -65) {
                    break;
                }
                j5 = j10;
            } else {
                return b;
            }
            i5 = 2;
            i6 = 0;
            j2 = 1;
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.vision.zzme
    final String zzb(byte[] bArr, int i, int i2) {
        boolean zzd;
        boolean zzd2;
        boolean zze;
        boolean zzf;
        boolean zzd3;
        if ((i | i2 | ((bArr.length - i) - i2)) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)));
        }
        int i3 = i + i2;
        char[] cArr = new char[i2];
        int i4 = i;
        int i5 = 0;
        while (i4 < i3) {
            byte zza = zzma.zza(bArr, i4);
            zzd3 = zzmf.zzd(zza);
            if (!zzd3) {
                break;
            }
            i4++;
            zzmf.zzb(zza, cArr, i5);
            i5++;
        }
        int i6 = i5;
        while (i4 < i3) {
            int i7 = i4 + 1;
            byte zza2 = zzma.zza(bArr, i4);
            zzd = zzmf.zzd(zza2);
            if (zzd) {
                int i8 = i6 + 1;
                zzmf.zzb(zza2, cArr, i6);
                while (i7 < i3) {
                    byte zza3 = zzma.zza(bArr, i7);
                    zzd2 = zzmf.zzd(zza3);
                    if (!zzd2) {
                        break;
                    }
                    i7++;
                    zzmf.zzb(zza3, cArr, i8);
                    i8++;
                }
                i6 = i8;
                i4 = i7;
            } else {
                zze = zzmf.zze(zza2);
                if (!zze) {
                    zzf = zzmf.zzf(zza2);
                    if (zzf) {
                        if (i7 < i3 - 1) {
                            int i9 = i4 + 2;
                            i4 += 3;
                            zzmf.zzb(zza2, zzma.zza(bArr, i7), zzma.zza(bArr, i9), cArr, i6);
                            i6++;
                        } else {
                            throw zzjk.zzh();
                        }
                    } else {
                        if (i7 >= i3 - 2) {
                            throw zzjk.zzh();
                        }
                        byte zza4 = zzma.zza(bArr, i7);
                        int i10 = i4 + 3;
                        byte zza5 = zzma.zza(bArr, i4 + 2);
                        i4 += 4;
                        zzmf.zzb(zza2, zza4, zza5, zzma.zza(bArr, i10), cArr, i6);
                        i6 += 2;
                    }
                } else if (i7 < i3) {
                    i4 += 2;
                    zzmf.zzb(zza2, zzma.zza(bArr, i7), cArr, i6);
                    i6++;
                } else {
                    throw zzjk.zzh();
                }
            }
        }
        return new String(cArr, 0, i6);
    }

    @Override // com.google.android.gms.internal.vision.zzme
    final int zza(CharSequence charSequence, byte[] bArr, int i, int i2) {
        long j;
        long j2;
        long j3;
        int i3;
        char charAt;
        long j4 = i;
        long j5 = i2 + j4;
        int length = charSequence.length();
        if (length > i2 || bArr.length - i2 < i) {
            char charAt2 = charSequence.charAt(length - 1);
            StringBuilder sb = new StringBuilder(37);
            sb.append("Failed writing ");
            sb.append(charAt2);
            sb.append(" at index ");
            sb.append(i + i2);
            throw new ArrayIndexOutOfBoundsException(sb.toString());
        }
        int i4 = 0;
        while (true) {
            j = 1;
            if (i4 >= length || (charAt = charSequence.charAt(i4)) >= 128) {
                break;
            }
            zzma.zza(bArr, j4, (byte) charAt);
            i4++;
            j4 = 1 + j4;
        }
        if (i4 == length) {
            return (int) j4;
        }
        while (i4 < length) {
            char charAt3 = charSequence.charAt(i4);
            if (charAt3 < 128 && j4 < j5) {
                zzma.zza(bArr, j4, (byte) charAt3);
                j3 = j5;
                j2 = j;
                j4 += j;
            } else if (charAt3 >= 2048 || j4 > j5 - 2) {
                j2 = j;
                if ((charAt3 >= 55296 && 57343 >= charAt3) || j4 > j5 - 3) {
                    j3 = j5;
                    if (j4 <= j3 - 4) {
                        int i5 = i4 + 1;
                        if (i5 != length) {
                            char charAt4 = charSequence.charAt(i5);
                            if (Character.isSurrogatePair(charAt3, charAt4)) {
                                int codePoint = Character.toCodePoint(charAt3, charAt4);
                                zzma.zza(bArr, j4, (byte) ((codePoint >>> 18) | NotificationCenter.appConfigUpdated));
                                zzma.zza(bArr, j4 + j2, (byte) (((codePoint >>> 12) & 63) | 128));
                                long j6 = j4 + 3;
                                zzma.zza(bArr, j4 + 2, (byte) (((codePoint >>> 6) & 63) | 128));
                                j4 += 4;
                                zzma.zza(bArr, j6, (byte) ((codePoint & 63) | 128));
                                i4 = i5;
                            } else {
                                i4 = i5;
                            }
                        }
                        throw new zzmg(i4 - 1, length);
                    }
                    if (55296 > charAt3 || charAt3 > 57343 || ((i3 = i4 + 1) != length && Character.isSurrogatePair(charAt3, charSequence.charAt(i3)))) {
                        StringBuilder sb2 = new StringBuilder(46);
                        sb2.append("Failed writing ");
                        sb2.append(charAt3);
                        sb2.append(" at index ");
                        sb2.append(j4);
                        throw new ArrayIndexOutOfBoundsException(sb2.toString());
                    }
                    throw new zzmg(i4, length);
                }
                zzma.zza(bArr, j4, (byte) ((charAt3 >>> '\f') | 480));
                j3 = j5;
                long j7 = j4 + 2;
                zzma.zza(bArr, j4 + j2, (byte) (((charAt3 >>> 6) & 63) | 128));
                j4 += 3;
                zzma.zza(bArr, j7, (byte) ((charAt3 & '?') | 128));
            } else {
                j2 = j;
                long j8 = j4 + j2;
                zzma.zza(bArr, j4, (byte) ((charAt3 >>> 6) | 960));
                j4 += 2;
                zzma.zza(bArr, j8, (byte) ((charAt3 & '?') | 128));
                j3 = j5;
            }
            i4++;
            j = j2;
            j5 = j3;
        }
        return (int) j4;
    }

    private static int zza(byte[] bArr, int i, long j, int i2) {
        int zzb;
        int zzb2;
        int zzb3;
        if (i2 == 0) {
            zzb = zzmd.zzb(i);
            return zzb;
        }
        if (i2 == 1) {
            zzb2 = zzmd.zzb(i, zzma.zza(bArr, j));
            return zzb2;
        }
        if (i2 == 2) {
            zzb3 = zzmd.zzb(i, zzma.zza(bArr, j), zzma.zza(bArr, j + 1));
            return zzb3;
        }
        throw new AssertionError();
    }
}
