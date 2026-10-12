package k2;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes.dex */
public final class w extends Exception {
    public final boolean a;
    public final b2.x b;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public w(int i10, int i11, int i12, int i13, b2.x xVar, boolean z10, m mVar) {
        super(r3.toString(), mVar);
        StringBuilder l4 = i2.d.l("AudioTrack init failed 0 Config(", i10, ", ", i11, ", ");
        i2.d.u(l4, i12, ", ", i13, ") ");
        l4.append(xVar);
        l4.append(z10 ? " (recoverable)" : "");
        this.a = z10;
        this.b = xVar;
    }
}
