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
            char[] cArr = a;
            int i = (length2 / 3) * 3;
            int i2 = 0;
            int i3 = 0;
            while (i2 < i) {
                int min = Math.min(i2 + i, i);
                int i4 = i2;
                int i5 = i3;
                while (i4 < min) {
                    int i6 = i4 + 2;
                    int i7 = ((bArr[i4 + 1] & 255) << 8) | ((bArr[i4] & 255) << 16);
                    i4 += 3;
                    int i8 = i7 | (bArr[i6] & 255);
                    bArr2[i5] = (byte) cArr[(i8 >>> 18) & 63];
                    bArr2[i5 + 1] = (byte) cArr[(i8 >>> 12) & 63];
                    int i9 = i5 + 3;
                    bArr2[i5 + 2] = (byte) cArr[(i8 >>> 6) & 63];
                    i5 += 4;
                    bArr2[i9] = (byte) cArr[i8 & 63];
                }
                int i10 = ((min - i2) / 3) * 4;
                i3 += i10;
                if (i10 == -1 && min < length2) {
                    throw null;
                }
                i2 = min;
            }
            if (i2 < length2) {
                int i11 = i2 + 1;
                int i12 = bArr[i2] & 255;
                int i13 = i3 + 1;
                bArr2[i3] = (byte) cArr[i12 >> 2];
                if (i11 == length2) {
                    bArr2[i13] = (byte) cArr[(i12 << 4) & 63];
                    int i14 = i3 + 3;
                    bArr2[i3 + 2] = 61;
                    i3 += 4;
                    bArr2[i14] = 61;
                } else {
                    int i15 = bArr[i11] & 255;
                    bArr2[i13] = (byte) cArr[((i12 << 4) & 63) | (i15 >> 4)];
                    int i16 = i3 + 3;
                    bArr2[i3 + 2] = (byte) cArr[(i15 << 2) & 63];
                    i3 += 4;
                    bArr2[i16] = 61;
                }
            }
            if (i3 != length) {
                bArr2 = Arrays.copyOf(bArr2, i3);
            }
            return new String(bArr2, 0, 0, bArr2.length);
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
            for (int i = 0; i < 64; i++) {
                a[Encoder.a[i]] = i;
            }
            a[61] = -2;
            int[] iArr2 = new int[256];
            b = iArr2;
            Arrays.fill(iArr2, -1);
            for (int i2 = 0; i2 < 64; i2++) {
                b[Encoder.b[i2]] = i2;
            }
            b[61] = -2;
            c = new Decoder();
        }

        /* JADX WARN: Code restructure failed: missing block: B:32:0x00b8, code lost:
        
            if (r0[r3] == 61) goto L42;
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x00bf, code lost:
        
            if (r10 != 18) goto L55;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public byte[] decode(String str) {
            int i;
            int i2;
            int i3;
            byte[] bytes = str.getBytes(j$.sun.nio.cs.c.a);
            int length = bytes.length;
            int[] iArr = a;
            if (length == 0) {
                i2 = 0;
            } else {
                if (length < 2) {
                    throw new IllegalArgumentException("Input byte[] should at least have 2 bytes for base64 bytes");
                }
                if (bytes[length - 1] == 61) {
                    i = bytes[length + (-2)] == 61 ? 2 : 1;
                } else {
                    i = 0;
                }
                if (i == 0 && (i3 = length & 3) != 0) {
                    i = 4 - i3;
                }
                i2 = (((length + 3) / 4) * 3) - i;
            }
            byte[] bArr = new byte[i2];
            int length2 = bytes.length;
            int i4 = 18;
            int i5 = 0;
            int i6 = 18;
            int i7 = 0;
            int i8 = 0;
            while (true) {
                if (i5 >= length2) {
                    break;
                }
                if (i6 == i4 && i5 + 4 < length2) {
                    int i9 = ((length2 - i5) & (-4)) + i5;
                    while (i5 < i9) {
                        int i10 = iArr[bytes[i5] & 255];
                        int i11 = iArr[bytes[i5 + 1] & 255];
                        int i12 = iArr[bytes[i5 + 2] & 255];
                        int i13 = i5 + 4;
                        int i14 = iArr[bytes[i5 + 3] & 255];
                        if ((i10 | i11 | i12 | i14) < 0) {
                            break;
                        }
                        int i15 = (i10 << 18) | (i11 << 12) | (i12 << 6) | i14;
                        bArr[i7] = (byte) (i15 >> 16);
                        int i16 = i7 + 2;
                        bArr[i7 + 1] = (byte) (i15 >> 8);
                        i7 += 3;
                        bArr[i16] = (byte) i15;
                        i5 = i13;
                    }
                    if (i5 >= length2) {
                        break;
                    }
                }
                int i17 = i5 + 1;
                int i18 = iArr[bytes[i5] & 255];
                if (i18 >= 0) {
                    i4 = 18;
                    int i19 = (i18 << i6) | i8;
                    i6 -= 6;
                    if (i6 < 0) {
                        bArr[i7] = (byte) (i19 >> 16);
                        int i20 = i7 + 2;
                        bArr[i7 + 1] = (byte) (i19 >> 8);
                        i7 += 3;
                        bArr[i20] = (byte) i19;
                        i6 = 18;
                        i8 = 0;
                    } else {
                        i8 = i19;
                    }
                    i5 = i17;
                } else {
                    if (i18 != -2) {
                        throw new IllegalArgumentException("Illegal base64 character " + Integer.toString(bytes[i5], 16));
                    }
                    if (i6 == 6) {
                        if (i17 != length2) {
                            i5 += 2;
                        }
                        throw new IllegalArgumentException("Input byte array has wrong 4-byte ending unit");
                    }
                    i5 = i17;
                }
            }
            if (i6 == 6) {
                bArr[i7] = (byte) (i8 >> 16);
                i7++;
            } else if (i6 == 0) {
                int i21 = i7 + 1;
                bArr[i7] = (byte) (i8 >> 16);
                i7 += 2;
                bArr[i21] = (byte) (i8 >> 8);
            } else if (i6 == 12) {
                throw new IllegalArgumentException("Last unit does not have enough valid bits");
            }
            if (i5 >= length2) {
                return i7 != i2 ? Arrays.copyOf(bArr, i7) : bArr;
            }
            throw new IllegalArgumentException("Input byte array has incorrect ending byte at " + i5);
        }
    }
}
