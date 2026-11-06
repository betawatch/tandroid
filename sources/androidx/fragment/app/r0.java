package androidx.fragment.app;

import android.util.Log;
import java.io.Writer;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
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
    public final void write(char[] cArr, int i7, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            char c10 = cArr[i7 + i11];
            if (c10 == '\n') {
                a();
            } else {
                this.b.append(c10);
            }
        }
    }
}
