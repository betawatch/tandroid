// default package

import java.io.InputStream;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class m29 extends i51 {
    public final long d;

    public m29(InputStream inputStream, long j, long j2) {
        super(inputStream, j);
        this.d = j + j2;
    }

    public final long e() {
        return this.d - this.b;
    }

    @Override // i51, java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        long j = this.b;
        long j2 = i2 + j;
        long j3 = this.d;
        if (j2 <= j3 || (i2 = (int) (j3 - j)) != 0) {
            return super.read(bArr, i, i2);
        }
        return -1;
    }

    @Override // i51, java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j) {
        long j2 = this.b;
        long j3 = j2 + j;
        long j4 = this.d;
        if (j3 > j4) {
            j = (int) (j4 - j2);
        }
        return super.skip(j);
    }

    @Override // i51, java.io.FilterInputStream, java.io.InputStream
    public final int read() {
        if (this.b == this.d) {
            return -1;
        }
        return super.read();
    }
}
