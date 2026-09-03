package l3;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class u extends Exception {
    public final int a;
    public final boolean b;
    public final j3.n0 c;

    public u(int i10, j3.n0 n0Var, boolean z4) {
        super(kf.k0.j(i10, "AudioTrack write failed: "));
        this.b = z4;
        this.a = i10;
        this.c = n0Var;
    }
}
