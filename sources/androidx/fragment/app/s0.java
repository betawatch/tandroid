package androidx.fragment.app;

import android.util.Log;
import java.io.Writer;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class s0 extends Writer {
    public final StringBuilder b = new StringBuilder(128);
    public final String a = "FragmentManager";

    public final void a() {
        StringBuilder sb2 = this.b;
        if (sb2.length() > 0) {
            Log.d(this.a, sb2.toString());
            sb2.delete(0, sb2.length());
        }
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        a();
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
        a();
    }

    @Override // java.io.Writer
    public final void write(char[] cArr, int i9, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            char c10 = cArr[i9 + i11];
            if (c10 == '\n') {
                a();
            } else {
                this.b.append(c10);
            }
        }
    }
}
