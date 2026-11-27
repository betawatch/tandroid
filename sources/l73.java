// default package

import java.io.InputStream;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class l73 extends InputStream {
    public final h73 a;
    public final n73 b;
    public boolean d = false;
    public boolean e = false;
    public final byte[] c = new byte[1];

    public l73(h73 h73Var, n73 n73Var) {
        this.a = h73Var;
        this.b = n73Var;
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
        yve.p(!this.e);
        boolean z = this.d;
        h73 h73Var = this.a;
        if (!z) {
            h73Var.open(this.b);
            this.d = true;
        }
        int read = h73Var.read(bArr, i, i2);
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
