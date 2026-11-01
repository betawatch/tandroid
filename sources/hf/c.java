package hf;

import g2.h;
import g2.n;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final class c extends InputStream {
    public final h a;
    public final byte[] b = new byte[1];
    public long c;

    public c(h hVar, n nVar) {
        this.a = hVar;
        try {
            this.c = hVar.open(nVar);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // java.io.InputStream
    public final int available() {
        return (int) this.c;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }

    @Override // java.io.InputStream
    public final int read() {
        h hVar = this.a;
        byte[] bArr = this.b;
        int read = hVar.read(bArr, 0, 1);
        this.c--;
        if (read == -1) {
            return -1;
        }
        return bArr[0] & 255;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        int read = this.a.read(bArr, i10, i11);
        this.c -= read;
        return read;
    }
}
