package j$.util;

import java.util.Arrays;

/* loaded from: classes2.dex */
public class Base64 {
    public static Encoder getEncoder() {
        return Encoder.c;
    }

    public static Decoder getDecoder() {
        return Decoder.c;
    }

    public static class Encoder {
        public static final char[] a = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/'};
        public static final char[] b = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '-', '_'};
        public static final Encoder c = new Encoder();

        public String encodeToString(byte[] bArr) {
            int length = ((bArr.length + 2) / 3) * 4;
            byte[] bArr2 = new byte[length];
            int length2 = bArr.length;
            int i10 = (length2 / 3) * 3;
            int i11 = 0;
            int i12 = 0;
            while (true) {
                char[] cArr = a;
                if (i11 >= i10) {
                    if (i11 < length2) {
                        int i13 = i11 + 1;
                        int i14 = bArr[i11] & 255;
                        int i15 = i12 + 1;
                        bArr2[i12] = (byte) cArr[i14 >> 2];
                        if (i13 == length2) {
                            bArr2[i15] = (byte) cArr[(i14 << 4) & 63];
                            int i16 = i12 + 3;
                            bArr2[i12 + 2] = 61;
                            i12 += 4;
                            bArr2[i16] = 61;
                        } else {
                            int i17 = bArr[i13] & 255;
                            bArr2[i15] = (byte) cArr[((i14 << 4) & 63) | (i17 >> 4)];
                            int i18 = i12 + 3;
                            bArr2[i12 + 2] = (byte) cArr[(i17 << 2) & 63];
                            i12 += 4;
                            bArr2[i18] = 61;
                        }
                    }
                    if (i12 != length) {
                        bArr2 = Arrays.copyOf(bArr2, i12);
                    }
                    return new String(bArr2, 0, 0, bArr2.length);
                }
                int min = Math.min(i11 + i10, i10);
                int i19 = i11;
                int i20 = i12;
                while (i19 < min) {
                    int i21 = i19 + 2;
                    int i22 = ((bArr[i19 + 1] & 255) << 8) | ((bArr[i19] & 255) << 16);
                    i19 += 3;
                    int i23 = i22 | (bArr[i21] & 255);
                    bArr2[i20] = (byte) cArr[(i23 >>> 18) & 63];
                    bArr2[i20 + 1] = (byte) cArr[(i23 >>> 12) & 63];
                    int i24 = i20 + 3;
                    bArr2[i20 + 2] = (byte) cArr[(i23 >>> 6) & 63];
                    i20 += 4;
                    bArr2[i24] = (byte) cArr[i23 & 63];
                }
                int i25 = ((min - i11) / 3) * 4;
                i12 += i25;
                if (i25 == -1 && min < length2) {
                    throw null;
                }
                i11 = min;
            }
        }
    }

    public static class Decoder {
        public static final int[] a;
        public static final int[] b;
        public static final Decoder c;

        static {
            int[] iArr = new int[256];
            a = iArr;
            Arrays.fill(iArr, -1);
            for (int i10 = 0; i10 < 64; i10++) {
                a[Encoder.a[i10]] = i10;
            }
            a[61] = -2;
            int[] iArr2 = new int[256];
            b = iArr2;
            Arrays.fill(iArr2, -1);
            for (int i11 = 0; i11 < 64; i11++) {
                b[Encoder.b[i11]] = i11;
            }
            b[61] = -2;
            c = new Decoder();
        }

        /* JADX WARN: Code restructure failed: missing block: B:33:0x00b8, code lost:
        
            if (r0[r2] == 61) goto L43;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x00bf, code lost:
        
            if (r9 != 18) goto L56;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public byte[] decode(String str) {
            int i10;
            int i11;
            int i12;
            byte[] bytes = str.getBytes(j$.sun.nio.cs.c.a);
            int length = bytes.length;
            if (length == 0) {
                i11 = 0;
            } else {
                if (length < 2) {
                    throw new IllegalArgumentException("Input byte[] should at least have 2 bytes for base64 bytes");
                }
                if (bytes[length - 1] == 61) {
                    i10 = bytes[length + (-2)] == 61 ? 2 : 1;
                } else {
                    i10 = 0;
                }
                if (i10 == 0 && (i12 = length & 3) != 0) {
                    i10 = 4 - i12;
                }
                i11 = (((length + 3) / 4) * 3) - i10;
            }
            byte[] bArr = new byte[i11];
            int length2 = bytes.length;
            int i13 = 18;
            int i14 = 0;
            int i15 = 18;
            int i16 = 0;
            int i17 = 0;
            while (true) {
                if (i14 >= length2) {
                    break;
                }
                int[] iArr = a;
                if (i15 == i13 && i14 + 4 < length2) {
                    int i18 = ((length2 - i14) & (-4)) + i14;
                    while (i14 < i18) {
                        int i19 = iArr[bytes[i14] & 255];
                        int i20 = iArr[bytes[i14 + 1] & 255];
                        int i21 = iArr[bytes[i14 + 2] & 255];
                        int i22 = i14 + 4;
                        int i23 = iArr[bytes[i14 + 3] & 255];
                        if ((i19 | i20 | i21 | i23) < 0) {
                            break;
                        }
                        int i24 = (i19 << 18) | (i20 << 12) | (i21 << 6) | i23;
                        bArr[i16] = (byte) (i24 >> 16);
                        int i25 = i16 + 2;
                        bArr[i16 + 1] = (byte) (i24 >> 8);
                        i16 += 3;
                        bArr[i25] = (byte) i24;
                        i14 = i22;
                    }
                    if (i14 >= length2) {
                        break;
                    }
                }
                int i26 = i14 + 1;
                int i27 = iArr[bytes[i14] & 255];
                if (i27 >= 0) {
                    i13 = 18;
                    int i28 = (i27 << i15) | i17;
                    i15 -= 6;
                    if (i15 < 0) {
                        bArr[i16] = (byte) (i28 >> 16);
                        int i29 = i16 + 2;
                        bArr[i16 + 1] = (byte) (i28 >> 8);
                        i16 += 3;
                        bArr[i29] = (byte) i28;
                        i15 = 18;
                        i17 = 0;
                    } else {
                        i17 = i28;
                    }
                    i14 = i26;
                } else {
                    if (i27 != -2) {
                        throw new IllegalArgumentException("Illegal base64 character " + Integer.toString(bytes[i14], 16));
                    }
                    if (i15 == 6) {
                        if (i26 != length2) {
                            i14 += 2;
                        }
                        throw new IllegalArgumentException("Input byte array has wrong 4-byte ending unit");
                    }
                    i14 = i26;
                }
            }
            if (i15 == 6) {
                bArr[i16] = (byte) (i17 >> 16);
                i16++;
            } else if (i15 == 0) {
                int i30 = i16 + 1;
                bArr[i16] = (byte) (i17 >> 16);
                i16 += 2;
                bArr[i30] = (byte) (i17 >> 8);
            } else if (i15 == 12) {
                throw new IllegalArgumentException("Last unit does not have enough valid bits");
            }
            if (i14 >= length2) {
                return i16 != i11 ? Arrays.copyOf(bArr, i16) : bArr;
            }
            throw new IllegalArgumentException("Input byte array has incorrect ending byte at " + i14);
        }
    }
}
