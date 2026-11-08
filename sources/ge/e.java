package ge;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
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
