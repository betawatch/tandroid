package m1;

import java.io.FileOutputStream;
import java.io.OutputStream;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class g1 extends OutputStream {
    public final FileOutputStream a;

    public g1(FileOutputStream fileOutputStream) {
        this.a = fileOutputStream;
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() {
        this.a.flush();
    }

    @Override // java.io.OutputStream
    public final void write(int i7) {
        this.a.write(i7);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] b10) {
        kotlin.jvm.internal.j.e(b10, "b");
        this.a.write(b10);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bytes, int i7, int i10) {
        kotlin.jvm.internal.j.e(bytes, "bytes");
        this.a.write(bytes, i7, i10);
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
