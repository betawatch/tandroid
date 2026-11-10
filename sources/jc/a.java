package jc;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
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
    public final int read(byte[] bArr, int i7, int i10) {
        bArr.getClass();
        if (i7 < 0 || i10 < 0 || i10 > bArr.length - i7) {
            throw new IndexOutOfBoundsException();
        }
        if (i10 == 0) {
            return 0;
        }
        int read = read();
        if (read == -1) {
            return -1;
        }
        bArr[i7] = (byte) read;
        int i11 = 1;
        while (i11 < i10) {
            try {
                int read2 = read();
                if (read2 == -1) {
                    break;
                }
                bArr[i7 + i11] = (byte) read2;
                i11++;
            } catch (IOException unused) {
            }
        }
        return i11;
    }
}
