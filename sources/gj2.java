// default package

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class gj2 extends FilterInputStream {
    public int a;
    public int b;

    public gj2(InputStream inputStream) {
        super(inputStream);
        this.a = -1;
        this.b = -1;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        bArr.getClass();
        if (i < 0 || i2 < 0 || i2 > bArr.length - i) {
            throw new IndexOutOfBoundsException();
        }
        if (i2 == 0) {
            return 0;
        }
        int read = read();
        if (read == -1) {
            return -1;
        }
        bArr[i] = (byte) read;
        int i3 = 1;
        while (i3 < i2) {
            try {
                int read2 = read();
                if (read2 == -1) {
                    break;
                }
                bArr[i + i3] = (byte) read2;
                i3++;
            } catch (IOException unused) {
            }
        }
        return i3;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() {
        int read = super.read();
        if (read == 3 && this.a == 0 && this.b == 0) {
            this.a = -1;
            this.b = -1;
            read = super.read();
        }
        this.a = this.b;
        this.b = read;
        return read;
    }
}
