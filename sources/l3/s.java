package l3;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final class s extends Exception {
    public final int a;
    public final boolean b;
    public final j3.n0 c;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public s(int i10, int i11, int i12, int i13, j3.n0 n0Var, boolean z4, RuntimeException runtimeException) {
        super(r5.toString(), runtimeException);
        StringBuilder m9 = e2.c.m("AudioTrack init failed ", i10, " Config(", i11, ", ");
        l.d.w(m9, i12, ", ", i13, ") ");
        m9.append(n0Var);
        m9.append(z4 ? " (recoverable)" : "");
        this.a = i10;
        this.b = z4;
        this.c = n0Var;
    }
}
