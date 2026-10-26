package k2;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class x extends Exception {
    public final boolean a;
    public final b2.x b;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public x(int i10, int i11, int i12, int i13, b2.x xVar, boolean z10, n nVar) {
        super(r3.toString(), nVar);
        StringBuilder n10 = c3.h0.n("AudioTrack init failed 0 Config(", i10, ", ", i11, ", ");
        c3.h0.q(n10, i12, ", ", i13, ") ");
        n10.append(xVar);
        n10.append(z10 ? " (recoverable)" : "");
        this.a = z10;
        this.b = xVar;
    }
}
