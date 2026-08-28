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
            int i9 = (length2 / 3) * 3;
            int i10 = 0;
            int i11 = 0;
            while (true) {
                char[] cArr = a;
                if (i10 >= i9) {
                    if (i10 < length2) {
                        int i12 = i10 + 1;
                        int i13 = bArr[i10] & 255;
                        int i14 = i11 + 1;
                        bArr2[i11] = (byte) cArr[i13 >> 2];
                        if (i12 == length2) {
                            bArr2[i14] = (byte) cArr[(i13 << 4) & 63];
                            int i15 = i11 + 3;
                            bArr2[i11 + 2] = 61;
                            i11 += 4;
                            bArr2[i15] = 61;
                        } else {
                            int i16 = bArr[i12] & 255;
                            bArr2[i14] = (byte) cArr[((i13 << 4) & 63) | (i16 >> 4)];
                            int i17 = i11 + 3;
                            bArr2[i11 + 2] = (byte) cArr[(i16 << 2) & 63];
                            i11 += 4;
                            bArr2[i17] = 61;
                        }
                    }
                    if (i11 != length) {
                        bArr2 = Arrays.copyOf(bArr2, i11);
                    }
                    return new String(bArr2, 0, 0, bArr2.length);
                }
                int min = Math.min(i10 + i9, i9);
                int i18 = i10;
                int i19 = i11;
                while (i18 < min) {
                    int i20 = i18 + 2;
                    int i21 = ((bArr[i18 + 1] & 255) << 8) | ((bArr[i18] & 255) << 16);
                    i18 += 3;
                    int i22 = i21 | (bArr[i20] & 255);
                    bArr2[i19] = (byte) cArr[(i22 >>> 18) & 63];
                    bArr2[i19 + 1] = (byte) cArr[(i22 >>> 12) & 63];
                    int i23 = i19 + 3;
                    bArr2[i19 + 2] = (byte) cArr[(i22 >>> 6) & 63];
                    i19 += 4;
                    bArr2[i23] = (byte) cArr[i22 & 63];
                }
                int i24 = ((min - i10) / 3) * 4;
                i11 += i24;
                if (i24 == -1 && min < length2) {
                    throw null;
                }
                i10 = min;
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
            for (int i9 = 0; i9 < 64; i9++) {
                a[Encoder.a[i9]] = i9;
            }
            a[61] = -2;
            int[] iArr2 = new int[256];
            b = iArr2;
            Arrays.fill(iArr2, -1);
            for (int i10 = 0; i10 < 64; i10++) {
                b[Encoder.b[i10]] = i10;
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
            int i9;
            int i10;
            int i11;
            byte[] bytes = str.getBytes(j$.sun.nio.cs.c.a);
            int length = bytes.length;
            if (length == 0) {
                i10 = 0;
            } else {
                if (length < 2) {
                    throw new IllegalArgumentException("Input byte[] should at least have 2 bytes for base64 bytes");
                }
                if (bytes[length - 1] == 61) {
                    i9 = bytes[length + (-2)] == 61 ? 2 : 1;
                } else {
                    i9 = 0;
                }
                if (i9 == 0 && (i11 = length & 3) != 0) {
                    i9 = 4 - i11;
                }
                i10 = (((length + 3) / 4) * 3) - i9;
            }
            byte[] bArr = new byte[i10];
            int length2 = bytes.length;
            int i12 = 18;
            int i13 = 0;
            int i14 = 18;
            int i15 = 0;
            int i16 = 0;
            while (true) {
                if (i13 >= length2) {
                    break;
                }
                int[] iArr = a;
                if (i14 == i12 && i13 + 4 < length2) {
                    int i17 = ((length2 - i13) & (-4)) + i13;
                    while (i13 < i17) {
                        int i18 = iArr[bytes[i13] & 255];
                        int i19 = iArr[bytes[i13 + 1] & 255];
                        int i20 = iArr[bytes[i13 + 2] & 255];
                        int i21 = i13 + 4;
                        int i22 = iArr[bytes[i13 + 3] & 255];
                        if ((i18 | i19 | i20 | i22) < 0) {
                            break;
                        }
                        int i23 = (i18 << 18) | (i19 << 12) | (i20 << 6) | i22;
                        bArr[i15] = (byte) (i23 >> 16);
                        int i24 = i15 + 2;
                        bArr[i15 + 1] = (byte) (i23 >> 8);
                        i15 += 3;
                        bArr[i24] = (byte) i23;
                        i13 = i21;
                    }
                    if (i13 >= length2) {
                        break;
                    }
                }
                int i25 = i13 + 1;
                int i26 = iArr[bytes[i13] & 255];
                if (i26 >= 0) {
                    i12 = 18;
                    int i27 = (i26 << i14) | i16;
                    i14 -= 6;
                    if (i14 < 0) {
                        bArr[i15] = (byte) (i27 >> 16);
                        int i28 = i15 + 2;
                        bArr[i15 + 1] = (byte) (i27 >> 8);
                        i15 += 3;
                        bArr[i28] = (byte) i27;
                        i14 = 18;
                        i16 = 0;
                    } else {
                        i16 = i27;
                    }
                    i13 = i25;
                } else {
                    if (i26 != -2) {
                        throw new IllegalArgumentException("Illegal base64 character " + Integer.toString(bytes[i13], 16));
                    }
                    if (i14 == 6) {
                        if (i25 != length2) {
                            i13 += 2;
                        }
                        throw new IllegalArgumentException("Input byte array has wrong 4-byte ending unit");
                    }
                    i13 = i25;
                }
            }
            if (i14 == 6) {
                bArr[i15] = (byte) (i16 >> 16);
                i15++;
            } else if (i14 == 0) {
                int i29 = i15 + 1;
                bArr[i15] = (byte) (i16 >> 16);
                i15 += 2;
                bArr[i29] = (byte) (i16 >> 8);
            } else if (i14 == 12) {
                throw new IllegalArgumentException("Last unit does not have enough valid bits");
            }
            if (i13 >= length2) {
                return i15 != i10 ? Arrays.copyOf(bArr, i15) : bArr;
            }
            throw new IllegalArgumentException("Input byte array has incorrect ending byte at " + i13);
        }
    }
}
