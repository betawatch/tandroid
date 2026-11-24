// default package

import java.io.InputStream;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class e83 extends InputStream {
    public final a83 a;
    public final g83 b;
    public boolean d = false;
    public boolean e = false;
    public final byte[] c = new byte[1];

    public e83(a83 a83Var, g83 g83Var) {
        this.a = a83Var;
        this.b = g83Var;
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
    public final int read(byte[] bArr, int i, int i2) {
        jte.p(!this.e);
        boolean z = this.d;
        a83 a83Var = this.a;
        if (!z) {
            a83Var.open(this.b);
            this.d = true;
        }
        int read = a83Var.read(bArr, i, i2);
        if (read == -1) {
            return -1;
        }
        return read;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public final int read() {
        byte[] bArr = this.c;
        if (read(bArr, 0, bArr.length) == -1) {
            return -1;
        }
        return bArr[0] & 255;
    }
}
