package od;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class e extends h {
    public static final e d;

    static {
        int i9 = k.c;
        int i10 = k.d;
        long j10 = k.e;
        String str = k.a;
        e eVar = new e();
        eVar.c = new c(i9, j10, str, i10);
        d = eVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // hd.a0
    public final String toString() {
        return "Dispatchers.Default";
    }
}
