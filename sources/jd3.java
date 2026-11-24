// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class jd3 extends d64 {
    public static final jd3 d;
    public jy2 c;

    static {
        int i = eib.c;
        int i2 = eib.d;
        long j = eib.e;
        String str = eib.a;
        jd3 jd3Var = new jd3();
        jd3Var.c = new jy2(i, j, str, i2);
        d = jd3Var;
    }

    @Override // fy2
    public final void c(cy2 cy2Var, Runnable runnable) {
        this.c.b(runnable, false);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // fy2
    public final String toString() {
        return "Dispatchers.Default";
    }
}
