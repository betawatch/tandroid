package k2;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes.dex */
public final class w extends Exception {
    public final boolean a;
    public final b2.w b;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public w(int i10, int i11, int i12, int i13, b2.w wVar, boolean z10, m mVar) {
        super(r3.toString(), mVar);
        StringBuilder m10 = i0.a.m("AudioTrack init failed 0 Config(", i10, ", ", i11, ", ");
        i0.a.w(m10, i12, ", ", i13, ") ");
        m10.append(wVar);
        m10.append(z10 ? " (recoverable)" : "");
        this.a = z10;
        this.b = wVar;
    }
}
