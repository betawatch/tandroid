package g2;

import java.io.InputStream;
import v7.t6;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
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
    public final int read(byte[] bArr, int i10, int i11) {
        t6.p(!this.e);
        a();
        int read = this.a.read(bArr, i10, i11);
        if (read == -1) {
            return -1;
        }
        return read;
    }
}
