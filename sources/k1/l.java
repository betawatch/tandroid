package k1;

import java.io.FileOutputStream;
import java.io.OutputStream;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class l extends OutputStream {
    public final FileOutputStream a;

    public l(FileOutputStream fileOutputStream) {
        this.a = fileOutputStream;
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() {
        this.a.flush();
    }

    @Override // java.io.OutputStream
    public final void write(int i9) {
        this.a.write(i9);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] b10) {
        kotlin.jvm.internal.i.e(b10, "b");
        this.a.write(b10);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bytes, int i9, int i10) {
        kotlin.jvm.internal.i.e(bytes, "bytes");
        this.a.write(bytes, i9, i10);
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
