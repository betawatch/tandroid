// default package

import java.io.BufferedOutputStream;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class hwc extends BufferedOutputStream {
    public final void a(gwc gwcVar) {
        byte[] bArr;
        write((gwcVar.a ? 128 : 0) | (gwcVar.b ? 64 : 0) | (gwcVar.c ? 32 : 0) | (gwcVar.d ? 16 : 0) | (gwcVar.e & 15));
        byte[] bArr2 = gwcVar.g;
        int length = bArr2 == null ? 0 : bArr2.length;
        write(length <= 125 ? length | 128 : length <= 65535 ? nm7.c4 : 255);
        byte[] bArr3 = gwcVar.g;
        int length2 = bArr3 == null ? 0 : bArr3.length;
        if (length2 > 125) {
            if (length2 <= 65535) {
                bArr = new byte[]{(byte) ((length2 >> 8) & nm7.d4), (byte) (length2 & nm7.d4)};
            } else {
                bArr = new byte[8];
                for (int i = 7; i >= 0; i--) {
                    bArr[i] = (byte) (length2 & nm7.d4);
                    length2 >>>= 8;
                }
            }
            write(bArr);
        }
        byte[] bArr4 = new byte[4];
        ag7.a.nextBytes(bArr4);
        write(bArr4);
        byte[] bArr5 = gwcVar.g;
        if (bArr5 == null) {
            return;
        }
        byte[] bArr6 = new byte[bArr5.length];
        for (int i2 = 0; i2 < bArr5.length; i2++) {
            bArr6[i2] = (byte) ((bArr5[i2] ^ bArr4[i2 % 4]) & nm7.d4);
        }
        write(bArr6);
    }
}
