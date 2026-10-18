package g2;

import java.io.InputStream;
import v7.u6;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes.dex */
public final class k extends InputStream {
    public final h a;
    public final m b;
    public boolean d = false;
    public boolean e = false;
    public final byte[] c = new byte[1];

    public k(h hVar, m mVar) {
        this.a = hVar;
        this.b = mVar;
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
        u6.p(!this.e);
        a();
        int read = this.a.read(bArr, i10, i11);
        if (read == -1) {
            return -1;
        }
        return read;
    }
}
