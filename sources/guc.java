// default package

import java.io.BufferedOutputStream;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class guc extends BufferedOutputStream {
    public final void a(fuc fucVar) {
        byte[] bArr;
        write((fucVar.a ? 128 : 0) | (fucVar.b ? 64 : 0) | (fucVar.c ? 32 : 0) | (fucVar.d ? 16 : 0) | (fucVar.e & 15));
        byte[] bArr2 = fucVar.g;
        int length = bArr2 == null ? 0 : bArr2.length;
        write(length <= 125 ? length | 128 : length <= 65535 ? kk7.c4 : 255);
        byte[] bArr3 = fucVar.g;
        int length2 = bArr3 == null ? 0 : bArr3.length;
        if (length2 > 125) {
            if (length2 <= 65535) {
                bArr = new byte[]{(byte) ((length2 >> 8) & kk7.d4), (byte) (length2 & kk7.d4)};
            } else {
                bArr = new byte[8];
                for (int i = 7; i >= 0; i--) {
                    bArr[i] = (byte) (length2 & kk7.d4);
                    length2 >>>= 8;
                }
            }
            write(bArr);
        }
        byte[] bArr4 = new byte[4];
        yd7.a.nextBytes(bArr4);
        write(bArr4);
        byte[] bArr5 = fucVar.g;
        if (bArr5 == null) {
            return;
        }
        byte[] bArr6 = new byte[bArr5.length];
        for (int i2 = 0; i2 < bArr5.length; i2++) {
            bArr6[i2] = (byte) ((bArr5[i2] ^ bArr4[i2 % 4]) & kk7.d4);
        }
        write(bArr6);
    }
}
