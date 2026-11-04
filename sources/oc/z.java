package oc;

import java.io.BufferedOutputStream;
import org.telegram.messenger.hs;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class z extends BufferedOutputStream {
    public final void a(x xVar) {
        byte[] bArr;
        write((xVar.a ? 128 : 0) | (xVar.b ? 64 : 0) | (xVar.c ? 32 : 0) | (xVar.d ? 16 : 0) | (xVar.e & 15));
        byte[] bArr2 = xVar.g;
        int length = bArr2 == null ? 0 : bArr2.length;
        write(length <= 125 ? length | 128 : length <= 65535 ? hs.d4 : 255);
        byte[] bArr3 = xVar.g;
        int length2 = bArr3 == null ? 0 : bArr3.length;
        if (length2 > 125) {
            if (length2 <= 65535) {
                bArr = new byte[]{(byte) ((length2 >> 8) & hs.e4), (byte) (length2 & hs.e4)};
            } else {
                bArr = new byte[8];
                for (int i3 = 7; i3 >= 0; i3--) {
                    bArr[i3] = (byte) (length2 & hs.e4);
                    length2 >>>= 8;
                }
            }
            write(bArr);
        }
        byte[] bArr4 = new byte[4];
        k.a.nextBytes(bArr4);
        write(bArr4);
        byte[] bArr5 = xVar.g;
        if (bArr5 == null) {
            return;
        }
        byte[] bArr6 = new byte[bArr5.length];
        for (int i10 = 0; i10 < bArr5.length; i10++) {
            bArr6[i10] = (byte) ((bArr5[i10] ^ bArr4[i10 % 4]) & hs.e4);
        }
        write(bArr6);
    }
}
