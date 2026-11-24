// default package

import java.io.File;
import java.io.FileInputStream;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class ii6 extends FileInputStream {
    public final long a;

    public ii6(long j, long j2, File file) {
        super(file);
        this.a = j2;
        if (j <= 0 || skip(j) == j) {
            return;
        }
        zo4.k("BoundedInputStream failed to skip");
        throw null;
    }

    @Override // java.io.FileInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        long position = getChannel().position();
        long j = this.a;
        if (position >= j) {
            return -1;
        }
        long position2 = j - getChannel().position();
        if (i2 > position2) {
            i2 = (int) position2;
        }
        return super.read(bArr, i, i2);
    }

    @Override // java.io.FileInputStream, java.io.InputStream
    public final int read() {
        if (getChannel().position() >= this.a) {
            return -1;
        }
        return super.read();
    }
}
