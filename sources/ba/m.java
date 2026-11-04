package ba;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class m implements Closeable {
    public static final Logger h = Logger.getLogger(m.class.getName());
    public final RandomAccessFile a;
    public final int b;
    public final int c;
    public final j d;
    public final j e;
    public final byte[] f = new byte[16];

    public m(File file) {
        if (!file.exists()) {
            File file2 = new File(file.getPath() + ".tmp");
            RandomAccessFile randomAccessFile = new RandomAccessFile(file2, "rwd");
            try {
                randomAccessFile.setLength(4096L);
                randomAccessFile.seek(0L);
                byte[] bArr = new byte[16];
                int[] iArr = {TLObject.FLAG_12, 0, 0, 0};
                int i3 = 0;
                for (int i10 = 0; i10 < 4; i10++) {
                    int i11 = iArr[i10];
                    bArr[i3] = (byte) (i11 >> 24);
                    bArr[i3 + 1] = (byte) (i11 >> 16);
                    bArr[i3 + 2] = (byte) (i11 >> 8);
                    bArr[i3 + 3] = (byte) i11;
                    i3 += 4;
                }
                randomAccessFile.write(bArr);
                randomAccessFile.close();
                if (!file2.renameTo(file)) {
                    throw new IOException("Rename failed!");
                }
            } catch (Throwable th2) {
                randomAccessFile.close();
                throw th2;
            }
        }
        RandomAccessFile randomAccessFile2 = new RandomAccessFile(file, "rwd");
        this.a = randomAccessFile2;
        randomAccessFile2.seek(0L);
        byte[] bArr2 = this.f;
        randomAccessFile2.readFully(bArr2);
        int c2 = c(0, bArr2);
        this.b = c2;
        if (c2 > randomAccessFile2.length()) {
            throw new IOException("File is truncated. Expected length: " + this.b + ", Actual length: " + randomAccessFile2.length());
        }
        this.c = c(4, bArr2);
        int c10 = c(8, bArr2);
        int c11 = c(12, bArr2);
        this.d = b(c10);
        this.e = b(c11);
    }

    public static int c(int i3, byte[] bArr) {
        return ((bArr[i3] & 255) << 24) + ((bArr[i3 + 1] & 255) << 16) + ((bArr[i3 + 2] & 255) << 8) + (bArr[i3 + 3] & 255);
    }

    public final synchronized void a(l lVar) {
        int i3 = this.d.a;
        for (int i10 = 0; i10 < this.c; i10++) {
            j b10 = b(i3);
            lVar.a(new k(this, b10), b10.b);
            i3 = d(b10.a + 4 + b10.b);
        }
    }

    public final j b(int i3) {
        if (i3 == 0) {
            return j.c;
        }
        RandomAccessFile randomAccessFile = this.a;
        randomAccessFile.seek(i3);
        return new j(i3, randomAccessFile.readInt());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.a.close();
    }

    public final int d(int i3) {
        int i10 = this.b;
        return i3 < i10 ? i3 : (i3 + 16) - i10;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(m.class.getSimpleName());
        sb2.append("[fileLength=");
        sb2.append(this.b);
        sb2.append(", size=");
        sb2.append(this.c);
        sb2.append(", first=");
        sb2.append(this.d);
        sb2.append(", last=");
        sb2.append(this.e);
        sb2.append(", element lengths=[");
        try {
            a(new i(sb2, 0));
        } catch (IOException e10) {
            h.log(Level.WARNING, "read error", (Throwable) e10);
        }
        sb2.append("]]");
        return sb2.toString();
    }
}
