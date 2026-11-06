package j2;

import a8.ia;
import java.io.InputStream;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
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
    public final int read(byte[] bArr, int i7, int i10) {
        ia.p(!this.e);
        a();
        int read = this.a.read(bArr, i7, i10);
        if (read == -1) {
            return -1;
        }
        return read;
    }
}
