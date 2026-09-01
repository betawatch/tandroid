package j9;

import java.io.InputStream;
import java.io.RandomAccessFile;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
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
    public final int read(byte[] bArr, int i10, int i11) {
        if (bArr == null) {
            throw new NullPointerException("buffer");
        }
        if ((i10 | i11) < 0 || i11 > bArr.length - i10) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int i12 = this.b;
        if (i12 <= 0) {
            return -1;
        }
        if (i11 > i12) {
            i11 = i12;
        }
        int i13 = this.a;
        k kVar = this.c;
        RandomAccessFile randomAccessFile = kVar.a;
        int d = kVar.d(i13);
        int i14 = d + i11;
        int i15 = kVar.b;
        if (i14 <= i15) {
            randomAccessFile.seek(d);
            randomAccessFile.readFully(bArr, i10, i11);
        } else {
            int i16 = i15 - d;
            randomAccessFile.seek(d);
            randomAccessFile.readFully(bArr, i10, i16);
            randomAccessFile.seek(16L);
            randomAccessFile.readFully(bArr, i10 + i16, i11 - i16);
        }
        this.a = kVar.d(this.a + i11);
        this.b -= i11;
        return i11;
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
