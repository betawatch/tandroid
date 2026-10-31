package k2;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class y extends Exception {
    public final boolean a;
    public final b2.x b;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public y(int i10, int i11, int i12, int i13, b2.x xVar, boolean z10, m mVar) {
        super(r3.toString(), mVar);
        StringBuilder m10 = i0.a.m("AudioTrack init failed 0 Config(", i10, ", ", i11, ", ");
        i0.a.t(m10, i12, ", ", i13, ") ");
        m10.append(xVar);
        m10.append(z10 ? " (recoverable)" : "");
        this.a = z10;
        this.b = xVar;
    }
}
