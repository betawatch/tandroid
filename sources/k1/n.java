package k1;

import java.io.FileOutputStream;
import java.io.OutputStream;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
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
