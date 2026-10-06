package of;

import g2.h;
import g2.m;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes.dex */
public final class c extends InputStream {
    public final h a;
    public final byte[] b = new byte[1];
    public long c;

    public c(h hVar, m mVar) {
        this.a = hVar;
        try {
            this.c = hVar.open(mVar);
        } catch (IOException e7) {
            throw new RuntimeException(e7);
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
