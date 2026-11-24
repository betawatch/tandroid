package j$.util;

import java.util.Arrays;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes4.dex */
public class Base64 {

    /* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
    public static class Decoder {
        public static final int[] a;
        public static final int[] b;
        public static final Decoder c;

        static {
            int[] iArr;
            int[] iArr2 = new int[256];
            a = iArr2;
            Arrays.fill(iArr2, -1);
            int i = 0;
            int i2 = 0;
            while (true) {
                iArr = a;
                if (i2 >= 64) {
                    break;
                }
                iArr[Encoder.a[i2]] = i2;
                i2++;
            }
            iArr[61] = -2;
            int[] iArr3 = new int[256];
            b = iArr3;
            Arrays.fill(iArr3, -1);
            while (true) {
                int[] iArr4 = b;
                if (i >= 64) {
                    iArr4[61] = -2;
                    c = new Decoder();
                    return;
                } else {
                    iArr4[Encoder.b[i]] = i;
                    i++;
                }
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:32:0x00bb, code lost:
        
            if (r0[r2] == 61) goto L43;
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x00c2, code lost:
        
            if (r10 == 18) goto L46;
         */
        /* JADX WARN: Removed duplicated region for block: B:20:0x00e4  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x00b0 A[SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public byte[] decode(String str) {
            int i;
            int i2;
            byte[] bArr;
            char c2;
            int i3;
            byte[] bytes = str.getBytes(j$.sun.nio.cs.c.a);
            int length = bytes.length;
            char c3 = 2;
            if (length == 0) {
                i = 0;
            } else {
                if (length < 2) {
                    j$.time.g.c("Input byte[] should at least have 2 bytes for base64 bytes");
                    return null;
                }
                int i4 = bytes[length + (-1)] == 61 ? bytes[length + (-2)] == 61 ? 2 : 1 : 0;
                if (i4 == 0 && (i2 = length & 3) != 0) {
                    i4 = 4 - i2;
                }
                i = (((length + 3) / 4) * 3) - i4;
            }
            byte[] bArr2 = new byte[i];
            int length2 = bytes.length;
            int i5 = 18;
            int i6 = 18;
            int i7 = 0;
            int i8 = 0;
            int i9 = 0;
            while (true) {
                if (i7 >= length2) {
                    bArr = null;
                    break;
                }
                int[] iArr = a;
                if (i6 == i5) {
                    bArr = null;
                    if (i7 + 4 < length2) {
                        int i10 = ((length2 - i7) & (-4)) + i7;
                        while (true) {
                            if (i7 >= i10) {
                                c2 = c3;
                                break;
                            }
                            int i11 = iArr[bytes[i7] & 255];
                            c2 = c3;
                            int i12 = iArr[bytes[i7 + 1] & 255];
                            int i13 = iArr[bytes[i7 + 2] & 255];
                            int i14 = i7 + 4;
                            int i15 = iArr[bytes[i7 + 3] & 255];
                            if ((i11 | i12 | i13 | i15) < 0) {
                                break;
                            }
                            int i16 = (i11 << 18) | (i12 << 12) | (i13 << 6) | i15;
                            bArr2[i8] = (byte) (i16 >> 16);
                            int i17 = i8 + 2;
                            bArr2[i8 + 1] = (byte) (i16 >> 8);
                            i8 += 3;
                            bArr2[i17] = (byte) i16;
                            i7 = i14;
                            c3 = c2;
                        }
                        if (i7 >= length2) {
                            break;
                        }
                        int i18 = i7 + 1;
                        byte b2 = bytes[i7];
                        i3 = iArr[b2 & 255];
                        if (i3 < 0) {
                            i9 |= i3 << i6;
                            i6 -= 6;
                            if (i6 < 0) {
                                bArr2[i8] = (byte) (i9 >> 16);
                                int i19 = i8 + 2;
                                bArr2[i8 + 1] = (byte) (i9 >> 8);
                                i8 += 3;
                                bArr2[i19] = (byte) i9;
                                i6 = 18;
                                i9 = 0;
                            }
                            i7 = i18;
                            i5 = 18;
                            c3 = c2;
                        } else {
                            if (i3 != -2) {
                                throw new IllegalArgumentException("Illegal base64 character " + Integer.toString(b2, 16));
                            }
                            if (i6 == 6) {
                                if (i18 != length2) {
                                    i7 += 2;
                                }
                                j$.time.g.c("Input byte array has wrong 4-byte ending unit");
                                return bArr;
                            }
                            i7 = i18;
                        }
                    }
                } else {
                    bArr = null;
                }
                c2 = c3;
                int i182 = i7 + 1;
                byte b22 = bytes[i7];
                i3 = iArr[b22 & 255];
                if (i3 < 0) {
                }
            }
            if (i6 == 6) {
                bArr2[i8] = (byte) (i9 >> 16);
                i8++;
            } else if (i6 == 0) {
                int i20 = i8 + 1;
                bArr2[i8] = (byte) (i9 >> 16);
                i8 += 2;
                bArr2[i20] = (byte) (i9 >> 8);
            } else if (i6 == 12) {
                j$.time.g.c("Last unit does not have enough valid bits");
                return bArr;
            }
            if (i7 >= length2) {
                return i8 != i ? Arrays.copyOf(bArr2, i8) : bArr2;
            }
            j$.time.g.j("Input byte array has incorrect ending byte at ", i7);
            return bArr;
        }
    }

    /* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
    public static class Encoder {
        public static final char[] a = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/'};
        public static final char[] b = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '-', '_'};
        public static final Encoder c = new Encoder();

        public String encodeToString(byte[] bArr) {
            int length = ((bArr.length + 2) / 3) << 2;
            byte[] bArr2 = new byte[length];
            int length2 = bArr.length;
            int i = (length2 / 3) * 3;
            int i2 = 0;
            int i3 = 0;
            while (true) {
                char[] cArr = a;
                if (i2 >= i) {
                    if (i2 < length2) {
                        int i4 = i2 + 1;
                        int i5 = bArr[i2] & 255;
                        int i6 = i3 + 1;
                        bArr2[i3] = (byte) cArr[i5 >> 2];
                        if (i4 == length2) {
                            bArr2[i6] = (byte) cArr[(i5 << 4) & 63];
                            int i7 = i3 + 3;
                            bArr2[i3 + 2] = 61;
                            i3 += 4;
                            bArr2[i7] = 61;
                        } else {
                            int i8 = bArr[i4] & 255;
                            bArr2[i6] = (byte) cArr[((i5 << 4) & 63) | (i8 >> 4)];
                            int i9 = i3 + 3;
                            bArr2[i3 + 2] = (byte) cArr[(i8 << 2) & 63];
                            i3 += 4;
                            bArr2[i9] = 61;
                        }
                    }
                    if (i3 != length) {
                        bArr2 = Arrays.copyOf(bArr2, i3);
                    }
                    return new String(bArr2, 0, 0, bArr2.length);
                }
                int min = Math.min(i2 + i, i);
                int i10 = i2;
                int i11 = i3;
                while (i10 < min) {
                    int i12 = i10 + 2;
                    int i13 = ((bArr[i10] & 255) << 16) | ((bArr[i10 + 1] & 255) << 8);
                    i10 += 3;
                    int i14 = i13 | (bArr[i12] & 255);
                    bArr2[i11] = (byte) cArr[(i14 >>> 18) & 63];
                    bArr2[i11 + 1] = (byte) cArr[(i14 >>> 12) & 63];
                    int i15 = i11 + 3;
                    bArr2[i11 + 2] = (byte) cArr[(i14 >>> 6) & 63];
                    i11 += 4;
                    bArr2[i15] = (byte) cArr[i14 & 63];
                }
                int i16 = ((min - i2) / 3) << 2;
                i3 += i16;
                if (i16 == -1 && min < length2) {
                    throw null;
                }
                i2 = min;
            }
        }
    }

    public static Decoder getDecoder() {
        return Decoder.c;
    }

    public static Encoder getEncoder() {
        return Encoder.c;
    }
}
