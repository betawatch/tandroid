package ge;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes.dex */
public final class e extends h {
    public static final e d;

    static {
        int i10 = k.c;
        int i11 = k.d;
        long j3 = k.e;
        String str = k.a;
        e eVar = new e();
        eVar.c = new c(i10, j3, str, i11);
        d = eVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // zd.a0
    public final String toString() {
        return "Dispatchers.Default";
    }
}
