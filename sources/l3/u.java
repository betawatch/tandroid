package l3;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final class u extends Exception {
    public final int a;
    public final boolean b;
    public final j3.n0 c;

    public u(int i10, j3.n0 n0Var, boolean z4) {
        super(l.d.j(i10, "AudioTrack write failed: "));
        this.b = z4;
        this.a = i10;
        this.c = n0Var;
    }
}
