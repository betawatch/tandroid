package oc;

import java.io.BufferedInputStream;
import java.io.FilterInputStream;
import java.io.IOException;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class y extends FilterInputStream {
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y(BufferedInputStream bufferedInputStream, int i3) {
        super(bufferedInputStream);
        this.a = i3;
    }

    public static int a(int i3) {
        if (i3 >= 48 && i3 <= 57) {
            return i3 - 48;
        }
        if (i3 >= 65 && i3 <= 70) {
            return i3 - 55;
        }
        if (i3 < 97 || i3 > 102) {
            return 0;
        }
        return i3 - 87;
    }

    public void b(int i3, byte[] bArr) {
        int i10 = 0;
        while (i10 < i3) {
            int read = read(bArr, i10, i3 - i10);
            if (read <= 0) {
                throw new j(i10);
            }
            i10 += read;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x010b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public x c() {
        int i3;
        byte b10;
        byte[] bArr;
        byte[] bArr2 = new byte[8];
        try {
            b(2, bArr2);
            byte b11 = bArr2[0];
            boolean z10 = (b11 & 128) != 0;
            boolean z11 = (b11 & 64) != 0;
            boolean z12 = (b11 & 32) != 0;
            boolean z13 = (b11 & 16) != 0;
            int i10 = b11 & 15;
            byte b12 = bArr2[1];
            boolean z14 = (b12 & 128) != 0;
            long j10 = b12 & Byte.MAX_VALUE;
            if (j10 != 126) {
                if (j10 == 127) {
                    b(8, bArr2);
                    byte b13 = bArr2[0];
                    if ((b13 & 128) != 0) {
                        throw new v(21, "The payload length of a frame is invalid.");
                    }
                    i3 = ((bArr2[6] & 255) << 8) | ((bArr2[1] & 255) << 48) | ((b13 & 255) << 56) | ((bArr2[2] & 255) << 40) | ((bArr2[3] & 255) << 32) | ((bArr2[4] & 255) << 24) | ((bArr2[5] & 255) << 16);
                    b10 = bArr2[7];
                }
                byte[] bArr3 = null;
                if (z14) {
                    bArr = null;
                } else {
                    bArr = new byte[4];
                    b(4, bArr);
                }
                if (2147483647L >= j10) {
                    try {
                        skip(j10);
                    } catch (IOException unused) {
                    }
                    throw new v(22, "The payload length of a frame exceeds the maximum array size in Java.");
                }
                if (j10 != 0) {
                    int i11 = (int) j10;
                    try {
                        byte[] bArr4 = new byte[i11];
                        b(i11, bArr4);
                        if (z14 && bArr != null && bArr.length >= 4) {
                            for (int i12 = 0; i12 < i11; i12++) {
                                bArr4[i12] = (byte) (bArr4[i12] ^ bArr[i12 % 4]);
                            }
                        }
                        bArr3 = bArr4;
                    } catch (OutOfMemoryError e10) {
                        try {
                            skip(j10);
                        } catch (IOException unused2) {
                        }
                        throw new v(23, "OutOfMemoryError occurred during a trial to allocate a memory area for a frame's payload: " + e10.getMessage(), e10);
                    }
                }
                x xVar = new x();
                xVar.a = z10;
                xVar.b = z11;
                xVar.c = z12;
                xVar.d = z13;
                xVar.e = i10;
                xVar.f = z14;
                xVar.c(bArr3);
                return xVar;
            }
            b(2, bArr2);
            i3 = (bArr2[0] & 255) << 8;
            b10 = bArr2[1];
            j10 = i3 | (b10 & 255);
            byte[] bArr32 = null;
            if (z14) {
            }
            if (2147483647L >= j10) {
            }
        } catch (j e11) {
            if (e11.b == 0) {
                throw new l(48, "No more WebSocket frame from the server.");
            }
            throw e11;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() {
        switch (this.a) {
            case 1:
                int read = ((FilterInputStream) this).in.read();
                if (read != 61) {
                    return read;
                }
                int read2 = ((FilterInputStream) this).in.read();
                int read3 = ((FilterInputStream) this).in.read();
                if (read2 == -1 || read3 == -1) {
                    return -1;
                }
                return (read2 == 13 && read3 == 10) ? read() : (read2 == 10 || read3 == 10) ? read3 : (a(read2) << 4) | a(read3);
            default:
                return super.read();
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i3, int i10) {
        switch (this.a) {
            case 1:
                int i11 = 0;
                for (int i12 = 0; i12 < i10; i12++) {
                    int read = read();
                    if (read == -1) {
                        if (i11 == 0) {
                            return -1;
                        }
                        return i11;
                    }
                    bArr[i3 + i12] = (byte) read;
                    i11++;
                }
                return i11;
            default:
                return super.read(bArr, i3, i10);
        }
    }
}
