package androidx.fragment.app;

import android.util.Log;
import java.io.Writer;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class r0 extends Writer {
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
    public final void write(char[] cArr, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            char c10 = cArr[i10 + i12];
            if (c10 == '\n') {
                a();
            } else {
                this.b.append(c10);
            }
        }
    }
}
