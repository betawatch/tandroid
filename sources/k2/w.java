package k2;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
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
        StringBuilder m10 = i2.d.m("AudioTrack init failed 0 Config(", i10, ", ", i11, ", ");
        i2.d.w(m10, i12, ", ", i13, ") ");
        m10.append(xVar);
        m10.append(z10 ? " (recoverable)" : "");
        this.a = z10;
        this.b = xVar;
    }
}
