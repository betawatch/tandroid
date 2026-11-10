package c8;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public abstract class wa {
    public static boolean a(int i7, byte[] bArr) {
        return ((bArr[i7 / 8] >> (7 - (i7 % 8))) & 1) != 0;
    }

    public static int b(byte[] bArr, int[] iArr) {
        int i7 = 0;
        if (a(0, bArr) && !a(1, bArr) && !a(2, bArr) && !a(3, bArr) && a(4, bArr) && !a(5, bArr) && !a(6, bArr)) {
            int i10 = 271;
            int i11 = 0;
            while (i7 < 4) {
                i11 = (i11 << 1) | (a(i10, bArr) ? 1 : 0);
                i7++;
                i10++;
            }
            int i12 = (i11 * 8) + i10;
            int i13 = i12 + 1;
            if (a(i12, bArr)) {
                int i14 = i12 + 2;
                if (a(i13, bArr)) {
                    i13 = i14;
                } else {
                    int i15 = i12 + 3;
                    if (a(i14, bArr)) {
                        i15 = i12 + 8;
                    }
                    int i16 = i15 + 1;
                    if (a(i15, bArr)) {
                        i16 = i15 + 3;
                    }
                    i13 = i16 + 3;
                }
            }
            if (a(i13, bArr) && iArr.length > 0) {
                return iArr[iArr.length - 1];
            }
        }
        return -1;
    }

    public static void c(int i7, byte[] bArr) {
        int i10 = i7 / 8;
        bArr[i10] = (byte) (((byte) (1 << (7 - (i7 % 8)))) | bArr[i10]);
    }

    public static long d(int i7, ByteBuffer byteBuffer) {
        long j3 = 0;
        for (int i10 = 0; i10 < i7; i10++) {
            j3 = (j3 << 8) | (byteBuffer.get() & 255);
        }
        return j3;
    }
}
