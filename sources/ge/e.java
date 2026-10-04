package ge;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
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
