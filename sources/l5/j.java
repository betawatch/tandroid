package l5;

import java.io.Closeable;
import k2.m0;
import n2.u;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final class j implements Closeable {
    public zc.a a;
    public m0 b;
    public zc.a c;
    public u d;
    public zc.a e;
    public zc.a f;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ((s5.g) ((s5.d) this.e.get())).close();
    }
}
