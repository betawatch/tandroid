package ge;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
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
