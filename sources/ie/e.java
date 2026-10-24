package ie;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes.dex */
public final class e extends h {
    public static final e d;

    static {
        int i10 = k.c;
        int i11 = k.d;
        long j10 = k.e;
        String str = k.a;
        e eVar = new e();
        eVar.c = new c(i10, j10, str, i11);
        d = eVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // be.a0
    public final String toString() {
        return "Dispatchers.Default";
    }
}
