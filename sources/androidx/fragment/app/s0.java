package androidx.fragment.app;

import android.util.Log;
import java.io.Writer;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class s0 extends Writer {
    public final StringBuilder b = new StringBuilder(128);
    public final String a = "FragmentManager";

    public final void a() {
        StringBuilder sb = this.b;
        if (sb.length() > 0) {
            Log.d(this.a, sb.toString());
            sb.delete(0, sb.length());
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
    public final void write(char[] cArr, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            char c3 = cArr[i10 + i12];
            if (c3 == '\n') {
                a();
            } else {
                this.b.append(c3);
            }
        }
    }
}
