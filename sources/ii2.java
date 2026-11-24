// default package

import java.io.IOException;
import java.io.InputStream;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class ii2 extends InputStream {
    public final a83 a;
    public final byte[] b = new byte[1];
    public long c;

    public ii2(a83 a83Var, g83 g83Var) {
        this.a = a83Var;
        try {
            this.c = a83Var.open(g83Var);
        } catch (IOException e) {
            rjb.m(e);
            throw null;
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
        a83 a83Var = this.a;
        byte[] bArr = this.b;
        int read = a83Var.read(bArr, 0, 1);
        this.c--;
        if (read == -1) {
            return -1;
        }
        return bArr[0] & 255;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        int read = this.a.read(bArr, i, i2);
        this.c -= read;
        return read;
    }
}
