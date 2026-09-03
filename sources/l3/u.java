package l3;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
