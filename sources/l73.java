// default package

import java.io.InputStream;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
