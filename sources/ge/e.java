package ge;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public final class e extends h {
    public static final e d;

    static {
        int i7 = k.c;
        int i10 = k.d;
        long j3 = k.e;
        String str = k.a;
        e eVar = new e();
        eVar.c = new c(i7, j3, str, i10);
        d = eVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // zd.x
    public final String toString() {
        return "Dispatchers.Default";
    }
}
