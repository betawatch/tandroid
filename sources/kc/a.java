package kc;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public final class a extends FilterInputStream {
    public int a;
    public int b;

    public a(InputStream inputStream) {
        super(inputStream);
        this.a = -1;
        this.b = -1;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return false;
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

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i10, int i11) {
        bArr.getClass();
        if (i10 < 0 || i11 < 0 || i11 > bArr.length - i10) {
            throw new IndexOutOfBoundsException();
        }
        if (i11 == 0) {
            return 0;
        }
        int read = read();
        if (read == -1) {
            return -1;
        }
        bArr[i10] = (byte) read;
        int i12 = 1;
        while (i12 < i11) {
            try {
                int read2 = read();
                if (read2 == -1) {
                    break;
                }
                bArr[i10 + i12] = (byte) read2;
                i12++;
            } catch (IOException unused) {
            }
        }
        return i12;
    }
}
