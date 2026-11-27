// default package

import java.io.File;
import java.io.FileInputStream;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class mi6 extends FileInputStream {
    public final long a;

    public mi6(long j, long j2, File file) {
        super(file);
        this.a = j2;
        if (j <= 0 || skip(j) == j) {
            return;
        }
        xi4.l("BoundedInputStream failed to skip");
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
