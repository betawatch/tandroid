// default package

import java.io.File;
import java.io.FileInputStream;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class ig6 extends FileInputStream {
    public final long a;

    public ig6(long j, long j2, File file) {
        super(file);
        this.a = j2;
        if (j <= 0 || skip(j) == j) {
            return;
        }
        wn4.j("BoundedInputStream failed to skip");
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
