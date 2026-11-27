// default package

import java.nio.charset.Charset;
import java.util.Arrays;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class dcc {
    public final /* synthetic */ byte a;

    public /* synthetic */ dcc(byte b) {
        this.a = b;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String a(int i, int i2, byte[] bArr) {
        switch (this.a) {
            case 0:
                if ((i | i2 | ((bArr.length - i) - i2)) < 0) {
                    throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)));
                }
                int i3 = i + i2;
                char[] cArr = new char[i2];
                int i4 = 0;
                while (i < i3) {
                    byte b = bArr[i];
                    if (b < 0) {
                        while (i < i3) {
                            int i5 = i + 1;
                            byte b2 = bArr[i];
                            if (b2 >= 0) {
                                int i6 = i4 + 1;
                                cArr[i4] = (char) b2;
                                while (i5 < i3) {
                                    byte b3 = bArr[i5];
                                    if (b3 >= 0) {
                                        i5++;
                                        cArr[i6] = (char) b3;
                                        i6++;
                                    } else {
                                        i4 = i6;
                                        i = i5;
                                    }
                                }
                                i4 = i6;
                                i = i5;
                            } else if (b2 < -32) {
                                if (i5 >= i3) {
                                    throw bs5.a();
                                }
                                i += 2;
                                byte b4 = bArr[i5];
                                int i7 = i4 + 1;
                                if (b2 < -62 || e2f.a(b4)) {
                                    throw bs5.a();
                                }
                                cArr[i4] = (char) (((b2 & 31) << 6) | (b4 & 63));
                                i4 = i7;
                            } else if (b2 < -16) {
                                if (i5 >= i3 - 1) {
                                    throw bs5.a();
                                }
                                int i8 = i + 2;
                                byte b5 = bArr[i5];
                                i += 3;
                                byte b6 = bArr[i8];
                                int i9 = i4 + 1;
                                if (e2f.a(b5) || ((b2 == -32 && b5 < -96) || ((b2 == -19 && b5 >= -96) || e2f.a(b6)))) {
                                    throw bs5.a();
                                }
                                cArr[i4] = (char) (((b2 & 15) << 12) | ((b5 & 63) << 6) | (b6 & 63));
                                i4 = i9;
                            } else {
                                if (i5 >= i3 - 2) {
                                    throw bs5.a();
                                }
                                byte b7 = bArr[i5];
                                int i10 = i + 3;
                                byte b8 = bArr[i + 2];
                                i += 4;
                                byte b9 = bArr[i10];
                                int i11 = i4 + 1;
                                if (e2f.a(b7) || (((b7 + 112) + (b2 << 28)) >> 30) != 0 || e2f.a(b8) || e2f.a(b9)) {
                                    throw bs5.a();
                                }
                                int i12 = ((b2 & 7) << 18) | ((b7 & 63) << 12) | ((b8 & 63) << 6) | (b9 & 63);
                                cArr[i4] = (char) ((i12 >>> 10) + 55232);
                                cArr[i11] = (char) ((i12 & 1023) + 56320);
                                i4 += 2;
                            }
                        }
                        return new String(cArr, 0, i4);
                    }
                    i++;
                    cArr[i4] = (char) b;
                    i4++;
                }
                while (i < i3) {
                }
                return new String(cArr, 0, i4);
            default:
                Charset charset = pr5.a;
                String str = new String(bArr, i, i2, charset);
                if (str.indexOf(65533) < 0 || Arrays.equals(str.getBytes(charset), Arrays.copyOfRange(bArr, i, i2 + i))) {
                    return str;
                }
                throw bs5.a();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:79:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0183  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int b(String str, byte[] bArr, int i, int i2) {
        int i3;
        char charAt;
        int i4;
        int i5;
        char charAt2;
        char c = 2048;
        char c2 = 128;
        char c3 = 55296;
        switch (this.a) {
            case 0:
                int length = str.length();
                int i6 = i2 + i;
                int i7 = 0;
                while (i7 < length) {
                    int i8 = i7 + i;
                    if (i8 < i6 && (charAt = str.charAt(i7)) < 128) {
                        bArr[i8] = (byte) charAt;
                        i7++;
                    }
                    if (i7 != length) {
                        return i + length;
                    }
                    int i9 = i + i7;
                    while (i7 < length) {
                        char charAt3 = str.charAt(i7);
                        if (charAt3 < 128 && i9 < i6) {
                            bArr[i9] = (byte) charAt3;
                            i9++;
                        } else if (charAt3 < 2048 && i9 <= i6 - 2) {
                            int i10 = i9 + 1;
                            bArr[i9] = (byte) ((charAt3 >>> 6) | 960);
                            i9 += 2;
                            bArr[i10] = (byte) ((charAt3 & '?') | 128);
                        } else {
                            if ((charAt3 >= 55296 && 57343 >= charAt3) || i9 > i6 - 3) {
                                if (i9 > i6 - 4) {
                                    if (55296 <= charAt3 && charAt3 <= 57343 && ((i3 = i7 + 1) == str.length() || !Character.isSurrogatePair(charAt3, str.charAt(i3)))) {
                                        throw new ecc(i7, length);
                                    }
                                    p3d.k(charAt3, i9);
                                    return 0;
                                }
                                int i11 = i7 + 1;
                                if (i11 != str.length()) {
                                    char charAt4 = str.charAt(i11);
                                    if (Character.isSurrogatePair(charAt3, charAt4)) {
                                        int codePoint = Character.toCodePoint(charAt3, charAt4);
                                        bArr[i9] = (byte) ((codePoint >>> 18) | jn7.O3);
                                        bArr[i9 + 1] = (byte) (((codePoint >>> 12) & 63) | 128);
                                        int i12 = i9 + 3;
                                        bArr[i9 + 2] = (byte) (((codePoint >>> 6) & 63) | 128);
                                        i9 += 4;
                                        bArr[i12] = (byte) ((codePoint & 63) | 128);
                                        i7 = i11;
                                    } else {
                                        i7 = i11;
                                    }
                                }
                                throw new ecc(i7 - 1, length);
                            }
                            bArr[i9] = (byte) ((charAt3 >>> '\f') | 480);
                            int i13 = i9 + 2;
                            bArr[i9 + 1] = (byte) (((charAt3 >>> 6) & 63) | 128);
                            i9 += 3;
                            bArr[i13] = (byte) ((charAt3 & '?') | 128);
                        }
                        i7++;
                    }
                    return i9;
                }
                if (i7 != length) {
                }
                break;
            default:
                long j = i;
                long j2 = i2 + j;
                int length2 = str.length();
                if (length2 > i2 || bArr.length - i2 < i) {
                    throw new ArrayIndexOutOfBoundsException("Failed writing " + str.charAt(length2 - 1) + " at index " + (i + i2));
                }
                int i14 = 0;
                while (i14 < length2 && (charAt2 = str.charAt(i14)) < 128) {
                    dac.j(bArr, j, (byte) charAt2);
                    i14++;
                    j++;
                }
                if (i14 != length2) {
                    while (i14 < length2) {
                        char charAt5 = str.charAt(i14);
                        if (charAt5 >= c2 || j >= j2) {
                            if (charAt5 >= c || j > j2 - 2) {
                                i4 = i14;
                                if ((charAt5 >= c3 && 57343 >= charAt5) || j > j2 - 3) {
                                    if (j > j2 - 4) {
                                        if (55296 <= charAt5 && charAt5 <= 57343 && ((i5 = i4 + 1) == length2 || !Character.isSurrogatePair(charAt5, str.charAt(i5)))) {
                                            throw new ecc(i4, length2);
                                        }
                                        throw new ArrayIndexOutOfBoundsException("Failed writing " + charAt5 + " at index " + j);
                                    }
                                    i14 = i4 + 1;
                                    if (i14 != length2) {
                                        char charAt6 = str.charAt(i14);
                                        if (Character.isSurrogatePair(charAt5, charAt6)) {
                                            int codePoint2 = Character.toCodePoint(charAt5, charAt6);
                                            dac.j(bArr, j, (byte) ((codePoint2 >>> 18) | jn7.O3));
                                            dac.j(bArr, j + 1, (byte) (((codePoint2 >>> 12) & 63) | 128));
                                            long j3 = j + 3;
                                            dac.j(bArr, j + 2, (byte) (((codePoint2 >>> 6) & 63) | 128));
                                            j += 4;
                                            dac.j(bArr, j3, (byte) ((codePoint2 & 63) | 128));
                                        }
                                    } else {
                                        i14 = i4;
                                    }
                                    throw new ecc(i14 - 1, length2);
                                }
                                dac.j(bArr, j, (byte) ((charAt5 >>> '\f') | 480));
                                long j4 = j + 2;
                                dac.j(bArr, j + 1, (byte) (((charAt5 >>> 6) & 63) | c2));
                                j += 3;
                                dac.j(bArr, j4, (byte) ((charAt5 & '?') | 128));
                            } else {
                                i4 = i14;
                                long j5 = j + 1;
                                dac.j(bArr, j, (byte) ((charAt5 >>> 6) | 960));
                                j += 2;
                                dac.j(bArr, j5, (byte) ((charAt5 & '?') | c2));
                            }
                            i14 = i4;
                        } else {
                            dac.j(bArr, j, (byte) charAt5);
                            j++;
                        }
                        i14++;
                        c = 2048;
                        c2 = 128;
                        c3 = 55296;
                    }
                }
                return (int) j;
        }
    }
}
