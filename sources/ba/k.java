package ba;

import java.io.InputStream;
import java.io.RandomAccessFile;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class k extends InputStream {
    public int a;
    public int b;
    public final /* synthetic */ m c;

    public k(m mVar, j jVar) {
        this.c = mVar;
        this.a = mVar.d(jVar.a + 4);
        this.b = jVar.b;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i3, int i10) {
        if (bArr == null) {
            throw new NullPointerException("buffer");
        }
        if ((i3 | i10) < 0 || i10 > bArr.length - i3) {
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
        m mVar = this.c;
        RandomAccessFile randomAccessFile = mVar.a;
        int d = mVar.d(i12);
        int i13 = d + i10;
        int i14 = mVar.b;
        if (i13 <= i14) {
            randomAccessFile.seek(d);
            randomAccessFile.readFully(bArr, i3, i10);
        } else {
            int i15 = i14 - d;
            randomAccessFile.seek(d);
            randomAccessFile.readFully(bArr, i3, i15);
            randomAccessFile.seek(16L);
            randomAccessFile.readFully(bArr, i3 + i15, i10 - i15);
        }
        this.a = mVar.d(this.a + i10);
        this.b -= i10;
        return i10;
    }

    @Override // java.io.InputStream
    public final int read() {
        if (this.b == 0) {
            return -1;
        }
        m mVar = this.c;
        mVar.a.seek(this.a);
        int read = mVar.a.read();
        this.a = mVar.d(this.a + 1);
        this.b--;
        return read;
    }
}
