package bf;

import g5.m;
import g5.p;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class c extends InputStream {
    public final m a;
    public final byte[] b = new byte[1];
    public long c;

    public c(m mVar, p pVar) {
        this.a = mVar;
        try {
            this.c = mVar.open(pVar);
        } catch (IOException e6) {
            throw new RuntimeException(e6);
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
        m mVar = this.a;
        byte[] bArr = this.b;
        int read = mVar.read(bArr, 0, 1);
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
