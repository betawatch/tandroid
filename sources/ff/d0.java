package ff;

import java.io.OutputStream;
import java.util.Arrays;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class d0 extends OutputStream {
    public byte[] a;
    public int b;

    public d0(int i9) {
        this.a = new byte[i9];
    }

    public final void a(int i9) {
        byte[] bArr = this.a;
        if (i9 - bArr.length > 0) {
            int length = bArr.length << 1;
            if (length - i9 < 0) {
                length = i9;
            }
            if (length - 2147483639 > 0) {
                if (i9 < 0) {
                    throw new OutOfMemoryError();
                }
                length = i9 > 2147483639 ? ConnectionsManager.DEFAULT_DATACENTER_ID : 2147483639;
            }
            this.a = Arrays.copyOf(bArr, length);
        }
    }

    public final synchronized void b() {
        this.b = 0;
    }

    public final void c(int i9) {
        a(this.b + 4);
        byte[] bArr = this.a;
        int i10 = this.b;
        bArr[i10] = (byte) (i9 >>> 24);
        bArr[i10 + 1] = (byte) (i9 >>> 16);
        bArr[i10 + 2] = (byte) (i9 >>> 8);
        bArr[i10 + 3] = (byte) i9;
        this.b = i10 + 4;
    }

    public final void d(long j10) {
        a(this.b + 8);
        byte[] bArr = this.a;
        int i9 = this.b;
        bArr[i9] = (byte) (j10 >>> 56);
        bArr[i9 + 1] = (byte) (j10 >>> 48);
        bArr[i9 + 2] = (byte) (j10 >>> 40);
        bArr[i9 + 3] = (byte) (j10 >>> 32);
        bArr[i9 + 4] = (byte) (j10 >>> 24);
        bArr[i9 + 5] = (byte) (j10 >>> 16);
        bArr[i9 + 6] = (byte) (j10 >>> 8);
        bArr[i9 + 7] = (byte) j10;
        this.b = i9 + 8;
    }

    @Override // java.io.OutputStream
    public final synchronized void write(int i9) {
        a(this.b + 1);
        byte[] bArr = this.a;
        int i10 = this.b;
        bArr[i10] = (byte) i9;
        this.b = i10 + 1;
    }

    @Override // java.io.OutputStream
    public final synchronized void write(byte[] bArr, int i9, int i10) {
        if (i9 >= 0) {
            if (i9 <= bArr.length && i10 >= 0 && (i9 + i10) - bArr.length <= 0) {
                a(this.b + i10);
                System.arraycopy(bArr, i9, this.a, this.b, i10);
                this.b += i10;
            }
        }
        throw new IndexOutOfBoundsException();
    }
}
