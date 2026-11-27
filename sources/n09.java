// default package

import java.io.InputStream;
import java.io.RandomAccessFile;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class n09 extends InputStream {
    public int a;
    public int b;
    public final /* synthetic */ p09 c;

    public n09(p09 p09Var, m09 m09Var) {
        this.c = p09Var;
        this.a = p09Var.d(m09Var.b + 4);
        this.b = m09Var.c;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        if (bArr == null) {
            p3d.h("buffer");
            return 0;
        }
        if ((i | i2) < 0 || i2 > bArr.length - i) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int i3 = this.b;
        if (i3 <= 0) {
            return -1;
        }
        if (i2 > i3) {
            i2 = i3;
        }
        int i4 = this.a;
        p09 p09Var = this.c;
        int d = p09Var.d(i4);
        int i5 = d + i2;
        int i6 = p09Var.b;
        RandomAccessFile randomAccessFile = p09Var.a;
        if (i5 <= i6) {
            randomAccessFile.seek(d);
            randomAccessFile.readFully(bArr, i, i2);
        } else {
            int i7 = i6 - d;
            randomAccessFile.seek(d);
            randomAccessFile.readFully(bArr, i, i7);
            randomAccessFile.seek(16L);
            randomAccessFile.readFully(bArr, i + i7, i2 - i7);
        }
        this.a = p09Var.d(this.a + i2);
        this.b -= i2;
        return i2;
    }

    @Override // java.io.InputStream
    public final int read() {
        p09 p09Var = this.c;
        RandomAccessFile randomAccessFile = p09Var.a;
        if (this.b == 0) {
            return -1;
        }
        randomAccessFile.seek(this.a);
        int read = randomAccessFile.read();
        this.a = p09Var.d(this.a + 1);
        this.b--;
        return read;
    }
}
