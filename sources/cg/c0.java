package cg;

import java.io.OutputStream;
import java.util.Arrays;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class c0 extends OutputStream {
    public byte[] a;
    public int b;

    public c0(int i3) {
        this.a = new byte[i3];
    }

    public final void a(int i3) {
        byte[] bArr = this.a;
        if (i3 - bArr.length > 0) {
            int length = bArr.length << 1;
            if (length - i3 < 0) {
                length = i3;
            }
            if (length - 2147483639 > 0) {
                if (i3 < 0) {
                    throw new OutOfMemoryError();
                }
                length = i3 > 2147483639 ? Integer.MAX_VALUE : 2147483639;
            }
            this.a = Arrays.copyOf(bArr, length);
        }
    }

    public final synchronized void b() {
        this.b = 0;
    }

    public final void c(int i3) {
        a(this.b + 4);
        byte[] bArr = this.a;
        int i10 = this.b;
        bArr[i10] = (byte) (i3 >>> 24);
        bArr[i10 + 1] = (byte) (i3 >>> 16);
        bArr[i10 + 2] = (byte) (i3 >>> 8);
        bArr[i10 + 3] = (byte) i3;
        this.b = i10 + 4;
    }

    public final void d(long j10) {
        a(this.b + 8);
        byte[] bArr = this.a;
        int i3 = this.b;
        bArr[i3] = (byte) (j10 >>> 56);
        bArr[i3 + 1] = (byte) (j10 >>> 48);
        bArr[i3 + 2] = (byte) (j10 >>> 40);
        bArr[i3 + 3] = (byte) (j10 >>> 32);
        bArr[i3 + 4] = (byte) (j10 >>> 24);
        bArr[i3 + 5] = (byte) (j10 >>> 16);
        bArr[i3 + 6] = (byte) (j10 >>> 8);
        bArr[i3 + 7] = (byte) j10;
        this.b = i3 + 8;
    }

    @Override // java.io.OutputStream
    public final synchronized void write(int i3) {
        a(this.b + 1);
        byte[] bArr = this.a;
        int i10 = this.b;
        bArr[i10] = (byte) i3;
        this.b = i10 + 1;
    }

    @Override // java.io.OutputStream
    public final synchronized void write(byte[] bArr, int i3, int i10) {
        if (i3 >= 0) {
            if (i3 <= bArr.length && i10 >= 0 && (i3 + i10) - bArr.length <= 0) {
                a(this.b + i10);
                System.arraycopy(bArr, i3, this.a, this.b, i10);
                this.b += i10;
            }
        }
        throw new IndexOutOfBoundsException();
    }
}
