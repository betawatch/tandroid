package de;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class e extends h {
    public static final e d;

    static {
        int i3 = k.c;
        int i10 = k.d;
        long j10 = k.e;
        String str = k.a;
        e eVar = new e();
        eVar.c = new c(i3, j10, str, i10);
        d = eVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // wd.x
    public final String toString() {
        return "Dispatchers.Default";
    }
}
