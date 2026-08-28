package f9;

import java.io.InputStream;
import java.io.RandomAccessFile;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class i extends InputStream {
    public int a;
    public int b;
    public final /* synthetic */ k c;

    public i(k kVar, h hVar) {
        this.c = kVar;
        this.a = kVar.d(hVar.a + 4);
        this.b = hVar.b;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i9, int i10) {
        if (bArr == null) {
            throw new NullPointerException("buffer");
        }
        if ((i9 | i10) < 0 || i10 > bArr.length - i9) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int i11 = this.b;
        if (i11 <= 0) {
            return -1;
        }
        if (i10 > i11) {
            i10 = i11;
        }
        int i12 = this.a;
        k kVar = this.c;
        RandomAccessFile randomAccessFile = kVar.a;
        int d = kVar.d(i12);
        int i13 = d + i10;
        int i14 = kVar.b;
        if (i13 <= i14) {
            randomAccessFile.seek(d);
            randomAccessFile.readFully(bArr, i9, i10);
        } else {
            int i15 = i14 - d;
            randomAccessFile.seek(d);
            randomAccessFile.readFully(bArr, i9, i15);
            randomAccessFile.seek(16L);
            randomAccessFile.readFully(bArr, i9 + i15, i10 - i15);
        }
        this.a = kVar.d(this.a + i10);
        this.b -= i10;
        return i10;
    }

    @Override // java.io.InputStream
    public final int read() {
        if (this.b == 0) {
            return -1;
        }
        k kVar = this.c;
        kVar.a.seek(this.a);
        int read = kVar.a.read();
        this.a = kVar.d(this.a + 1);
        this.b--;
        return read;
    }
}
