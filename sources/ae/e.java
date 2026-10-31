package ae;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class e extends h {
    public static final e d;

    static {
        int i10 = l.c;
        int i11 = l.d;
        long j10 = l.e;
        String str = l.a;
        e eVar = new e();
        eVar.c = new c(i10, j10, str, i11);
        d = eVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // td.a0
    public final String toString() {
        return "Dispatchers.Default";
    }
}
