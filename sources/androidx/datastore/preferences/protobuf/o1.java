package androidx.datastore.preferences.protobuf;

import java.nio.charset.Charset;
import java.util.Arrays;
import org.telegram.messenger.hs;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class o1 {
    public final /* synthetic */ int a;

    /* JADX WARN: Removed duplicated region for block: B:21:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String a(int i3, int i10, byte[] bArr) {
        switch (this.a) {
            case 0:
                if ((i3 | i10 | ((bArr.length - i3) - i10)) < 0) {
                    throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i3), Integer.valueOf(i10)));
                }
                int i11 = i3 + i10;
                char[] cArr = new char[i10];
                int i12 = 0;
                while (i3 < i11) {
                    byte b10 = bArr[i3];
                    if (b10 < 0) {
                        while (i3 < i11) {
                            int i13 = i3 + 1;
                            byte b11 = bArr[i3];
                            if (b11 >= 0) {
                                int i14 = i12 + 1;
                                cArr[i12] = (char) b11;
                                while (i13 < i11) {
                                    byte b12 = bArr[i13];
                                    if (b12 >= 0) {
                                        i13++;
                                        cArr[i14] = (char) b12;
                                        i14++;
                                    } else {
                                        i12 = i14;
                                        i3 = i13;
                                    }
                                }
                                i12 = i14;
                                i3 = i13;
                            } else if (b11 < -32) {
                                if (i13 >= i11) {
                                    throw e0.a();
                                }
                                i3 += 2;
                                byte b13 = bArr[i13];
                                int i15 = i12 + 1;
                                if (b11 < -62 || b8.u0.a(b13)) {
                                    throw e0.a();
                                }
                                cArr[i12] = (char) ((b13 & 63) | ((b11 & 31) << 6));
                                i12 = i15;
                            } else if (b11 < -16) {
                                if (i13 >= i11 - 1) {
                                    throw e0.a();
                                }
                                int i16 = i3 + 2;
                                byte b14 = bArr[i13];
                                i3 += 3;
                                byte b15 = bArr[i16];
                                int i17 = i12 + 1;
                                if (b8.u0.a(b14) || ((b11 == -32 && b14 < -96) || ((b11 == -19 && b14 >= -96) || b8.u0.a(b15)))) {
                                    throw e0.a();
                                }
                                cArr[i12] = (char) (((b14 & 63) << 6) | ((b11 & 15) << 12) | (b15 & 63));
                                i12 = i17;
                            } else {
                                if (i13 >= i11 - 2) {
                                    throw e0.a();
                                }
                                byte b16 = bArr[i13];
                                int i18 = i3 + 3;
                                byte b17 = bArr[i3 + 2];
                                i3 += 4;
                                byte b18 = bArr[i18];
                                int i19 = i12 + 1;
                                if (b8.u0.a(b16) || (((b16 + 112) + (b11 << 28)) >> 30) != 0 || b8.u0.a(b17) || b8.u0.a(b18)) {
                                    throw e0.a();
                                }
                                int i20 = ((b16 & 63) << 12) | ((b11 & 7) << 18) | ((b17 & 63) << 6) | (b18 & 63);
                                cArr[i12] = (char) ((i20 >>> 10) + 55232);
                                cArr[i19] = (char) ((i20 & 1023) + 56320);
                                i12 += 2;
                            }
                        }
                        return new String(cArr, 0, i12);
                    }
                    i3++;
                    cArr[i12] = (char) b10;
                    i12++;
                }
                while (i3 < i11) {
                }
                return new String(cArr, 0, i12);
            default:
                Charset charset = c0.a;
                String str = new String(bArr, i3, i10, charset);
                if (str.indexOf(65533) >= 0 && !Arrays.equals(str.getBytes(charset), Arrays.copyOfRange(bArr, i3, i10 + i3))) {
                    throw e0.a();
                }
                return str;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:79:?, code lost:
    
        return r27 + r5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int b(String str, byte[] bArr, int i3, int i10) {
        int i11;
        int i12;
        char charAt;
        long j10;
        long j11;
        long j12;
        int i13;
        char charAt2;
        switch (this.a) {
            case 0:
                int length = str.length();
                int i14 = i10 + i3;
                int i15 = 0;
                while (i15 < length && (i12 = i15 + i3) < i14 && (charAt = str.charAt(i15)) < 128) {
                    bArr[i12] = (byte) charAt;
                    i15++;
                }
                int i16 = i3 + i15;
                while (i15 < length) {
                    char charAt3 = str.charAt(i15);
                    if (charAt3 < 128 && i16 < i14) {
                        bArr[i16] = (byte) charAt3;
                        i16++;
                    } else if (charAt3 < 2048 && i16 <= i14 - 2) {
                        int i17 = i16 + 1;
                        bArr[i16] = (byte) ((charAt3 >>> 6) | 960);
                        i16 += 2;
                        bArr[i17] = (byte) ((charAt3 & '?') | 128);
                    } else {
                        if ((charAt3 >= 55296 && 57343 >= charAt3) || i16 > i14 - 3) {
                            if (i16 > i14 - 4) {
                                if (55296 <= charAt3 && charAt3 <= 57343 && ((i11 = i15 + 1) == str.length() || !Character.isSurrogatePair(charAt3, str.charAt(i11)))) {
                                    throw new p1(i15, length);
                                }
                                throw new ArrayIndexOutOfBoundsException("Failed writing " + charAt3 + " at index " + i16);
                            }
                            int i18 = i15 + 1;
                            if (i18 != str.length()) {
                                char charAt4 = str.charAt(i18);
                                if (Character.isSurrogatePair(charAt3, charAt4)) {
                                    int codePoint = Character.toCodePoint(charAt3, charAt4);
                                    bArr[i16] = (byte) ((codePoint >>> 18) | hs.P3);
                                    bArr[i16 + 1] = (byte) (((codePoint >>> 12) & 63) | 128);
                                    int i19 = i16 + 3;
                                    bArr[i16 + 2] = (byte) (((codePoint >>> 6) & 63) | 128);
                                    i16 += 4;
                                    bArr[i19] = (byte) ((codePoint & 63) | 128);
                                    i15 = i18;
                                } else {
                                    i15 = i18;
                                }
                            }
                            throw new p1(i15 - 1, length);
                        }
                        bArr[i16] = (byte) ((charAt3 >>> '\f') | 480);
                        int i20 = i16 + 2;
                        bArr[i16 + 1] = (byte) (((charAt3 >>> 6) & 63) | 128);
                        i16 += 3;
                        bArr[i20] = (byte) ((charAt3 & '?') | 128);
                    }
                    i15++;
                }
                return i16;
            default:
                long j13 = i3;
                long j14 = i10 + j13;
                int length2 = str.length();
                if (length2 > i10 || bArr.length - i10 < i3) {
                    throw new ArrayIndexOutOfBoundsException("Failed writing " + str.charAt(length2 - 1) + " at index " + (i3 + i10));
                }
                int i21 = 0;
                while (true) {
                    j10 = 1;
                    if (i21 < length2 && (charAt2 = str.charAt(i21)) < 128) {
                        n1.j(bArr, j13, (byte) charAt2);
                        i21++;
                        j13 = 1 + j13;
                    }
                }
                if (i21 != length2) {
                    while (i21 < length2) {
                        char charAt5 = str.charAt(i21);
                        if (charAt5 < 128 && j13 < j14) {
                            n1.j(bArr, j13, (byte) charAt5);
                            j12 = j14;
                            j11 = j10;
                            j13 += j10;
                        } else if (charAt5 >= 2048 || j13 > j14 - 2) {
                            j11 = j10;
                            if ((charAt5 >= 55296 && 57343 >= charAt5) || j13 > j14 - 3) {
                                j12 = j14;
                                if (j13 > j12 - 4) {
                                    if (55296 <= charAt5 && charAt5 <= 57343 && ((i13 = i21 + 1) == length2 || !Character.isSurrogatePair(charAt5, str.charAt(i13)))) {
                                        throw new p1(i21, length2);
                                    }
                                    throw new ArrayIndexOutOfBoundsException("Failed writing " + charAt5 + " at index " + j13);
                                }
                                int i22 = i21 + 1;
                                if (i22 != length2) {
                                    char charAt6 = str.charAt(i22);
                                    if (Character.isSurrogatePair(charAt5, charAt6)) {
                                        int codePoint2 = Character.toCodePoint(charAt5, charAt6);
                                        n1.j(bArr, j13, (byte) ((codePoint2 >>> 18) | hs.P3));
                                        n1.j(bArr, j13 + j11, (byte) (((codePoint2 >>> 12) & 63) | 128));
                                        long j15 = j13 + 3;
                                        n1.j(bArr, j13 + 2, (byte) (((codePoint2 >>> 6) & 63) | 128));
                                        j13 += 4;
                                        n1.j(bArr, j15, (byte) ((codePoint2 & 63) | 128));
                                        i21 = i22;
                                    } else {
                                        i21 = i22;
                                    }
                                }
                                throw new p1(i21 - 1, length2);
                            }
                            n1.j(bArr, j13, (byte) ((charAt5 >>> '\f') | 480));
                            j12 = j14;
                            long j16 = j13 + 2;
                            n1.j(bArr, j13 + j11, (byte) (((charAt5 >>> 6) & 63) | 128));
                            j13 += 3;
                            n1.j(bArr, j16, (byte) ((charAt5 & '?') | 128));
                        } else {
                            j11 = j10;
                            long j17 = j13 + j11;
                            n1.j(bArr, j13, (byte) ((charAt5 >>> 6) | 960));
                            j13 += 2;
                            n1.j(bArr, j17, (byte) ((charAt5 & '?') | 128));
                            j12 = j14;
                        }
                        i21++;
                        j10 = j11;
                        j14 = j12;
                    }
                }
                return (int) j13;
        }
    }
}
