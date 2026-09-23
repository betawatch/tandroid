package k2;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes.dex */
public final class m extends Exception {
    public final int a;
    public final boolean b;
    public final b2.s c;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public m(int i10, int i11, int i12, int i13, int i14, b2.s sVar, boolean z10, RuntimeException runtimeException) {
        super(r5.toString(), runtimeException);
        StringBuilder m10 = hg.c.m("AudioTrack init failed ", i10, " Config(", i11, ", ");
        hg.c.v(m10, i12, ", ", i13, ", ");
        m10.append(i14);
        m10.append(") ");
        m10.append(sVar);
        m10.append(z10 ? " (recoverable)" : "");
        this.a = i10;
        this.b = z10;
        this.c = sVar;
    }
}
