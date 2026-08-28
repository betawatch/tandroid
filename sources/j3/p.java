package j3;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class p extends Exception {
    public final int a;
    public final boolean b;
    public final h3.t0 c;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public p(int i9, int i10, int i11, int i12, h3.t0 t0Var, boolean z10, RuntimeException runtimeException) {
        super(r5.toString(), runtimeException);
        StringBuilder o6 = e2.c.o("AudioTrack init failed ", i9, " Config(", i10, ", ");
        r0.y(o6, i11, ", ", i12, ")");
        o6.append(z10 ? " (recoverable)" : "");
        this.a = i9;
        this.b = z10;
        this.c = t0Var;
    }
}
