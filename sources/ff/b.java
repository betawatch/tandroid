package ff;

import java.io.InputStream;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class b extends a {
    public final long d;

    public b(InputStream inputStream, long j10, long j11) {
        super(inputStream, j10);
        this.d = j10 + j11;
    }

    public final long e() {
        return this.d - this.b;
    }

    @Override // ff.a, java.io.FilterInputStream, java.io.InputStream
    public final int read() {
        if (this.b == this.d) {
            return -1;
        }
        return super.read();
    }

    @Override // ff.a, java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j10) {
        long j11 = this.b;
        long j12 = j11 + j10;
        long j13 = this.d;
        if (j12 > j13) {
            j10 = (int) (j13 - j11);
        }
        return super.skip(j10);
    }

    @Override // ff.a, java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i10, int i11) {
        long j10 = this.b;
        long j11 = i11 + j10;
        long j12 = this.d;
        if (j11 <= j12 || (i11 = (int) (j12 - j10)) != 0) {
            return super.read(bArr, i10, i11);
        }
        return -1;
    }
}
