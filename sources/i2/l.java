package i2;

import b8.zb;
import java.io.InputStream;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class l extends InputStream {
    public final h a;
    public final n b;
    public boolean d = false;
    public boolean e = false;
    public final byte[] c = new byte[1];

    public l(h hVar, n nVar) {
        this.a = hVar;
        this.b = nVar;
    }

    public final void a() {
        if (this.d) {
            return;
        }
        this.a.open(this.b);
        this.d = true;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.e) {
            return;
        }
        this.a.close();
        this.e = true;
    }

    @Override // java.io.InputStream
    public final int read() {
        byte[] bArr = this.c;
        if (read(bArr, 0, bArr.length) == -1) {
            return -1;
        }
        return bArr[0] & 255;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i3, int i10) {
        zb.p(!this.e);
        a();
        int read = this.a.read(bArr, i3, i10);
        if (read == -1) {
            return -1;
        }
        return read;
    }
}
