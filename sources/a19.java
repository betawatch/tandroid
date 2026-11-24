// default package

import java.io.InputStream;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class a19 extends h61 {
    public final long d;

    public a19(InputStream inputStream, long j, long j2) {
        super(inputStream, j);
        this.d = j + j2;
    }

    public final long e() {
        return this.d - this.b;
    }

    @Override // h61, java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        long j = this.b;
        long j2 = i2 + j;
        long j3 = this.d;
        if (j2 <= j3 || (i2 = (int) (j3 - j)) != 0) {
            return super.read(bArr, i, i2);
        }
        return -1;
    }

    @Override // h61, java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j) {
        long j2 = this.b;
        long j3 = j2 + j;
        long j4 = this.d;
        if (j3 > j4) {
            j = (int) (j4 - j2);
        }
        return super.skip(j);
    }

    @Override // h61, java.io.FilterInputStream, java.io.InputStream
    public final int read() {
        if (this.b == this.d) {
            return -1;
        }
        return super.read();
    }
}
