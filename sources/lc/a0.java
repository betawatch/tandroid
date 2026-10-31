package lc;

import java.io.BufferedOutputStream;
import org.telegram.messenger.zs;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class a0 extends BufferedOutputStream {
    public final void a(y yVar) {
        byte[] bArr;
        write((yVar.a ? 128 : 0) | (yVar.b ? 64 : 0) | (yVar.c ? 32 : 0) | (yVar.d ? 16 : 0) | (yVar.e & 15));
        byte[] bArr2 = yVar.g;
        int length = bArr2 == null ? 0 : bArr2.length;
        write(length <= 125 ? length | 128 : length <= 65535 ? zs.d4 : 255);
        byte[] bArr3 = yVar.g;
        int length2 = bArr3 == null ? 0 : bArr3.length;
        if (length2 > 125) {
            if (length2 <= 65535) {
                bArr = new byte[]{(byte) ((length2 >> 8) & zs.e4), (byte) (length2 & zs.e4)};
            } else {
                bArr = new byte[8];
                for (int i10 = 7; i10 >= 0; i10--) {
                    bArr[i10] = (byte) (length2 & zs.e4);
                    length2 >>>= 8;
                }
            }
            write(bArr);
        }
        byte[] bArr4 = new byte[4];
        k.a.nextBytes(bArr4);
        write(bArr4);
        byte[] bArr5 = yVar.g;
        if (bArr5 == null) {
            return;
        }
        byte[] bArr6 = new byte[bArr5.length];
        for (int i11 = 0; i11 < bArr5.length; i11++) {
            bArr6[i11] = (byte) ((bArr5[i11] ^ bArr4[i11 % 4]) & zs.e4);
        }
        write(bArr6);
    }
}
