package l5;

import java.io.Closeable;
import k2.m0;
import n2.u;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
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
