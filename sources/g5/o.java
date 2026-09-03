package g5;

import java.io.InputStream;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class o extends InputStream {
    public final m a;
    public final p b;
    public boolean d = false;
    public boolean e = false;
    public final byte[] c = new byte[1];

    public o(m mVar, p pVar) {
        this.a = mVar;
        this.b = pVar;
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
        h5.a.i(!this.e);
        a();
        int read = this.a.read(bArr, i10, i11);
        if (read == -1) {
            return -1;
        }
        return read;
    }
}
