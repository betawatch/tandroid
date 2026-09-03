package k1;

import java.io.FileOutputStream;
import java.io.OutputStream;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class n extends OutputStream {
    public final FileOutputStream a;

    public n(FileOutputStream fileOutputStream) {
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
        kotlin.jvm.internal.j.e(b10, "b");
        this.a.write(b10);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bytes, int i10, int i11) {
        kotlin.jvm.internal.j.e(bytes, "bytes");
        this.a.write(bytes, i10, i11);
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
