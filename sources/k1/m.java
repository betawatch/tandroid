package k1;

import java.io.FileOutputStream;
import java.io.OutputStream;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class m extends OutputStream {
    public final FileOutputStream a;

    public m(FileOutputStream fileOutputStream) {
        this.a = fileOutputStream;
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() {
        this.a.flush();
    }

    @Override // java.io.OutputStream
    public final void write(int i10) {
        this.a.write(i10);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] b10) {
        kotlin.jvm.internal.i.e(b10, "b");
        this.a.write(b10);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bytes, int i10, int i11) {
        kotlin.jvm.internal.i.e(bytes, "bytes");
        this.a.write(bytes, i10, i11);
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
