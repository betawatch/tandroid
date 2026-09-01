package bf;

import g5.m;
import g5.p;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
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
